package com.example.sjapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.socket.client.IO;
import io.socket.client.Socket;

import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.SocketHandler;

import io.socket.emitter.Emitter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.sjapp.LoginActivity.BASE_URL;

public class MainActivity extends AppCompatActivity {

    TextView tv_id;
    ImageView iv_profile;
    Button btn_goGame,btn_animTrigger1,btn_animTrigger2;
    TextView tv_loading;

    Animation anim;
    private Retrofit retrofit;
    private retrofitInterface retrofitInterface;

    private Socket mSocket;

    boolean start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        //View view = getLayoutInflater().from(this).inflate(R.layout.activity_main,null);
        tv_id=findViewById(R.id.tv_id);//카카오 id
        iv_profile=findViewById(R.id.iv_profile);//카카오 프로필
        btn_goGame=findViewById(R.id.btn_goGame);
        tv_loading=findViewById(R.id.tv_loading);
        btn_animTrigger1=findViewById(R.id.btn_animTrigger1);
        btn_animTrigger2=findViewById(R.id.btn_animTrigger2);




        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        Intent intent=getIntent();

        String id=intent.getExtras().getString("id");
        String profileUrl = intent.getExtras().getString("profile");

        try {
            mSocket = IO.socket(BASE_URL);
            mSocket.connect();
            mSocket.emit("join",id);
            Log.d("io소캣 연결","connected");
        } catch (URISyntaxException e) {
            Log.d("io소캣 연결","failed");
        }

        mSocket.on("player join", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
            }
        });

        mSocket.on("start", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                String UserMe = (String) args[0];
                String UserYou = (String) args[1];

                Intent intent = new Intent(getApplicationContext(),GameActivity.class);
                intent.putExtra("Me",UserMe);
                intent.putExtra("You",UserYou);
                startActivity(intent);
            }
        });


        //Log.d("profileUrl",profileUrl);

        tv_id.setText(id);
        Glide.with(this).load(profileUrl).into(iv_profile);

        btn_goGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSocket.emit("ready",id);
            }
        });

        btn_animTrigger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.setText("다");
                    }
                }, 300);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append("른");
                    }
                }, 400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append("유");
                    }
                }, 500);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append("저");
                    }
                }, 600);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append("");
                    }
                }, 700);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append("대");
                    }
                }, 800);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append("기");
                    }
                }, 900);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append("중");
                    }
                }, 1000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append(".");
                    }
                }, 1100);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append(".");
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_loading.append(".");
                        btn_animTrigger2.performClick();
                    }
                }, 1300);
            }
        });

        btn_animTrigger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!start){
                    start = true;
                    tv_loading.startAnimation(anim);
                }else{
                    start = false;
                    tv_loading.clearAnimation();
                }
            }
        });
        anim = new AlphaAnimation(0.0f,1.0f);
        anim.setDuration(150);
        anim.setStartOffset(100);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);

        btn_animTrigger1.performClick();

    }
}