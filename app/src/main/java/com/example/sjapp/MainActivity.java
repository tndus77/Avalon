package com.example.sjapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
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
import java.util.logging.SocketHandler;

import io.socket.emitter.Emitter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView tv_id;
    ImageView iv_profile;
    Button btn_goGame;
    TextView textView;
    private Retrofit retrofit;
    private retrofitInterface retrofitInterface;

    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("http://192.249.18.138:443");
        } catch (URISyntaxException e) {}
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View view = getLayoutInflater().from(this).inflate(R.layout.activity_main,null);
        tv_id=findViewById(R.id.tv_id);//카카오 id
        iv_profile=findViewById(R.id.iv_profile);//카카오 프로필
        btn_goGame=findViewById(R.id.btn_goGame);
        textView=findViewById(R.id.textView);


        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.249.18.138:443")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mSocket.connect();

        mSocket.on("connection", new Emitter.Listener() {
                    @Override
                    public void call(Object... args) {
                        try {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    JSONObject data = (JSONObject) args[0];
                                    try {
                                        Toast.makeText(MainActivity.this, data.getString(mSocket.id()), Toast.LENGTH_SHORT).show();
                                        //connect
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                        } catch (Exception e) {
                            System.out.println("에러");
                        }
                    }
                });




        Intent intent=getIntent();

        String id=intent.getExtras().getString("id");
        String profileUrl = intent.getExtras().getString("profile");

        tv_id.setText(id);
        Glide.with(this).load(profileUrl).into(iv_profile);

        btn_goGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GameActivity.class);
                startActivity(intent);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText("다");
                    }
                }, 300);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append("른");
                    }
                }, 400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append("유");
                    }
                }, 500);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append("저");
                    }
                }, 600);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append("대");
                    }
                }, 700);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append("기");
                    }
                }, 800);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append("중");
                    }
                }, 900);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append(".");
                    }
                }, 1000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append(".");
                    }
                }, 1100);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.append(".");
                    }
                }, 1200);
            }
        });

    }
}