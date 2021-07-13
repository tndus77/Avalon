# 2021s MAD CAMP
## WEEK II (7/7 - 7/14)
### 공통 과제
> 서버 및 DB 기술 적응 및 응용하여 안드로이드 앱 제작
서버, DB, SDK를 활용한 앱으로 데이터를 서버와 주고 받음

## Team Introduction
>박수연, 장종원

## Project Description
### Dependency
Android Studio 4.2.1

### Project name : AVALON
실제로 출시 되어있는 Avalon classic 보드게임을 구현했습니다.

---
## Details
### LoginActivity
#### SDK 활용
1. 카카오 로그인 SDK
- 카카오 로그인은 카카오 카카오계정과 앱을 연결하고 토큰을 발급받아 카카오 API를 사용했습니다. 
- 카카오 API를 통해 사용자의 카카오계정의 프로필 정보를 제공받았고, 로그인 시 사용자 동의를 받아 접속할 수 있도록 구현하였습니다.

```java
Profile profile = kakaoAccount.getProfile();
id = profile.getNickname();
profileImg = profile.getProfileImageUrl();
```
> 프로필 이름과 사진을 가져오는 과정

#### 서버 활용
1. 양방향 통신을 위해 Socket 사용

+ Node JS에서 tcp socket통신을 위해 Socket.io를 사용하여 다른 사용자와 multiplay할 수 있도록 구현하였습니다.

2. 단방향 통신을 위해 POST, GET 사용
+ POST방식을 통해 BODY에 데이터를 넣어서 서버로 전송하였습니다.
+ ~~Mongodb를 활용하지는 않았지만, MongoDB를 설치하여 Player의 id를 받는 작업을 했습니다.~~

###MainActivity 
#### 셜명과 기능
1. Player 입장
Socket을 활용하여 한 플레이어가 입장하면 카카오톡 프로필을 가져온 후 Toast 메시지가 나오도록 구현하였습니다. 
```java
mSocket.on("player join", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String userId = (String) args[0];
                        try {
                            Toast.makeText(getApplicationContext(), id + "님이 입장하셨습니다.", Toast.LENGTH_SHORT).show();
                        }catch (RuntimeException r){

                        }
                    }
                });
            }
        });
```
# player입장해서 toast메시지 나오는 거 gif 넣기
2. Button animation




