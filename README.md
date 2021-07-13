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

--> 로그인 시현하는 gif 
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

### MainActivity 
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


### GameActivity
#### Avalon Classic 규칙 설명
1. 게임의 목적은 상대의 돌을 경기장 바깥으로 5개 이상 밀어내는 것입니다.
2. 참가자는 한 턴에 한 번 돌을 이동시킬 수 있습니다.
3. 한 번에 이동시킬 수 있는 돌은 최대 3개까지 동일 방향으로 가능합니다.
4. 이동시키려는 방향에 대해 연속적으로 붙어있는 검은 돌의 수가 연속적으로 붙어있는 푸른 돌의 수 보다 많아야 이동이 가능합니다.
ex) (검 검 검 푸 푸 푸)일 경우에는 이동이 불가능 하며 (검 검 검 푸 푸 ' ' 푸)일 경우에는 이동이 가능합니다.
4. 이동시키려는 방향에 대해 검은 돌과 푸른 돌이 교차로 연속적으로 붙어있다면 이동이 불가능합니다.
ex) (검 검 푸 검 푸)일 경우에는 이동이 불가능합니다.
#### 셜명과 기능
1. 경기장은 육각형 형태의 삼각형 밀집 구조이며, 선들이 겹치는 부분의 수는 총 61개 입니다. 또한 검은 돌의 경우에는 게임 참가자가 직접 조작하여야 하기 때문에 버튼 클릭 이벤트및 방향 조작을 보조할 이벤트가 필요했습니다. 따라서 모든 점에 대하여 floatingActionButton을 배치하여 클릭 이벤트를 만들었고, 각각의 돌을 클릭할 때마다 

3. 기능적인 부분은 게임 규칙 설명에 적혀있는 모든 사항을 구현하였습니다.
-> 시현하는 gif 넣기




