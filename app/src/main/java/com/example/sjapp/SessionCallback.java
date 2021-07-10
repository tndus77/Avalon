package com.example.sjapp;

import android.util.Log;
import android.widget.ImageView;

import com.kakao.auth.ISessionCallback;
import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.MeV2ResponseCallback;
import com.kakao.usermgmt.response.MeV2Response;
import com.kakao.usermgmt.response.model.Profile;
import com.kakao.usermgmt.response.model.UserAccount;
import com.kakao.util.OptionalBoolean;
import com.kakao.util.exception.KakaoException;

import java.util.HashMap;


public class SessionCallback implements ISessionCallback{
    //로그인에 성공
    @Override
    public void onSessionOpened() {
        requestMe();
        
    }

    //로그인 실패 상태
    public void onSessionOpenFailed(KakaoException exception) {
        Log.e("SessionCallBack :: ", "onSessionOpenFailed : " + exception.getMessage());
    }
    // 사용자 정보 요청
    public void requestMe() {
        UserManagement.getInstance().me(new MeV2ResponseCallback() {
                    //세션이 닫혀 실패한 경우로 에러 결과를 받음
                    @Override
                    public void onSessionClosed(ErrorResult errorResult) {
                        Log.e("KAKAO_API", "세션이 닫혀 있음: " + errorResult);
                    }

                    //가입이 안된 경우와 세션이 닫힌 경우를 제외한 다른 이유로 요청이 실패한 경우 콜백
                    @Override
                    public void onFailure(ErrorResult errorResult) {
                        Log.e("KAKAO_API", "사용자 정보 요청 실패: " + errorResult);
                    }

                    //사용자 정보 요청이 성공한 경우로 사용자 정보 객체를 받음
                    @Override
                    public void onSuccess(MeV2Response result) {

                        Log.i("KAKAO_API", "사용자 아이디: " + result.getId());

                        UserAccount kakaoAccount = result.getKakaoAccount();
                        if (kakaoAccount != null) {

                            // 이메일
                            String email = kakaoAccount.getEmail();

                            if (email != null) {
                                Log.i("KAKAO_API", "email: " + email);

                            } else if (kakaoAccount.emailNeedsAgreement() == OptionalBoolean.TRUE) {
                                // 동의 요청 후 이메일 획득 가능
                                // 단, 선택 동의로 설정되어 있다면 서비스 이용 시나리오 상에서 반드시 필요한 경우에만 요청해야 합니다.

                            } else {
                                // 이메일 획득 불가
                            }

                            // 프로필
                            Profile profile = kakaoAccount.getProfile();

                            if (profile != null) {
                                Log.d("KAKAO_API", "nickname: " + profile.getNickname());

                            } else if (kakaoAccount.profileNeedsAgreement() == OptionalBoolean.TRUE) {
                                // 동의 요청 후 프로필 정보 획득 가능

                            } else {
                                // 프로필 획득 불가
                            }
                            HashMap<String, String> map = new HashMap<>();
                            map.put("name", result.getKakaoAccount().getProfile().getNickname());
                            map.put("email", result.getKakaoAccount().getEmail());
                        }
                    }
                });
    }

}
