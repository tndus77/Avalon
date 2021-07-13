package com.example.sjapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.sjapp.LoginActivity.BASE_URL;

public class GameActivity extends AppCompatActivity {

    FloatingActionButton black_stone1;
    FloatingActionButton arrowUL1;
    FloatingActionButton arrowUR1;
    FloatingActionButton arrowR1;

    FloatingActionButton black_stone2;
    FloatingActionButton arrowL2;
    FloatingActionButton arrowUL2;
    FloatingActionButton arrowUR2;
    FloatingActionButton arrowR2;

    FloatingActionButton black_stone3;
    FloatingActionButton arrowL3;
    FloatingActionButton arrowUL3;
    FloatingActionButton arrowUR3;
    FloatingActionButton arrowR3;

    FloatingActionButton black_stone4;
    FloatingActionButton arrowL4;
    FloatingActionButton arrowUL4;
    FloatingActionButton arrowUR4;
    FloatingActionButton arrowR4;

    FloatingActionButton black_stone5;
    FloatingActionButton arrowL5;
    FloatingActionButton arrowUL5;
    FloatingActionButton arrowUR5;

    FloatingActionButton black_stone6;
    FloatingActionButton arrowUL6;
    FloatingActionButton arrowUR6;
    FloatingActionButton arrowR6;
    FloatingActionButton arrowDR6;

    FloatingActionButton black_stone7;
    FloatingActionButton arrowL7;
    FloatingActionButton arrowUL7;
    FloatingActionButton arrowUR7;
    FloatingActionButton arrowR7;
    FloatingActionButton arrowDL7;
    FloatingActionButton arrowDR7;

    FloatingActionButton black_stone8;
    FloatingActionButton arrowL8;
    FloatingActionButton arrowUL8;
    FloatingActionButton arrowUR8;
    FloatingActionButton arrowR8;
    FloatingActionButton arrowDL8;
    FloatingActionButton arrowDR8;

    FloatingActionButton black_stone9;
    FloatingActionButton arrowL9;
    FloatingActionButton arrowUL9;
    FloatingActionButton arrowUR9;
    FloatingActionButton arrowR9;
    FloatingActionButton arrowDL9;
    FloatingActionButton arrowDR9;

    FloatingActionButton black_stone10;
    FloatingActionButton arrowL10;
    FloatingActionButton arrowUL10;
    FloatingActionButton arrowUR10;
    FloatingActionButton arrowR10;
    FloatingActionButton arrowDL10;
    FloatingActionButton arrowDR10;

    FloatingActionButton black_stone11;
    FloatingActionButton arrowL11;
    FloatingActionButton arrowUL11;
    FloatingActionButton arrowUR11;
    FloatingActionButton arrowDL11;

    FloatingActionButton black_stone12;
    FloatingActionButton arrowUL12;
    FloatingActionButton arrowUR12;
    FloatingActionButton arrowR12;
    FloatingActionButton arrowDR12;

    FloatingActionButton black_stone13;
    FloatingActionButton arrowL13;
    FloatingActionButton arrowUL13;
    FloatingActionButton arrowUR13;
    FloatingActionButton arrowR13;
    FloatingActionButton arrowDL13;
    FloatingActionButton arrowDR13;

    FloatingActionButton black_stone14;
    FloatingActionButton arrowL14;
    FloatingActionButton arrowUL14;
    FloatingActionButton arrowUR14;
    FloatingActionButton arrowR14;
    FloatingActionButton arrowDL14;
    FloatingActionButton arrowDR14;

    FloatingActionButton black_stone15;
    FloatingActionButton arrowL15;
    FloatingActionButton arrowUL15;
    FloatingActionButton arrowUR15;
    FloatingActionButton arrowR15;
    FloatingActionButton arrowDL15;
    FloatingActionButton arrowDR15;

    FloatingActionButton black_stone16;
    FloatingActionButton arrowL16;
    FloatingActionButton arrowUL16;
    FloatingActionButton arrowUR16;
    FloatingActionButton arrowR16;
    FloatingActionButton arrowDL16;
    FloatingActionButton arrowDR16;

    FloatingActionButton black_stone17;
    FloatingActionButton arrowL17;
    FloatingActionButton arrowUL17;
    FloatingActionButton arrowUR17;
    FloatingActionButton arrowR17;
    FloatingActionButton arrowDL17;
    FloatingActionButton arrowDR17;

    FloatingActionButton black_stone18;
    FloatingActionButton arrowL18;
    FloatingActionButton arrowUL18;
    FloatingActionButton arrowUR18;
    FloatingActionButton arrowDL18;

    FloatingActionButton black_stone19;
    FloatingActionButton arrowUL19;
    FloatingActionButton arrowUR19;
    FloatingActionButton arrowR19;
    FloatingActionButton arrowDR19;

    FloatingActionButton black_stone20;
    FloatingActionButton arrowL20;
    FloatingActionButton arrowUL20;
    FloatingActionButton arrowUR20;
    FloatingActionButton arrowR20;
    FloatingActionButton arrowDL20;
    FloatingActionButton arrowDR20;

    FloatingActionButton black_stone21;
    FloatingActionButton arrowL21;
    FloatingActionButton arrowUL21;
    FloatingActionButton arrowUR21;
    FloatingActionButton arrowR21;
    FloatingActionButton arrowDL21;
    FloatingActionButton arrowDR21;

    FloatingActionButton black_stone22;
    FloatingActionButton arrowL22;
    FloatingActionButton arrowUL22;
    FloatingActionButton arrowUR22;
    FloatingActionButton arrowR22;
    FloatingActionButton arrowDL22;
    FloatingActionButton arrowDR22;

    FloatingActionButton black_stone23;
    FloatingActionButton arrowL23;
    FloatingActionButton arrowUL23;
    FloatingActionButton arrowUR23;
    FloatingActionButton arrowR23;
    FloatingActionButton arrowDL23;
    FloatingActionButton arrowDR23;

    FloatingActionButton black_stone24;
    FloatingActionButton arrowL24;
    FloatingActionButton arrowUL24;
    FloatingActionButton arrowUR24;
    FloatingActionButton arrowR24;
    FloatingActionButton arrowDL24;
    FloatingActionButton arrowDR24;

    FloatingActionButton black_stone25;
    FloatingActionButton arrowL25;
    FloatingActionButton arrowUL25;
    FloatingActionButton arrowUR25;
    FloatingActionButton arrowR25;
    FloatingActionButton arrowDL25;
    FloatingActionButton arrowDR25;

    FloatingActionButton black_stone26;
    FloatingActionButton arrowL26;
    FloatingActionButton arrowUL26;
    FloatingActionButton arrowUR26;
    FloatingActionButton arrowDL26;

    FloatingActionButton black_stone27;
    FloatingActionButton arrowUR27;
    FloatingActionButton arrowR27;
    FloatingActionButton arrowDR27;

    FloatingActionButton black_stone28;
    FloatingActionButton arrowL28;
    FloatingActionButton arrowUL28;
    FloatingActionButton arrowUR28;
    FloatingActionButton arrowR28;
    FloatingActionButton arrowDL28;
    FloatingActionButton arrowDR28;

    FloatingActionButton black_stone29;
    FloatingActionButton arrowL29;
    FloatingActionButton arrowUL29;
    FloatingActionButton arrowUR29;
    FloatingActionButton arrowR29;
    FloatingActionButton arrowDL29;
    FloatingActionButton arrowDR29;

    FloatingActionButton black_stone30;
    FloatingActionButton arrowL30;
    FloatingActionButton arrowUL30;
    FloatingActionButton arrowUR30;
    FloatingActionButton arrowR30;
    FloatingActionButton arrowDL30;
    FloatingActionButton arrowDR30;

    FloatingActionButton black_stone31;
    FloatingActionButton arrowL31;
    FloatingActionButton arrowUL31;
    FloatingActionButton arrowUR31;
    FloatingActionButton arrowR31;
    FloatingActionButton arrowDL31;
    FloatingActionButton arrowDR31;

    FloatingActionButton black_stone32;
    FloatingActionButton arrowL32;
    FloatingActionButton arrowUL32;
    FloatingActionButton arrowUR32;
    FloatingActionButton arrowR32;
    FloatingActionButton arrowDL32;
    FloatingActionButton arrowDR32;

    FloatingActionButton black_stone33;
    FloatingActionButton arrowL33;
    FloatingActionButton arrowUL33;
    FloatingActionButton arrowUR33;
    FloatingActionButton arrowR33;
    FloatingActionButton arrowDL33;
    FloatingActionButton arrowDR33;

    FloatingActionButton black_stone34;
    FloatingActionButton arrowL34;
    FloatingActionButton arrowUL34;
    FloatingActionButton arrowUR34;
    FloatingActionButton arrowR34;
    FloatingActionButton arrowDL34;
    FloatingActionButton arrowDR34;

    FloatingActionButton black_stone35;
    FloatingActionButton arrowL35;
    FloatingActionButton arrowUL35;
    FloatingActionButton arrowDL35;

    FloatingActionButton black_stone36;
    FloatingActionButton arrowUR36;
    FloatingActionButton arrowR36;
    FloatingActionButton arrowDL36;
    FloatingActionButton arrowDR36;

    FloatingActionButton black_stone37;
    FloatingActionButton arrowL37;
    FloatingActionButton arrowUL37;
    FloatingActionButton arrowUR37;
    FloatingActionButton arrowR37;
    FloatingActionButton arrowDL37;
    FloatingActionButton arrowDR37;

    FloatingActionButton black_stone38;
    FloatingActionButton arrowL38;
    FloatingActionButton arrowUL38;
    FloatingActionButton arrowUR38;
    FloatingActionButton arrowR38;
    FloatingActionButton arrowDL38;
    FloatingActionButton arrowDR38;

    FloatingActionButton black_stone39;
    FloatingActionButton arrowL39;
    FloatingActionButton arrowUL39;
    FloatingActionButton arrowUR39;
    FloatingActionButton arrowR39;
    FloatingActionButton arrowDL39;
    FloatingActionButton arrowDR39;

    FloatingActionButton black_stone40;
    FloatingActionButton arrowL40;
    FloatingActionButton arrowUL40;
    FloatingActionButton arrowUR40;
    FloatingActionButton arrowR40;
    FloatingActionButton arrowDL40;
    FloatingActionButton arrowDR40;

    FloatingActionButton black_stone41;
    FloatingActionButton arrowL41;
    FloatingActionButton arrowUL41;
    FloatingActionButton arrowUR41;
    FloatingActionButton arrowR41;
    FloatingActionButton arrowDL41;
    FloatingActionButton arrowDR41;

    FloatingActionButton black_stone42;
    FloatingActionButton arrowL42;
    FloatingActionButton arrowUL42;
    FloatingActionButton arrowUR42;
    FloatingActionButton arrowR42;
    FloatingActionButton arrowDL42;
    FloatingActionButton arrowDR42;

    FloatingActionButton black_stone43;
    FloatingActionButton arrowL43;
    FloatingActionButton arrowUL43;
    FloatingActionButton arrowDL43;
    FloatingActionButton arrowDR43;

    FloatingActionButton black_stone44;
    FloatingActionButton arrowUR44;
    FloatingActionButton arrowR44;
    FloatingActionButton arrowDL44;
    FloatingActionButton arrowDR44;

    FloatingActionButton black_stone45;
    FloatingActionButton arrowL45;
    FloatingActionButton arrowUL45;
    FloatingActionButton arrowUR45;
    FloatingActionButton arrowR45;
    FloatingActionButton arrowDL45;
    FloatingActionButton arrowDR45;

    FloatingActionButton black_stone46;
    FloatingActionButton arrowL46;
    FloatingActionButton arrowUL46;
    FloatingActionButton arrowUR46;
    FloatingActionButton arrowR46;
    FloatingActionButton arrowDL46;
    FloatingActionButton arrowDR46;

    FloatingActionButton black_stone47;
    FloatingActionButton arrowL47;
    FloatingActionButton arrowUL47;
    FloatingActionButton arrowUR47;
    FloatingActionButton arrowR47;
    FloatingActionButton arrowDL47;
    FloatingActionButton arrowDR47;

    FloatingActionButton black_stone48;
    FloatingActionButton arrowL48;
    FloatingActionButton arrowUL48;
    FloatingActionButton arrowUR48;
    FloatingActionButton arrowR48;
    FloatingActionButton arrowDL48;
    FloatingActionButton arrowDR48;

    FloatingActionButton black_stone49;
    FloatingActionButton arrowL49;
    FloatingActionButton arrowUL49;
    FloatingActionButton arrowUR49;
    FloatingActionButton arrowR49;
    FloatingActionButton arrowDL49;
    FloatingActionButton arrowDR49;

    FloatingActionButton black_stone50;
    FloatingActionButton arrowL50;
    FloatingActionButton arrowUL50;
    FloatingActionButton arrowDL50;
    FloatingActionButton arrowDR50;

    FloatingActionButton black_stone51;
    FloatingActionButton arrowUR51;
    FloatingActionButton arrowR51;
    FloatingActionButton arrowDL51;
    FloatingActionButton arrowDR51;

    FloatingActionButton black_stone52;
    FloatingActionButton arrowL52;
    FloatingActionButton arrowUL52;
    FloatingActionButton arrowUR52;
    FloatingActionButton arrowR52;
    FloatingActionButton arrowDL52;
    FloatingActionButton arrowDR52;

    FloatingActionButton black_stone53;
    FloatingActionButton arrowL53;
    FloatingActionButton arrowUL53;
    FloatingActionButton arrowUR53;
    FloatingActionButton arrowR53;
    FloatingActionButton arrowDL53;
    FloatingActionButton arrowDR53;

    FloatingActionButton black_stone54;
    FloatingActionButton arrowL54;
    FloatingActionButton arrowUL54;
    FloatingActionButton arrowUR54;
    FloatingActionButton arrowR54;
    FloatingActionButton arrowDL54;
    FloatingActionButton arrowDR54;

    FloatingActionButton black_stone55;
    FloatingActionButton arrowL55;
    FloatingActionButton arrowUL55;
    FloatingActionButton arrowUR55;
    FloatingActionButton arrowR55;
    FloatingActionButton arrowDL55;
    FloatingActionButton arrowDR55;

    FloatingActionButton black_stone56;
    FloatingActionButton arrowL56;
    FloatingActionButton arrowUL56;
    FloatingActionButton arrowDL56;
    FloatingActionButton arrowDR56;

    FloatingActionButton black_stone57;
    FloatingActionButton arrowR57;
    FloatingActionButton arrowDL57;
    FloatingActionButton arrowDR57;

    FloatingActionButton black_stone58;
    FloatingActionButton arrowL58;
    FloatingActionButton arrowR58;
    FloatingActionButton arrowDL58;
    FloatingActionButton arrowDR58;

    FloatingActionButton black_stone59;
    FloatingActionButton arrowL59;
    FloatingActionButton arrowR59;
    FloatingActionButton arrowDL59;
    FloatingActionButton arrowDR59;

    FloatingActionButton black_stone60;
    FloatingActionButton arrowL60;
    FloatingActionButton arrowR60;
    FloatingActionButton arrowDL60;
    FloatingActionButton arrowDR60;

    FloatingActionButton black_stone61;
    FloatingActionButton arrowL61;
    FloatingActionButton arrowDL61;
    FloatingActionButton arrowDR61;

    TextView tv_user1,tv_user2,tv_score1,tv_score2;


    int stoneExist[][];//0:없음,1:내돌,2:상대돌
    int nowWayInfo[][];//선택된 돌 주위로 갈 수 있는 길 저장


    Animation animTran1Start, animTran1End, animTran2Start, animTran2End,
            animTran3Start, animTran3End, animTran4Start, animTran4End,animTran5Start, animTran5End,animTran6Start, animTran6End;

    int clicked = 0;
    boolean opened = false;
    View view;
    ImageView imageView;
    Bitmap bitmap;
    Canvas canvas;
    Paint paint;

    Retrofit retrofit;
    retrofitInterface retrofitInterface;

    Call<Void> direction;

    private Socket mSocket2;
    private View decorView;
    private int	uiOption;
    String me = "";
    String you = "";
    String winner="";
    Boolean winnerExist=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        decorView = getWindow().getDecorView();
        uiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        decorView.setSystemUiVisibility( uiOption );

        try {
            mSocket2 = IO.socket(BASE_URL);
            mSocket2.connect();
        } catch (URISyntaxException e) {
        }

        tv_user1 = findViewById(R.id.player1Name);
        tv_user2 = findViewById(R.id.player2Name);
        tv_score1 = findViewById(R.id.player1Score);
        tv_score2 = findViewById(R.id.player2Score);

        Intent intent = getIntent();


        me = intent.getStringExtra("Me");
        you = intent.getStringExtra("You");

        tv_user1.setText(intent.getStringExtra("Me"));
        tv_user2.setText(intent.getStringExtra("You"));

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitInterface = retrofit.create(retrofitInterface.class);

        stoneExist = new int[9][9];

        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++){
                stoneExist[i][j]=1;
            }
        }
        for(int i=7;i<9;i++){
            for(int j=0;j<6;j++){
                stoneExist[i][j]=2;
            }
        }
        stoneExist[2][2]=1;
        stoneExist[2][3]=1;
        stoneExist[2][4]=1;

        stoneExist[6][2]=2;
        stoneExist[6][3]=2;
        stoneExist[6][4]=2;

        view = getLayoutInflater().from(this).inflate(R.layout.game_activity,null);

        animTran1Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_1);
        animTran1End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_1_end);
        animTran2Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_2);
        animTran2End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_2_end);
        animTran3Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_3);
        animTran3End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_3_end);
        animTran4Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_4);
        animTran4End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_4_end);
        animTran5Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_5);
        animTran5End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_5_end);
        animTran6Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_6);
        animTran6End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_6_end);

        black_stone1 = (FloatingActionButton)findViewById(R.id.black_stone1);
        arrowUL1 = (FloatingActionButton)findViewById(R.id.arrowUL1);
        arrowUR1 = (FloatingActionButton)findViewById(R.id.arrowUR1);
        arrowR1 = (FloatingActionButton)findViewById(R.id.arrowR1);

        black_stone2 = (FloatingActionButton)findViewById(R.id.black_stone2);
        arrowL2 = (FloatingActionButton)findViewById(R.id.arrowL2);
        arrowUL2 = (FloatingActionButton)findViewById(R.id.arrowUL2);
        arrowUR2 = (FloatingActionButton)findViewById(R.id.arrowUR2);
        arrowR2 = (FloatingActionButton)findViewById(R.id.arrowR2);

        black_stone3 = (FloatingActionButton)findViewById(R.id.black_stone3);
        arrowL3 = (FloatingActionButton)findViewById(R.id.arrowL3);
        arrowUL3 = (FloatingActionButton)findViewById(R.id.arrowUL3);
        arrowUR3 = (FloatingActionButton)findViewById(R.id.arrowUR3);
        arrowR3 = (FloatingActionButton)findViewById(R.id.arrowR3);

        black_stone4 = (FloatingActionButton)findViewById(R.id.black_stone4);
        arrowL4 = (FloatingActionButton)findViewById(R.id.arrowL4);
        arrowUL4 = (FloatingActionButton)findViewById(R.id.arrowUL4);
        arrowUR4 = (FloatingActionButton)findViewById(R.id.arrowUR4);
        arrowR4 = (FloatingActionButton)findViewById(R.id.arrowR4);

        black_stone5 = (FloatingActionButton)findViewById(R.id.black_stone5);
        arrowL5 = (FloatingActionButton)findViewById(R.id.arrowL5);
        arrowUL5 = (FloatingActionButton)findViewById(R.id.arrowUL5);
        arrowUR5 = (FloatingActionButton)findViewById(R.id.arrowUR5);

        black_stone6 = (FloatingActionButton)findViewById(R.id.black_stone6);
        arrowUL6 = (FloatingActionButton)findViewById(R.id.arrowUL6);
        arrowUR6 = (FloatingActionButton)findViewById(R.id.arrowUR6);
        arrowR6 = (FloatingActionButton)findViewById(R.id.arrowR6);
        arrowDR6 = (FloatingActionButton)findViewById(R.id.arrowDR6);

        black_stone7 = (FloatingActionButton)findViewById(R.id.black_stone7);
        arrowL7 = (FloatingActionButton)findViewById(R.id.arrowL7);
        arrowUL7 = (FloatingActionButton)findViewById(R.id.arrowUL7);
        arrowUR7 = (FloatingActionButton)findViewById(R.id.arrowUR7);
        arrowR7 = (FloatingActionButton)findViewById(R.id.arrowR7);
        arrowDL7 = (FloatingActionButton)findViewById(R.id.arrowDL7);
        arrowDR7 = (FloatingActionButton)findViewById(R.id.arrowDR7);

        black_stone8 = (FloatingActionButton)findViewById(R.id.black_stone8);
        arrowL8 = (FloatingActionButton)findViewById(R.id.arrowL8);
        arrowUL8 = (FloatingActionButton)findViewById(R.id.arrowUL8);
        arrowUR8 = (FloatingActionButton)findViewById(R.id.arrowUR8);
        arrowR8 = (FloatingActionButton)findViewById(R.id.arrowR8);
        arrowDL8 = (FloatingActionButton)findViewById(R.id.arrowDL8);
        arrowDR8 = (FloatingActionButton)findViewById(R.id.arrowDR8);

        black_stone9 = (FloatingActionButton)findViewById(R.id.black_stone9);
        arrowL9 = (FloatingActionButton)findViewById(R.id.arrowL9);
        arrowUL9 = (FloatingActionButton)findViewById(R.id.arrowUL9);
        arrowUR9 = (FloatingActionButton)findViewById(R.id.arrowUR9);
        arrowR9 = (FloatingActionButton)findViewById(R.id.arrowR9);
        arrowDL9 = (FloatingActionButton)findViewById(R.id.arrowDL9);
        arrowDR9 = (FloatingActionButton)findViewById(R.id.arrowDR9);

        black_stone10 = (FloatingActionButton)findViewById(R.id.black_stone10);
        arrowL10 = (FloatingActionButton)findViewById(R.id.arrowL10);
        arrowUL10 = (FloatingActionButton)findViewById(R.id.arrowUL10);
        arrowUR10 = (FloatingActionButton)findViewById(R.id.arrowUR10);
        arrowR10 = (FloatingActionButton)findViewById(R.id.arrowR10);
        arrowDL10 = (FloatingActionButton)findViewById(R.id.arrowDL10);
        arrowDR10 = (FloatingActionButton)findViewById(R.id.arrowDR10);

        black_stone11 = (FloatingActionButton)findViewById(R.id.black_stone11);
        arrowL11 = (FloatingActionButton)findViewById(R.id.arrowL11);
        arrowUL11 = (FloatingActionButton)findViewById(R.id.arrowUL11);
        arrowUR11 = (FloatingActionButton)findViewById(R.id.arrowUR11);
        arrowDL11 = (FloatingActionButton)findViewById(R.id.arrowDL11);

        black_stone12 = (FloatingActionButton)findViewById(R.id.black_stone12);
        arrowUL12 = (FloatingActionButton)findViewById(R.id.arrowUL12);
        arrowUR12 = (FloatingActionButton)findViewById(R.id.arrowUR12);
        arrowR12 = (FloatingActionButton)findViewById(R.id.arrowR12);
        arrowDR12 = (FloatingActionButton)findViewById(R.id.arrowDR12);

        black_stone13 = (FloatingActionButton)findViewById(R.id.black_stone13);
        arrowL13 = (FloatingActionButton)findViewById(R.id.arrowL13);
        arrowUL13 = (FloatingActionButton)findViewById(R.id.arrowUL13);
        arrowUR13 = (FloatingActionButton)findViewById(R.id.arrowUR13);
        arrowR13 = (FloatingActionButton)findViewById(R.id.arrowR13);
        arrowDL13 = (FloatingActionButton)findViewById(R.id.arrowDL13);
        arrowDR13 = (FloatingActionButton)findViewById(R.id.arrowDR13);

        black_stone14 = (FloatingActionButton)findViewById(R.id.black_stone14);
        arrowL14 = (FloatingActionButton)findViewById(R.id.arrowL14);
        arrowUL14 = (FloatingActionButton)findViewById(R.id.arrowUL14);
        arrowUR14 = (FloatingActionButton)findViewById(R.id.arrowUR14);
        arrowR14 = (FloatingActionButton)findViewById(R.id.arrowR14);
        arrowDL14 = (FloatingActionButton)findViewById(R.id.arrowDL14);
        arrowDR14 = (FloatingActionButton)findViewById(R.id.arrowDR14);

        black_stone15 = (FloatingActionButton)findViewById(R.id.black_stone15);
        arrowL15 = (FloatingActionButton)findViewById(R.id.arrowL15);
        arrowUL15 = (FloatingActionButton)findViewById(R.id.arrowUL15);
        arrowUR15 = (FloatingActionButton)findViewById(R.id.arrowUR15);
        arrowR15 = (FloatingActionButton)findViewById(R.id.arrowR15);
        arrowDL15 = (FloatingActionButton)findViewById(R.id.arrowDL15);
        arrowDR15 = (FloatingActionButton)findViewById(R.id.arrowDR15);

        black_stone16 = (FloatingActionButton)findViewById(R.id.black_stone16);
        arrowL16 = (FloatingActionButton)findViewById(R.id.arrowL16);
        arrowUL16 = (FloatingActionButton)findViewById(R.id.arrowUL16);
        arrowUR16 = (FloatingActionButton)findViewById(R.id.arrowUR16);
        arrowR16 = (FloatingActionButton)findViewById(R.id.arrowR16);
        arrowDL16 = (FloatingActionButton)findViewById(R.id.arrowDL16);
        arrowDR16 = (FloatingActionButton)findViewById(R.id.arrowDR16);

        black_stone17 = (FloatingActionButton)findViewById(R.id.black_stone17);
        arrowL17 = (FloatingActionButton)findViewById(R.id.arrowL17);
        arrowUL17 = (FloatingActionButton)findViewById(R.id.arrowUL17);
        arrowUR17 = (FloatingActionButton)findViewById(R.id.arrowUR17);
        arrowR17 = (FloatingActionButton)findViewById(R.id.arrowR17);
        arrowDL17 = (FloatingActionButton)findViewById(R.id.arrowDL17);
        arrowDR17 = (FloatingActionButton)findViewById(R.id.arrowDR17);

        black_stone18 = (FloatingActionButton)findViewById(R.id.black_stone18);
        arrowL18 = (FloatingActionButton)findViewById(R.id.arrowL18);
        arrowUL18 = (FloatingActionButton)findViewById(R.id.arrowUL18);
        arrowUR18 = (FloatingActionButton)findViewById(R.id.arrowUR18);
        arrowDL18 = (FloatingActionButton)findViewById(R.id.arrowDL18);

        black_stone19 = (FloatingActionButton)findViewById(R.id.black_stone19);
        arrowUL19 = (FloatingActionButton)findViewById(R.id.arrowUL19);
        arrowUR19 = (FloatingActionButton)findViewById(R.id.arrowUR19);
        arrowR19 = (FloatingActionButton)findViewById(R.id.arrowR19);
        arrowDR19 = (FloatingActionButton)findViewById(R.id.arrowDR19);

        black_stone20 = (FloatingActionButton)findViewById(R.id.black_stone20);
        arrowL20 = (FloatingActionButton)findViewById(R.id.arrowL20);
        arrowUL20 = (FloatingActionButton)findViewById(R.id.arrowUL20);
        arrowUR20 = (FloatingActionButton)findViewById(R.id.arrowUR20);
        arrowR20 = (FloatingActionButton)findViewById(R.id.arrowR20);
        arrowDL20 = (FloatingActionButton)findViewById(R.id.arrowDL20);
        arrowDR20 = (FloatingActionButton)findViewById(R.id.arrowDR20);

        black_stone21 = (FloatingActionButton)findViewById(R.id.black_stone21);
        arrowL21 = (FloatingActionButton)findViewById(R.id.arrowL21);
        arrowUL21 = (FloatingActionButton)findViewById(R.id.arrowUL21);
        arrowUR21 = (FloatingActionButton)findViewById(R.id.arrowUR21);
        arrowR21 = (FloatingActionButton)findViewById(R.id.arrowR21);
        arrowDL21 = (FloatingActionButton)findViewById(R.id.arrowDL21);
        arrowDR21 = (FloatingActionButton)findViewById(R.id.arrowDR21);

        black_stone22 = (FloatingActionButton)findViewById(R.id.black_stone22);
        arrowL22 = (FloatingActionButton)findViewById(R.id.arrowL22);
        arrowUL22 = (FloatingActionButton)findViewById(R.id.arrowUL22);
        arrowUR22 = (FloatingActionButton)findViewById(R.id.arrowUR22);
        arrowR22 = (FloatingActionButton)findViewById(R.id.arrowR22);
        arrowDL22 = (FloatingActionButton)findViewById(R.id.arrowDL22);
        arrowDR22 = (FloatingActionButton)findViewById(R.id.arrowDR22);

        black_stone23 = (FloatingActionButton)findViewById(R.id.black_stone23);
        arrowL23 = (FloatingActionButton)findViewById(R.id.arrowL23);
        arrowUL23 = (FloatingActionButton)findViewById(R.id.arrowUL23);
        arrowUR23 = (FloatingActionButton)findViewById(R.id.arrowUR23);
        arrowR23 = (FloatingActionButton)findViewById(R.id.arrowR23);
        arrowDL23 = (FloatingActionButton)findViewById(R.id.arrowDL23);
        arrowDR23 = (FloatingActionButton)findViewById(R.id.arrowDR23);

        black_stone24 = (FloatingActionButton)findViewById(R.id.black_stone24);
        arrowL24 = (FloatingActionButton)findViewById(R.id.arrowL24);
        arrowUL24 = (FloatingActionButton)findViewById(R.id.arrowUL24);
        arrowUR24 = (FloatingActionButton)findViewById(R.id.arrowUR24);
        arrowR24 = (FloatingActionButton)findViewById(R.id.arrowR24);
        arrowDL24 = (FloatingActionButton)findViewById(R.id.arrowDL24);
        arrowDR24 = (FloatingActionButton)findViewById(R.id.arrowDR24);

        black_stone25 = (FloatingActionButton)findViewById(R.id.black_stone25);
        arrowL25 = (FloatingActionButton)findViewById(R.id.arrowL25);
        arrowUL25 = (FloatingActionButton)findViewById(R.id.arrowUL25);
        arrowUR25 = (FloatingActionButton)findViewById(R.id.arrowUR25);
        arrowR25 = (FloatingActionButton)findViewById(R.id.arrowR25);
        arrowDL25 = (FloatingActionButton)findViewById(R.id.arrowDL25);
        arrowDR25 = (FloatingActionButton)findViewById(R.id.arrowDR25);

        black_stone26 = (FloatingActionButton)findViewById(R.id.black_stone26);
        arrowL26 = (FloatingActionButton)findViewById(R.id.arrowL26);
        arrowUL26 = (FloatingActionButton)findViewById(R.id.arrowUL26);
        arrowUR26 = (FloatingActionButton)findViewById(R.id.arrowUR26);
        arrowDL26 = (FloatingActionButton)findViewById(R.id.arrowDL26);

        black_stone27 = (FloatingActionButton)findViewById(R.id.black_stone27);
        arrowUR27 = (FloatingActionButton)findViewById(R.id.arrowUR27);
        arrowR27 = (FloatingActionButton)findViewById(R.id.arrowR27);
        arrowDR27 = (FloatingActionButton)findViewById(R.id.arrowDR27);

        black_stone28 = (FloatingActionButton)findViewById(R.id.black_stone28);
        arrowL28 = (FloatingActionButton)findViewById(R.id.arrowL28);
        arrowUL28 = (FloatingActionButton)findViewById(R.id.arrowUL28);
        arrowUR28 = (FloatingActionButton)findViewById(R.id.arrowUR28);
        arrowR28 = (FloatingActionButton)findViewById(R.id.arrowR28);
        arrowDL28 = (FloatingActionButton)findViewById(R.id.arrowDL28);
        arrowDR28 = (FloatingActionButton)findViewById(R.id.arrowDR28);

        black_stone29 = (FloatingActionButton)findViewById(R.id.black_stone29);
        arrowL29 = (FloatingActionButton)findViewById(R.id.arrowL29);
        arrowUL29 = (FloatingActionButton)findViewById(R.id.arrowUL29);
        arrowUR29 = (FloatingActionButton)findViewById(R.id.arrowUR29);
        arrowR29 = (FloatingActionButton)findViewById(R.id.arrowR29);
        arrowDL29 = (FloatingActionButton)findViewById(R.id.arrowDL29);
        arrowDR29 = (FloatingActionButton)findViewById(R.id.arrowDR29);

        black_stone30 = (FloatingActionButton)findViewById(R.id.black_stone30);
        arrowL30 = (FloatingActionButton)findViewById(R.id.arrowL30);
        arrowUL30 = (FloatingActionButton)findViewById(R.id.arrowUL30);
        arrowUR30 = (FloatingActionButton)findViewById(R.id.arrowUR30);
        arrowR30 = (FloatingActionButton)findViewById(R.id.arrowR30);
        arrowDL30 = (FloatingActionButton)findViewById(R.id.arrowDL30);
        arrowDR30 = (FloatingActionButton)findViewById(R.id.arrowDR30);

        black_stone31 = (FloatingActionButton)findViewById(R.id.black_stone31);
        arrowL31 = (FloatingActionButton)findViewById(R.id.arrowL31);
        arrowUL31 = (FloatingActionButton)findViewById(R.id.arrowUL31);
        arrowUR31 = (FloatingActionButton)findViewById(R.id.arrowUR31);
        arrowR31 = (FloatingActionButton)findViewById(R.id.arrowR31);
        arrowDL31 = (FloatingActionButton)findViewById(R.id.arrowDL31);
        arrowDR31 = (FloatingActionButton)findViewById(R.id.arrowDR31);

        black_stone32 = (FloatingActionButton)findViewById(R.id.black_stone32);
        arrowL32 = (FloatingActionButton)findViewById(R.id.arrowL32);
        arrowUL32 = (FloatingActionButton)findViewById(R.id.arrowUL32);
        arrowUR32 = (FloatingActionButton)findViewById(R.id.arrowUR32);
        arrowR32 = (FloatingActionButton)findViewById(R.id.arrowR32);
        arrowDL32 = (FloatingActionButton)findViewById(R.id.arrowDL32);
        arrowDR32 = (FloatingActionButton)findViewById(R.id.arrowDR32);

        black_stone33 = (FloatingActionButton)findViewById(R.id.black_stone33);
        arrowL33 = (FloatingActionButton)findViewById(R.id.arrowL33);
        arrowUL33 = (FloatingActionButton)findViewById(R.id.arrowUL33);
        arrowUR33 = (FloatingActionButton)findViewById(R.id.arrowUR33);
        arrowR33 = (FloatingActionButton)findViewById(R.id.arrowR33);
        arrowDL33 = (FloatingActionButton)findViewById(R.id.arrowDL33);
        arrowDR33 = (FloatingActionButton)findViewById(R.id.arrowDR33);

        black_stone34 = (FloatingActionButton)findViewById(R.id.black_stone34);
        arrowL34 = (FloatingActionButton)findViewById(R.id.arrowL34);
        arrowUL34 = (FloatingActionButton)findViewById(R.id.arrowUL34);
        arrowUR34 = (FloatingActionButton)findViewById(R.id.arrowUR34);
        arrowR34 = (FloatingActionButton)findViewById(R.id.arrowR34);
        arrowDL34 = (FloatingActionButton)findViewById(R.id.arrowDL34);
        arrowDR34 = (FloatingActionButton)findViewById(R.id.arrowDR34);

        black_stone35 = (FloatingActionButton)findViewById(R.id.black_stone35);
        arrowL35 = (FloatingActionButton)findViewById(R.id.arrowL35);
        arrowUL35 = (FloatingActionButton)findViewById(R.id.arrowUL35);
        arrowDL35 = (FloatingActionButton)findViewById(R.id.arrowDL35);

        black_stone36 = (FloatingActionButton)findViewById(R.id.black_stone36);
        arrowUR36 = (FloatingActionButton)findViewById(R.id.arrowUR36);
        arrowR36 = (FloatingActionButton)findViewById(R.id.arrowR36);
        arrowDL36 = (FloatingActionButton)findViewById(R.id.arrowDL36);
        arrowDR36 = (FloatingActionButton)findViewById(R.id.arrowDR36);

        black_stone37 = (FloatingActionButton)findViewById(R.id.black_stone37);
        arrowL37 = (FloatingActionButton)findViewById(R.id.arrowL37);
        arrowUL37 = (FloatingActionButton)findViewById(R.id.arrowUL37);
        arrowUR37 = (FloatingActionButton)findViewById(R.id.arrowUR37);
        arrowR37 = (FloatingActionButton)findViewById(R.id.arrowR37);
        arrowDL37 = (FloatingActionButton)findViewById(R.id.arrowDL37);
        arrowDR37 = (FloatingActionButton)findViewById(R.id.arrowDR37);

        black_stone38 = (FloatingActionButton)findViewById(R.id.black_stone38);
        arrowL38 = (FloatingActionButton)findViewById(R.id.arrowL38);
        arrowUL38 = (FloatingActionButton)findViewById(R.id.arrowUL38);
        arrowUR38 = (FloatingActionButton)findViewById(R.id.arrowUR38);
        arrowR38 = (FloatingActionButton)findViewById(R.id.arrowR38);
        arrowDL38 = (FloatingActionButton)findViewById(R.id.arrowDL38);
        arrowDR38 = (FloatingActionButton)findViewById(R.id.arrowDR38);

        black_stone39 = (FloatingActionButton)findViewById(R.id.black_stone39);
        arrowL39 = (FloatingActionButton)findViewById(R.id.arrowL39);
        arrowUL39 = (FloatingActionButton)findViewById(R.id.arrowUL39);
        arrowUR39 = (FloatingActionButton)findViewById(R.id.arrowUR39);
        arrowR39 = (FloatingActionButton)findViewById(R.id.arrowR39);
        arrowDL39 = (FloatingActionButton)findViewById(R.id.arrowDL39);
        arrowDR39 = (FloatingActionButton)findViewById(R.id.arrowDR39);

        black_stone40 = (FloatingActionButton)findViewById(R.id.black_stone40);
        arrowL40 = (FloatingActionButton)findViewById(R.id.arrowL40);
        arrowUL40 = (FloatingActionButton)findViewById(R.id.arrowUL40);
        arrowUR40 = (FloatingActionButton)findViewById(R.id.arrowUR40);
        arrowR40 = (FloatingActionButton)findViewById(R.id.arrowR40);
        arrowDL40 = (FloatingActionButton)findViewById(R.id.arrowDL40);
        arrowDR40 = (FloatingActionButton)findViewById(R.id.arrowDR40);

        black_stone41 = (FloatingActionButton)findViewById(R.id.black_stone41);
        arrowL41 = (FloatingActionButton)findViewById(R.id.arrowL41);
        arrowUL41 = (FloatingActionButton)findViewById(R.id.arrowUL41);
        arrowUR41 = (FloatingActionButton)findViewById(R.id.arrowUR41);
        arrowR41 = (FloatingActionButton)findViewById(R.id.arrowR41);
        arrowDL41 = (FloatingActionButton)findViewById(R.id.arrowDL41);
        arrowDR41 = (FloatingActionButton)findViewById(R.id.arrowDR41);

        black_stone42 = (FloatingActionButton)findViewById(R.id.black_stone42);
        arrowL42 = (FloatingActionButton)findViewById(R.id.arrowL42);
        arrowUL42 = (FloatingActionButton)findViewById(R.id.arrowUL42);
        arrowUR42 = (FloatingActionButton)findViewById(R.id.arrowUR42);
        arrowR42 = (FloatingActionButton)findViewById(R.id.arrowR42);
        arrowDL42 = (FloatingActionButton)findViewById(R.id.arrowDL42);
        arrowDR42 = (FloatingActionButton)findViewById(R.id.arrowDR42);

        black_stone43 = (FloatingActionButton)findViewById(R.id.black_stone43);
        arrowL43 = (FloatingActionButton)findViewById(R.id.arrowL43);
        arrowUL43 = (FloatingActionButton)findViewById(R.id.arrowUL43);
        arrowDL43 = (FloatingActionButton)findViewById(R.id.arrowDL43);
        arrowDR43 = (FloatingActionButton)findViewById(R.id.arrowDR43);

        black_stone44 = (FloatingActionButton)findViewById(R.id.black_stone44);
        arrowUR44 = (FloatingActionButton)findViewById(R.id.arrowUR44);
        arrowR44 = (FloatingActionButton)findViewById(R.id.arrowR44);
        arrowDL44 = (FloatingActionButton)findViewById(R.id.arrowDL44);
        arrowDR44 = (FloatingActionButton)findViewById(R.id.arrowDR44);

        black_stone45 = (FloatingActionButton)findViewById(R.id.black_stone45);
        arrowL45 = (FloatingActionButton)findViewById(R.id.arrowL45);
        arrowUL45 = (FloatingActionButton)findViewById(R.id.arrowUL45);
        arrowUR45 = (FloatingActionButton)findViewById(R.id.arrowUR45);
        arrowR45 = (FloatingActionButton)findViewById(R.id.arrowR45);
        arrowDL45 = (FloatingActionButton)findViewById(R.id.arrowDL45);
        arrowDR45 = (FloatingActionButton)findViewById(R.id.arrowDR45);

        black_stone46 = (FloatingActionButton)findViewById(R.id.black_stone46);
        arrowL46 = (FloatingActionButton)findViewById(R.id.arrowL46);
        arrowUL46 = (FloatingActionButton)findViewById(R.id.arrowUL46);
        arrowUR46 = (FloatingActionButton)findViewById(R.id.arrowUR46);
        arrowR46 = (FloatingActionButton)findViewById(R.id.arrowR46);
        arrowDL46 = (FloatingActionButton)findViewById(R.id.arrowDL46);
        arrowDR46 = (FloatingActionButton)findViewById(R.id.arrowDR46);

        black_stone47 = (FloatingActionButton)findViewById(R.id.black_stone47);
        arrowL47 = (FloatingActionButton)findViewById(R.id.arrowL47);
        arrowUL47 = (FloatingActionButton)findViewById(R.id.arrowUL47);
        arrowUR47 = (FloatingActionButton)findViewById(R.id.arrowUR47);
        arrowR47 = (FloatingActionButton)findViewById(R.id.arrowR47);
        arrowDL47 = (FloatingActionButton)findViewById(R.id.arrowDL47);
        arrowDR47 = (FloatingActionButton)findViewById(R.id.arrowDR47);

        black_stone48 = (FloatingActionButton)findViewById(R.id.black_stone48);
        arrowL48 = (FloatingActionButton)findViewById(R.id.arrowL48);
        arrowUL48 = (FloatingActionButton)findViewById(R.id.arrowUL48);
        arrowUR48 = (FloatingActionButton)findViewById(R.id.arrowUR48);
        arrowR48 = (FloatingActionButton)findViewById(R.id.arrowR48);
        arrowDL48 = (FloatingActionButton)findViewById(R.id.arrowDL48);
        arrowDR48 = (FloatingActionButton)findViewById(R.id.arrowDR48);

        black_stone49 = (FloatingActionButton)findViewById(R.id.black_stone49);
        arrowL49 = (FloatingActionButton)findViewById(R.id.arrowL49);
        arrowUL49 = (FloatingActionButton)findViewById(R.id.arrowUL49);
        arrowUR49 = (FloatingActionButton)findViewById(R.id.arrowUR49);
        arrowR49 = (FloatingActionButton)findViewById(R.id.arrowR49);
        arrowDL49 = (FloatingActionButton)findViewById(R.id.arrowDL49);
        arrowDR49 = (FloatingActionButton)findViewById(R.id.arrowDR49);

        black_stone50 = (FloatingActionButton)findViewById(R.id.black_stone50);
        arrowL50 = (FloatingActionButton)findViewById(R.id.arrowL50);
        arrowUL50 = (FloatingActionButton)findViewById(R.id.arrowUL50);
        arrowDL50 = (FloatingActionButton)findViewById(R.id.arrowDL50);
        arrowDR50 = (FloatingActionButton)findViewById(R.id.arrowDR50);

        black_stone51 = (FloatingActionButton)findViewById(R.id.black_stone51);
        arrowUR51 = (FloatingActionButton)findViewById(R.id.arrowUR51);
        arrowR51 = (FloatingActionButton)findViewById(R.id.arrowR51);
        arrowDL51 = (FloatingActionButton)findViewById(R.id.arrowDL51);
        arrowDR51 = (FloatingActionButton)findViewById(R.id.arrowDR51);

        black_stone52 = (FloatingActionButton)findViewById(R.id.black_stone52);
        arrowL52 = (FloatingActionButton)findViewById(R.id.arrowL52);
        arrowUL52 = (FloatingActionButton)findViewById(R.id.arrowUL52);
        arrowUR52 = (FloatingActionButton)findViewById(R.id.arrowUR52);
        arrowR52 = (FloatingActionButton)findViewById(R.id.arrowR52);
        arrowDL52 = (FloatingActionButton)findViewById(R.id.arrowDL52);
        arrowDR52 = (FloatingActionButton)findViewById(R.id.arrowDR52);

        black_stone53 = (FloatingActionButton)findViewById(R.id.black_stone53);
        arrowL53 = (FloatingActionButton)findViewById(R.id.arrowL53);
        arrowUL53 = (FloatingActionButton)findViewById(R.id.arrowUL53);
        arrowUR53 = (FloatingActionButton)findViewById(R.id.arrowUR53);
        arrowR53 = (FloatingActionButton)findViewById(R.id.arrowR53);
        arrowDL53 = (FloatingActionButton)findViewById(R.id.arrowDL53);
        arrowDR53 = (FloatingActionButton)findViewById(R.id.arrowDR53);

        black_stone54 = (FloatingActionButton)findViewById(R.id.black_stone54);
        arrowL54 = (FloatingActionButton)findViewById(R.id.arrowL54);
        arrowUL54 = (FloatingActionButton)findViewById(R.id.arrowUL54);
        arrowUR54 = (FloatingActionButton)findViewById(R.id.arrowUR54);
        arrowR54 = (FloatingActionButton)findViewById(R.id.arrowR54);
        arrowDL54 = (FloatingActionButton)findViewById(R.id.arrowDL54);
        arrowDR54 = (FloatingActionButton)findViewById(R.id.arrowDR54);

        black_stone55 = (FloatingActionButton)findViewById(R.id.black_stone55);
        arrowL55 = (FloatingActionButton)findViewById(R.id.arrowL55);
        arrowUL55 = (FloatingActionButton)findViewById(R.id.arrowUL55);
        arrowUR55 = (FloatingActionButton)findViewById(R.id.arrowUR55);
        arrowR55 = (FloatingActionButton)findViewById(R.id.arrowR55);
        arrowDL55 = (FloatingActionButton)findViewById(R.id.arrowDL55);
        arrowDR55 = (FloatingActionButton)findViewById(R.id.arrowDR55);

        black_stone56 = (FloatingActionButton)findViewById(R.id.black_stone56);
        arrowL56 = (FloatingActionButton)findViewById(R.id.arrowL56);
        arrowUL56 = (FloatingActionButton)findViewById(R.id.arrowUL56);
        arrowDL56 = (FloatingActionButton)findViewById(R.id.arrowDL56);
        arrowDR56 = (FloatingActionButton)findViewById(R.id.arrowDR56);

        black_stone57 = (FloatingActionButton)findViewById(R.id.black_stone57);
        arrowR57 = (FloatingActionButton)findViewById(R.id.arrowR57);
        arrowDL57 = (FloatingActionButton)findViewById(R.id.arrowDL57);
        arrowDR57 = (FloatingActionButton)findViewById(R.id.arrowDR57);

        black_stone58 = (FloatingActionButton)findViewById(R.id.black_stone58);
        arrowL58 = (FloatingActionButton)findViewById(R.id.arrowL58);
        arrowR58 = (FloatingActionButton)findViewById(R.id.arrowR58);
        arrowDL58 = (FloatingActionButton)findViewById(R.id.arrowDL58);
        arrowDR58 = (FloatingActionButton)findViewById(R.id.arrowDR58);

        black_stone59 = (FloatingActionButton)findViewById(R.id.black_stone59);
        arrowL59 = (FloatingActionButton)findViewById(R.id.arrowL59);
        arrowR59 = (FloatingActionButton)findViewById(R.id.arrowR59);
        arrowDL59 = (FloatingActionButton)findViewById(R.id.arrowDL59);
        arrowDR59 = (FloatingActionButton)findViewById(R.id.arrowDR59);

        black_stone60 = (FloatingActionButton)findViewById(R.id.black_stone60);
        arrowL60 = (FloatingActionButton)findViewById(R.id.arrowL60);
        arrowR60 = (FloatingActionButton)findViewById(R.id.arrowR60);
        arrowDL60 = (FloatingActionButton)findViewById(R.id.arrowDL60);
        arrowDR60 = (FloatingActionButton)findViewById(R.id.arrowDR60);

        black_stone61 = (FloatingActionButton)findViewById(R.id.black_stone61);
        arrowL61 = (FloatingActionButton)findViewById(R.id.arrowL61);
        arrowDL61 = (FloatingActionButton)findViewById(R.id.arrowDL61);
        arrowDR61 = (FloatingActionButton)findViewById(R.id.arrowDR61);



        imageView = (ImageView)findViewById(R.id.background);
        bitmap = Bitmap.createBitmap(1200,1080,Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        imageView.setImageBitmap(bitmap);

        black_stone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,1);
            }
        });
        arrowUR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(1)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(1,nowWayInfo[0],0);
                    moving(1,result[0],result[1]);
                }
            }
        });
        arrowR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(1)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(1,nowWayInfo[1],1);
                    moving(1,result[0],result[1]);
                }
            }
        });
        arrowUL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(1)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(1,nowWayInfo[5],5);
                    moving(1,result[0],result[1]);
                }
            }
        });

        black_stone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,2);
            }
        });
        arrowUR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(2)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(2,nowWayInfo[0],0);
                    moving(2,result[0],result[1]);
                }
            }
        });
        arrowR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(2)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(2,nowWayInfo[1],1);
                    moving(2,result[0],result[1]);
                }
            }
        });
        arrowL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(2)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(2,nowWayInfo[4],4);
                    moving(2,result[0],result[1]);
                }
            }
        });
        arrowUL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(2)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(2,nowWayInfo[5],5);
                    moving(2,result[0],result[1]);
                }
            }
        });

        black_stone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,3);
            }
        });
        arrowUR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(3)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(3,nowWayInfo[0],0);
                    moving(3,result[0],result[1]);
                }
            }
        });
        arrowR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(3)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(3,nowWayInfo[1],1);
                    moving(3,result[0],result[1]);
                }
            }
        });
        arrowL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(3)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(3,nowWayInfo[4],4);
                    moving(3,result[0],result[1]);
                }
            }
        });
        arrowUL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(3)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(3,nowWayInfo[5],5);
                    moving(3,result[0],result[1]);
                }
            }
        });

        black_stone4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,4);
            }
        });
        arrowUR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(4)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(4,nowWayInfo[0],0);
                    moving(4,result[0],result[1]);
                }
            }
        });
        arrowR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(4)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(4,nowWayInfo[1],1);
                    moving(4,result[0],result[1]);
                }
            }
        });
        arrowL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(4)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(4,nowWayInfo[4],4);
                    moving(4,result[0],result[1]);
                }
            }
        });
        arrowUL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(4)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(4,nowWayInfo[5],5);
                    moving(4,result[0],result[1]);
                }
            }
        });

        black_stone5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,5);
            }
        });
        arrowUR5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(5)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(5,nowWayInfo[0],0);
                    moving(5,result[0],result[1]);
                }
            }
        });
        arrowL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(5)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(5,nowWayInfo[4],4);
                    moving(5,result[0],result[1]);
                }
            }
        });
        arrowUL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(5)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(5,nowWayInfo[5],5);
                    moving(5,result[0],result[1]);
                }
            }
        });

        black_stone6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,6);
            }
        });
        arrowUR6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(6)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(6,nowWayInfo[0],0);
                    moving(6,result[0],result[1]);
                }
            }
        });
        arrowR6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(6)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(6,nowWayInfo[1],1);
                    moving(6,result[0],result[1]);
                }
            }
        });
        arrowDR6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(6)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(6,nowWayInfo[2],2);
                    moving(6,result[0],result[1]);
                }
            }
        });
        arrowUL6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(6)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(6,nowWayInfo[5],5);
                    moving(6,result[0],result[1]);
                }
            }
        });

        black_stone7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canMove(7);
                onBlackButtonClicked(v,7);
            }
        });
        arrowUR7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(7)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(7,nowWayInfo[0],0);
                    moving(7,result[0],result[1]);
                }
            }
        });
        arrowR7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(7)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(7,nowWayInfo[1],1);
                    moving(7,result[0],result[1]);
                }
            }
        });
        arrowDR7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(7)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(7,nowWayInfo[2],2);
                    moving(7,result[0],result[1]);
                }
            }
        });
        arrowDL7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(7)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(7,nowWayInfo[3],3);
                    moving(7,result[0],result[1]);
                }
            }
        });
        arrowL7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(7)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(7,nowWayInfo[4],4);
                    moving(7,result[0],result[1]);
                }
            }
        });
        arrowUL7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(7)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(7,nowWayInfo[5],5);
                    moving(7,result[0],result[1]);
                }
            }
        });

        black_stone8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canMove(8);
                onBlackButtonClicked(v,8);
            }
        });
        arrowUR8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(8)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(8,nowWayInfo[0],0);
                    moving(8,result[0],result[1]);
                }
            }
        });
        arrowR8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(8)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(8,nowWayInfo[1],1);
                    moving(8,result[0],result[1]);
                }
            }
        });
        arrowDR8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(8)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(8,nowWayInfo[2],2);
                    moving(8,result[0],result[1]);
                }
            }
        });
        arrowDL8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(8)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(8,nowWayInfo[3],3);
                    moving(8,result[0],result[1]);
                }
            }
        });
        arrowL8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(8)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(8,nowWayInfo[4],4);
                    moving(8,result[0],result[1]);
                }
            }
        });
        arrowUL8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(8)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(8,nowWayInfo[5],5);
                    moving(8,result[0],result[1]);
                }
            }
        });

        black_stone9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,9);
            }
        });
        arrowUR9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(9)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(9,nowWayInfo[0],0);
                    moving(9,result[0],result[1]);
                }
            }
        });
        arrowR9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(9)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(9,nowWayInfo[1],1);
                    moving(9,result[0],result[1]);
                }
            }
        });
        arrowDR9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(9)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(9,nowWayInfo[2],2);
                    moving(9,result[0],result[1]);
                }
            }
        });
        arrowDL9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(9)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(9,nowWayInfo[3],3);
                    moving(9,result[0],result[1]);
                }
            }
        });
        arrowL9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(9)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(9,nowWayInfo[4],4);
                    moving(9,result[0],result[1]);
                }
            }
        });
        arrowUL9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(9)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(9,nowWayInfo[5],5);
                    moving(9,result[0],result[1]);
                }
            }
        });

        black_stone10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,10);
            }
        });
        arrowUR10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(10)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(10,nowWayInfo[0],0);
                    moving(10,result[0],result[1]);
                }
            }
        });
        arrowR10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(10)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(10,nowWayInfo[1],1);
                    moving(10,result[0],result[1]);
                }
            }
        });
        arrowDR10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(10)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(10,nowWayInfo[2],2);
                    moving(10,result[0],result[1]);
                }
            }
        });
        arrowDL10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(10)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(10,nowWayInfo[3],3);
                    moving(10,result[0],result[1]);
                }
            }
        });
        arrowL10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(10)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(10,nowWayInfo[4],4);
                    moving(10,result[0],result[1]);
                }
            }
        });
        arrowUL10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(10)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(10,nowWayInfo[5],5);
                    moving(10,result[0],result[1]);
                }
            }
        });

        black_stone11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,11);
            }
        });
        arrowUR11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(11)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(11,nowWayInfo[0],0);
                    moving(11,result[0],result[1]);
                }
            }
        });
        arrowDL11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(11)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(11,nowWayInfo[3],3);
                    moving(11,result[0],result[1]);
                }
            }
        });
        arrowL11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(11)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(11,nowWayInfo[4],4);
                    moving(11,result[0],result[1]);
                }
            }
        });
        arrowUL11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(11)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(11,nowWayInfo[5],5);
                    moving(11,result[0],result[1]);
                }
            }
        });

        black_stone12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,12);
            }
        });
        arrowUR12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(12)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(12,nowWayInfo[0],0);
                    moving(12,result[0],result[1]);
                }
            }
        });
        arrowR12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(12)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(12,nowWayInfo[1],1);
                    moving(12,result[0],result[1]);
                }
            }
        });
        arrowDR12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(12)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(12,nowWayInfo[2],2);
                    moving(12,result[0],result[1]);
                }
            }
        });
        arrowUL12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(12)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(12,nowWayInfo[5],5);
                    moving(12,result[0],result[1]);
                }
            }
        });

        black_stone13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,13);
            }
        });
        arrowUR13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(13)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(13,nowWayInfo[0],0);
                    moving(13,result[0],result[1]);
                }
            }
        });
        arrowR13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(13)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(13,nowWayInfo[1],1);
                    moving(13,result[0],result[1]);
                }
            }
        });
        arrowDR13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(13)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(13,nowWayInfo[2],2);
                    moving(13,result[0],result[1]);
                }
            }
        });
        arrowDL13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(13)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(13,nowWayInfo[3],3);
                    moving(13,result[0],result[1]);
                }
            }
        });
        arrowL13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(13)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(13,nowWayInfo[4],4);
                    moving(13,result[0],result[1]);
                }
            }
        });
        arrowUL13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(13)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(13,nowWayInfo[5],5);
                    moving(13,result[0],result[1]);
                }
            }
        });

        black_stone14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,14);
                canMove(14);
            }
        });
        arrowUR14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(14)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(14,nowWayInfo[0],0);
                    moving(14,result[0],result[1]);
                }
            }
        });
        arrowR14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(14)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(14,nowWayInfo[1],1);
                    moving(14,result[0],result[1]);
                }
            }
        });
        arrowDR14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(14)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(14,nowWayInfo[2],2);
                    moving(14,result[0],result[1]);
                }
            }
        });
        arrowDL14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(14)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(14,nowWayInfo[3],3);
                    moving(14,result[0],result[1]);
                }
            }
        });
        arrowL14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(14)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(14,nowWayInfo[4],4);
                    moving(14,result[0],result[1]);
                }
            }
        });
        arrowUL14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(14)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(14,nowWayInfo[5],5);
                    moving(14,result[0],result[1]);
                }
            }
        });

        black_stone15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,15);
            }
        });
        arrowUR15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(15)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(15,nowWayInfo[0],0);
                    moving(15,result[0],result[1]);
                }
            }
        });
        arrowR15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(15)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(15,nowWayInfo[1],1);
                    moving(15,result[0],result[1]);
                }
            }
        });
        arrowDR15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(15)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(15,nowWayInfo[2],2);
                    moving(15,result[0],result[1]);
                }
            }
        });
        arrowDL15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(15)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(15,nowWayInfo[3],3);
                    moving(15,result[0],result[1]);
                }
            }
        });
        arrowL15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(15)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(15,nowWayInfo[4],4);
                    moving(15,result[0],result[1]);
                }
            }
        });
        arrowUL15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(15)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(15,nowWayInfo[5],5);
                    moving(15,result[0],result[1]);
                }
            }
        });

        black_stone16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,16);
            }
        });
        arrowUR16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(16)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(16,nowWayInfo[0],0);
                    moving(16,result[0],result[1]);
                }
            }
        });
        arrowR16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(16)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(16,nowWayInfo[1],1);
                    moving(16,result[0],result[1]);
                }
            }
        });
        arrowDR16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(16)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(16,nowWayInfo[2],2);
                    moving(16,result[0],result[1]);
                }
            }
        });
        arrowDL16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(16)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(16,nowWayInfo[3],3);
                    moving(16,result[0],result[1]);
                }
            }
        });
        arrowL16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(16)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(16,nowWayInfo[4],4);
                    moving(16,result[0],result[1]);
                }
            }
        });
        arrowUL16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(16)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(16,nowWayInfo[5],5);
                    moving(16,result[0],result[1]);
                }
            }
        });

        black_stone17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,17);
            }
        });
        arrowUR17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(17)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(17,nowWayInfo[0],0);
                    moving(17,result[0],result[1]);
                }
            }
        });
        arrowR17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(17)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(17,nowWayInfo[1],1);
                    moving(17,result[0],result[1]);
                }
            }
        });
        arrowDR17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(17)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(17,nowWayInfo[2],2);
                    moving(17,result[0],result[1]);
                }
            }
        });
        arrowDL17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(17)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(17,nowWayInfo[3],3);
                    moving(17,result[0],result[1]);
                }
            }
        });
        arrowL17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(17)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(17,nowWayInfo[4],4);
                    moving(17,result[0],result[1]);
                }
            }
        });
        arrowUL17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(17)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(17,nowWayInfo[5],5);
                    moving(17,result[0],result[1]);
                }
            }
        });

        black_stone18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,18);
            }
        });
        arrowUR18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(18)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(18,nowWayInfo[0],0);
                    moving(18,result[0],result[1]);
                }
            }
        });
        arrowDL18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(18)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(18,nowWayInfo[3],3);
                    moving(18,result[0],result[1]);
                }
            }
        });
        arrowL18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(18)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(18,nowWayInfo[4],4);
                    moving(18,result[0],result[1]);
                }
            }
        });
        arrowUL18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(18)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(18,nowWayInfo[5],5);
                    moving(18,result[0],result[1]);
                }
            }
        });

        black_stone19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,19);
            }
        });
        arrowUR19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(19)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(19,nowWayInfo[0],0);
                    moving(19,result[0],result[1]);
                }
            }
        });
        arrowR19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(19)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(19,nowWayInfo[1],1);
                    moving(19,result[0],result[1]);
                }
            }
        });
        arrowDR19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(19)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(19,nowWayInfo[2],2);
                    moving(19,result[0],result[1]);
                }
            }
        });
        arrowUL19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(19)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(19,nowWayInfo[5],5);
                    moving(19,result[0],result[1]);
                }
            }
        });

        black_stone20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,20);
            }
        });
        arrowUR20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(20)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(20,nowWayInfo[0],0);
                    moving(20,result[0],result[1]);
                }
            }
        });
        arrowR20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(20)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(20,nowWayInfo[1],1);
                    moving(20,result[0],result[1]);
                }
            }
        });
        arrowDR20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(20)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(20,nowWayInfo[2],2);
                    moving(20,result[0],result[1]);
                }
            }
        });
        arrowDL20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(20)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(20,nowWayInfo[3],3);
                    moving(20,result[0],result[1]);
                }
            }
        });
        arrowL20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(20)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(20,nowWayInfo[4],4);
                    moving(20,result[0],result[1]);
                }
            }
        });
        arrowUL20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(20)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(20,nowWayInfo[5],5);
                    moving(20,result[0],result[1]);
                }
            }
        });

        black_stone21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,21);
            }
        });
        arrowUR21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(21)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(21,nowWayInfo[0],0);
                    moving(21,result[0],result[1]);
                }
            }
        });
        arrowR21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(21)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(21,nowWayInfo[1],1);
                    moving(21,result[0],result[1]);
                }
            }
        });
        arrowDR21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(21)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(21,nowWayInfo[2],2);
                    moving(21,result[0],result[1]);
                }
            }
        });
        arrowDL21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(21)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(21,nowWayInfo[3],3);
                    moving(21,result[0],result[1]);
                }
            }
        });
        arrowL21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(21)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(21,nowWayInfo[4],4);
                    moving(21,result[0],result[1]);
                }
            }
        });
        arrowUL21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(21)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(21,nowWayInfo[5],5);
                    moving(21,result[0],result[1]);
                }
            }
        });

        black_stone22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,22);
            }
        });
        arrowUR22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(22)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(22,nowWayInfo[0],0);
                    moving(22,result[0],result[1]);
                }
            }
        });
        arrowR22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(22)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(22,nowWayInfo[1],1);
                    moving(22,result[0],result[1]);
                }
            }
        });
        arrowDR22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(22)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(22,nowWayInfo[2],2);
                    moving(22,result[0],result[1]);
                }
            }
        });
        arrowDL22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(22)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(22,nowWayInfo[3],3);
                    moving(22,result[0],result[1]);
                }
            }
        });
        arrowL22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(22)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(22,nowWayInfo[4],4);
                    moving(22,result[0],result[1]);
                }
            }
        });
        arrowUL22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(22)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(22,nowWayInfo[5],5);
                    moving(22,result[0],result[1]);
                }
            }
        });

        black_stone23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,23);
            }
        });
        arrowUR23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(23)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(23,nowWayInfo[0],0);
                    moving(23,result[0],result[1]);
                }
            }
        });
        arrowR23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(23)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(23,nowWayInfo[1],1);
                    moving(23,result[0],result[1]);
                }
            }
        });
        arrowDR23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(23)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(23,nowWayInfo[2],2);
                    moving(23,result[0],result[1]);
                }
            }
        });
        arrowDL23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(23)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(23,nowWayInfo[3],3);
                    moving(23,result[0],result[1]);
                }
            }
        });
        arrowL23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(23)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(23,nowWayInfo[4],4);
                    moving(23,result[0],result[1]);
                }
            }
        });
        arrowUL23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(23)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(23,nowWayInfo[5],5);
                    moving(23,result[0],result[1]);
                }
            }
        });

        black_stone24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,24);
            }
        });
        arrowUR24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(24)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(24,nowWayInfo[0],0);
                    moving(24,result[0],result[1]);
                }
            }
        });
        arrowR24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(24)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(24,nowWayInfo[1],1);
                    moving(24,result[0],result[1]);
                }
            }
        });
        arrowDR24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(24)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(24,nowWayInfo[2],2);
                    moving(24,result[0],result[1]);
                }
            }
        });
        arrowDL24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(24)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(24,nowWayInfo[3],3);
                    moving(24,result[0],result[1]);
                }
            }
        });
        arrowL24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(24)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(24,nowWayInfo[4],4);
                    moving(24,result[0],result[1]);
                }
            }
        });
        arrowUL24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(24)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(24,nowWayInfo[5],5);
                    moving(24,result[0],result[1]);
                }
            }
        });

        black_stone25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,25);
            }
        });
        arrowUR25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(25)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(25,nowWayInfo[0],0);
                    moving(25,result[0],result[1]);
                }
            }
        });
        arrowR25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(25)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(25,nowWayInfo[1],1);
                    moving(25,result[0],result[1]);
                }
            }
        });
        arrowDR25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(25)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(25,nowWayInfo[2],2);
                    moving(25,result[0],result[1]);
                }
            }
        });
        arrowDL25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(25)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(25,nowWayInfo[3],3);
                    moving(25,result[0],result[1]);
                }
            }
        });
        arrowL25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(25)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(25,nowWayInfo[4],4);
                    moving(25,result[0],result[1]);
                }
            }
        });
        arrowUL25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(25)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(25,nowWayInfo[5],5);
                    moving(25,result[0],result[1]);
                }
            }
        });

        black_stone26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,26);
            }
        });
        arrowUR26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(26)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(26,nowWayInfo[0],0);
                    moving(26,result[0],result[1]);
                }
            }
        });
        arrowDL26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(26)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(26,nowWayInfo[3],3);
                    moving(26,result[0],result[1]);
                }
            }
        });
        arrowL26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(26)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(26,nowWayInfo[4],4);
                    moving(26,result[0],result[1]);
                }
            }
        });
        arrowUL26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(26)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(26,nowWayInfo[5],5);
                    moving(26,result[0],result[1]);
                }
            }
        });

        black_stone27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,27);
            }
        });
        arrowUR27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(27)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(27,nowWayInfo[0],0);
                    moving(27,result[0],result[1]);
                }
            }
        });
        arrowR27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(27)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(27,nowWayInfo[1],1);
                    moving(27,result[0],result[1]);
                }
            }
        });
        arrowDR27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(27)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(27,nowWayInfo[2],2);
                    moving(27,result[0],result[1]);
                }
            }
        });

        black_stone28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,28);
            }
        });
        arrowUR28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(28)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(28,nowWayInfo[0],0);
                    moving(28,result[0],result[1]);
                }
            }
        });
        arrowR28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(28)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(28,nowWayInfo[1],1);
                    moving(28,result[0],result[1]);
                }
            }
        });
        arrowDR28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(28)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(28,nowWayInfo[2],2);
                    moving(28,result[0],result[1]);
                }
            }
        });
        arrowDL28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(28)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(28,nowWayInfo[3],3);
                    moving(28,result[0],result[1]);
                }
            }
        });
        arrowL28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(28)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(28,nowWayInfo[4],4);
                    moving(28,result[0],result[1]);
                }
            }
        });
        arrowUL28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(28)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(28,nowWayInfo[5],5);
                    moving(28,result[0],result[1]);
                }
            }
        });

        black_stone29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,29);
            }
        });
        arrowUR29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(29)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(29,nowWayInfo[0],0);
                    moving(29,result[0],result[1]);
                }
            }
        });
        arrowR29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(29)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(29,nowWayInfo[1],1);
                    moving(29,result[0],result[1]);
                }
            }
        });
        arrowDR29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(29)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(29,nowWayInfo[2],2);
                    moving(29,result[0],result[1]);
                }
            }
        });
        arrowDL29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(29)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(29,nowWayInfo[3],3);
                    moving(29,result[0],result[1]);
                }
            }
        });
        arrowL29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(29)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(29,nowWayInfo[4],4);
                    moving(29,result[0],result[1]);
                }
            }
        });
        arrowUL29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(29)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(29,nowWayInfo[5],5);
                    moving(29,result[0],result[1]);
                }
            }
        });

        black_stone30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,30);
            }
        });
        arrowUR30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(30)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(30,nowWayInfo[0],0);
                    moving(30,result[0],result[1]);
                }
            }
        });
        arrowR30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(30)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(30,nowWayInfo[1],1);
                    moving(30,result[0],result[1]);
                }
            }
        });
        arrowDR30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(30)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(30,nowWayInfo[2],2);
                    moving(30,result[0],result[1]);
                }
            }
        });
        arrowDL30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(30)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(30,nowWayInfo[3],3);
                    moving(30,result[0],result[1]);
                }
            }
        });
        arrowL30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(30)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(30,nowWayInfo[4],4);
                    moving(30,result[0],result[1]);
                }
            }
        });
        arrowUL30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(30)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(30,nowWayInfo[5],5);
                    moving(30,result[0],result[1]);
                }
            }
        });

        black_stone31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,31);
            }
        });
        arrowUR31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(31)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(31,nowWayInfo[0],0);
                    moving(31,result[0],result[1]);
                }
            }
        });
        arrowR31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(31)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(31,nowWayInfo[1],1);
                    moving(31,result[0],result[1]);
                }
            }
        });
        arrowDR31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(31)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(31,nowWayInfo[2],2);
                    moving(31,result[0],result[1]);
                }
            }
        });
        arrowDL31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(31)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(31,nowWayInfo[3],3);
                    moving(31,result[0],result[1]);
                }
            }
        });
        arrowL31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(31)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(31,nowWayInfo[4],4);
                    moving(31,result[0],result[1]);
                }
            }
        });
        arrowUL31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(31)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(31,nowWayInfo[5],5);
                    moving(31,result[0],result[1]);
                }
            }
        });

        black_stone32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,32);
            }
        });
        arrowUR32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(32)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(32,nowWayInfo[0],0);
                    moving(32,result[0],result[1]);
                }
            }
        });
        arrowR32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(32)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(32,nowWayInfo[1],1);
                    moving(32,result[0],result[1]);
                }
            }
        });
        arrowDR32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(32)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(32,nowWayInfo[2],2);
                    moving(32,result[0],result[1]);
                }
            }
        });
        arrowDL32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(32)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(32,nowWayInfo[3],3);
                    moving(32,result[0],result[1]);
                }
            }
        });
        arrowL32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(32)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(32,nowWayInfo[4],4);
                    moving(32,result[0],result[1]);
                }
            }
        });
        arrowUL32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(32)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(32,nowWayInfo[5],5);
                    moving(32,result[0],result[1]);
                }
            }
        });

        black_stone33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,33);
            }
        });
        arrowUR33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(33)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(33,nowWayInfo[0],0);
                    moving(33,result[0],result[1]);
                }
            }
        });
        arrowR33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(33)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(33,nowWayInfo[1],1);
                    moving(33,result[0],result[1]);
                }
            }
        });
        arrowDR33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(33)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(33,nowWayInfo[2],2);
                    moving(33,result[0],result[1]);
                }
            }
        });
        arrowDL33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(33)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(33,nowWayInfo[3],3);
                    moving(33,result[0],result[1]);
                }
            }
        });
        arrowL33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(33)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(33,nowWayInfo[4],4);
                    moving(33,result[0],result[1]);
                }
            }
        });
        arrowUL33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(33)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(33,nowWayInfo[5],5);
                    moving(33,result[0],result[1]);
                }
            }
        });

        black_stone34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,34);
            }
        });
        arrowUR34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(34)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(34,nowWayInfo[0],0);
                    moving(34,result[0],result[1]);
                }
            }
        });
        arrowR34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(34)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(34,nowWayInfo[1],1);
                    moving(34,result[0],result[1]);
                }
            }
        });
        arrowDR34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(34)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(34,nowWayInfo[2],2);
                    moving(34,result[0],result[1]);
                }
            }
        });
        arrowDL34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(34)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(34,nowWayInfo[3],3);
                    moving(34,result[0],result[1]);
                }
            }
        });
        arrowL34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(34)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(34,nowWayInfo[4],4);
                    moving(34,result[0],result[1]);
                }
            }
        });
        arrowUL34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(34)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(34,nowWayInfo[5],5);
                    moving(34,result[0],result[1]);
                }
            }
        });

        black_stone35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,35);
            }
        });
        arrowDL35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(35)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(35,nowWayInfo[3],3);
                    moving(35,result[0],result[1]);
                }
            }
        });
        arrowL35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(35)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(35,nowWayInfo[4],4);
                    moving(35,result[0],result[1]);
                }
            }
        });
        arrowUL35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(35)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(35,nowWayInfo[5],5);
                    moving(35,result[0],result[1]);
                }
            }
        });

        black_stone36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,36);
            }
        });
        arrowUR36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(36)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(36,nowWayInfo[0],0);
                    moving(36,result[0],result[1]);
                }
            }
        });
        arrowR36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(36)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(36,nowWayInfo[1],1);
                    moving(36,result[0],result[1]);
                }
            }
        });
        arrowDR36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(36)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(36,nowWayInfo[2],2);
                    moving(36,result[0],result[1]);
                }
            }
        });
        arrowDL36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(36)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(36,nowWayInfo[3],3);
                    moving(36,result[0],result[1]);
                }
            }
        });

        black_stone37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,37);
            }
        });
        arrowUR37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(37)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(37,nowWayInfo[0],0);
                    moving(37,result[0],result[1]);
                }
            }
        });
        arrowR37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(37)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(37,nowWayInfo[1],1);
                    moving(37,result[0],result[1]);
                }
            }
        });
        arrowDR37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(37)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(37,nowWayInfo[2],2);
                    moving(37,result[0],result[1]);
                }
            }
        });
        arrowDL37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(37)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(37,nowWayInfo[3],3);
                    moving(37,result[0],result[1]);
                }
            }
        });
        arrowL37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(37)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(37,nowWayInfo[4],4);
                    moving(37,result[0],result[1]);
                }
            }
        });
        arrowUL37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(37)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(37,nowWayInfo[5],5);
                    moving(37,result[0],result[1]);
                }
            }
        });

        black_stone38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,38);
            }
        });
        arrowUR38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(38)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(38,nowWayInfo[0],0);
                    moving(38,result[0],result[1]);
                }
            }
        });
        arrowR38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(38)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(38,nowWayInfo[1],1);
                    moving(38,result[0],result[1]);
                }
            }
        });
        arrowDR38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(38)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(38,nowWayInfo[2],2);
                    moving(38,result[0],result[1]);
                }
            }
        });
        arrowDL38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(38)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(38,nowWayInfo[3],3);
                    moving(38,result[0],result[1]);
                }
            }
        });
        arrowL38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(38)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(38,nowWayInfo[4],4);
                    moving(38,result[0],result[1]);
                }
            }
        });
        arrowUL38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(38)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(38,nowWayInfo[5],5);
                    moving(38,result[0],result[1]);
                }
            }
        });

        black_stone39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,39);
            }
        });
        arrowUR39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(39)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(39,nowWayInfo[0],0);
                    moving(39,result[0],result[1]);
                }
            }
        });
        arrowR39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(39)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(39,nowWayInfo[1],1);
                    moving(39,result[0],result[1]);
                }
            }
        });
        arrowDR39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(39)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(39,nowWayInfo[2],2);
                    moving(39,result[0],result[1]);
                }
            }
        });
        arrowDL39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(39)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(39,nowWayInfo[3],3);
                    moving(39,result[0],result[1]);
                }
            }
        });
        arrowL39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(39)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(39,nowWayInfo[4],4);
                    moving(39,result[0],result[1]);
                }
            }
        });
        arrowUL39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(39)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(39,nowWayInfo[5],5);
                    moving(39,result[0],result[1]);
                }
            }
        });

        black_stone40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,40);
            }
        });
        arrowUR40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(40)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(40,nowWayInfo[0],0);
                    moving(40,result[0],result[1]);
                }
            }
        });
        arrowR40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(40)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(40,nowWayInfo[1],1);
                    moving(40,result[0],result[1]);
                }
            }
        });
        arrowDR40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(40)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(40,nowWayInfo[2],2);
                    moving(40,result[0],result[1]);
                }
            }
        });
        arrowDL40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(40)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(40,nowWayInfo[3],3);
                    moving(40,result[0],result[1]);
                }
            }
        });
        arrowL40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(40)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(40,nowWayInfo[4],4);
                    moving(40,result[0],result[1]);
                }
            }
        });
        arrowUL40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(40)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(40,nowWayInfo[5],5);
                    moving(40,result[0],result[1]);
                }
            }
        });

        black_stone41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,41);
            }
        });
        arrowUR41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(41)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(41,nowWayInfo[0],0);
                    moving(41,result[0],result[1]);
                }
            }
        });
        arrowR41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(41)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(41,nowWayInfo[1],1);
                    moving(41,result[0],result[1]);
                }
            }
        });
        arrowDR41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(41)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(41,nowWayInfo[2],2);
                    moving(41,result[0],result[1]);
                }
            }
        });
        arrowDL41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(41)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(41,nowWayInfo[3],3);
                    moving(41,result[0],result[1]);
                }
            }
        });
        arrowL41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(41)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(41,nowWayInfo[4],4);
                    moving(41,result[0],result[1]);
                }
            }
        });
        arrowUL41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(41)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(41,nowWayInfo[5],5);
                    moving(41,result[0],result[1]);
                }
            }
        });

        black_stone42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,42);
            }
        });
        arrowUR42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(42)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(42,nowWayInfo[0],0);
                    moving(42,result[0],result[1]);
                }
            }
        });
        arrowR42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(42)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(42,nowWayInfo[1],1);
                    moving(42,result[0],result[1]);
                }
            }
        });
        arrowDR42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(42)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(42,nowWayInfo[2],2);
                    moving(42,result[0],result[1]);
                }
            }
        });
        arrowDL42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(42)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(42,nowWayInfo[3],3);
                    moving(42,result[0],result[1]);
                }
            }
        });
        arrowL42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(42)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(42,nowWayInfo[4],4);
                    moving(42,result[0],result[1]);
                }
            }
        });
        arrowUL42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(42)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(42,nowWayInfo[5],5);
                    moving(42,result[0],result[1]);
                }
            }
        });

        black_stone43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,43);
            }
        });
        arrowDR43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(43)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(43,nowWayInfo[2],2);
                    moving(43,result[0],result[1]);
                }
            }
        });
        arrowDL43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(43)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(43,nowWayInfo[3],3);
                    moving(43,result[0],result[1]);
                }
            }
        });
        arrowL43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(43)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(43,nowWayInfo[4],4);
                    moving(43,result[0],result[1]);
                }
            }
        });
        arrowUL43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(43)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(43,nowWayInfo[5],5);
                    moving(43,result[0],result[1]);
                }
            }
        });

        black_stone44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,44);
            }
        });
        arrowUR44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(44)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(44,nowWayInfo[0],0);
                    moving(44,result[0],result[1]);
                }
            }
        });
        arrowR44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(44)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(44,nowWayInfo[1],1);
                    moving(44,result[0],result[1]);
                }
            }
        });
        arrowDR44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(44)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(44,nowWayInfo[2],2);
                    moving(44,result[0],result[1]);
                }
            }
        });
        arrowDL44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(44)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(44,nowWayInfo[3],3);
                    moving(44,result[0],result[1]);
                }
            }
        });

        black_stone45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,45);
            }
        });
        arrowUR45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(45)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(45,nowWayInfo[0],0);
                    moving(45,result[0],result[1]);
                }
            }
        });
        arrowR45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(45)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(45,nowWayInfo[1],1);
                    moving(45,result[0],result[1]);
                }
            }
        });
        arrowDR45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(45)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(45,nowWayInfo[2],2);
                    moving(45,result[0],result[1]);
                }
            }
        });
        arrowDL45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(45)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(45,nowWayInfo[3],3);
                    moving(45,result[0],result[1]);
                }
            }
        });
        arrowL45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(45)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(45,nowWayInfo[4],4);
                    moving(45,result[0],result[1]);
                }
            }
        });
        arrowUL45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(45)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(45,nowWayInfo[5],5);
                    moving(45,result[0],result[1]);
                }
            }
        });

        black_stone46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,46);
            }
        });
        arrowUR46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(46)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(46,nowWayInfo[0],0);
                    moving(46,result[0],result[1]);
                }
            }
        });
        arrowR46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(46)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(46,nowWayInfo[1],1);
                    moving(46,result[0],result[1]);
                }
            }
        });
        arrowDR46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(46)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(46,nowWayInfo[2],2);
                    moving(46,result[0],result[1]);
                }
            }
        });
        arrowDL46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(46)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(46,nowWayInfo[3],3);
                    moving(46,result[0],result[1]);
                }
            }
        });
        arrowL46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(46)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(46,nowWayInfo[4],4);
                    moving(46,result[0],result[1]);
                }
            }
        });
        arrowUL46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(46)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(46,nowWayInfo[5],5);
                    moving(46,result[0],result[1]);
                }
            }
        });

        black_stone47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,47);
            }
        });
        arrowUR47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(47)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(47,nowWayInfo[0],0);
                    moving(47,result[0],result[1]);
                }
            }
        });
        arrowR47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(47)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(47,nowWayInfo[1],1);
                    moving(47,result[0],result[1]);
                }
            }
        });
        arrowDR47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(47)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(47,nowWayInfo[2],2);
                    moving(47,result[0],result[1]);
                }
            }
        });
        arrowDL47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(47)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(47,nowWayInfo[3],3);
                    moving(47,result[0],result[1]);
                }
            }
        });
        arrowL47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(47)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(47,nowWayInfo[4],4);
                    moving(47,result[0],result[1]);
                }
            }
        });
        arrowUL47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(47)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(47,nowWayInfo[5],5);
                    moving(47,result[0],result[1]);
                }
            }
        });

        black_stone48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,48);
            }
        });
        arrowUR48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(48)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(48,nowWayInfo[0],0);
                    moving(48,result[0],result[1]);
                }
            }
        });
        arrowR48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(48)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(48,nowWayInfo[1],1);
                    moving(48,result[0],result[1]);
                }
            }
        });
        arrowDR48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(48)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(48,nowWayInfo[2],2);
                    moving(48,result[0],result[1]);
                }
            }
        });
        arrowDL48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(48)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(48,nowWayInfo[3],3);
                    moving(48,result[0],result[1]);
                }
            }
        });
        arrowL48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(48)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(48,nowWayInfo[4],4);
                    moving(48,result[0],result[1]);
                }
            }
        });
        arrowUL48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(48)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(48,nowWayInfo[5],5);
                    moving(48,result[0],result[1]);
                }
            }
        });

        black_stone49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,49);
            }
        });
        arrowUR49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(49)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(49,nowWayInfo[0],0);
                    moving(49,result[0],result[1]);
                }
            }
        });
        arrowR49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(49)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(49,nowWayInfo[1],1);
                    moving(49,result[0],result[1]);
                }
            }
        });
        arrowDR49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(49)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(49,nowWayInfo[2],2);
                    moving(49,result[0],result[1]);
                }
            }
        });
        arrowDL49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(49)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(49,nowWayInfo[3],3);
                    moving(49,result[0],result[1]);
                }
            }
        });
        arrowL49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(49)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(49,nowWayInfo[4],4);
                    moving(49,result[0],result[1]);
                }
            }
        });
        arrowUL49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(49)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(49,nowWayInfo[5],5);
                    moving(49,result[0],result[1]);
                }
            }
        });

        black_stone50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,50);
            }
        });
        arrowDR50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(50)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(50,nowWayInfo[2],2);
                    moving(50,result[0],result[1]);
                }
            }
        });
        arrowDL50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(50)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(50,nowWayInfo[3],3);
                    moving(50,result[0],result[1]);
                }
            }
        });
        arrowL50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(50)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(50,nowWayInfo[4],4);
                    moving(50,result[0],result[1]);
                }
            }
        });
        arrowUL50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(50)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(50,nowWayInfo[5],5);
                    moving(50,result[0],result[1]);
                }
            }
        });

        black_stone51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,51);
            }
        });
        arrowUR51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(51)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(51,nowWayInfo[0],0);
                    moving(51,result[0],result[1]);
                }
            }
        });
        arrowR51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(51)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(51,nowWayInfo[1],1);
                    moving(51,result[0],result[1]);
                }
            }
        });
        arrowDR51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(51)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(51,nowWayInfo[2],2);
                    moving(51,result[0],result[1]);
                }
            }
        });
        arrowDL51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(51)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(51,nowWayInfo[3],3);
                    moving(51,result[0],result[1]);
                }
            }
        });

        black_stone52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,52);
            }
        });
        arrowUR52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(52)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(52,nowWayInfo[0],0);
                    moving(52,result[0],result[1]);
                }
            }
        });
        arrowR52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(52)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(52,nowWayInfo[1],1);
                    moving(52,result[0],result[1]);
                }
            }
        });
        arrowDR52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(52)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(52,nowWayInfo[2],2);
                    moving(52,result[0],result[1]);
                }
            }
        });
        arrowDL52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(52)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(52,nowWayInfo[3],3);
                    moving(52,result[0],result[1]);
                }
            }
        });
        arrowL52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(52)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(52,nowWayInfo[4],4);
                    moving(52,result[0],result[1]);
                }
            }
        });
        arrowUL52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(52)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(52,nowWayInfo[5],5);
                    moving(52,result[0],result[1]);
                }
            }
        });

        black_stone53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,53);
            }
        });
        arrowUR53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(53)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(53,nowWayInfo[0],0);
                    moving(53,result[0],result[1]);
                }
            }
        });
        arrowR53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(53)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(53,nowWayInfo[1],1);
                    moving(53,result[0],result[1]);
                }
            }
        });
        arrowDR53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(53)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(53,nowWayInfo[2],2);
                    moving(53,result[0],result[1]);
                }
            }
        });
        arrowDL53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(53)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(53,nowWayInfo[3],3);
                    moving(53,result[0],result[1]);
                }
            }
        });
        arrowL53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(53)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(53,nowWayInfo[4],4);
                    moving(53,result[0],result[1]);
                }
            }
        });
        arrowUL53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(53)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(53,nowWayInfo[5],5);
                    moving(53,result[0],result[1]);
                }
            }
        });

        black_stone54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,54);
            }
        });
        arrowUR54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(54)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(54,nowWayInfo[0],0);
                    moving(54,result[0],result[1]);
                }
            }
        });
        arrowR54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(54)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(54,nowWayInfo[1],1);
                    moving(54,result[0],result[1]);
                }
            }
        });
        arrowDR54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(54)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(54,nowWayInfo[2],2);
                    moving(54,result[0],result[1]);
                }
            }
        });
        arrowDL54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(54)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(54,nowWayInfo[3],3);
                    moving(54,result[0],result[1]);
                }
            }
        });
        arrowL54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(54)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(54,nowWayInfo[4],4);
                    moving(54,result[0],result[1]);
                }
            }
        });
        arrowUL54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(54)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(54,nowWayInfo[5],5);
                    moving(54,result[0],result[1]);
                }
            }
        });

        black_stone55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,55);
            }
        });
        arrowUR55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(55)[0]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(55,nowWayInfo[0],0);
                    moving(55,result[0],result[1]);
                }
            }
        });
        arrowR55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(55)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(55,nowWayInfo[1],1);
                    moving(55,result[0],result[1]);
                }
            }
        });
        arrowDR55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(55)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(55,nowWayInfo[2],2);
                    moving(55,result[0],result[1]);
                }
            }
        });
        arrowDL55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(55)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(55,nowWayInfo[3],3);
                    moving(55,result[0],result[1]);
                }
            }
        });
        arrowL55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(55)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(55,nowWayInfo[4],4);
                    moving(55,result[0],result[1]);
                }
            }
        });
        arrowUL55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(55)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(55,nowWayInfo[5],5);
                    moving(55,result[0],result[1]);
                }
            }
        });

        black_stone56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,56);
            }
        });
        arrowDR56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(56)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(56,nowWayInfo[2],2);
                    moving(56,result[0],result[1]);
                }
            }
        });
        arrowDL56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(56)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(56,nowWayInfo[3],3);
                    moving(56,result[0],result[1]);
                }
            }
        });
        arrowL56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(56)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(56,nowWayInfo[4],4);
                    moving(56,result[0],result[1]);
                }
            }
        });
        arrowUL56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(56)[5]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(56,nowWayInfo[5],5);
                    moving(56,result[0],result[1]);
                }
            }
        });

        black_stone57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,57);
            }
        });
        arrowR57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(57)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(57,nowWayInfo[1],1);
                    moving(57,result[0],result[1]);
                }
            }
        });
        arrowDR57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(57)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(57,nowWayInfo[2],2);
                    moving(57,result[0],result[1]);
                }
            }
        });
        arrowDL57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(57)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(57,nowWayInfo[3],3);
                    moving(57,result[0],result[1]);
                }
            }
        });

        black_stone58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,58);
            }
        });
        arrowR58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(58)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(58,nowWayInfo[1],1);
                    moving(58,result[0],result[1]);
                }
            }
        });
        arrowDR58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(58)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(58,nowWayInfo[2],2);
                    moving(58,result[0],result[1]);
                }
            }
        });
        arrowDL58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(58)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(58,nowWayInfo[3],3);
                    moving(58,result[0],result[1]);
                }
            }
        });
        arrowL58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(58)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(58,nowWayInfo[4],4);
                    moving(58,result[0],result[1]);
                }
            }
        });

        black_stone59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,59);
            }
        });
        arrowR59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(59)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(59,nowWayInfo[1],1);
                    moving(59,result[0],result[1]);
                }
            }
        });
        arrowDR59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(59)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(59,nowWayInfo[2],2);
                    moving(59,result[0],result[1]);
                }
            }
        });
        arrowDL59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(59)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(59,nowWayInfo[3],3);
                    moving(59,result[0],result[1]);
                }
            }
        });
        arrowL59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(59)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(59,nowWayInfo[4],4);
                    moving(59,result[0],result[1]);
                }
            }
        });

        black_stone60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,60);
            }
        });
        arrowR60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(60)[1]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(60,nowWayInfo[1],1);
                    moving(60,result[0],result[1]);
                }
            }
        });
        arrowDR60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(60)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(60,nowWayInfo[2],2);
                    moving(60,result[0],result[1]);
                }
            }
        });
        arrowDL60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(60)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(60,nowWayInfo[3],3);
                    moving(60,result[0],result[1]);
                }
            }
        });
        arrowL60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(60)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(60,nowWayInfo[4],4);
                    moving(60,result[0],result[1]);
                }
            }
        });

        black_stone61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,61);
            }
        });
        arrowDR61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(61)[2]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(61,nowWayInfo[2],2);
                    moving(61,result[0],result[1]);
                }
            }
        });
        arrowDL61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(61)[3]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(61,nowWayInfo[3],3);
                    moving(61,result[0],result[1]);
                }
            }
        });
        arrowL61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!canMove(61)[4]){
                    Toast.makeText(view.getContext(),"움직일 수 없습니다",Toast.LENGTH_SHORT).show();
                }else{
                    int[] result= movingPoint(61,nowWayInfo[4],4);
                    moving(61,result[0],result[1]);
                }
            }
        });

        init();
        turnStartInit();

        mSocket2.on("changedBlue", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if( !((String) args[1]).equalsIgnoreCase(me)){
                            int num1_row,num1_col;
                            num1_row = numToRowCol(Integer.parseInt((String) args[0]))[0];
                            num1_col = numToRowCol(Integer.parseInt((String) args[0]))[1];
                            stoneExist[num1_row][num1_col]=1;
                            turnStartInit();
                        }
                    }
                });
            }
        });
        mSocket2.on("winner", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                winner = (String)args[0];
                winnerExist = true;
            }
        });

        mSocket2.on("changedCanvas", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                Log.d("왜 안될까...","들어오긴 하네...");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if( !((String) args[3]).equalsIgnoreCase(me)){
                            int num1_row,num1_col,num2_row,num2_col,num2_kind;
                            String none = "None";
                            if(!((String) args[1]).equalsIgnoreCase(none)){
                                num1_row = numToRowCol(Integer.parseInt((String) args[0]))[0];
                                num1_col = numToRowCol(Integer.parseInt((String) args[0]))[1];

                                num2_row = numToRowCol(Integer.parseInt((String) args[1]))[0];
                                num2_col = numToRowCol(Integer.parseInt((String) args[1]))[1];

                                num2_kind = Integer.parseInt((String) args[2]);

                                stoneExist[num1_row][num1_col]=0;
                                int num2_kind_temp=0;
                                if(num2_kind==2){
                                    num2_kind_temp=1;
                                }
                                else if(num2_kind==1){
                                    num2_kind_temp=2;
                                }
                                stoneExist[num2_row][num2_col]=num2_kind_temp;
                                turnStartInit();
                                Log.d("된다규","벽아님");
                            }
                            else{
                                num1_row = numToRowCol(Integer.parseInt((String) args[0]))[0];
                                num1_col = numToRowCol(Integer.parseInt((String) args[0]))[1];

                                stoneExist[num1_row][num1_col]=0;
                                turnStartInit();
                                Log.d("된다아","벽임");
                            }
                        }
                    }
                });
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        if (requestCode == 1) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void turnStartInit() {//캔버스에 흰 돌 이미지 찍어주기
        int score1, score2;
        score1=0;
        score2=0;
        int row, col;
        row = 0;
        int yCen=0;
        int xCen=0;
        int r=63;
        allUnabled();
        allInVisible();
        canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
        drawingBackground();
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.blue));
        paint.setAlpha(200);
        RectF rect = new RectF();

        for (col = 0; col < 5; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=1;
        for (col = 0; col < 6; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=2;
        for (col = 0; col < 7; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=3;
        for (col = 0; col < 8; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=4;
        for (col = 0; col < 9; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=5;
        for (col = 0; col < 8; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=6;
        for (col = 0; col < 7; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=7;
        for (col = 0; col < 6; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        row=8;
        for (col = 0; col < 5; col++) {
            if (stoneExist[row][col] == 1) {
                score1++;
                setStone(rowcolToNum(row, col));
            }
            if (stoneExist[row][col] == 2) {
                score2++;
                yCen=70+120*(8-row);
                xCen=40+Math.abs(4-row)*70+col*140;
                rect.set(xCen-r,yCen-r,xCen+r,yCen+r);
                canvas.drawArc(rect, 0,360,true,paint);
            }
        }
        String score1Show = Integer.toString(14-score2) + "점";
        tv_score1.setText(score1Show);
        String score2Show = Integer.toString(14-score1) + "점";
        tv_score2.setText(score2Show);
        if(score2<10){//me 승리
            mSocket2.emit("gameSet",me,score2);
        }
        if(score1<10) {//you 승리
            mSocket2.emit("gameSet",you,score1);
        }
    }

    private void setStone(int num){
        if(num==1){
            black_stone1.setEnabled(true);
            black_stone1.setVisibility(View.VISIBLE);
        }
        if(num==2){
            black_stone2.setEnabled(true);
            black_stone2.setVisibility(View.VISIBLE);
        }
        if(num==3){
            black_stone3.setEnabled(true);
            black_stone3.setVisibility(View.VISIBLE);
        }
        if(num==4){
            black_stone4.setEnabled(true);
            black_stone4.setVisibility(View.VISIBLE);
        }
        if(num==5){
            black_stone5.setEnabled(true);
            black_stone5.setVisibility(View.VISIBLE);
        }
        if(num==6){
            black_stone6.setEnabled(true);
            black_stone6.setVisibility(View.VISIBLE);
        }
        if(num==7){
            black_stone7.setEnabled(true);
            black_stone7.setVisibility(View.VISIBLE);
        }
        if(num==8){
            black_stone8.setEnabled(true);
            black_stone8.setVisibility(View.VISIBLE);
        }
        if(num==9){
            black_stone9.setEnabled(true);
            black_stone9.setVisibility(View.VISIBLE);
        }
        if(num==10){
            black_stone10.setEnabled(true);
            black_stone10.setVisibility(View.VISIBLE);
        }
        if(num==11){
            black_stone11.setEnabled(true);
            black_stone11.setVisibility(View.VISIBLE);
        }
        if(num==12){
            black_stone12.setEnabled(true);
            black_stone12.setVisibility(View.VISIBLE);
        }
        if(num==13){
            black_stone13.setEnabled(true);
            black_stone13.setVisibility(View.VISIBLE);
        }
        if(num==14){
            black_stone14.setEnabled(true);
            black_stone14.setVisibility(View.VISIBLE);
        }
        if(num==15){
            black_stone15.setEnabled(true);
            black_stone15.setVisibility(View.VISIBLE);
        }
        if(num==16){
            black_stone16.setEnabled(true);
            black_stone16.setVisibility(View.VISIBLE);
        }
        if(num==17){
            black_stone17.setEnabled(true);
            black_stone17.setVisibility(View.VISIBLE);
        }
        if(num==18){
            black_stone18.setEnabled(true);
            black_stone18.setVisibility(View.VISIBLE);
        }
        if(num==19){
            black_stone19.setEnabled(true);
            black_stone19.setVisibility(View.VISIBLE);
        }
        if(num==20){
            black_stone20.setEnabled(true);
            black_stone20.setVisibility(View.VISIBLE);
        }
        if(num==21){
            black_stone21.setEnabled(true);
            black_stone21.setVisibility(View.VISIBLE);
        }
        if(num==22){
            black_stone22.setEnabled(true);
            black_stone22.setVisibility(View.VISIBLE);
        }
        if(num==23){
            black_stone23.setEnabled(true);
            black_stone23.setVisibility(View.VISIBLE);
        }
        if(num==24){
            black_stone24.setEnabled(true);
            black_stone24.setVisibility(View.VISIBLE);
        }
        if(num==25){
            black_stone25.setEnabled(true);
            black_stone25.setVisibility(View.VISIBLE);
        }
        if(num==26){
            black_stone26.setEnabled(true);
            black_stone26.setVisibility(View.VISIBLE);
        }
        if(num==27){
            black_stone27.setEnabled(true);
            black_stone27.setVisibility(View.VISIBLE);
        }
        if(num==28){
            black_stone28.setEnabled(true);
            black_stone28.setVisibility(View.VISIBLE);
        }
        if(num==29){
            black_stone29.setEnabled(true);
            black_stone29.setVisibility(View.VISIBLE);
        }
        if(num==30){
            black_stone30.setEnabled(true);
            black_stone30.setVisibility(View.VISIBLE);
        }
        if(num==31){
            black_stone31.setEnabled(true);
            black_stone31.setVisibility(View.VISIBLE);
        }
        if(num==32){
            black_stone32.setEnabled(true);
            black_stone32.setVisibility(View.VISIBLE);
        }
        if(num==33){
            black_stone33.setEnabled(true);
            black_stone33.setVisibility(View.VISIBLE);
        }
        if(num==34){
            black_stone34.setEnabled(true);
            black_stone34.setVisibility(View.VISIBLE);
        }
        if(num==35){
            black_stone35.setEnabled(true);
            black_stone35.setVisibility(View.VISIBLE);
        }
        if(num==36){
            black_stone36.setEnabled(true);
            black_stone36.setVisibility(View.VISIBLE);
        }
        if(num==37){
            black_stone37.setEnabled(true);
            black_stone37.setVisibility(View.VISIBLE);
        }
        if(num==38){
            black_stone38.setEnabled(true);
            black_stone38.setVisibility(View.VISIBLE);
        }
        if(num==39){
            black_stone39.setEnabled(true);
            black_stone39.setVisibility(View.VISIBLE);
        }
        if(num==40){
            black_stone40.setEnabled(true);
            black_stone40.setVisibility(View.VISIBLE);
        }
        if(num==41){
            black_stone41.setEnabled(true);
            black_stone41.setVisibility(View.VISIBLE);
        }
        if(num==42){
            black_stone42.setEnabled(true);
            black_stone42.setVisibility(View.VISIBLE);
        }
        if(num==43){
            black_stone43.setEnabled(true);
            black_stone43.setVisibility(View.VISIBLE);
        }
        if(num==44){
            black_stone44.setEnabled(true);
            black_stone44.setVisibility(View.VISIBLE);
        }
        if(num==45){
            black_stone45.setEnabled(true);
            black_stone45.setVisibility(View.VISIBLE);
        }
        if(num==46){
            black_stone46.setEnabled(true);
            black_stone46.setVisibility(View.VISIBLE);
        }
        if(num==47){
            black_stone47.setEnabled(true);
            black_stone47.setVisibility(View.VISIBLE);
        }
        if(num==48){
            black_stone48.setEnabled(true);
            black_stone48.setVisibility(View.VISIBLE);
        }
        if(num==49){
            black_stone49.setEnabled(true);
            black_stone49.setVisibility(View.VISIBLE);
        }
        if(num==50){
            black_stone50.setEnabled(true);
            black_stone50.setVisibility(View.VISIBLE);
        }
        if(num==51){
            black_stone51.setEnabled(true);
            black_stone51.setVisibility(View.VISIBLE);
        }
        if(num==52){
            black_stone52.setEnabled(true);
            black_stone52.setVisibility(View.VISIBLE);
        }
        if(num==53){
            black_stone53.setEnabled(true);
            black_stone53.setVisibility(View.VISIBLE);
        }
        if(num==54){
            black_stone54.setEnabled(true);
            black_stone54.setVisibility(View.VISIBLE);
        }
        if(num==55){
            black_stone55.setEnabled(true);
            black_stone55.setVisibility(View.VISIBLE);
        }
        if(num==56){
            black_stone56.setEnabled(true);
            black_stone56.setVisibility(View.VISIBLE);
        }
        if(num==57){
            black_stone57.setEnabled(true);
            black_stone57.setVisibility(View.VISIBLE);
        }
        if(num==58){
            black_stone58.setEnabled(true);
            black_stone58.setVisibility(View.VISIBLE);
        }
        if(num==59){
            black_stone59.setEnabled(true);
            black_stone59.setVisibility(View.VISIBLE);
        }
        if(num==60){
            black_stone60.setEnabled(true);
            black_stone60.setVisibility(View.VISIBLE);
        }
        if(num==61){
            black_stone61.setEnabled(true);
            black_stone61.setVisibility(View.VISIBLE);
        }
    }



    private void init(){
        nowWayInfo = new int[6][6];
        black_stone12.setVisibility(View.INVISIBLE);
        black_stone13.setVisibility(View.INVISIBLE);
        black_stone17.setVisibility(View.INVISIBLE);
        black_stone18.setVisibility(View.INVISIBLE);
        black_stone19.setVisibility(View.INVISIBLE);
        black_stone20.setVisibility(View.INVISIBLE);
        black_stone21.setVisibility(View.INVISIBLE);
        black_stone22.setVisibility(View.INVISIBLE);
        black_stone23.setVisibility(View.INVISIBLE);
        black_stone24.setVisibility(View.INVISIBLE);
        black_stone25.setVisibility(View.INVISIBLE);
        black_stone26.setVisibility(View.INVISIBLE);
        black_stone27.setVisibility(View.INVISIBLE);
        black_stone28.setVisibility(View.INVISIBLE);
        black_stone29.setVisibility(View.INVISIBLE);
        black_stone30.setVisibility(View.INVISIBLE);
        black_stone31.setVisibility(View.INVISIBLE);
        black_stone32.setVisibility(View.INVISIBLE);
        black_stone33.setVisibility(View.INVISIBLE);
        black_stone34.setVisibility(View.INVISIBLE);
        black_stone35.setVisibility(View.INVISIBLE);
        black_stone36.setVisibility(View.INVISIBLE);
        black_stone37.setVisibility(View.INVISIBLE);
        black_stone38.setVisibility(View.INVISIBLE);
        black_stone39.setVisibility(View.INVISIBLE);
        black_stone40.setVisibility(View.INVISIBLE);
        black_stone41.setVisibility(View.INVISIBLE);
        black_stone42.setVisibility(View.INVISIBLE);
        black_stone43.setVisibility(View.INVISIBLE);
        black_stone44.setVisibility(View.INVISIBLE);
        black_stone45.setVisibility(View.INVISIBLE);
        black_stone46.setVisibility(View.INVISIBLE);
        black_stone47.setVisibility(View.INVISIBLE);
        black_stone48.setVisibility(View.INVISIBLE);
        black_stone49.setVisibility(View.INVISIBLE);
        black_stone50.setVisibility(View.INVISIBLE);
        black_stone51.setVisibility(View.INVISIBLE);
        black_stone52.setVisibility(View.INVISIBLE);
        black_stone53.setVisibility(View.INVISIBLE);
        black_stone54.setVisibility(View.INVISIBLE);
        black_stone55.setVisibility(View.INVISIBLE);
        black_stone56.setVisibility(View.INVISIBLE);
        black_stone57.setVisibility(View.INVISIBLE);
        black_stone58.setVisibility(View.INVISIBLE);
        black_stone59.setVisibility(View.INVISIBLE);
        black_stone60.setVisibility(View.INVISIBLE);
        black_stone61.setVisibility(View.INVISIBLE);
    }

    private int[] numToRowCol(int num){
        int[] rowCol = new int[2];
        int col=0;
        int row=0;
        if(num<=5){
            col = num - 1;
            row = 0;
        }if(num>=6 && num<=11){
            col = num - 6;
            row = 1;
        }if(num>=12 && num<=18){
            col = num - 12;
            row = 2;
        }if(num>=19 && num<=26){
            col = num - 19;
            row = 3;
        }if(num>=27 && num<=35){
            col = num - 27;
            row = 4;
        }if(num>=36 && num<=43){
            col = num - 36;
            row = 5;
        }if(num>=44 && num<=50){
            col = num - 44;
            row = 6;
        }if(num>=51 && num<=56){
            col = num - 51;
            row = 7;
        }if(num>=57 && num<=61){
            col = num - 57;
            row = 8;
        }
        rowCol[0]=row;
        rowCol[1]=col;
        return rowCol;
    }

    private boolean[] canMove(int num){
        boolean availPoint[] = new boolean[6];
        Arrays.fill(availPoint,true);
        int wayinfo[][] = new int[6][6];//막다른 길은 -1, 빈칸은 0, 흑돌은 1, 백돌은 2
        int col,row;//num의 stoneExist상의 위치
        col=0; row=0;
        if(num<=5){
            col = num - 1;
            row = 0;
        }if(num>=6 && num<=11){
            col = num - 6;
            row = 1;
        }if(num>=12 && num<=18){
            col = num - 12;
            row = 2;
        }if(num>=19 && num<=26){
            col = num - 19;
            row = 3;
        }if(num>=27 && num<=35){
            col = num - 27;
            row = 4;
        }if(num>=36 && num<=43){
            col = num - 36;
            row = 5;
        }if(num>=44 && num<=50){
            col = num - 44;
            row = 6;
        }if(num>=51 && num<=56){
            col = num - 51;
            row = 7;
        }if(num>=57 && num<=61){
            col = num - 57;
            row = 8;
        }
//        for(int i=0; i<6; i++){
//            String n = "gg";
//            Log.d("availpass",n);
//            Log.d("passfind",Integer.toString(stoneExist[0][i]));
//        }
        for(int way=0; way<6; way++){
            int coloffset=0;
            for(int oneline=0; oneline<6; oneline++){
                if(way==0){//UR
                    if(row+oneline<5){
                        coloffset = oneline;
                        if(endroad(row+oneline, col+oneline)){//막다른길 아니면
                            wayinfo[way][oneline]=stoneExist[row+oneline][col+oneline];
//                            Log.d("row+oneline",Integer.toString(row+oneline));
//                            Log.d("col+oneline",Integer.toString(col+oneline));
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }else{
                        if(endroad(row+oneline, col+coloffset)){
                            wayinfo[way][oneline]=stoneExist[row+oneline][col+coloffset];
//                            Log.d("row+oneline",Integer.toString(row+oneline));
//                            Log.d("col+oneline",Integer.toString(col+coloffset));
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }
                }
                if (way == 1) {
                    if(endroad(row, col+oneline)){
                        wayinfo[way][oneline]=stoneExist[row][col+oneline];
                    }else{
                        wayinfo[way][oneline]=-1;
                        break;
                    }
                }
                if (way == 2) {
                    if(row-oneline>3) {
                        coloffset = oneline;
                        if (endroad(row - oneline, col + oneline)) {//막다른길 아니면
                            wayinfo[way][oneline] = stoneExist[row - oneline][col + oneline];
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }else{
                        if(endroad(row-oneline, col+coloffset)){
                            wayinfo[way][oneline]=stoneExist[row-oneline][col+coloffset];
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }
                }
                if (way == 3) {
                    if(row-oneline>3) {
                        coloffset = oneline;
                        if (endroad(row - oneline, col)) {//막다른길 아니면
                            wayinfo[way][oneline] = stoneExist[row - oneline][col];
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }else{
                        if(endroad(row-oneline, col-(oneline-coloffset))){
                            wayinfo[way][oneline]=stoneExist[row-oneline][col-(oneline-coloffset)];

                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }
                }
                if (way == 4) {
                    if(endroad(row, col-oneline)){
                        wayinfo[way][oneline]=stoneExist[row][col-oneline];
                    }else{
                        wayinfo[way][oneline]=-1;
                        break;
                    }
                }
                if (way == 5) {
                    if(row+oneline<5){
                        coloffset = oneline;
                        if(endroad(row+oneline, col)){//막다른길 아니면
                            wayinfo[way][oneline]=stoneExist[row+oneline][col];
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }else{
                        if(endroad(row+oneline, col+coloffset-oneline)){
                            wayinfo[way][oneline]=stoneExist[row+oneline][col+coloffset-oneline];
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }
                }
            }
        }
        for(int i=0; i<6;i++){
            if(availPoint[i]==false){
                break;
            }
            int blackcount=0;
            int whitecount=0;
            for(int j=0; j<6; j++){
                if(wayinfo[i][j]==-1){
                    availPoint[i]=true;
                    break;
                }
                if(wayinfo[i][j]==0){
                    availPoint[i]=true;
                    break;
                }else if(wayinfo[i][j]==1){
                    blackcount++;
                    if(whitecount>0){
                        availPoint[i]=false;
                        break;
                    }
                    if(blackcount>3){
                        availPoint[i]=false;
                        break;
                    }
                }else{
                    whitecount++;
                    if(whitecount>=blackcount){
                        availPoint[i]=false;
                        break;
                    }
                }
            }
        }
//        for(int i=0; i<6; i++){
//            String s = new String();
//            String n = "gg";
//            if(availPoint[i]==true){
//                s="true";
//            }else{
//                s="false";
//            }
//            Log.d("availpass",s);
//            Log.d("availpass",n);
//            Log.d("passfind",Integer.toString(stoneExist[0][i]));
//        }

        nowWayInfo = wayinfo;
        return availPoint;
    }

    private int[] movingPoint(int num , int[] wayinfo, int way){
        int[] movingpoint = new int[2];
        int count=0;
        int whiteCount=0;
        for(int i =0; i<6; i++){
            Log.d("wayinfo",Integer.toString(wayinfo[i]));
        }
        for(int i=0; i<6; i++){
            if(wayinfo[i]==-1){
                if(wayinfo[i-1]==2){
                    movingpoint[1]=3;
                    break;
                }
                movingpoint[1]=-1;
                break;
            }
            if(wayinfo[i]==0){
                //count가 빈 칸의 위치를 나타냄
                movingpoint[1]=1;//빈칸이 오기 직전의 돌을 반환함
                break;
            }
            if(wayinfo[i]==1){//자리에 돌이 있다면
                count++;
            }
            if(wayinfo[i]==2){//흰 돌 일 경우에는 카운트 안함.
                whiteCount++;
            }
        }
        if(whiteCount>0){
            int tempcount=0;
            tempcount=count+whiteCount;
            int col,row;//num의 stoneExist상의 위치
            col=0; row=0;
            if(num<=5){
                col = num - 1;
                row = 0;
            }if(num>=6 && num<=11){
                col = num - 6;
                row = 1;
            }if(num>=12 && num<=18){
                col = num - 12;
                row = 2;
            }if(num>=19 && num<=26){
                col = num - 19;
                row = 3;
            }if(num>=27 && num<=35){
                col = num - 27;
                row = 4;
            }if(num>=36 && num<=43){
                col = num - 36;
                row = 5;
            }if(num>=44 && num<=50){
                col = num - 44;
                row = 6;
            }if(num>=51 && num<=56){
                col = num - 51;
                row = 7;
            }if(num>=57 && num<=61){
                col = num - 57;
                row = 8;
            }

            int coloffset=0;
            int rowCount=0;
            for(int oneline=0; oneline<tempcount; oneline++) {
                if (way == 0) {//UR
                    if (row + oneline < 4) {
                        rowCount++;
                        col++;
                    } else {
                        rowCount++;
                    }
                }
                if (way == 1) {
                    col++;
                }
                if (way == 2) {
                    if (row - oneline > 4) {
                        rowCount--;
                        col++;
                    } else {
                        rowCount--;;
                    }
                }
                if (way == 3) {
                    if (row - oneline > 4) {
                        rowCount--;
                    } else {
                        rowCount--;
                        col--;
                    }
                }
                if (way == 4) {
                    col--;
                }
                if (way == 5) {
                    if (row + oneline < 4) {
                        rowCount++;
                    } else {
                        rowCount++;
                        col--;
                    }
                }
            }
            row += rowCount;
            if(row<9 && col<9 && row>=0 && col>=0){
                stoneExist[row][col]=2;
                String bluenum1="";
                bluenum1 = Integer.toString(62-rowcolToNum(row,col));
                mSocket2.emit("blue",bluenum1,me);
            }
        }

        int col,row;//num의 stoneExist상의 위치
        col=0; row=0;
        if(num<=5){
            col = num - 1;
            row = 0;
        }if(num>=6 && num<=11){
            col = num - 6;
            row = 1;
        }if(num>=12 && num<=18){
            col = num - 12;
            row = 2;
        }if(num>=19 && num<=26){
            col = num - 19;
            row = 3;
        }if(num>=27 && num<=35){
            col = num - 27;
            row = 4;
        }if(num>=36 && num<=43){
            col = num - 36;
            row = 5;
        }if(num>=44 && num<=50){
            col = num - 44;
            row = 6;
        }if(num>=51 && num<=56){
            col = num - 51;
            row = 7;
        }if(num>=57 && num<=61){
            col = num - 57;
            row = 8;
        }

        int coloffset=0;
        int rowCount=0;
        for(int oneline=0; oneline<count; oneline++) {
            if (way == 0) {//UR
                if (row + oneline < 4) {
                    rowCount++;
                    col++;
                } else {
                    rowCount++;
                }
            }
            if (way == 1) {
                col++;
            }
            if (way == 2) {
                if (row - oneline > 4) {
                    rowCount--;
                    col++;
                } else {
                    rowCount--;;
                }
            }
            if (way == 3) {
                if (row - oneline > 4) {
                    rowCount--;
                } else {
                    rowCount--;
                    col--;
                }
            }
            if (way == 4) {
                col--;
            }
            if (way == 5) {
                if (row + oneline < 4) {
                    rowCount++;
                } else {
                    rowCount++;
                    col--;
                }
            }
        }
        row += rowCount;

        movingpoint[0]=rowcolToNum(row,col);
        if(whiteCount>0){
            stoneExist[row][col]=1;
        }

        return movingpoint;
    }
    private int rowcolToNum(int row, int col){
        int num=0;
        if(row==0){
            num=col+1;
        }
        if(row==1){
            num=col+6;
        }
        if(row==2){
            num=col+12;
        }
        if(row==3){
            num=col+19;
        }
        if(row==4){
            num=col+27;
        }
        if(row==5){
            num=col+36;
        }
        if(row==6){
            num=col+44;
        }
        if(row==7){
            num=col+51;
        }
        if(row==8){
            num=col+57;
        }
        return num;
    }

    private void moving(int start, int end, int kindOfStone){

        int row=0,col=0;

        if(start<=5){
            col = start - 1;
            row = 0;
        }if(start>=6 && start<=11){
            col = start - 6;
            row = 1;
        }if(start>=12 && start<=18){
            col = start - 12;
            row = 2;
        }if(start>=19 && start<=26){
            col = start - 19;
            row = 3;
        }if(start>=27 && start<=35){
            col = start - 27;
            row = 4;
        }if(start>=36 && start<=43){
            col = start - 36;
            row = 5;
        }if(start>=44 && start<=50){
            col = start - 44;
            row = 6;
        }if(start>=51 && start<=56){
            col = start - 51;
            row = 7;
        }if(start>=57 && start<=61){
            col = start - 57;
            row = 8;
        }
        stoneExist[row][col] = 0;


        if(start==1){
            black_stone1.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,1);
        }
        if(start==2){
            black_stone2.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,2);
        }
        if(start==3){
            black_stone3.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,3);
        }
        if(start==4){
            black_stone4.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,4);
        }
        if(start==5){
            black_stone5.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,5);
        }
        if(start==6){
            black_stone6.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,6);
        }
        if(start==7){
            black_stone7.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,7);
        }
        if(start==8){
            black_stone8.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,8);
        }
        if(start==9){
            black_stone9.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,9);
        }
        if(start==10){
            black_stone10.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,10);
        }
        if(start==11){
            black_stone11.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,11);
        }
        if(start==12){
            black_stone12.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,12);
        }
        if(start==13){
            black_stone13.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,13);
        }
        if(start==14){
            black_stone14.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,14);
        }
        if(start==15){
            black_stone15.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,15);
        }
        if(start==16){
            black_stone16.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,16);
        }
        if(start==17){
            black_stone17.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,17);
        }
        if(start==18){
            black_stone18.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,18);
        }
        if(start==19){
            black_stone19.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,19);
        }
        if(start==20){
            black_stone20.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,20);
        }
        if(start==21){
            black_stone21.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,21);
        }
        if(start==22){
            black_stone22.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,22);
        }
        if(start==23){
            black_stone23.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,23);
        }
        if(start==24){
            black_stone24.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,24);
        }
        if(start==25){
            black_stone25.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,25);
        }
        if(start==26){
            black_stone26.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,26);
        }
        if(start==27){
            black_stone27.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,27);
        }
        if(start==28){
            black_stone28.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,28);
        }
        if(start==29){
            black_stone29.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,29);
        }
        if(start==30){
            black_stone30.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,30);
        }
        if(start==31){
            black_stone31.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,31);
        }
        if(start==32){
            black_stone32.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,32);
        }
        if(start==33){
            black_stone33.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,33);
        }
        if(start==34){
            black_stone34.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,34);
        }
        if(start==35){
            black_stone35.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,35);
        }
        if(start==36){
            black_stone36.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,36);
        }
        if(start==37){
            black_stone37.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,37);
        }
        if(start==38){
            black_stone38.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,38);
        }
        if(start==39){
            black_stone39.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,39);
        }
        if(start==40){
            black_stone40.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,40);
        }if(start==41){
            black_stone41.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,41);
        }
        if(start==42){
            black_stone42.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,42);
        }
        if(start==43){
            black_stone43.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,43);
        }
        if(start==44){
            black_stone44.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,44);
        }
        if(start==45){
            black_stone45.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,45);
        }
        if(start==46){
            black_stone46.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,46);
        }
        if(start==47){
            black_stone47.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,47);
        }
        if(start==48){
            black_stone48.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,48);
        }
        if(start==49){
            black_stone49.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,49);
        }
        if(start==50){
            black_stone50.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,50);
        }if(start==51){
            black_stone51.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,51);
        }
        if(start==52){
            black_stone52.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,52);
        }
        if(start==53){
            black_stone53.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,53);
        }
        if(start==54){
            black_stone54.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,54);
        }
        if(start==55){
            black_stone55.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,55);
        }
        if(start==56){
            black_stone56.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,56);
        }
        if(start==57){
            black_stone57.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,57);
        }
        if(start==58){
            black_stone58.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,58);
        }
        if(start==59){
            black_stone59.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,59);
        }
        if(start==60){
            black_stone60.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,60);
        }
        if(start==61){
            black_stone61.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,61);
        }
        String num1=Integer.toString(62-start);
        String num2="";
        String num2_kind="";
        if(kindOfStone==-1){
            num2="None";
            num2_kind="None";
        }

        if(kindOfStone!=-1){
            row=0;
            col=0;
            if(end<=5){
                col = end - 1;
                row = 0;
            }if(end>=6 && end<=11){
                col = end - 6;
                row = 1;
            }if(end>=12 && end<=18){
                col = end - 12;
                row = 2;
            }if(end>=19 && end<=26){
                col = end - 19;
                row = 3;
            }if(end>=27 && end<=35){
                col = end - 27;
                row = 4;
            }if(end>=36 && end<=43){
                col = end - 36;
                row = 5;
            }if(end>=44 && end<=50){
                col = end - 44;
                row = 6;
            }if(end>=51 && end<=56){
                col = end - 51;
                row = 7;
            }if(end>=57 && end<=61){
                col = end - 57;
                row = 8;
            }
            num2 = Integer.toString(62-end);
            if(row>=0 && row<9 && col>=0 && col<9){
                if(kindOfStone!=3) {
                    stoneExist[row][col] = kindOfStone;
                    num2_kind = Integer.toString(kindOfStone);
                }
                else{
                    stoneExist[row][col]=1;
                    num2_kind = Integer.toString(1);
                }
            }

            if(end==1){
                black_stone1.setVisibility(View.VISIBLE);
            }
            if(end==2){
                black_stone2.setVisibility(View.VISIBLE);
            }
            if(end==3){
                black_stone3.setVisibility(View.VISIBLE);
            }
            if(end==4){
                black_stone4.setVisibility(View.VISIBLE);
            }
            if(end==5){
                black_stone5.setVisibility(View.VISIBLE);
            }
            if(end==6){
                black_stone6.setVisibility(View.VISIBLE);
            }
            if(end==7){
                black_stone7.setVisibility(View.VISIBLE);
            }
            if(end==8){
                black_stone8.setVisibility(View.VISIBLE);
            }
            if(end==9){
                black_stone9.setVisibility(View.VISIBLE);
            }
            if(end==10){
                black_stone10.setVisibility(View.VISIBLE);
            }
            if(end==11){
                black_stone11.setVisibility(View.VISIBLE);
            }
            if(end==12){
                black_stone12.setVisibility(View.VISIBLE);
            }
            if(end==13){
                black_stone13.setVisibility(View.VISIBLE);
            }
            if(end==14){
                black_stone14.setVisibility(View.VISIBLE);
            }
            if(end==15){
                black_stone15.setVisibility(View.VISIBLE);
            }
            if(end==16){
                black_stone16.setVisibility(View.VISIBLE);
            }
            if(end==17){
                black_stone17.setVisibility(View.VISIBLE);
            }
            if(end==18){
                black_stone18.setVisibility(View.VISIBLE);
            }
            if(end==19){
                black_stone19.setVisibility(View.VISIBLE);
            }
            if(end==20){
                black_stone20.setVisibility(View.VISIBLE);
            }
            if(end==21){
                black_stone21.setVisibility(View.VISIBLE);
            }
            if(end==22){
                black_stone22.setVisibility(View.VISIBLE);
            }
            if(end==23){
                black_stone23.setVisibility(View.VISIBLE);
            }
            if(end==24){
                black_stone24.setVisibility(View.VISIBLE);
            }
            if(end==25){
                black_stone25.setVisibility(View.VISIBLE);
            }
            if(end==26){
                black_stone26.setVisibility(View.VISIBLE);
            }
            if(end==27){
                black_stone27.setVisibility(View.VISIBLE);
            }
            if(end==28){
                black_stone28.setVisibility(View.VISIBLE);
            }
            if(end==29){
                black_stone29.setVisibility(View.VISIBLE);
            }
            if(end==30){
                black_stone30.setVisibility(View.VISIBLE);
            }
            if(end==31){
                black_stone31.setVisibility(View.VISIBLE);
            }
            if(end==32){
                black_stone32.setVisibility(View.VISIBLE);
            }
            if(end==33){
                black_stone33.setVisibility(View.VISIBLE);
            }
            if(end==34){
                black_stone34.setVisibility(View.VISIBLE);
            }
            if(end==35){
                black_stone35.setVisibility(View.VISIBLE);
            }
            if(end==36){
                black_stone36.setVisibility(View.VISIBLE);
            }
            if(end==37){
                black_stone37.setVisibility(View.VISIBLE);
            }
            if(end==38){
                black_stone38.setVisibility(View.VISIBLE);
            }
            if(end==39){
                black_stone39.setVisibility(View.VISIBLE);
            }
            if(end==40){
                black_stone40.setVisibility(View.VISIBLE);
            }if(end==41){
                black_stone41.setVisibility(View.VISIBLE);
            }
            if(end==42){
                black_stone42.setVisibility(View.VISIBLE);
            }
            if(end==43){
                black_stone43.setVisibility(View.VISIBLE);
            }
            if(end==44){
                black_stone44.setVisibility(View.VISIBLE);
            }
            if(end==45){
                black_stone45.setVisibility(View.VISIBLE);
            }
            if(end==46){
                black_stone46.setVisibility(View.VISIBLE);
            }
            if(end==47){
                black_stone47.setVisibility(View.VISIBLE);
            }
            if(end==48){
                black_stone48.setVisibility(View.VISIBLE);
            }
            if(end==49){
                black_stone49.setVisibility(View.VISIBLE);
            }
            if(end==50){
                black_stone50.setVisibility(View.VISIBLE);
            }
            if(end==51){
                black_stone51.setVisibility(View.VISIBLE);
            }
            if(end==52){
                black_stone52.setVisibility(View.VISIBLE);
            }
            if(end==53){
                black_stone53.setVisibility(View.VISIBLE);
            }
            if(end==54){
                black_stone54.setVisibility(View.VISIBLE);
            }
            if(end==55){
                black_stone55.setVisibility(View.VISIBLE);
            }
            if(end==56){
                black_stone56.setVisibility(View.VISIBLE);
            }
            if(end==57){
                black_stone57.setVisibility(View.VISIBLE);
            }
            if(end==58){
                black_stone58.setVisibility(View.VISIBLE);
            }
            if(end==59){
                black_stone59.setVisibility(View.VISIBLE);
            }
            if(end==60){
                black_stone60.setVisibility(View.VISIBLE);
            }
            if(end==61){
                black_stone61.setVisibility(View.VISIBLE);
            }
            turnStartInit();
        }
        //마지막 위치

        mSocket2.emit("moving",num1,num2,num2_kind,me);
        allUnabled();
        if(winnerExist) {
            Intent intent = new Intent(this,ScoreActivity.class);
            intent.putExtra("winner","승자: "+ winner);
            startActivityForResult(intent,1);
        }

    }

    private boolean endroad(int row, int col){//false: no line
        if(col<0 || row<0 || col>8 || row>8)
            return false;
        if(row==0 && col>4)
            return false;
        if(row==1 && col>5)
            return false;
        if(row==2 && col>6)
            return false;
        if(row==3 && col>7)
            return false;
        if(row==4 && col>8)
            return false;
        if(row==5 && col>7)
            return false;
        if(row==6 && col>6)
            return false;
        if(row==7 && col>5)
            return false;
        if(row==8 && col>4)
            return false;
        return true;
    }

    private void drawingBackground() {
        canvas.drawColor(getResources().getColor(R.color.yellow));
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5f);
        paint.setStyle(Paint.Style.FILL);
        //Path path = new Path();
        float firstartx;
        float firstarty;
        float firendx;
        float firendy;
        float secstartx;
        float secstarty;
        float secendx;
        float secendy;
        float startx;
        float starty;
        float endx;
        float endy;
        for(int i=0;i<5;i++) {
            firstartx = 255+60;
            firstarty = 70;
            firendx = 825+60;
            firendy = 70;
            secstartx = 825+60;
            secstarty = 1010;
            secendx = 1080+60;
            secendy = 540;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = -Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255+60;
            firstarty = 70;
            firendx = 825+60;
            firendy = 70;
            secstartx = 0+60;
            secstarty = 540;
            secendx = 255+60;
            secendy = 1010;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255+60;
            firstarty = 1010;
            firendx = 825+60;
            firendy = 1010;
            secstartx = 0+60;
            secstarty = 540;
            secendx = 255+60;
            secendy = 70;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = -Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255+60;
            firstarty = 1010;
            firendx = 825+60;
            firendy = 1010;
            secstartx = 825+60;
            secstarty = 70;
            secendx = 1080+60;
            secendy = 540;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255+60;
            firstarty = 70;
            firendx = 0+60;
            firendy = 540;
            secstartx = 825+60;
            secstarty = 70;
            secendx = 1080+60;
            secendy = 540;
            startx = -Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firstarty;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255+60;
            firstarty = 540;
            firendx = 0+60;
            firendy = 1010;
            secstartx = 825+60;
            secstarty = 540;
            secendx = 1080+60;
            secendy = 1010;
            startx = Math.abs((firendx-firstartx)/4)*i+firendx;
            starty = Math.abs((firendy-firstarty)/4)*i+firstarty;
            endx = -Math.abs((secendx-secstartx)/4)*i+secendx;
            endy = Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
    }

    private void onBlackButtonClicked(View v,int num) {
        int option=-1;

        if(clicked==num && opened) {//같은 버튼을 2번 눌렀을 때
            option=1;
        }else if(!opened){//정상 상태일 때
            option=2;
        }else{
            Toast.makeText(this,"다른 버튼은 클릭할 수 없습니다",Toast.LENGTH_SHORT).show();
        }
        if(option==1){
            setVisibility(clicked, v, num);
            setAnimation(clicked, num);
            clicked=0;
            opened=false;
        }
        if(option==2){
            setVisibility(clicked, v, num);
            setAnimation(clicked, num);
            clicked = num;
            opened = true;
        }
    }

    private void setAnimation(int clicked, int num) {
        if(!opened){
            allUnabled();
            if(num==1) {
                arrowUR1.startAnimation(animTran1Start);
                arrowR1.startAnimation(animTran2Start);
                arrowUL1.startAnimation(animTran6Start);
                arrowUR1.setEnabled(true);
                arrowR1.setEnabled(true);
                arrowUL1.setEnabled(true);
                black_stone1.setEnabled(true);
            }
            if(num==2) {
                arrowUR2.startAnimation(animTran1Start);
                arrowR2.startAnimation(animTran2Start);
                arrowUL2.startAnimation(animTran6Start);
                arrowL2.startAnimation(animTran5Start);
                arrowUR2.setEnabled(true);
                arrowR2.setEnabled(true);
                arrowUL2.setEnabled(true);
                arrowL2.setEnabled(true);
                black_stone2.setEnabled(true);
            }
            if(num==3){
                arrowUR3.startAnimation(animTran1Start);
                arrowR3.startAnimation(animTran2Start);
                arrowUL3.startAnimation(animTran6Start);
                arrowL3.startAnimation(animTran5Start);
                arrowUR3.setEnabled(true);
                arrowR3.setEnabled(true);
                arrowUL3.setEnabled(true);
                arrowL3.setEnabled(true);
                black_stone3.setEnabled(true);
            }
            if(num==4){
                arrowUR4.startAnimation(animTran1Start);
                arrowR4.startAnimation(animTran2Start);
                arrowUL4.startAnimation(animTran6Start);
                arrowL4.startAnimation(animTran5Start);
                arrowUR4.setEnabled(true);
                arrowR4.setEnabled(true);
                arrowUL4.setEnabled(true);
                arrowL4.setEnabled(true);
                black_stone4.setEnabled(true);
            }
            if(num==5) {
                arrowUR5.startAnimation(animTran1Start);
                arrowL5.startAnimation(animTran5Start);
                arrowUL5.startAnimation(animTran6Start);
                arrowUR5.setEnabled(true);
                arrowL5.setEnabled(true);
                arrowUL5.setEnabled(true);
                black_stone5.setEnabled(true);
            }
            if(num==6) {
                arrowUR6.startAnimation(animTran1Start);
                arrowR6.startAnimation(animTran2Start);
                arrowDR6.startAnimation(animTran3Start);
                arrowUL6.startAnimation(animTran6Start);
                arrowUR6.setEnabled(true);
                arrowR6.setEnabled(true);
                arrowDR6.setEnabled(true);
                arrowUL6.setEnabled(true);
                black_stone6.setEnabled(true);
            }
            if(num==7) {
                arrowUR7.startAnimation(animTran1Start);
                arrowR7.startAnimation(animTran2Start);
                arrowDR7.startAnimation(animTran3Start);
                arrowDL7.startAnimation(animTran4Start);
                arrowL7.startAnimation(animTran5Start);
                arrowUL7.startAnimation(animTran6Start);
                arrowUR7.setEnabled(true);
                arrowR7.setEnabled(true);
                arrowDR7.setEnabled(true);
                arrowDL7.setEnabled(true);
                arrowL7.setEnabled(true);
                arrowUL7.setEnabled(true);
                black_stone7.setEnabled(true);
            }
            if(num==8) {
                arrowUR8.startAnimation(animTran1Start);
                arrowR8.startAnimation(animTran2Start);
                arrowDR8.startAnimation(animTran3Start);
                arrowDL8.startAnimation(animTran4Start);
                arrowL8.startAnimation(animTran5Start);
                arrowUL8.startAnimation(animTran6Start);
                arrowUR8.setEnabled(true);
                arrowR8.setEnabled(true);
                arrowDR8.setEnabled(true);
                arrowDL8.setEnabled(true);
                arrowL8.setEnabled(true);
                arrowUL8.setEnabled(true);
                black_stone8.setEnabled(true);
            }
            if(num==9) {
                arrowUR9.startAnimation(animTran1Start);
                arrowR9.startAnimation(animTran2Start);
                arrowDR9.startAnimation(animTran3Start);
                arrowDL9.startAnimation(animTran4Start);
                arrowL9.startAnimation(animTran5Start);
                arrowUL9.startAnimation(animTran6Start);
                arrowUR9.setEnabled(true);
                arrowR9.setEnabled(true);
                arrowDR9.setEnabled(true);
                arrowDL9.setEnabled(true);
                arrowL9.setEnabled(true);
                arrowUL9.setEnabled(true);
                black_stone9.setEnabled(true);
            }
            if(num==10) {
                arrowUR10.startAnimation(animTran1Start);
                arrowR10.startAnimation(animTran2Start);
                arrowDR10.startAnimation(animTran3Start);
                arrowDL10.startAnimation(animTran4Start);
                arrowL10.startAnimation(animTran5Start);
                arrowUL10.startAnimation(animTran6Start);
                arrowUR10.setEnabled(true);
                arrowR10.setEnabled(true);
                arrowDR10.setEnabled(true);
                arrowDL10.setEnabled(true);
                arrowL10.setEnabled(true);
                arrowUL10.setEnabled(true);
                black_stone10.setEnabled(true);
            }
            if(num==11) {
                arrowUR11.startAnimation(animTran1Start);
                arrowDL11.startAnimation(animTran4Start);
                arrowL11.startAnimation(animTran5Start);
                arrowUL11.startAnimation(animTran6Start);
                arrowUR11.setEnabled(true);
                arrowDL11.setEnabled(true);
                arrowL11.setEnabled(true);
                arrowUL11.setEnabled(true);
                black_stone11.setEnabled(true);
            }
            if(num==12) {
                arrowUR12.startAnimation(animTran1Start);
                arrowR12.startAnimation(animTran2Start);
                arrowDR12.startAnimation(animTran3Start);
                arrowUL12.startAnimation(animTran6Start);
                arrowUR12.setEnabled(true);
                arrowR12.setEnabled(true);
                arrowDR12.setEnabled(true);
                arrowUL12.setEnabled(true);
                black_stone12.setEnabled(true);
            }
            if(num==13) {
                arrowUR13.startAnimation(animTran1Start);
                arrowR13.startAnimation(animTran2Start);
                arrowDR13.startAnimation(animTran3Start);
                arrowDL13.startAnimation(animTran4Start);
                arrowL13.startAnimation(animTran5Start);
                arrowUL13.startAnimation(animTran6Start);
                arrowUR13.setEnabled(true);
                arrowR13.setEnabled(true);
                arrowDR13.setEnabled(true);
                arrowDL13.setEnabled(true);
                arrowL13.setEnabled(true);
                arrowUL13.setEnabled(true);
                black_stone13.setEnabled(true);
            }
            if(num==14) {
                arrowUR14.startAnimation(animTran1Start);
                arrowR14.startAnimation(animTran2Start);
                arrowDR14.startAnimation(animTran3Start);
                arrowDL14.startAnimation(animTran4Start);
                arrowL14.startAnimation(animTran5Start);
                arrowUL14.startAnimation(animTran6Start);
                arrowUR14.setEnabled(true);
                arrowR14.setEnabled(true);
                arrowDR14.setEnabled(true);
                arrowDL14.setEnabled(true);
                arrowL14.setEnabled(true);
                arrowUL14.setEnabled(true);
                black_stone14.setEnabled(true);
            }
            if(num==15) {
                arrowUR15.startAnimation(animTran1Start);
                arrowR15.startAnimation(animTran2Start);
                arrowDR15.startAnimation(animTran3Start);
                arrowDL15.startAnimation(animTran4Start);
                arrowL15.startAnimation(animTran5Start);
                arrowUL15.startAnimation(animTran6Start);
                arrowUR15.setEnabled(true);
                arrowR15.setEnabled(true);
                arrowDR15.setEnabled(true);
                arrowDL15.setEnabled(true);
                arrowL15.setEnabled(true);
                arrowUL15.setEnabled(true);
                black_stone15.setEnabled(true);
            }
            if(num==16) {
                arrowUR16.startAnimation(animTran1Start);
                arrowR16.startAnimation(animTran2Start);
                arrowDR16.startAnimation(animTran3Start);
                arrowDL16.startAnimation(animTran4Start);
                arrowL16.startAnimation(animTran5Start);
                arrowUL16.startAnimation(animTran6Start);
                arrowUR16.setEnabled(true);
                arrowR16.setEnabled(true);
                arrowDR16.setEnabled(true);
                arrowDL16.setEnabled(true);
                arrowL16.setEnabled(true);
                arrowUL16.setEnabled(true);
                black_stone16.setEnabled(true);
            }
            if(num==17) {
                arrowUR17.startAnimation(animTran1Start);
                arrowR17.startAnimation(animTran2Start);
                arrowDR17.startAnimation(animTran3Start);
                arrowDL17.startAnimation(animTran4Start);
                arrowL17.startAnimation(animTran5Start);
                arrowUL17.startAnimation(animTran6Start);
                arrowUR17.setEnabled(true);
                arrowR17.setEnabled(true);
                arrowDR17.setEnabled(true);
                arrowDL17.setEnabled(true);
                arrowL17.setEnabled(true);
                arrowUL17.setEnabled(true);
                black_stone17.setEnabled(true);
            }
            if(num==18) {
                arrowUR18.startAnimation(animTran1Start);
                arrowDL18.startAnimation(animTran4Start);
                arrowL18.startAnimation(animTran5Start);
                arrowUL18.startAnimation(animTran6Start);
                arrowUR18.setEnabled(true);
                arrowDL18.setEnabled(true);
                arrowL18.setEnabled(true);
                arrowUL18.setEnabled(true);
                black_stone18.setEnabled(true);
            }
            if(num==19) {
                arrowUR19.startAnimation(animTran1Start);
                arrowR19.startAnimation(animTran2Start);
                arrowDR19.startAnimation(animTran3Start);
                arrowUL19.startAnimation(animTran6Start);
                arrowUR19.setEnabled(true);
                arrowR19.setEnabled(true);
                arrowDR19.setEnabled(true);
                arrowUL19.setEnabled(true);
                black_stone19.setEnabled(true);
            }
            if(num==20) {
                arrowUR20.startAnimation(animTran1Start);
                arrowR20.startAnimation(animTran2Start);
                arrowDR20.startAnimation(animTran3Start);
                arrowDL20.startAnimation(animTran4Start);
                arrowL20.startAnimation(animTran5Start);
                arrowUL20.startAnimation(animTran6Start);
                arrowUR20.setEnabled(true);
                arrowR20.setEnabled(true);
                arrowDR20.setEnabled(true);
                arrowDL20.setEnabled(true);
                arrowL20.setEnabled(true);
                arrowUL20.setEnabled(true);
                black_stone20.setEnabled(true);
            }
            if(num==21) {
                arrowUR21.startAnimation(animTran1Start);
                arrowR21.startAnimation(animTran2Start);
                arrowDR21.startAnimation(animTran3Start);
                arrowDL21.startAnimation(animTran4Start);
                arrowL21.startAnimation(animTran5Start);
                arrowUL21.startAnimation(animTran6Start);
                arrowUR21.setEnabled(true);
                arrowR21.setEnabled(true);
                arrowDR21.setEnabled(true);
                arrowDL21.setEnabled(true);
                arrowL21.setEnabled(true);
                arrowUL21.setEnabled(true);
                black_stone21.setEnabled(true);
            }
            if(num==22) {
                arrowUR22.startAnimation(animTran1Start);
                arrowR22.startAnimation(animTran2Start);
                arrowDR22.startAnimation(animTran3Start);
                arrowDL22.startAnimation(animTran4Start);
                arrowL22.startAnimation(animTran5Start);
                arrowUL22.startAnimation(animTran6Start);
                arrowUR22.setEnabled(true);
                arrowR22.setEnabled(true);
                arrowDR22.setEnabled(true);
                arrowDL22.setEnabled(true);
                arrowL22.setEnabled(true);
                arrowUL22.setEnabled(true);
                black_stone22.setEnabled(true);
            }
            if(num==23) {
                arrowUR23.startAnimation(animTran1Start);
                arrowR23.startAnimation(animTran2Start);
                arrowDR23.startAnimation(animTran3Start);
                arrowDL23.startAnimation(animTran4Start);
                arrowL23.startAnimation(animTran5Start);
                arrowUL23.startAnimation(animTran6Start);
                arrowUR23.setEnabled(true);
                arrowR23.setEnabled(true);
                arrowDR23.setEnabled(true);
                arrowDL23.setEnabled(true);
                arrowL23.setEnabled(true);
                arrowUL23.setEnabled(true);
                black_stone23.setEnabled(true);
            }
            if(num==24) {
                arrowUR24.startAnimation(animTran1Start);
                arrowR24.startAnimation(animTran2Start);
                arrowDR24.startAnimation(animTran3Start);
                arrowDL24.startAnimation(animTran4Start);
                arrowL24.startAnimation(animTran5Start);
                arrowUL24.startAnimation(animTran6Start);
                arrowUR24.setEnabled(true);
                arrowR24.setEnabled(true);
                arrowDR24.setEnabled(true);
                arrowDL24.setEnabled(true);
                arrowL24.setEnabled(true);
                arrowUL24.setEnabled(true);
                black_stone24.setEnabled(true);
            }
            if(num==25) {
                arrowUR25.startAnimation(animTran1Start);
                arrowR25.startAnimation(animTran2Start);
                arrowDR25.startAnimation(animTran3Start);
                arrowDL25.startAnimation(animTran4Start);
                arrowL25.startAnimation(animTran5Start);
                arrowUL25.startAnimation(animTran6Start);
                arrowUR25.setEnabled(true);
                arrowR25.setEnabled(true);
                arrowDR25.setEnabled(true);
                arrowDL25.setEnabled(true);
                arrowL25.setEnabled(true);
                arrowUL25.setEnabled(true);
                black_stone25.setEnabled(true);
            }
            if(num==26) {
                arrowUR26.startAnimation(animTran1Start);
                arrowDL26.startAnimation(animTran4Start);
                arrowL26.startAnimation(animTran5Start);
                arrowUL26.startAnimation(animTran6Start);
                arrowUR26.setEnabled(true);
                arrowDL26.setEnabled(true);
                arrowL26.setEnabled(true);
                arrowUL26.setEnabled(true);
                black_stone26.setEnabled(true);
            }
            if(num==27) {
                arrowUR27.startAnimation(animTran1Start);
                arrowR27.startAnimation(animTran2Start);
                arrowDR27.startAnimation(animTran3Start);
                arrowUR27.setEnabled(true);
                arrowR27.setEnabled(true);
                arrowDR27.setEnabled(true);
                black_stone27.setEnabled(true);
            }
            if(num==28) {
                arrowUR28.startAnimation(animTran1Start);
                arrowR28.startAnimation(animTran2Start);
                arrowDR28.startAnimation(animTran3Start);
                arrowDL28.startAnimation(animTran4Start);
                arrowL28.startAnimation(animTran5Start);
                arrowUL28.startAnimation(animTran6Start);
                arrowUR28.setEnabled(true);
                arrowR28.setEnabled(true);
                arrowDR28.setEnabled(true);
                arrowDL28.setEnabled(true);
                arrowL28.setEnabled(true);
                arrowUL28.setEnabled(true);
                black_stone28.setEnabled(true);
            }
            if(num==29) {
                arrowUR29.startAnimation(animTran1Start);
                arrowR29.startAnimation(animTran2Start);
                arrowDR29.startAnimation(animTran3Start);
                arrowDL29.startAnimation(animTran4Start);
                arrowL29.startAnimation(animTran5Start);
                arrowUL29.startAnimation(animTran6Start);
                arrowUR29.setEnabled(true);
                arrowR29.setEnabled(true);
                arrowDR29.setEnabled(true);
                arrowDL29.setEnabled(true);
                arrowL29.setEnabled(true);
                arrowUL29.setEnabled(true);
                black_stone29.setEnabled(true);
            }
            if(num==30) {
                arrowUR30.startAnimation(animTran1Start);
                arrowR30.startAnimation(animTran2Start);
                arrowDR30.startAnimation(animTran3Start);
                arrowDL30.startAnimation(animTran4Start);
                arrowL30.startAnimation(animTran5Start);
                arrowUL30.startAnimation(animTran6Start);
                arrowUR30.setEnabled(true);
                arrowR30.setEnabled(true);
                arrowDR30.setEnabled(true);
                arrowDL30.setEnabled(true);
                arrowL30.setEnabled(true);
                arrowUL30.setEnabled(true);
                black_stone30.setEnabled(true);
            }
            if(num==31) {
                arrowUR31.startAnimation(animTran1Start);
                arrowR31.startAnimation(animTran2Start);
                arrowDR31.startAnimation(animTran3Start);
                arrowDL31.startAnimation(animTran4Start);
                arrowL31.startAnimation(animTran5Start);
                arrowUL31.startAnimation(animTran6Start);
                arrowUR31.setEnabled(true);
                arrowR31.setEnabled(true);
                arrowDR31.setEnabled(true);
                arrowDL31.setEnabled(true);
                arrowL31.setEnabled(true);
                arrowUL31.setEnabled(true);
                black_stone31.setEnabled(true);
            }
            if(num==32) {
                arrowUR32.startAnimation(animTran1Start);
                arrowR32.startAnimation(animTran2Start);
                arrowDR32.startAnimation(animTran3Start);
                arrowDL32.startAnimation(animTran4Start);
                arrowL32.startAnimation(animTran5Start);
                arrowUL32.startAnimation(animTran6Start);
                arrowUR32.setEnabled(true);
                arrowR32.setEnabled(true);
                arrowDR32.setEnabled(true);
                arrowDL32.setEnabled(true);
                arrowL32.setEnabled(true);
                arrowUL32.setEnabled(true);
                black_stone32.setEnabled(true);
            }
            if(num==33) {
                arrowUR33.startAnimation(animTran1Start);
                arrowR33.startAnimation(animTran2Start);
                arrowDR33.startAnimation(animTran3Start);
                arrowDL33.startAnimation(animTran4Start);
                arrowL33.startAnimation(animTran5Start);
                arrowUL33.startAnimation(animTran6Start);
                arrowUR33.setEnabled(true);
                arrowR33.setEnabled(true);
                arrowDR33.setEnabled(true);
                arrowDL33.setEnabled(true);
                arrowL33.setEnabled(true);
                arrowUL33.setEnabled(true);
                black_stone33.setEnabled(true);
            }
            if(num==34) {
                arrowUR34.startAnimation(animTran1Start);
                arrowR34.startAnimation(animTran2Start);
                arrowDR34.startAnimation(animTran3Start);
                arrowDL34.startAnimation(animTran4Start);
                arrowL34.startAnimation(animTran5Start);
                arrowUL34.startAnimation(animTran6Start);
                arrowUR34.setEnabled(true);
                arrowR34.setEnabled(true);
                arrowDR34.setEnabled(true);
                arrowDL34.setEnabled(true);
                arrowL34.setEnabled(true);
                arrowUL34.setEnabled(true);
                black_stone34.setEnabled(true);
            }
            if(num==35) {
                arrowDL35.startAnimation(animTran4Start);
                arrowL35.startAnimation(animTran5Start);
                arrowUL35.startAnimation(animTran6Start);
                arrowDL35.setEnabled(true);
                arrowL35.setEnabled(true);
                arrowUL35.setEnabled(true);
                black_stone35.setEnabled(true);
            }
            if(num==36) {
                arrowUR36.startAnimation(animTran1Start);
                arrowR36.startAnimation(animTran2Start);
                arrowDR36.startAnimation(animTran3Start);
                arrowDL36.startAnimation(animTran4Start);
                arrowUR36.setEnabled(true);
                arrowR36.setEnabled(true);
                arrowDR36.setEnabled(true);
                arrowDL36.setEnabled(true);
                black_stone36.setEnabled(true);
            }
            if(num==37) {
                arrowUR37.startAnimation(animTran1Start);
                arrowR37.startAnimation(animTran2Start);
                arrowDR37.startAnimation(animTran3Start);
                arrowDL37.startAnimation(animTran4Start);
                arrowL37.startAnimation(animTran5Start);
                arrowUL37.startAnimation(animTran6Start);
                arrowUR37.setEnabled(true);
                arrowR37.setEnabled(true);
                arrowDR37.setEnabled(true);
                arrowDL37.setEnabled(true);
                arrowL37.setEnabled(true);
                arrowUL37.setEnabled(true);
                black_stone37.setEnabled(true);
            }
            if(num==38) {
                arrowUR38.startAnimation(animTran1Start);
                arrowR38.startAnimation(animTran2Start);
                arrowDR38.startAnimation(animTran3Start);
                arrowDL38.startAnimation(animTran4Start);
                arrowL38.startAnimation(animTran5Start);
                arrowUL38.startAnimation(animTran6Start);
                arrowUR38.setEnabled(true);
                arrowR38.setEnabled(true);
                arrowDR38.setEnabled(true);
                arrowDL38.setEnabled(true);
                arrowL38.setEnabled(true);
                arrowUL38.setEnabled(true);
                black_stone38.setEnabled(true);
            }
            if(num==39) {
                arrowUR39.startAnimation(animTran1Start);
                arrowR39.startAnimation(animTran2Start);
                arrowDR39.startAnimation(animTran3Start);
                arrowDL39.startAnimation(animTran4Start);
                arrowL39.startAnimation(animTran5Start);
                arrowUL39.startAnimation(animTran6Start);
                arrowUR39.setEnabled(true);
                arrowR39.setEnabled(true);
                arrowDR39.setEnabled(true);
                arrowDL39.setEnabled(true);
                arrowL39.setEnabled(true);
                arrowUL39.setEnabled(true);
                black_stone39.setEnabled(true);
            }
            if(num==40) {
                arrowUR40.startAnimation(animTran1Start);
                arrowR40.startAnimation(animTran2Start);
                arrowDR40.startAnimation(animTran3Start);
                arrowDL40.startAnimation(animTran4Start);
                arrowL40.startAnimation(animTran5Start);
                arrowUL40.startAnimation(animTran6Start);
                arrowUR40.setEnabled(true);
                arrowR40.setEnabled(true);
                arrowDR40.setEnabled(true);
                arrowDL40.setEnabled(true);
                arrowL40.setEnabled(true);
                arrowUL40.setEnabled(true);
                black_stone40.setEnabled(true);
            }
            if(num==41) {
                arrowUR41.startAnimation(animTran1Start);
                arrowR41.startAnimation(animTran2Start);
                arrowDR41.startAnimation(animTran3Start);
                arrowDL41.startAnimation(animTran4Start);
                arrowL41.startAnimation(animTran5Start);
                arrowUL41.startAnimation(animTran6Start);
                arrowUR41.setEnabled(true);
                arrowR41.setEnabled(true);
                arrowDR41.setEnabled(true);
                arrowDL41.setEnabled(true);
                arrowL41.setEnabled(true);
                arrowUL41.setEnabled(true);
                black_stone41.setEnabled(true);
            }
            if(num==42) {
                arrowUR42.startAnimation(animTran1Start);
                arrowR42.startAnimation(animTran2Start);
                arrowDR42.startAnimation(animTran3Start);
                arrowDL42.startAnimation(animTran4Start);
                arrowL42.startAnimation(animTran5Start);
                arrowUL42.startAnimation(animTran6Start);
                arrowUR42.setEnabled(true);
                arrowR42.setEnabled(true);
                arrowDR42.setEnabled(true);
                arrowDL42.setEnabled(true);
                arrowL42.setEnabled(true);
                arrowUL42.setEnabled(true);
                black_stone42.setEnabled(true);
            }
            if(num==43) {
                arrowDR43.startAnimation(animTran3Start);
                arrowDL43.startAnimation(animTran4Start);
                arrowL43.startAnimation(animTran5Start);
                arrowUL43.startAnimation(animTran6Start);
                arrowDR43.setEnabled(true);
                arrowDL43.setEnabled(true);
                arrowL43.setEnabled(true);
                arrowUL43.setEnabled(true);
                black_stone43.setEnabled(true);
            }
            if(num==44) {
                arrowUR44.startAnimation(animTran1Start);
                arrowR44.startAnimation(animTran2Start);
                arrowDR44.startAnimation(animTran3Start);
                arrowDL44.startAnimation(animTran4Start);
                arrowUR44.setEnabled(true);
                arrowR44.setEnabled(true);
                arrowDR44.setEnabled(true);
                arrowDL44.setEnabled(true);
                black_stone44.setEnabled(true);
            }
            if(num==45) {
                arrowUR45.startAnimation(animTran1Start);
                arrowR45.startAnimation(animTran2Start);
                arrowDR45.startAnimation(animTran3Start);
                arrowDL45.startAnimation(animTran4Start);
                arrowL45.startAnimation(animTran5Start);
                arrowUL45.startAnimation(animTran6Start);
                arrowUR45.setEnabled(true);
                arrowR45.setEnabled(true);
                arrowDR45.setEnabled(true);
                arrowDL45.setEnabled(true);
                arrowL45.setEnabled(true);
                arrowUL45.setEnabled(true);
                black_stone45.setEnabled(true);
            }
            if(num==46) {
                arrowUR46.startAnimation(animTran1Start);
                arrowR46.startAnimation(animTran2Start);
                arrowDR46.startAnimation(animTran3Start);
                arrowDL46.startAnimation(animTran4Start);
                arrowL46.startAnimation(animTran5Start);
                arrowUL46.startAnimation(animTran6Start);
                arrowUR46.setEnabled(true);
                arrowR46.setEnabled(true);
                arrowDR46.setEnabled(true);
                arrowDL46.setEnabled(true);
                arrowL46.setEnabled(true);
                arrowUL46.setEnabled(true);
                black_stone46.setEnabled(true);
            }
            if(num==47) {
                arrowUR47.startAnimation(animTran1Start);
                arrowR47.startAnimation(animTran2Start);
                arrowDR47.startAnimation(animTran3Start);
                arrowDL47.startAnimation(animTran4Start);
                arrowL47.startAnimation(animTran5Start);
                arrowUL47.startAnimation(animTran6Start);
                arrowUR47.setEnabled(true);
                arrowR47.setEnabled(true);
                arrowDR47.setEnabled(true);
                arrowDL47.setEnabled(true);
                arrowL47.setEnabled(true);
                arrowUL47.setEnabled(true);
                black_stone47.setEnabled(true);
            }
            if(num==48) {
                arrowUR48.startAnimation(animTran1Start);
                arrowR48.startAnimation(animTran2Start);
                arrowDR48.startAnimation(animTran3Start);
                arrowDL48.startAnimation(animTran4Start);
                arrowL48.startAnimation(animTran5Start);
                arrowUL48.startAnimation(animTran6Start);
                arrowUR48.setEnabled(true);
                arrowR48.setEnabled(true);
                arrowDR48.setEnabled(true);
                arrowDL48.setEnabled(true);
                arrowL48.setEnabled(true);
                arrowUL48.setEnabled(true);
                black_stone48.setEnabled(true);
            }
            if(num==49) {
                arrowUR49.startAnimation(animTran1Start);
                arrowR49.startAnimation(animTran2Start);
                arrowDR49.startAnimation(animTran3Start);
                arrowDL49.startAnimation(animTran4Start);
                arrowL49.startAnimation(animTran5Start);
                arrowUL49.startAnimation(animTran6Start);
                arrowUR49.setEnabled(true);
                arrowR49.setEnabled(true);
                arrowDR49.setEnabled(true);
                arrowDL49.setEnabled(true);
                arrowL49.setEnabled(true);
                arrowUL49.setEnabled(true);
                black_stone49.setEnabled(true);
            }
            if(num==50) {
                arrowDR50.startAnimation(animTran3Start);
                arrowDL50.startAnimation(animTran4Start);
                arrowL50.startAnimation(animTran5Start);
                arrowUL50.startAnimation(animTran6Start);
                arrowDR50.setEnabled(true);
                arrowDL50.setEnabled(true);
                arrowL50.setEnabled(true);
                arrowUL50.setEnabled(true);
                black_stone50.setEnabled(true);
            }
            if(num==51) {
                arrowUR51.startAnimation(animTran1Start);
                arrowR51.startAnimation(animTran2Start);
                arrowDR51.startAnimation(animTran3Start);
                arrowDL51.startAnimation(animTran4Start);
                arrowUR51.setEnabled(true);
                arrowR51.setEnabled(true);
                arrowDR51.setEnabled(true);
                arrowDL51.setEnabled(true);
                black_stone51.setEnabled(true);
            }
            if(num==52) {
                arrowUR52.startAnimation(animTran1Start);
                arrowR52.startAnimation(animTran2Start);
                arrowDR52.startAnimation(animTran3Start);
                arrowDL52.startAnimation(animTran4Start);
                arrowL52.startAnimation(animTran5Start);
                arrowUL52.startAnimation(animTran6Start);
                arrowUR52.setEnabled(true);
                arrowR52.setEnabled(true);
                arrowDR52.setEnabled(true);
                arrowDL52.setEnabled(true);
                arrowL52.setEnabled(true);
                arrowUL52.setEnabled(true);
                black_stone52.setEnabled(true);
            }
            if(num==53) {
                arrowUR53.startAnimation(animTran1Start);
                arrowR53.startAnimation(animTran2Start);
                arrowDR53.startAnimation(animTran3Start);
                arrowDL53.startAnimation(animTran4Start);
                arrowL53.startAnimation(animTran5Start);
                arrowUL53.startAnimation(animTran6Start);
                arrowUR53.setEnabled(true);
                arrowR53.setEnabled(true);
                arrowDR53.setEnabled(true);
                arrowDL53.setEnabled(true);
                arrowL53.setEnabled(true);
                arrowUL53.setEnabled(true);
                black_stone53.setEnabled(true);
            }
            if(num==54) {
                arrowUR54.startAnimation(animTran1Start);
                arrowR54.startAnimation(animTran2Start);
                arrowDR54.startAnimation(animTran3Start);
                arrowDL54.startAnimation(animTran4Start);
                arrowL54.startAnimation(animTran5Start);
                arrowUL54.startAnimation(animTran6Start);
                arrowUR54.setEnabled(true);
                arrowR54.setEnabled(true);
                arrowDR54.setEnabled(true);
                arrowDL54.setEnabled(true);
                arrowL54.setEnabled(true);
                arrowUL54.setEnabled(true);
                black_stone54.setEnabled(true);
            }
            if(num==55) {
                arrowUR55.startAnimation(animTran1Start);
                arrowR55.startAnimation(animTran2Start);
                arrowDR55.startAnimation(animTran3Start);
                arrowDL55.startAnimation(animTran4Start);
                arrowL55.startAnimation(animTran5Start);
                arrowUL55.startAnimation(animTran6Start);
                arrowUR55.setEnabled(true);
                arrowR55.setEnabled(true);
                arrowDR55.setEnabled(true);
                arrowDL55.setEnabled(true);
                arrowL55.setEnabled(true);
                arrowUL55.setEnabled(true);
                black_stone55.setEnabled(true);
            }
            if(num==56) {
                arrowDR56.startAnimation(animTran3Start);
                arrowDL56.startAnimation(animTran4Start);
                arrowL56.startAnimation(animTran5Start);
                arrowUL56.startAnimation(animTran6Start);
                arrowDR56.setEnabled(true);
                arrowDL56.setEnabled(true);
                arrowL56.setEnabled(true);
                arrowUL56.setEnabled(true);
                black_stone56.setEnabled(true);
            }
            if(num==57) {
                arrowR57.startAnimation(animTran2Start);
                arrowDR57.startAnimation(animTran3Start);
                arrowDL57.startAnimation(animTran4Start);
                arrowR57.setEnabled(true);
                arrowDR57.setEnabled(true);
                arrowDL57.setEnabled(true);
                black_stone57.setEnabled(true);
            }
            if(num==58) {
                arrowR58.startAnimation(animTran2Start);
                arrowDR58.startAnimation(animTran3Start);
                arrowDL58.startAnimation(animTran4Start);
                arrowL58.startAnimation(animTran5Start);
                arrowR58.setEnabled(true);
                arrowDR58.setEnabled(true);
                arrowDL58.setEnabled(true);
                arrowL58.setEnabled(true);
                black_stone58.setEnabled(true);
            }
            if(num==59) {
                arrowR59.startAnimation(animTran2Start);
                arrowDR59.startAnimation(animTran3Start);
                arrowDL59.startAnimation(animTran4Start);
                arrowL59.startAnimation(animTran5Start);
                arrowR59.setEnabled(true);
                arrowDR59.setEnabled(true);
                arrowDL59.setEnabled(true);
                arrowL59.setEnabled(true);
                black_stone59.setEnabled(true);
            }
            if(num==60) {
                arrowR60.startAnimation(animTran2Start);
                arrowDR60.startAnimation(animTran3Start);
                arrowDL60.startAnimation(animTran4Start);
                arrowL60.startAnimation(animTran5Start);
                arrowR60.setEnabled(true);
                arrowDR60.setEnabled(true);
                arrowDL60.setEnabled(true);
                arrowL60.setEnabled(true);
                black_stone60.setEnabled(true);
            }
            if(num==61) {
                arrowDR61.startAnimation(animTran3Start);
                arrowDL61.startAnimation(animTran4Start);
                arrowL61.startAnimation(animTran5Start);
                arrowDR61.setEnabled(true);
                arrowDL61.setEnabled(true);
                arrowL61.setEnabled(true);
                black_stone61.setEnabled(true);
            }


        }
        else {
            allEnabled();
            if(num==1) {
                arrowUR1.startAnimation(animTran1End);
                arrowR1.startAnimation(animTran2End);
                arrowUL1.startAnimation(animTran6End);
                arrowUR1.setEnabled(false);
                arrowR1.setEnabled(false);
                arrowUL1.setEnabled(false);
            }
            if(num==2) {
                arrowUR2.startAnimation(animTran1End);
                arrowR2.startAnimation(animTran2End);
                arrowUL2.startAnimation(animTran6End);
                arrowL2.startAnimation(animTran5End);
                arrowUR2.setEnabled(false);
                arrowR2.setEnabled(false);
                arrowUL2.setEnabled(false);
                arrowL2.setEnabled(false);
            }
            if(num==3){
                arrowUR3.startAnimation(animTran1End);
                arrowR3.startAnimation(animTran2End);
                arrowUL3.startAnimation(animTran6End);
                arrowL3.startAnimation(animTran5End);
                arrowUR3.setEnabled(false);
                arrowR3.setEnabled(false);
                arrowUL3.setEnabled(false);
                arrowL3.setEnabled(false);
            }
            if(num==4){
                arrowUR4.startAnimation(animTran1End);
                arrowR4.startAnimation(animTran2End);
                arrowUL4.startAnimation(animTran6End);
                arrowL4.startAnimation(animTran5End);
                arrowUR4.setEnabled(false);
                arrowR4.setEnabled(false);
                arrowUL4.setEnabled(false);
                arrowL4.setEnabled(false);
            }
            if(num==5) {
                arrowUR5.startAnimation(animTran1End);
                arrowL5.startAnimation(animTran5End);
                arrowUL5.startAnimation(animTran6End);
                arrowUR5.setEnabled(false);
                arrowL5.setEnabled(false);
                arrowUL5.setEnabled(false);
            }
            if(num==6) {
                arrowUR6.startAnimation(animTran1End);
                arrowR6.startAnimation(animTran2End);
                arrowDR6.startAnimation(animTran3End);
                arrowUL6.startAnimation(animTran6End);
                arrowUR6.setEnabled(false);
                arrowR6.setEnabled(false);
                arrowDR6.setEnabled(false);
                arrowUL6.setEnabled(false);
            }
            if(num==7) {
                arrowUR7.startAnimation(animTran1End);
                arrowR7.startAnimation(animTran2End);
                arrowDR7.startAnimation(animTran3End);
                arrowDL7.startAnimation(animTran4End);
                arrowL7.startAnimation(animTran5End);
                arrowUL7.startAnimation(animTran6End);
                arrowUR7.setEnabled(false);
                arrowR7.setEnabled(false);
                arrowDR7.setEnabled(false);
                arrowDL7.setEnabled(false);
                arrowL7.setEnabled(false);
                arrowUL7.setEnabled(false);
            }
            if(num==8) {
                arrowUR8.startAnimation(animTran1End);
                arrowR8.startAnimation(animTran2End);
                arrowDR8.startAnimation(animTran3End);
                arrowDL8.startAnimation(animTran4End);
                arrowL8.startAnimation(animTran5End);
                arrowUL8.startAnimation(animTran6End);
                arrowUR8.setEnabled(false);
                arrowR8.setEnabled(false);
                arrowDR8.setEnabled(false);
                arrowDL8.setEnabled(false);
                arrowL8.setEnabled(false);
                arrowUL8.setEnabled(false);
            }
            if(num==9) {
                arrowUR9.startAnimation(animTran1End);
                arrowR9.startAnimation(animTran2End);
                arrowDR9.startAnimation(animTran3End);
                arrowDL9.startAnimation(animTran4End);
                arrowL9.startAnimation(animTran5End);
                arrowUL9.startAnimation(animTran6End);
                arrowUR9.setEnabled(false);
                arrowR9.setEnabled(false);
                arrowDR9.setEnabled(false);
                arrowDL9.setEnabled(false);
                arrowL9.setEnabled(false);
                arrowUL9.setEnabled(false);
            }
            if(num==10) {
                arrowUR10.startAnimation(animTran1End);
                arrowR10.startAnimation(animTran2End);
                arrowDR10.startAnimation(animTran3End);
                arrowDL10.startAnimation(animTran4End);
                arrowL10.startAnimation(animTran5End);
                arrowUL10.startAnimation(animTran6End);
                arrowUR10.setEnabled(false);
                arrowR10.setEnabled(false);
                arrowDR10.setEnabled(false);
                arrowDL10.setEnabled(false);
                arrowL10.setEnabled(false);
                arrowUL10.setEnabled(false);
            }
            if(num==11) {
                arrowUR11.startAnimation(animTran1End);
                arrowDL11.startAnimation(animTran4End);
                arrowL11.startAnimation(animTran5End);
                arrowUL11.startAnimation(animTran6End);
                arrowUR11.setEnabled(false);
                arrowDL11.setEnabled(false);
                arrowL11.setEnabled(false);
                arrowUL11.setEnabled(false);
            }
            if(num==12) {
                arrowUR12.startAnimation(animTran1End);
                arrowR12.startAnimation(animTran2End);
                arrowDR12.startAnimation(animTran3End);
                arrowUL12.startAnimation(animTran6End);
                arrowUR12.setEnabled(false);
                arrowR12.setEnabled(false);
                arrowDR12.setEnabled(false);
                arrowUL12.setEnabled(false);
            }
            if(num==13) {
                arrowUR13.startAnimation(animTran1End);
                arrowR13.startAnimation(animTran2End);
                arrowDR13.startAnimation(animTran3End);
                arrowDL13.startAnimation(animTran4End);
                arrowL13.startAnimation(animTran5End);
                arrowUL13.startAnimation(animTran6End);
                arrowUR13.setEnabled(false);
                arrowR13.setEnabled(false);
                arrowDR13.setEnabled(false);
                arrowDL13.setEnabled(false);
                arrowL13.setEnabled(false);
                arrowUL13.setEnabled(false);
            }
            if(num==14) {
                arrowUR14.startAnimation(animTran1End);
                arrowR14.startAnimation(animTran2End);
                arrowDR14.startAnimation(animTran3End);
                arrowDL14.startAnimation(animTran4End);
                arrowL14.startAnimation(animTran5End);
                arrowUL14.startAnimation(animTran6End);
                arrowUR14.setEnabled(false);
                arrowR14.setEnabled(false);
                arrowDR14.setEnabled(false);
                arrowDL14.setEnabled(false);
                arrowL14.setEnabled(false);
                arrowUL14.setEnabled(false);
            }
            if(num==15) {
                arrowUR15.startAnimation(animTran1End);
                arrowR15.startAnimation(animTran2End);
                arrowDR15.startAnimation(animTran3End);
                arrowDL15.startAnimation(animTran4End);
                arrowL15.startAnimation(animTran5End);
                arrowUL15.startAnimation(animTran6End);
                arrowUR15.setEnabled(false);
                arrowR15.setEnabled(false);
                arrowDR15.setEnabled(false);
                arrowDL15.setEnabled(false);
                arrowL15.setEnabled(false);
                arrowUL15.setEnabled(false);
            }
            if(num==16) {
                arrowUR16.startAnimation(animTran1End);
                arrowR16.startAnimation(animTran2End);
                arrowDR16.startAnimation(animTran3End);
                arrowDL16.startAnimation(animTran4End);
                arrowL16.startAnimation(animTran5End);
                arrowUL16.startAnimation(animTran6End);
                arrowUR16.setEnabled(false);
                arrowR16.setEnabled(false);
                arrowDR16.setEnabled(false);
                arrowDL16.setEnabled(false);
                arrowL16.setEnabled(false);
                arrowUL16.setEnabled(false);
            }
            if(num==17) {
                arrowUR17.startAnimation(animTran1End);
                arrowR17.startAnimation(animTran2End);
                arrowDR17.startAnimation(animTran3End);
                arrowDL17.startAnimation(animTran4End);
                arrowL17.startAnimation(animTran5End);
                arrowUL17.startAnimation(animTran6End);
                arrowUR17.setEnabled(false);
                arrowR17.setEnabled(false);
                arrowDR17.setEnabled(false);
                arrowDL17.setEnabled(false);
                arrowL17.setEnabled(false);
                arrowUL17.setEnabled(false);
            }
            if(num==18) {
                arrowUR18.startAnimation(animTran1End);
                arrowDL18.startAnimation(animTran4End);
                arrowL18.startAnimation(animTran5End);
                arrowUL18.startAnimation(animTran6End);
                arrowUR18.setEnabled(false);
                arrowDL18.setEnabled(false);
                arrowL18.setEnabled(false);
                arrowUL18.setEnabled(false);
            }
            if(num==19) {
                arrowUR19.startAnimation(animTran1End);
                arrowR19.startAnimation(animTran2End);
                arrowDR19.startAnimation(animTran3End);
                arrowUL19.startAnimation(animTran6End);
                arrowUR19.setEnabled(false);
                arrowR19.setEnabled(false);
                arrowDR19.setEnabled(false);
                arrowUL19.setEnabled(false);
            }
            if(num==20) {
                arrowUR20.startAnimation(animTran1End);
                arrowR20.startAnimation(animTran2End);
                arrowDR20.startAnimation(animTran3End);
                arrowDL20.startAnimation(animTran4End);
                arrowL20.startAnimation(animTran5End);
                arrowUL20.startAnimation(animTran6End);
                arrowUR20.setEnabled(false);
                arrowR20.setEnabled(false);
                arrowDR20.setEnabled(false);
                arrowDL20.setEnabled(false);
                arrowL20.setEnabled(false);
                arrowUL20.setEnabled(false);
            }
            if(num==21) {
                arrowUR21.startAnimation(animTran1End);
                arrowR21.startAnimation(animTran2End);
                arrowDR21.startAnimation(animTran3End);
                arrowDL21.startAnimation(animTran4End);
                arrowL21.startAnimation(animTran5End);
                arrowUL21.startAnimation(animTran6End);
                arrowUR21.setEnabled(false);
                arrowR21.setEnabled(false);
                arrowDR21.setEnabled(false);
                arrowDL21.setEnabled(false);
                arrowL21.setEnabled(false);
                arrowUL21.setEnabled(false);
            }
            if(num==22) {
                arrowUR22.startAnimation(animTran1End);
                arrowR22.startAnimation(animTran2End);
                arrowDR22.startAnimation(animTran3End);
                arrowDL22.startAnimation(animTran4End);
                arrowL22.startAnimation(animTran5End);
                arrowUL22.startAnimation(animTran6End);
                arrowUR22.setEnabled(false);
                arrowR22.setEnabled(false);
                arrowDR22.setEnabled(false);
                arrowDL22.setEnabled(false);
                arrowL22.setEnabled(false);
                arrowUL22.setEnabled(false);
            }
            if(num==23) {
                arrowUR23.startAnimation(animTran1End);
                arrowR23.startAnimation(animTran2End);
                arrowDR23.startAnimation(animTran3End);
                arrowDL23.startAnimation(animTran4End);
                arrowL23.startAnimation(animTran5End);
                arrowUL23.startAnimation(animTran6End);
                arrowUR23.setEnabled(false);
                arrowR23.setEnabled(false);
                arrowDR23.setEnabled(false);
                arrowDL23.setEnabled(false);
                arrowL23.setEnabled(false);
                arrowUL23.setEnabled(false);
            }
            if(num==24) {
                arrowUR24.startAnimation(animTran1End);
                arrowR24.startAnimation(animTran2End);
                arrowDR24.startAnimation(animTran3End);
                arrowDL24.startAnimation(animTran4End);
                arrowL24.startAnimation(animTran5End);
                arrowUL24.startAnimation(animTran6End);
                arrowUR24.setEnabled(false);
                arrowR24.setEnabled(false);
                arrowDR24.setEnabled(false);
                arrowDL24.setEnabled(false);
                arrowL24.setEnabled(false);
                arrowUL24.setEnabled(false);
                black_stone24.setEnabled(false);
            }
            if(num==25) {
                arrowUR25.startAnimation(animTran1End);
                arrowR25.startAnimation(animTran2End);
                arrowDR25.startAnimation(animTran3End);
                arrowDL25.startAnimation(animTran4End);
                arrowL25.startAnimation(animTran5End);
                arrowUL25.startAnimation(animTran6End);
                arrowUR25.setEnabled(false);
                arrowR25.setEnabled(false);
                arrowDR25.setEnabled(false);
                arrowDL25.setEnabled(false);
                arrowL25.setEnabled(false);
                arrowUL25.setEnabled(false);
            }
            if(num==26) {
                arrowUR26.startAnimation(animTran1End);
                arrowDL26.startAnimation(animTran4End);
                arrowL26.startAnimation(animTran5End);
                arrowUL26.startAnimation(animTran6End);
                arrowUR26.setEnabled(false);
                arrowDL26.setEnabled(false);
                arrowL26.setEnabled(false);
                arrowUL26.setEnabled(false);
                black_stone26.setEnabled(false);
            }
            if(num==27) {
                arrowUR27.startAnimation(animTran1End);
                arrowR27.startAnimation(animTran2End);
                arrowDR27.startAnimation(animTran3End);
                arrowUR27.setEnabled(false);
                arrowR27.setEnabled(false);
                arrowDR27.setEnabled(false);
            }
            if(num==28) {
                arrowUR28.startAnimation(animTran1End);
                arrowR28.startAnimation(animTran2End);
                arrowDR28.startAnimation(animTran3End);
                arrowDL28.startAnimation(animTran4End);
                arrowL28.startAnimation(animTran5End);
                arrowUL28.startAnimation(animTran6End);
                arrowUR28.setEnabled(false);
                arrowR28.setEnabled(false);
                arrowDR28.setEnabled(false);
                arrowDL28.setEnabled(false);
                arrowL28.setEnabled(false);
                arrowUL28.setEnabled(false);
            }
            if(num==29) {
                arrowUR29.startAnimation(animTran1End);
                arrowR29.startAnimation(animTran2End);
                arrowDR29.startAnimation(animTran3End);
                arrowDL29.startAnimation(animTran4End);
                arrowL29.startAnimation(animTran5End);
                arrowUL29.startAnimation(animTran6End);
                arrowUR29.setEnabled(false);
                arrowR29.setEnabled(false);
                arrowDR29.setEnabled(false);
                arrowDL29.setEnabled(false);
                arrowL29.setEnabled(false);
                arrowUL29.setEnabled(false);
            }
            if(num==30) {
                arrowUR30.startAnimation(animTran1End);
                arrowR30.startAnimation(animTran2End);
                arrowDR30.startAnimation(animTran3End);
                arrowDL30.startAnimation(animTran4End);
                arrowL30.startAnimation(animTran5End);
                arrowUL30.startAnimation(animTran6End);
                arrowUR30.setEnabled(false);
                arrowR30.setEnabled(false);
                arrowDR30.setEnabled(false);
                arrowDL30.setEnabled(false);
                arrowL30.setEnabled(false);
                arrowUL30.setEnabled(false);
            }
            if(num==31) {
                arrowUR31.startAnimation(animTran1End);
                arrowR31.startAnimation(animTran2End);
                arrowDR31.startAnimation(animTran3End);
                arrowDL31.startAnimation(animTran4End);
                arrowL31.startAnimation(animTran5End);
                arrowUL31.startAnimation(animTran6End);
                arrowUR31.setEnabled(false);
                arrowR31.setEnabled(false);
                arrowDR31.setEnabled(false);
                arrowDL31.setEnabled(false);
                arrowL31.setEnabled(false);
                arrowUL31.setEnabled(false);
            }
            if(num==32) {
                arrowUR32.startAnimation(animTran1End);
                arrowR32.startAnimation(animTran2End);
                arrowDR32.startAnimation(animTran3End);
                arrowDL32.startAnimation(animTran4End);
                arrowL32.startAnimation(animTran5End);
                arrowUL32.startAnimation(animTran6End);
                arrowUR32.setEnabled(false);
                arrowR32.setEnabled(false);
                arrowDR32.setEnabled(false);
                arrowDL32.setEnabled(false);
                arrowL32.setEnabled(false);
                arrowUL32.setEnabled(false);
            }
            if(num==33) {
                arrowUR33.startAnimation(animTran1End);
                arrowR33.startAnimation(animTran2End);
                arrowDR33.startAnimation(animTran3End);
                arrowDL33.startAnimation(animTran4End);
                arrowL33.startAnimation(animTran5End);
                arrowUL33.startAnimation(animTran6End);
                arrowUR33.setEnabled(false);
                arrowR33.setEnabled(false);
                arrowDR33.setEnabled(false);
                arrowDL33.setEnabled(false);
                arrowL33.setEnabled(false);
                arrowUL33.setEnabled(false);
            }
            if(num==34) {
                arrowUR34.startAnimation(animTran1End);
                arrowR34.startAnimation(animTran2End);
                arrowDR34.startAnimation(animTran3End);
                arrowDL34.startAnimation(animTran4End);
                arrowL34.startAnimation(animTran5End);
                arrowUL34.startAnimation(animTran6End);
                arrowUR34.setEnabled(false);
                arrowR34.setEnabled(false);
                arrowDR34.setEnabled(false);
                arrowDL34.setEnabled(false);
                arrowL34.setEnabled(false);
                arrowUL34.setEnabled(false);
            }
            if(num==35) {
                arrowDL35.startAnimation(animTran4End);
                arrowL35.startAnimation(animTran5End);
                arrowUL35.startAnimation(animTran6End);
                arrowDL35.setEnabled(false);
                arrowL35.setEnabled(false);
                arrowUL35.setEnabled(false);
            }
            if(num==36) {
                arrowUR36.startAnimation(animTran1End);
                arrowR36.startAnimation(animTran2End);
                arrowDR36.startAnimation(animTran3End);
                arrowDL36.startAnimation(animTran4End);
                arrowUR36.setEnabled(false);
                arrowR36.setEnabled(false);
                arrowDR36.setEnabled(false);
                arrowDL36.setEnabled(false);
            }
            if(num==37) {
                arrowUR37.startAnimation(animTran1End);
                arrowR37.startAnimation(animTran2End);
                arrowDR37.startAnimation(animTran3End);
                arrowDL37.startAnimation(animTran4End);
                arrowL37.startAnimation(animTran5End);
                arrowUL37.startAnimation(animTran6End);
                arrowUR37.setEnabled(false);
                arrowR37.setEnabled(false);
                arrowDR37.setEnabled(false);
                arrowDL37.setEnabled(false);
                arrowL37.setEnabled(false);
                arrowUL37.setEnabled(false);
            }
            if(num==38) {
                arrowUR38.startAnimation(animTran1End);
                arrowR38.startAnimation(animTran2End);
                arrowDR38.startAnimation(animTran3End);
                arrowDL38.startAnimation(animTran4End);
                arrowL38.startAnimation(animTran5End);
                arrowUL38.startAnimation(animTran6End);
                arrowUR38.setEnabled(false);
                arrowR38.setEnabled(false);
                arrowDR38.setEnabled(false);
                arrowDL38.setEnabled(false);
                arrowL38.setEnabled(false);
                arrowUL38.setEnabled(false);
            }
            if(num==39) {
                arrowUR39.startAnimation(animTran1End);
                arrowR39.startAnimation(animTran2End);
                arrowDR39.startAnimation(animTran3End);
                arrowDL39.startAnimation(animTran4End);
                arrowL39.startAnimation(animTran5End);
                arrowUL39.startAnimation(animTran6End);
                arrowUR39.setEnabled(false);
                arrowR39.setEnabled(false);
                arrowDR39.setEnabled(false);
                arrowDL39.setEnabled(false);
                arrowL39.setEnabled(false);
                arrowUL39.setEnabled(false);
            }
            if(num==40) {
                arrowUR40.startAnimation(animTran1End);
                arrowR40.startAnimation(animTran2End);
                arrowDR40.startAnimation(animTran3End);
                arrowDL40.startAnimation(animTran4End);
                arrowL40.startAnimation(animTran5End);
                arrowUL40.startAnimation(animTran6End);
                arrowUR40.setEnabled(false);
                arrowR40.setEnabled(false);
                arrowDR40.setEnabled(false);
                arrowDL40.setEnabled(false);
                arrowL40.setEnabled(false);
                arrowUL40.setEnabled(false);
            }
            if(num==41) {
                arrowUR41.startAnimation(animTran1End);
                arrowR41.startAnimation(animTran2End);
                arrowDR41.startAnimation(animTran3End);
                arrowDL41.startAnimation(animTran4End);
                arrowL41.startAnimation(animTran5End);
                arrowUL41.startAnimation(animTran6End);
                arrowUR41.setEnabled(false);
                arrowR41.setEnabled(false);
                arrowDR41.setEnabled(false);
                arrowDL41.setEnabled(false);
                arrowL41.setEnabled(false);
                arrowUL41.setEnabled(false);
            }
            if(num==42) {
                arrowUR42.startAnimation(animTran1End);
                arrowR42.startAnimation(animTran2End);
                arrowDR42.startAnimation(animTran3End);
                arrowDL42.startAnimation(animTran4End);
                arrowL42.startAnimation(animTran5End);
                arrowUL42.startAnimation(animTran6End);
                arrowUR42.setEnabled(false);
                arrowR42.setEnabled(false);
                arrowDR42.setEnabled(false);
                arrowDL42.setEnabled(false);
                arrowL42.setEnabled(false);
                arrowUL42.setEnabled(false);
            }
            if(num==43) {
                arrowDR43.startAnimation(animTran3End);
                arrowDL43.startAnimation(animTran4End);
                arrowL43.startAnimation(animTran5End);
                arrowUL43.startAnimation(animTran6End);
                arrowDR43.setEnabled(false);
                arrowDL43.setEnabled(false);
                arrowL43.setEnabled(false);
                arrowUL43.setEnabled(false);
            }
            if(num==44) {
                arrowUR44.startAnimation(animTran1End);
                arrowR44.startAnimation(animTran2End);
                arrowDR44.startAnimation(animTran3End);
                arrowDL44.startAnimation(animTran4End);
                arrowUR44.setEnabled(false);
                arrowR44.setEnabled(false);
                arrowDR44.setEnabled(false);
                arrowDL44.setEnabled(false);
            }
            if(num==45) {
                arrowUR45.startAnimation(animTran1End);
                arrowR45.startAnimation(animTran2End);
                arrowDR45.startAnimation(animTran3End);
                arrowDL45.startAnimation(animTran4End);
                arrowL45.startAnimation(animTran5End);
                arrowUL45.startAnimation(animTran6End);
                arrowUR45.setEnabled(false);
                arrowR45.setEnabled(false);
                arrowDR45.setEnabled(false);
                arrowDL45.setEnabled(false);
                arrowL45.setEnabled(false);
                arrowUL45.setEnabled(false);
            }
            if(num==46) {
                arrowUR46.startAnimation(animTran1End);
                arrowR46.startAnimation(animTran2End);
                arrowDR46.startAnimation(animTran3End);
                arrowDL46.startAnimation(animTran4End);
                arrowL46.startAnimation(animTran5End);
                arrowUL46.startAnimation(animTran6End);
                arrowUR46.setEnabled(false);
                arrowR46.setEnabled(false);
                arrowDR46.setEnabled(false);
                arrowDL46.setEnabled(false);
                arrowL46.setEnabled(false);
                arrowUL46.setEnabled(false);
            }
            if(num==47) {
                arrowUR47.startAnimation(animTran1End);
                arrowR47.startAnimation(animTran2End);
                arrowDR47.startAnimation(animTran3End);
                arrowDL47.startAnimation(animTran4End);
                arrowL47.startAnimation(animTran5End);
                arrowUL47.startAnimation(animTran6End);
                arrowUR47.setEnabled(false);
                arrowR47.setEnabled(false);
                arrowDR47.setEnabled(false);
                arrowDL47.setEnabled(false);
                arrowL47.setEnabled(false);
                arrowUL47.setEnabled(false);
            }
            if(num==48) {
                arrowUR48.startAnimation(animTran1End);
                arrowR48.startAnimation(animTran2End);
                arrowDR48.startAnimation(animTran3End);
                arrowDL48.startAnimation(animTran4End);
                arrowL48.startAnimation(animTran5End);
                arrowUL48.startAnimation(animTran6End);
                arrowUR48.setEnabled(false);
                arrowR48.setEnabled(false);
                arrowDR48.setEnabled(false);
                arrowDL48.setEnabled(false);
                arrowL48.setEnabled(false);
                arrowUL48.setEnabled(false);
            }
            if(num==49) {
                arrowUR49.startAnimation(animTran1End);
                arrowR49.startAnimation(animTran2End);
                arrowDR49.startAnimation(animTran3End);
                arrowDL49.startAnimation(animTran4End);
                arrowL49.startAnimation(animTran5End);
                arrowUL49.startAnimation(animTran6End);
                arrowUR49.setEnabled(false);
                arrowR49.setEnabled(false);
                arrowDR49.setEnabled(false);
                arrowDL49.setEnabled(false);
                arrowL49.setEnabled(false);
                arrowUL49.setEnabled(false);
            }
            if(num==50) {
                arrowDR50.startAnimation(animTran3End);
                arrowDL50.startAnimation(animTran4End);
                arrowL50.startAnimation(animTran5End);
                arrowUL50.startAnimation(animTran6End);
                arrowDR50.setEnabled(false);
                arrowDL50.setEnabled(false);
                arrowL50.setEnabled(false);
                arrowUL50.setEnabled(false);
            }
            if(num==51) {
                arrowUR51.startAnimation(animTran1End);
                arrowR51.startAnimation(animTran2End);
                arrowDR51.startAnimation(animTran3End);
                arrowDL51.startAnimation(animTran4End);
                arrowUR51.setEnabled(false);
                arrowR51.setEnabled(false);
                arrowDR51.setEnabled(false);
                arrowDL51.setEnabled(false);
            }
            if(num==52) {
                arrowUR52.startAnimation(animTran1End);
                arrowR52.startAnimation(animTran2End);
                arrowDR52.startAnimation(animTran3End);
                arrowDL52.startAnimation(animTran4End);
                arrowL52.startAnimation(animTran5End);
                arrowUL52.startAnimation(animTran6End);
                arrowUR52.setEnabled(false);
                arrowR52.setEnabled(false);
                arrowDR52.setEnabled(false);
                arrowDL52.setEnabled(false);
                arrowL52.setEnabled(false);
                arrowUL52.setEnabled(false);
            }
            if(num==53) {
                arrowUR53.startAnimation(animTran1End);
                arrowR53.startAnimation(animTran2End);
                arrowDR53.startAnimation(animTran3End);
                arrowDL53.startAnimation(animTran4End);
                arrowL53.startAnimation(animTran5End);
                arrowUL53.startAnimation(animTran6End);
                arrowUR53.setEnabled(false);
                arrowR53.setEnabled(false);
                arrowDR53.setEnabled(false);
                arrowDL53.setEnabled(false);
                arrowL53.setEnabled(false);
                arrowUL53.setEnabled(false);
            }
            if(num==54) {
                arrowUR54.startAnimation(animTran1End);
                arrowR54.startAnimation(animTran2End);
                arrowDR54.startAnimation(animTran3End);
                arrowDL54.startAnimation(animTran4End);
                arrowL54.startAnimation(animTran5End);
                arrowUL54.startAnimation(animTran6End);
                arrowUR54.setEnabled(false);
                arrowR54.setEnabled(false);
                arrowDR54.setEnabled(false);
                arrowDL54.setEnabled(false);
                arrowL54.setEnabled(false);
                arrowUL54.setEnabled(false);
            }
            if(num==55) {
                arrowUR55.startAnimation(animTran1End);
                arrowR55.startAnimation(animTran2End);
                arrowDR55.startAnimation(animTran3End);
                arrowDL55.startAnimation(animTran4End);
                arrowL55.startAnimation(animTran5End);
                arrowUL55.startAnimation(animTran6End);
                arrowUR55.setEnabled(false);
                arrowR55.setEnabled(false);
                arrowDR55.setEnabled(false);
                arrowDL55.setEnabled(false);
                arrowL55.setEnabled(false);
                arrowUL55.setEnabled(false);
            }
            if(num==56) {
                arrowDR56.startAnimation(animTran3End);
                arrowDL56.startAnimation(animTran4End);
                arrowL56.startAnimation(animTran5End);
                arrowUL56.startAnimation(animTran6End);
                arrowDR56.setEnabled(false);
                arrowDL56.setEnabled(false);
                arrowL56.setEnabled(false);
                arrowUL56.setEnabled(false);
            }
            if(num==57) {
                arrowR57.startAnimation(animTran2End);
                arrowDR57.startAnimation(animTran3End);
                arrowDL57.startAnimation(animTran4End);
                arrowR57.setEnabled(false);
                arrowDR57.setEnabled(false);
                arrowDL57.setEnabled(false);
            }
            if(num==58) {
                arrowR58.startAnimation(animTran2End);
                arrowDR58.startAnimation(animTran3End);
                arrowDL58.startAnimation(animTran4End);
                arrowL58.startAnimation(animTran5End);
                arrowR58.setEnabled(false);
                arrowDR58.setEnabled(false);
                arrowDL58.setEnabled(false);
                arrowL58.setEnabled(false);
            }
            if(num==59) {
                arrowR59.startAnimation(animTran2End);
                arrowDR59.startAnimation(animTran3End);
                arrowDL59.startAnimation(animTran4End);
                arrowL59.startAnimation(animTran5End);
                arrowR59.setEnabled(false);
                arrowDR59.setEnabled(false);
                arrowDL59.setEnabled(false);
                arrowL59.setEnabled(false);
            }
            if(num==60) {
                arrowR60.startAnimation(animTran2End);
                arrowDR60.startAnimation(animTran3End);
                arrowDL60.startAnimation(animTran4End);
                arrowL60.startAnimation(animTran5End);
                arrowR60.setEnabled(false);
                arrowDR60.setEnabled(false);
                arrowDL60.setEnabled(false);
                arrowL60.setEnabled(false);
            }
            if(num==61) {
                arrowDR61.startAnimation(animTran3End);
                arrowDL61.startAnimation(animTran4End);
                arrowL61.startAnimation(animTran5End);
                arrowDR61.setEnabled(false);
                arrowDL61.setEnabled(false);
                arrowL61.setEnabled(false);
            }

        }
    }

    private void setVisibility(int clicked, View v, int num) {
        if(!opened){
            if(num==1){
                arrowUL1.setVisibility(v.VISIBLE);
                arrowUR1.setVisibility(v.VISIBLE);
                arrowR1.setVisibility(v.VISIBLE);
            }
            if(num==2) {
                arrowL2.setVisibility(v.VISIBLE);
                arrowUL2.setVisibility(v.VISIBLE);
                arrowUR2.setVisibility(v.VISIBLE);
                arrowR2.setVisibility(v.VISIBLE);
            }
            if(num==3){
                arrowL3.setVisibility(v.VISIBLE);
                arrowUL3.setVisibility(v.VISIBLE);
                arrowUR3.setVisibility(v.VISIBLE);
                arrowR3.setVisibility(v.VISIBLE);
            }
            if(num==4){
                arrowL4.setVisibility(v.VISIBLE);
                arrowUL4.setVisibility(v.VISIBLE);
                arrowUR4.setVisibility(v.VISIBLE);
                arrowR4.setVisibility(v.VISIBLE);
            }
            if(num==5){
                arrowL5.setVisibility(v.VISIBLE);
                arrowUL5.setVisibility(v.VISIBLE);
                arrowUR5.setVisibility(v.VISIBLE);
            }
            if(num==6){
                arrowUL6.setVisibility(v.VISIBLE);
                arrowDR6.setVisibility(v.VISIBLE);
                arrowUR6.setVisibility(v.VISIBLE);
                arrowR6.setVisibility(v.VISIBLE);
            }
            if(num==7){
                arrowL7.setVisibility(v.VISIBLE);
                arrowUL7.setVisibility(v.VISIBLE);
                arrowDL7.setVisibility(v.VISIBLE);
                arrowDR7.setVisibility(v.VISIBLE);
                arrowUR7.setVisibility(v.VISIBLE);
                arrowR7.setVisibility(v.VISIBLE);
            }
            if(num==8){
                arrowL8.setVisibility(v.VISIBLE);
                arrowUL8.setVisibility(v.VISIBLE);
                arrowDL8.setVisibility(v.VISIBLE);
                arrowDR8.setVisibility(v.VISIBLE);
                arrowUR8.setVisibility(v.VISIBLE);
                arrowR8.setVisibility(v.VISIBLE);
            }
            if(num==9){
                arrowL9.setVisibility(v.VISIBLE);
                arrowUL9.setVisibility(v.VISIBLE);
                arrowDL9.setVisibility(v.VISIBLE);
                arrowDR9.setVisibility(v.VISIBLE);
                arrowUR9.setVisibility(v.VISIBLE);
                arrowR9.setVisibility(v.VISIBLE);
            }
            if(num==10){
                arrowL10.setVisibility(v.VISIBLE);
                arrowUL10.setVisibility(v.VISIBLE);
                arrowDL10.setVisibility(v.VISIBLE);
                arrowDR10.setVisibility(v.VISIBLE);
                arrowUR10.setVisibility(v.VISIBLE);
                arrowR10.setVisibility(v.VISIBLE);
            }
            if(num==11){
                arrowL11.setVisibility(v.VISIBLE);
                arrowUL11.setVisibility(v.VISIBLE);
                arrowDL11.setVisibility(v.VISIBLE);
                arrowUR11.setVisibility(v.VISIBLE);
            }
            if(num==12){
                arrowUL12.setVisibility(v.VISIBLE);
                arrowDR12.setVisibility(v.VISIBLE);
                arrowUR12.setVisibility(v.VISIBLE);
                arrowR12.setVisibility(v.VISIBLE);
            }
            if(num==13){
                arrowL13.setVisibility(v.VISIBLE);
                arrowUL13.setVisibility(v.VISIBLE);
                arrowDL13.setVisibility(v.VISIBLE);
                arrowDR13.setVisibility(v.VISIBLE);
                arrowUR13.setVisibility(v.VISIBLE);
                arrowR13.setVisibility(v.VISIBLE);
            }
            if(num==14){
                arrowL14.setVisibility(v.VISIBLE);
                arrowUL14.setVisibility(v.VISIBLE);
                arrowDL14.setVisibility(v.VISIBLE);
                arrowDR14.setVisibility(v.VISIBLE);
                arrowUR14.setVisibility(v.VISIBLE);
                arrowR14.setVisibility(v.VISIBLE);
            }
            if(num==15){
                arrowL15.setVisibility(v.VISIBLE);
                arrowUL15.setVisibility(v.VISIBLE);
                arrowDL15.setVisibility(v.VISIBLE);
                arrowDR15.setVisibility(v.VISIBLE);
                arrowUR15.setVisibility(v.VISIBLE);
                arrowR15.setVisibility(v.VISIBLE);
            }
            if(num==16){
                arrowL16.setVisibility(v.VISIBLE);
                arrowUL16.setVisibility(v.VISIBLE);
                arrowDL16.setVisibility(v.VISIBLE);
                arrowDR16.setVisibility(v.VISIBLE);
                arrowUR16.setVisibility(v.VISIBLE);
                arrowR16.setVisibility(v.VISIBLE);
            }
            if(num==17){
                arrowL17.setVisibility(v.VISIBLE);
                arrowUL17.setVisibility(v.VISIBLE);
                arrowDL17.setVisibility(v.VISIBLE);
                arrowDR17.setVisibility(v.VISIBLE);
                arrowUR17.setVisibility(v.VISIBLE);
                arrowR17.setVisibility(v.VISIBLE);
            }
            if(num==18){
                arrowL18.setVisibility(v.VISIBLE);
                arrowUL18.setVisibility(v.VISIBLE);
                arrowDL18.setVisibility(v.VISIBLE);
                arrowUR18.setVisibility(v.VISIBLE);
            }
            if(num==19){
                arrowUL19.setVisibility(v.VISIBLE);
                arrowDR19.setVisibility(v.VISIBLE);
                arrowUR19.setVisibility(v.VISIBLE);
                arrowR19.setVisibility(v.VISIBLE);
            }
            if(num==20){
                arrowL20.setVisibility(v.VISIBLE);
                arrowUL20.setVisibility(v.VISIBLE);
                arrowDL20.setVisibility(v.VISIBLE);
                arrowDR20.setVisibility(v.VISIBLE);
                arrowUR20.setVisibility(v.VISIBLE);
                arrowR20.setVisibility(v.VISIBLE);
            }
            if(num==21){
                arrowL21.setVisibility(v.VISIBLE);
                arrowUL21.setVisibility(v.VISIBLE);
                arrowDL21.setVisibility(v.VISIBLE);
                arrowDR21.setVisibility(v.VISIBLE);
                arrowUR21.setVisibility(v.VISIBLE);
                arrowR21.setVisibility(v.VISIBLE);
            }
            if(num==22){
                arrowL22.setVisibility(v.VISIBLE);
                arrowUL22.setVisibility(v.VISIBLE);
                arrowDL22.setVisibility(v.VISIBLE);
                arrowDR22.setVisibility(v.VISIBLE);
                arrowUR22.setVisibility(v.VISIBLE);
                arrowR22.setVisibility(v.VISIBLE);
            }
            if(num==23){
                arrowL23.setVisibility(v.VISIBLE);
                arrowUL23.setVisibility(v.VISIBLE);
                arrowDL23.setVisibility(v.VISIBLE);
                arrowDR23.setVisibility(v.VISIBLE);
                arrowUR23.setVisibility(v.VISIBLE);
                arrowR23.setVisibility(v.VISIBLE);
            }
            if(num==24){
                arrowL24.setVisibility(v.VISIBLE);
                arrowUL24.setVisibility(v.VISIBLE);
                arrowDL24.setVisibility(v.VISIBLE);
                arrowDR24.setVisibility(v.VISIBLE);
                arrowUR24.setVisibility(v.VISIBLE);
                arrowR24.setVisibility(v.VISIBLE);
            }
            if(num==25){
                arrowL25.setVisibility(v.VISIBLE);
                arrowUL25.setVisibility(v.VISIBLE);
                arrowDL25.setVisibility(v.VISIBLE);
                arrowDR25.setVisibility(v.VISIBLE);
                arrowUR25.setVisibility(v.VISIBLE);
                arrowR25.setVisibility(v.VISIBLE);
            }
            if(num==26){
                arrowL26.setVisibility(v.VISIBLE);
                arrowUL26.setVisibility(v.VISIBLE);
                arrowDL26.setVisibility(v.VISIBLE);
                arrowUR26.setVisibility(v.VISIBLE);
            }
            if(num==27){
                arrowDR27.setVisibility(v.VISIBLE);
                arrowUR27.setVisibility(v.VISIBLE);
                arrowR27.setVisibility(v.VISIBLE);
            }
            if(num==28){
                arrowL28.setVisibility(v.VISIBLE);
                arrowUL28.setVisibility(v.VISIBLE);
                arrowDL28.setVisibility(v.VISIBLE);
                arrowDR28.setVisibility(v.VISIBLE);
                arrowUR28.setVisibility(v.VISIBLE);
                arrowR28.setVisibility(v.VISIBLE);
            }
            if(num==29){
                arrowL29.setVisibility(v.VISIBLE);
                arrowUL29.setVisibility(v.VISIBLE);
                arrowDL29.setVisibility(v.VISIBLE);
                arrowDR29.setVisibility(v.VISIBLE);
                arrowUR29.setVisibility(v.VISIBLE);
                arrowR29.setVisibility(v.VISIBLE);
            }
            if(num==30){
                arrowL30.setVisibility(v.VISIBLE);
                arrowUL30.setVisibility(v.VISIBLE);
                arrowDL30.setVisibility(v.VISIBLE);
                arrowDR30.setVisibility(v.VISIBLE);
                arrowUR30.setVisibility(v.VISIBLE);
                arrowR30.setVisibility(v.VISIBLE);
            }
            if(num==31){
                arrowL31.setVisibility(v.VISIBLE);
                arrowUL31.setVisibility(v.VISIBLE);
                arrowDL31.setVisibility(v.VISIBLE);
                arrowDR31.setVisibility(v.VISIBLE);
                arrowUR31.setVisibility(v.VISIBLE);
                arrowR31.setVisibility(v.VISIBLE);
            }
            if(num==32){
                arrowL32.setVisibility(v.VISIBLE);
                arrowUL32.setVisibility(v.VISIBLE);
                arrowDL32.setVisibility(v.VISIBLE);
                arrowDR32.setVisibility(v.VISIBLE);
                arrowUR32.setVisibility(v.VISIBLE);
                arrowR32.setVisibility(v.VISIBLE);
            }
            if(num==33){
                arrowL33.setVisibility(v.VISIBLE);
                arrowUL33.setVisibility(v.VISIBLE);
                arrowDL33.setVisibility(v.VISIBLE);
                arrowDR33.setVisibility(v.VISIBLE);
                arrowUR33.setVisibility(v.VISIBLE);
                arrowR33.setVisibility(v.VISIBLE);
            }
            if(num==34){
                arrowL34.setVisibility(v.VISIBLE);
                arrowUL34.setVisibility(v.VISIBLE);
                arrowDL34.setVisibility(v.VISIBLE);
                arrowDR34.setVisibility(v.VISIBLE);
                arrowUR34.setVisibility(v.VISIBLE);
                arrowR34.setVisibility(v.VISIBLE);
            }
            if(num==35){
                arrowL35.setVisibility(v.VISIBLE);
                arrowUL35.setVisibility(v.VISIBLE);
                arrowDL35.setVisibility(v.VISIBLE);
            }
            if(num==36){
                arrowDL36.setVisibility(v.VISIBLE);
                arrowDR36.setVisibility(v.VISIBLE);
                arrowUR36.setVisibility(v.VISIBLE);
                arrowR36.setVisibility(v.VISIBLE);
            }
            if(num==37){
                arrowL37.setVisibility(v.VISIBLE);
                arrowUL37.setVisibility(v.VISIBLE);
                arrowDL37.setVisibility(v.VISIBLE);
                arrowDR37.setVisibility(v.VISIBLE);
                arrowUR37.setVisibility(v.VISIBLE);
                arrowR37.setVisibility(v.VISIBLE);
            }
            if(num==38){
                arrowL38.setVisibility(v.VISIBLE);
                arrowUL38.setVisibility(v.VISIBLE);
                arrowDL38.setVisibility(v.VISIBLE);
                arrowDR38.setVisibility(v.VISIBLE);
                arrowUR38.setVisibility(v.VISIBLE);
                arrowR38.setVisibility(v.VISIBLE);
            }
            if(num==39){
                arrowL39.setVisibility(v.VISIBLE);
                arrowUL39.setVisibility(v.VISIBLE);
                arrowDL39.setVisibility(v.VISIBLE);
                arrowDR39.setVisibility(v.VISIBLE);
                arrowUR39.setVisibility(v.VISIBLE);
                arrowR39.setVisibility(v.VISIBLE);
            }
            if(num==40){
                arrowL40.setVisibility(v.VISIBLE);
                arrowUL40.setVisibility(v.VISIBLE);
                arrowDL40.setVisibility(v.VISIBLE);
                arrowDR40.setVisibility(v.VISIBLE);
                arrowUR40.setVisibility(v.VISIBLE);
                arrowR40.setVisibility(v.VISIBLE);
            }
            if(num==41){
                arrowL41.setVisibility(v.VISIBLE);
                arrowUL41.setVisibility(v.VISIBLE);
                arrowDL41.setVisibility(v.VISIBLE);
                arrowDR41.setVisibility(v.VISIBLE);
                arrowUR41.setVisibility(v.VISIBLE);
                arrowR41.setVisibility(v.VISIBLE);
            }
            if(num==42){
                arrowL42.setVisibility(v.VISIBLE);
                arrowUL42.setVisibility(v.VISIBLE);
                arrowDL42.setVisibility(v.VISIBLE);
                arrowDR42.setVisibility(v.VISIBLE);
                arrowUR42.setVisibility(v.VISIBLE);
                arrowR42.setVisibility(v.VISIBLE);
            }
            if(num==43){
                arrowL43.setVisibility(v.VISIBLE);
                arrowUL43.setVisibility(v.VISIBLE);
                arrowDL43.setVisibility(v.VISIBLE);
                arrowDR43.setVisibility(v.VISIBLE);
            }
            if(num==44){
                arrowDL44.setVisibility(v.VISIBLE);
                arrowDR44.setVisibility(v.VISIBLE);
                arrowUR44.setVisibility(v.VISIBLE);
                arrowR44.setVisibility(v.VISIBLE);
            }
            if(num==45){
                arrowL45.setVisibility(v.VISIBLE);
                arrowUL45.setVisibility(v.VISIBLE);
                arrowDL45.setVisibility(v.VISIBLE);
                arrowDR45.setVisibility(v.VISIBLE);
                arrowUR45.setVisibility(v.VISIBLE);
                arrowR45.setVisibility(v.VISIBLE);
            }
            if(num==46){
                arrowL46.setVisibility(v.VISIBLE);
                arrowUL46.setVisibility(v.VISIBLE);
                arrowDL46.setVisibility(v.VISIBLE);
                arrowDR46.setVisibility(v.VISIBLE);
                arrowUR46.setVisibility(v.VISIBLE);
                arrowR46.setVisibility(v.VISIBLE);
            }
            if(num==47){
                arrowL47.setVisibility(v.VISIBLE);
                arrowUL47.setVisibility(v.VISIBLE);
                arrowDL47.setVisibility(v.VISIBLE);
                arrowDR47.setVisibility(v.VISIBLE);
                arrowUR47.setVisibility(v.VISIBLE);
                arrowR47.setVisibility(v.VISIBLE);
            }
            if(num==48){
                arrowL48.setVisibility(v.VISIBLE);
                arrowUL48.setVisibility(v.VISIBLE);
                arrowDL48.setVisibility(v.VISIBLE);
                arrowDR48.setVisibility(v.VISIBLE);
                arrowUR48.setVisibility(v.VISIBLE);
                arrowR48.setVisibility(v.VISIBLE);
            }
            if(num==49){
                arrowL49.setVisibility(v.VISIBLE);
                arrowUL49.setVisibility(v.VISIBLE);
                arrowDL49.setVisibility(v.VISIBLE);
                arrowDR49.setVisibility(v.VISIBLE);
                arrowUR49.setVisibility(v.VISIBLE);
                arrowR49.setVisibility(v.VISIBLE);
            }
            if(num==50){
                arrowL50.setVisibility(v.VISIBLE);
                arrowUL50.setVisibility(v.VISIBLE);
                arrowDL50.setVisibility(v.VISIBLE);
                arrowDR50.setVisibility(v.VISIBLE);
            }
            if(num==51){
                arrowDL51.setVisibility(v.VISIBLE);
                arrowDR51.setVisibility(v.VISIBLE);
                arrowUR51.setVisibility(v.VISIBLE);
                arrowR51.setVisibility(v.VISIBLE);
            }
            if(num==52){
                arrowL52.setVisibility(v.VISIBLE);
                arrowUL52.setVisibility(v.VISIBLE);
                arrowDL52.setVisibility(v.VISIBLE);
                arrowDR52.setVisibility(v.VISIBLE);
                arrowUR52.setVisibility(v.VISIBLE);
                arrowR52.setVisibility(v.VISIBLE);
            }
            if(num==53){
                arrowL53.setVisibility(v.VISIBLE);
                arrowUL53.setVisibility(v.VISIBLE);
                arrowDL53.setVisibility(v.VISIBLE);
                arrowDR53.setVisibility(v.VISIBLE);
                arrowUR53.setVisibility(v.VISIBLE);
                arrowR53.setVisibility(v.VISIBLE);
            }
            if(num==54){
                arrowL54.setVisibility(v.VISIBLE);
                arrowUL54.setVisibility(v.VISIBLE);
                arrowDL54.setVisibility(v.VISIBLE);
                arrowDR54.setVisibility(v.VISIBLE);
                arrowUR54.setVisibility(v.VISIBLE);
                arrowR54.setVisibility(v.VISIBLE);
            }
            if(num==55){
                arrowL55.setVisibility(v.VISIBLE);
                arrowUL55.setVisibility(v.VISIBLE);
                arrowDL55.setVisibility(v.VISIBLE);
                arrowDR55.setVisibility(v.VISIBLE);
                arrowUR55.setVisibility(v.VISIBLE);
                arrowR55.setVisibility(v.VISIBLE);
            }
            if(num==56){
                arrowL56.setVisibility(v.VISIBLE);
                arrowUL56.setVisibility(v.VISIBLE);
                arrowDL56.setVisibility(v.VISIBLE);
                arrowDR56.setVisibility(v.VISIBLE);
            }
            if(num==57){
                arrowDL57.setVisibility(v.VISIBLE);
                arrowDR57.setVisibility(v.VISIBLE);
                arrowR57.setVisibility(v.VISIBLE);
            }
            if(num==58){
                arrowL58.setVisibility(v.VISIBLE);
                arrowDL58.setVisibility(v.VISIBLE);
                arrowDR58.setVisibility(v.VISIBLE);
                arrowR58.setVisibility(v.VISIBLE);
            }
            if(num==59){
                arrowL59.setVisibility(v.VISIBLE);
                arrowDL59.setVisibility(v.VISIBLE);
                arrowDR59.setVisibility(v.VISIBLE);
                arrowR59.setVisibility(v.VISIBLE);
            }
            if(num==60){
                arrowL60.setVisibility(v.VISIBLE);
                arrowDL60.setVisibility(v.VISIBLE);
                arrowDR60.setVisibility(v.VISIBLE);
                arrowR60.setVisibility(v.VISIBLE);
            }
            if(num==61){
                arrowL61.setVisibility(v.VISIBLE);
                arrowDL61.setVisibility(v.VISIBLE);
                arrowDR61.setVisibility(v.VISIBLE);
            }
        }
        else{
            if(num==1){
                arrowUL1.setVisibility(v.INVISIBLE);
                arrowUR1.setVisibility(v.INVISIBLE);
                arrowR1.setVisibility(v.INVISIBLE);
            }
            if(num==2) {
                arrowL2.setVisibility(v.INVISIBLE);
                arrowUL2.setVisibility(v.INVISIBLE);
                arrowUR2.setVisibility(v.INVISIBLE);
                arrowR2.setVisibility(v.INVISIBLE);
            }
            if(num==3){
                arrowL3.setVisibility(v.INVISIBLE);
                arrowUL3.setVisibility(v.INVISIBLE);
                arrowUR3.setVisibility(v.INVISIBLE);
                arrowR3.setVisibility(v.INVISIBLE);
            }
            if(num==4){
                arrowL4.setVisibility(v.INVISIBLE);
                arrowUL4.setVisibility(v.INVISIBLE);
                arrowUR4.setVisibility(v.INVISIBLE);
                arrowR4.setVisibility(v.INVISIBLE);
            }
            if(num==5){
                arrowL5.setVisibility(v.INVISIBLE);
                arrowUL5.setVisibility(v.INVISIBLE);
                arrowUR5.setVisibility(v.INVISIBLE);
            }
            if(num==6){
                arrowUL6.setVisibility(v.INVISIBLE);
                arrowDR6.setVisibility(v.INVISIBLE);
                arrowUR6.setVisibility(v.INVISIBLE);
                arrowR6.setVisibility(v.INVISIBLE);
            }
            if(num==7){
                arrowL7.setVisibility(v.INVISIBLE);
                arrowUL7.setVisibility(v.INVISIBLE);
                arrowDL7.setVisibility(v.INVISIBLE);
                arrowDR7.setVisibility(v.INVISIBLE);
                arrowUR7.setVisibility(v.INVISIBLE);
                arrowR7.setVisibility(v.INVISIBLE);
            }
            if(num==8){
                arrowL8.setVisibility(v.INVISIBLE);
                arrowUL8.setVisibility(v.INVISIBLE);
                arrowDL8.setVisibility(v.INVISIBLE);
                arrowDR8.setVisibility(v.INVISIBLE);
                arrowUR8.setVisibility(v.INVISIBLE);
                arrowR8.setVisibility(v.INVISIBLE);
            }
            if(num==9){
                arrowL9.setVisibility(v.INVISIBLE);
                arrowUL9.setVisibility(v.INVISIBLE);
                arrowDL9.setVisibility(v.INVISIBLE);
                arrowDR9.setVisibility(v.INVISIBLE);
                arrowUR9.setVisibility(v.INVISIBLE);
                arrowR9.setVisibility(v.INVISIBLE);
            }
            if(num==10){
                arrowL10.setVisibility(v.INVISIBLE);
                arrowUL10.setVisibility(v.INVISIBLE);
                arrowDL10.setVisibility(v.INVISIBLE);
                arrowDR10.setVisibility(v.INVISIBLE);
                arrowUR10.setVisibility(v.INVISIBLE);
                arrowR10.setVisibility(v.INVISIBLE);
            }
            if(num==11){
                arrowL11.setVisibility(v.INVISIBLE);
                arrowUL11.setVisibility(v.INVISIBLE);
                arrowDL11.setVisibility(v.INVISIBLE);
                arrowUR11.setVisibility(v.INVISIBLE);
            }
            if(num==12){
                arrowUL12.setVisibility(v.INVISIBLE);
                arrowDR12.setVisibility(v.INVISIBLE);
                arrowUR12.setVisibility(v.INVISIBLE);
                arrowR12.setVisibility(v.INVISIBLE);
            }
            if(num==13){
                arrowL13.setVisibility(v.INVISIBLE);
                arrowUL13.setVisibility(v.INVISIBLE);
                arrowDL13.setVisibility(v.INVISIBLE);
                arrowDR13.setVisibility(v.INVISIBLE);
                arrowUR13.setVisibility(v.INVISIBLE);
                arrowR13.setVisibility(v.INVISIBLE);
            }
            if(num==14){
                arrowL14.setVisibility(v.INVISIBLE);
                arrowUL14.setVisibility(v.INVISIBLE);
                arrowDL14.setVisibility(v.INVISIBLE);
                arrowDR14.setVisibility(v.INVISIBLE);
                arrowUR14.setVisibility(v.INVISIBLE);
                arrowR14.setVisibility(v.INVISIBLE);
            }
            if(num==15){
                arrowL15.setVisibility(v.INVISIBLE);
                arrowUL15.setVisibility(v.INVISIBLE);
                arrowDL15.setVisibility(v.INVISIBLE);
                arrowDR15.setVisibility(v.INVISIBLE);
                arrowUR15.setVisibility(v.INVISIBLE);
                arrowR15.setVisibility(v.INVISIBLE);
            }
            if(num==16){
                arrowL16.setVisibility(v.INVISIBLE);
                arrowUL16.setVisibility(v.INVISIBLE);
                arrowDL16.setVisibility(v.INVISIBLE);
                arrowDR16.setVisibility(v.INVISIBLE);
                arrowUR16.setVisibility(v.INVISIBLE);
                arrowR16.setVisibility(v.INVISIBLE);
            }
            if(num==17){
                arrowL17.setVisibility(v.INVISIBLE);
                arrowUL17.setVisibility(v.INVISIBLE);
                arrowDL17.setVisibility(v.INVISIBLE);
                arrowDR17.setVisibility(v.INVISIBLE);
                arrowUR17.setVisibility(v.INVISIBLE);
                arrowR17.setVisibility(v.INVISIBLE);
            }
            if(num==18){
                arrowL18.setVisibility(v.INVISIBLE);
                arrowUL18.setVisibility(v.INVISIBLE);
                arrowDL18.setVisibility(v.INVISIBLE);
                arrowUR18.setVisibility(v.INVISIBLE);
            }
            if(num==19){
                arrowUL19.setVisibility(v.INVISIBLE);
                arrowDR19.setVisibility(v.INVISIBLE);
                arrowUR19.setVisibility(v.INVISIBLE);
                arrowR19.setVisibility(v.INVISIBLE);
            }
            if(num==20){
                arrowL20.setVisibility(v.INVISIBLE);
                arrowUL20.setVisibility(v.INVISIBLE);
                arrowDL20.setVisibility(v.INVISIBLE);
                arrowDR20.setVisibility(v.INVISIBLE);
                arrowUR20.setVisibility(v.INVISIBLE);
                arrowR20.setVisibility(v.INVISIBLE);
            }
            if(num==21){
                arrowL21.setVisibility(v.INVISIBLE);
                arrowUL21.setVisibility(v.INVISIBLE);
                arrowDL21.setVisibility(v.INVISIBLE);
                arrowDR21.setVisibility(v.INVISIBLE);
                arrowUR21.setVisibility(v.INVISIBLE);
                arrowR21.setVisibility(v.INVISIBLE);
            }
            if(num==22){
                arrowL22.setVisibility(v.INVISIBLE);
                arrowUL22.setVisibility(v.INVISIBLE);
                arrowDL22.setVisibility(v.INVISIBLE);
                arrowDR22.setVisibility(v.INVISIBLE);
                arrowUR22.setVisibility(v.INVISIBLE);
                arrowR22.setVisibility(v.INVISIBLE);
            }
            if(num==23){
                arrowL23.setVisibility(v.INVISIBLE);
                arrowUL23.setVisibility(v.INVISIBLE);
                arrowDL23.setVisibility(v.INVISIBLE);
                arrowDR23.setVisibility(v.INVISIBLE);
                arrowUR23.setVisibility(v.INVISIBLE);
                arrowR23.setVisibility(v.INVISIBLE);
            }
            if(num==24){
                arrowL24.setVisibility(v.INVISIBLE);
                arrowUL24.setVisibility(v.INVISIBLE);
                arrowDL24.setVisibility(v.INVISIBLE);
                arrowDR24.setVisibility(v.INVISIBLE);
                arrowUR24.setVisibility(v.INVISIBLE);
                arrowR24.setVisibility(v.INVISIBLE);
            }
            if(num==25){
                arrowL25.setVisibility(v.INVISIBLE);
                arrowUL25.setVisibility(v.INVISIBLE);
                arrowDL25.setVisibility(v.INVISIBLE);
                arrowDR25.setVisibility(v.INVISIBLE);
                arrowUR25.setVisibility(v.INVISIBLE);
                arrowR25.setVisibility(v.INVISIBLE);
            }
            if(num==26){
                arrowL26.setVisibility(v.INVISIBLE);
                arrowUL26.setVisibility(v.INVISIBLE);
                arrowDL26.setVisibility(v.INVISIBLE);
                arrowUR26.setVisibility(v.INVISIBLE);
            }
            if(num==27){
                arrowDR27.setVisibility(v.INVISIBLE);
                arrowUR27.setVisibility(v.INVISIBLE);
                arrowR27.setVisibility(v.INVISIBLE);
            }
            if(num==28){
                arrowL28.setVisibility(v.INVISIBLE);
                arrowUL28.setVisibility(v.INVISIBLE);
                arrowDL28.setVisibility(v.INVISIBLE);
                arrowDR28.setVisibility(v.INVISIBLE);
                arrowUR28.setVisibility(v.INVISIBLE);
                arrowR28.setVisibility(v.INVISIBLE);
            }
            if(num==29){
                arrowL29.setVisibility(v.INVISIBLE);
                arrowUL29.setVisibility(v.INVISIBLE);
                arrowDL29.setVisibility(v.INVISIBLE);
                arrowDR29.setVisibility(v.INVISIBLE);
                arrowUR29.setVisibility(v.INVISIBLE);
                arrowR29.setVisibility(v.INVISIBLE);
            }
            if(num==30){
                arrowL30.setVisibility(v.INVISIBLE);
                arrowUL30.setVisibility(v.INVISIBLE);
                arrowDL30.setVisibility(v.INVISIBLE);
                arrowDR30.setVisibility(v.INVISIBLE);
                arrowUR30.setVisibility(v.INVISIBLE);
                arrowR30.setVisibility(v.INVISIBLE);
            }
            if(num==31){
                arrowL31.setVisibility(v.INVISIBLE);
                arrowUL31.setVisibility(v.INVISIBLE);
                arrowDL31.setVisibility(v.INVISIBLE);
                arrowDR31.setVisibility(v.INVISIBLE);
                arrowUR31.setVisibility(v.INVISIBLE);
                arrowR31.setVisibility(v.INVISIBLE);
            }
            if(num==32){
                arrowL32.setVisibility(v.INVISIBLE);
                arrowUL32.setVisibility(v.INVISIBLE);
                arrowDL32.setVisibility(v.INVISIBLE);
                arrowDR32.setVisibility(v.INVISIBLE);
                arrowUR32.setVisibility(v.INVISIBLE);
                arrowR32.setVisibility(v.INVISIBLE);
            }
            if(num==33){
                arrowL33.setVisibility(v.INVISIBLE);
                arrowUL33.setVisibility(v.INVISIBLE);
                arrowDL33.setVisibility(v.INVISIBLE);
                arrowDR33.setVisibility(v.INVISIBLE);
                arrowUR33.setVisibility(v.INVISIBLE);
                arrowR33.setVisibility(v.INVISIBLE);
            }
            if(num==34){
                arrowL34.setVisibility(v.INVISIBLE);
                arrowUL34.setVisibility(v.INVISIBLE);
                arrowDL34.setVisibility(v.INVISIBLE);
                arrowDR34.setVisibility(v.INVISIBLE);
                arrowUR34.setVisibility(v.INVISIBLE);
                arrowR34.setVisibility(v.INVISIBLE);
            }
            if(num==35){
                arrowL35.setVisibility(v.INVISIBLE);
                arrowUL35.setVisibility(v.INVISIBLE);
                arrowDL35.setVisibility(v.INVISIBLE);
            }
            if(num==36){
                arrowDL36.setVisibility(v.INVISIBLE);
                arrowDR36.setVisibility(v.INVISIBLE);
                arrowUR36.setVisibility(v.INVISIBLE);
                arrowR36.setVisibility(v.INVISIBLE);
            }
            if(num==37){
                arrowL37.setVisibility(v.INVISIBLE);
                arrowUL37.setVisibility(v.INVISIBLE);
                arrowDL37.setVisibility(v.INVISIBLE);
                arrowDR37.setVisibility(v.INVISIBLE);
                arrowUR37.setVisibility(v.INVISIBLE);
                arrowR37.setVisibility(v.INVISIBLE);
            }
            if(num==38){
                arrowL38.setVisibility(v.INVISIBLE);
                arrowUL38.setVisibility(v.INVISIBLE);
                arrowDL38.setVisibility(v.INVISIBLE);
                arrowDR38.setVisibility(v.INVISIBLE);
                arrowUR38.setVisibility(v.INVISIBLE);
                arrowR38.setVisibility(v.INVISIBLE);
            }
            if(num==39){
                arrowL39.setVisibility(v.INVISIBLE);
                arrowUL39.setVisibility(v.INVISIBLE);
                arrowDL39.setVisibility(v.INVISIBLE);
                arrowDR39.setVisibility(v.INVISIBLE);
                arrowUR39.setVisibility(v.INVISIBLE);
                arrowR39.setVisibility(v.INVISIBLE);
            }
            if(num==40){
                arrowL40.setVisibility(v.INVISIBLE);
                arrowUL40.setVisibility(v.INVISIBLE);
                arrowDL40.setVisibility(v.INVISIBLE);
                arrowDR40.setVisibility(v.INVISIBLE);
                arrowUR40.setVisibility(v.INVISIBLE);
                arrowR40.setVisibility(v.INVISIBLE);
            }
            if(num==41){
                arrowL41.setVisibility(v.INVISIBLE);
                arrowUL41.setVisibility(v.INVISIBLE);
                arrowDL41.setVisibility(v.INVISIBLE);
                arrowDR41.setVisibility(v.INVISIBLE);
                arrowUR41.setVisibility(v.INVISIBLE);
                arrowR41.setVisibility(v.INVISIBLE);
            }
            if(num==42){
                arrowL42.setVisibility(v.INVISIBLE);
                arrowUL42.setVisibility(v.INVISIBLE);
                arrowDL42.setVisibility(v.INVISIBLE);
                arrowDR42.setVisibility(v.INVISIBLE);
                arrowUR42.setVisibility(v.INVISIBLE);
                arrowR42.setVisibility(v.INVISIBLE);
            }
            if(num==43){
                arrowL43.setVisibility(v.INVISIBLE);
                arrowUL43.setVisibility(v.INVISIBLE);
                arrowDL43.setVisibility(v.INVISIBLE);
                arrowDR43.setVisibility(v.INVISIBLE);
            }
            if(num==44){
                arrowDL44.setVisibility(v.INVISIBLE);
                arrowDR44.setVisibility(v.INVISIBLE);
                arrowUR44.setVisibility(v.INVISIBLE);
                arrowR44.setVisibility(v.INVISIBLE);
            }
            if(num==45){
                arrowL45.setVisibility(v.INVISIBLE);
                arrowUL45.setVisibility(v.INVISIBLE);
                arrowDL45.setVisibility(v.INVISIBLE);
                arrowDR45.setVisibility(v.INVISIBLE);
                arrowUR45.setVisibility(v.INVISIBLE);
                arrowR45.setVisibility(v.INVISIBLE);
            }
            if(num==46){
                arrowL46.setVisibility(v.INVISIBLE);
                arrowUL46.setVisibility(v.INVISIBLE);
                arrowDL46.setVisibility(v.INVISIBLE);
                arrowDR46.setVisibility(v.INVISIBLE);
                arrowUR46.setVisibility(v.INVISIBLE);
                arrowR46.setVisibility(v.INVISIBLE);
            }
            if(num==47){
                arrowL47.setVisibility(v.INVISIBLE);
                arrowUL47.setVisibility(v.INVISIBLE);
                arrowDL47.setVisibility(v.INVISIBLE);
                arrowDR47.setVisibility(v.INVISIBLE);
                arrowUR47.setVisibility(v.INVISIBLE);
                arrowR47.setVisibility(v.INVISIBLE);
            }
            if(num==48){
                arrowL48.setVisibility(v.INVISIBLE);
                arrowUL48.setVisibility(v.INVISIBLE);
                arrowDL48.setVisibility(v.INVISIBLE);
                arrowDR48.setVisibility(v.INVISIBLE);
                arrowUR48.setVisibility(v.INVISIBLE);
                arrowR48.setVisibility(v.INVISIBLE);
            }
            if(num==49){
                arrowL49.setVisibility(v.INVISIBLE);
                arrowUL49.setVisibility(v.INVISIBLE);
                arrowDL49.setVisibility(v.INVISIBLE);
                arrowDR49.setVisibility(v.INVISIBLE);
                arrowUR49.setVisibility(v.INVISIBLE);
                arrowR49.setVisibility(v.INVISIBLE);
            }
            if(num==50){
                arrowL50.setVisibility(v.INVISIBLE);
                arrowUL50.setVisibility(v.INVISIBLE);
                arrowDL50.setVisibility(v.INVISIBLE);
                arrowDR50.setVisibility(v.INVISIBLE);
            }
            if(num==51){
                arrowDL51.setVisibility(v.INVISIBLE);
                arrowDR51.setVisibility(v.INVISIBLE);
                arrowUR51.setVisibility(v.INVISIBLE);
                arrowR51.setVisibility(v.INVISIBLE);
            }
            if(num==52){
                arrowL52.setVisibility(v.INVISIBLE);
                arrowUL52.setVisibility(v.INVISIBLE);
                arrowDL52.setVisibility(v.INVISIBLE);
                arrowDR52.setVisibility(v.INVISIBLE);
                arrowUR52.setVisibility(v.INVISIBLE);
                arrowR52.setVisibility(v.INVISIBLE);
            }
            if(num==53){
                arrowL53.setVisibility(v.INVISIBLE);
                arrowUL53.setVisibility(v.INVISIBLE);
                arrowDL53.setVisibility(v.INVISIBLE);
                arrowDR53.setVisibility(v.INVISIBLE);
                arrowUR53.setVisibility(v.INVISIBLE);
                arrowR53.setVisibility(v.INVISIBLE);
            }
            if(num==54){
                arrowL54.setVisibility(v.INVISIBLE);
                arrowUL54.setVisibility(v.INVISIBLE);
                arrowDL54.setVisibility(v.INVISIBLE);
                arrowDR54.setVisibility(v.INVISIBLE);
                arrowUR54.setVisibility(v.INVISIBLE);
                arrowR54.setVisibility(v.INVISIBLE);
            }
            if(num==55){
                arrowL55.setVisibility(v.INVISIBLE);
                arrowUL55.setVisibility(v.INVISIBLE);
                arrowDL55.setVisibility(v.INVISIBLE);
                arrowDR55.setVisibility(v.INVISIBLE);
                arrowUR55.setVisibility(v.INVISIBLE);
                arrowR55.setVisibility(v.INVISIBLE);
            }
            if(num==56){
                arrowL56.setVisibility(v.INVISIBLE);
                arrowUL56.setVisibility(v.INVISIBLE);
                arrowDL56.setVisibility(v.INVISIBLE);
                arrowDR56.setVisibility(v.INVISIBLE);
            }
            if(num==57){
                arrowDL57.setVisibility(v.INVISIBLE);
                arrowDR57.setVisibility(v.INVISIBLE);
                arrowR57.setVisibility(v.INVISIBLE);
            }
            if(num==58){
                arrowL58.setVisibility(v.INVISIBLE);
                arrowDL58.setVisibility(v.INVISIBLE);
                arrowDR58.setVisibility(v.INVISIBLE);
                arrowR58.setVisibility(v.INVISIBLE);
            }
            if(num==59){
                arrowL59.setVisibility(v.INVISIBLE);
                arrowDL59.setVisibility(v.INVISIBLE);
                arrowDR59.setVisibility(v.INVISIBLE);
                arrowR59.setVisibility(v.INVISIBLE);
            }
            if(num==60){
                arrowL60.setVisibility(v.INVISIBLE);
                arrowDL60.setVisibility(v.INVISIBLE);
                arrowDR60.setVisibility(v.INVISIBLE);
                arrowR60.setVisibility(v.INVISIBLE);
            }
            if(num==61){
                arrowL61.setVisibility(v.INVISIBLE);
                arrowDL61.setVisibility(v.INVISIBLE);
                arrowDR61.setVisibility(v.INVISIBLE);
            }
        }
        turnStartInit();
    }
    private void allInVisible(){
        black_stone1.setVisibility(View.INVISIBLE);
        black_stone2.setVisibility(View.INVISIBLE);
        black_stone3.setVisibility(View.INVISIBLE);
        black_stone4.setVisibility(View.INVISIBLE);
        black_stone5.setVisibility(View.INVISIBLE);
        black_stone6.setVisibility(View.INVISIBLE);
        black_stone7.setVisibility(View.INVISIBLE);
        black_stone8.setVisibility(View.INVISIBLE);
        black_stone9.setVisibility(View.INVISIBLE);
        black_stone10.setVisibility(View.INVISIBLE);
        black_stone11.setVisibility(View.INVISIBLE);
        black_stone12.setVisibility(View.INVISIBLE);
        black_stone13.setVisibility(View.INVISIBLE);
        black_stone14.setVisibility(View.INVISIBLE);
        black_stone15.setVisibility(View.INVISIBLE);
        black_stone16.setVisibility(View.INVISIBLE);
        black_stone17.setVisibility(View.INVISIBLE);
        black_stone18.setVisibility(View.INVISIBLE);
        black_stone19.setVisibility(View.INVISIBLE);
        black_stone20.setVisibility(View.INVISIBLE);
        black_stone21.setVisibility(View.INVISIBLE);
        black_stone22.setVisibility(View.INVISIBLE);
        black_stone23.setVisibility(View.INVISIBLE);
        black_stone24.setVisibility(View.INVISIBLE);
        black_stone25.setVisibility(View.INVISIBLE);
        black_stone26.setVisibility(View.INVISIBLE);
        black_stone27.setVisibility(View.INVISIBLE);
        black_stone28.setVisibility(View.INVISIBLE);
        black_stone29.setVisibility(View.INVISIBLE);
        black_stone30.setVisibility(View.INVISIBLE);
        black_stone31.setVisibility(View.INVISIBLE);
        black_stone32.setVisibility(View.INVISIBLE);
        black_stone33.setVisibility(View.INVISIBLE);
        black_stone34.setVisibility(View.INVISIBLE);
        black_stone35.setVisibility(View.INVISIBLE);
        black_stone36.setVisibility(View.INVISIBLE);
        black_stone37.setVisibility(View.INVISIBLE);
        black_stone38.setVisibility(View.INVISIBLE);
        black_stone39.setVisibility(View.INVISIBLE);
        black_stone40.setVisibility(View.INVISIBLE);
        black_stone41.setVisibility(View.INVISIBLE);
        black_stone42.setVisibility(View.INVISIBLE);
        black_stone43.setVisibility(View.INVISIBLE);
        black_stone44.setVisibility(View.INVISIBLE);
        black_stone45.setVisibility(View.INVISIBLE);
        black_stone46.setVisibility(View.INVISIBLE);
        black_stone47.setVisibility(View.INVISIBLE);
        black_stone48.setVisibility(View.INVISIBLE);
        black_stone49.setVisibility(View.INVISIBLE);
        black_stone50.setVisibility(View.INVISIBLE);
        black_stone51.setVisibility(View.INVISIBLE);
        black_stone52.setVisibility(View.INVISIBLE);
        black_stone53.setVisibility(View.INVISIBLE);
        black_stone54.setVisibility(View.INVISIBLE);
        black_stone55.setVisibility(View.INVISIBLE);
        black_stone56.setVisibility(View.INVISIBLE);
        black_stone57.setVisibility(View.INVISIBLE);
        black_stone58.setVisibility(View.INVISIBLE);
        black_stone59.setVisibility(View.INVISIBLE);
        black_stone60.setVisibility(View.INVISIBLE);
        black_stone61.setVisibility(View.INVISIBLE);
    }
    private void allUnabled(){
        black_stone1.setEnabled(false);
        black_stone2.setEnabled(false);
        black_stone3.setEnabled(false);
        black_stone4.setEnabled(false);
        black_stone5.setEnabled(false);
        black_stone6.setEnabled(false);
        black_stone7.setEnabled(false);
        black_stone8.setEnabled(false);
        black_stone9.setEnabled(false);
        black_stone10.setEnabled(false);
        black_stone11.setEnabled(false);
        black_stone12.setEnabled(false);
        black_stone13.setEnabled(false);
        black_stone14.setEnabled(false);
        black_stone15.setEnabled(false);
        black_stone16.setEnabled(false);
        black_stone17.setEnabled(false);
        black_stone18.setEnabled(false);
        black_stone19.setEnabled(false);
        black_stone20.setEnabled(false);
        black_stone21.setEnabled(false);
        black_stone22.setEnabled(false);
        black_stone23.setEnabled(false);
        black_stone24.setEnabled(false);
        black_stone25.setEnabled(false);
        black_stone26.setEnabled(false);
        black_stone27.setEnabled(false);
        black_stone28.setEnabled(false);
        black_stone29.setEnabled(false);
        black_stone30.setEnabled(false);
        black_stone31.setEnabled(false);
        black_stone32.setEnabled(false);
        black_stone33.setEnabled(false);
        black_stone34.setEnabled(false);
        black_stone35.setEnabled(false);
        black_stone36.setEnabled(false);
        black_stone37.setEnabled(false);
        black_stone38.setEnabled(false);
        black_stone39.setEnabled(false);
        black_stone40.setEnabled(false);
        black_stone41.setEnabled(false);
        black_stone42.setEnabled(false);
        black_stone43.setEnabled(false);
        black_stone44.setEnabled(false);
        black_stone45.setEnabled(false);
        black_stone46.setEnabled(false);
        black_stone47.setEnabled(false);
        black_stone48.setEnabled(false);
        black_stone49.setEnabled(false);
        black_stone50.setEnabled(false);
        black_stone51.setEnabled(false);
        black_stone52.setEnabled(false);
        black_stone53.setEnabled(false);
        black_stone54.setEnabled(false);
        black_stone55.setEnabled(false);
        black_stone56.setEnabled(false);
        black_stone57.setEnabled(false);
        black_stone58.setEnabled(false);
        black_stone59.setEnabled(false);
        black_stone60.setEnabled(false);
        black_stone61.setEnabled(false);
    }
    private void allEnabled(){
        black_stone1.setEnabled(true);
        black_stone2.setEnabled(true);
        black_stone3.setEnabled(true);
        black_stone4.setEnabled(true);
        black_stone5.setEnabled(true);
        black_stone6.setEnabled(true);
        black_stone7.setEnabled(true);
        black_stone8.setEnabled(true);
        black_stone9.setEnabled(true);
        black_stone10.setEnabled(true);
        black_stone11.setEnabled(true);
        black_stone12.setEnabled(true);
        black_stone13.setEnabled(true);
        black_stone14.setEnabled(true);
        black_stone15.setEnabled(true);
        black_stone16.setEnabled(true);
        black_stone17.setEnabled(true);
        black_stone18.setEnabled(true);
        black_stone19.setEnabled(true);
        black_stone20.setEnabled(true);
        black_stone21.setEnabled(true);
        black_stone22.setEnabled(true);
        black_stone23.setEnabled(true);
        black_stone24.setEnabled(true);
        black_stone25.setEnabled(true);
        black_stone26.setEnabled(true);
        black_stone27.setEnabled(true);
        black_stone28.setEnabled(true);
        black_stone29.setEnabled(true);
        black_stone30.setEnabled(true);
        black_stone31.setEnabled(true);
        black_stone32.setEnabled(true);
        black_stone33.setEnabled(true);
        black_stone34.setEnabled(true);
        black_stone35.setEnabled(true);
        black_stone36.setEnabled(true);
        black_stone37.setEnabled(true);
        black_stone38.setEnabled(true);
        black_stone39.setEnabled(true);
        black_stone40.setEnabled(true);
        black_stone41.setEnabled(true);
        black_stone42.setEnabled(true);
        black_stone43.setEnabled(true);
        black_stone44.setEnabled(true);
        black_stone45.setEnabled(true);
        black_stone46.setEnabled(true);
        black_stone47.setEnabled(true);
        black_stone48.setEnabled(true);
        black_stone49.setEnabled(true);
        black_stone50.setEnabled(true);
        black_stone51.setEnabled(true);
        black_stone52.setEnabled(true);
        black_stone53.setEnabled(true);
        black_stone54.setEnabled(true);
        black_stone55.setEnabled(true);
        black_stone56.setEnabled(true);
        black_stone57.setEnabled(true);
        black_stone58.setEnabled(true);
        black_stone59.setEnabled(true);
        black_stone60.setEnabled(true);
        black_stone61.setEnabled(true);
    }

}