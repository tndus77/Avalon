package com.example.sjapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    TextView tv_id;
    ImageView iv_profile;
    Button btn_goGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View view = getLayoutInflater().from(this).inflate(R.layout.activity_main,null);
        tv_id=findViewById(R.id.tv_id);//카카오 id
        iv_profile=findViewById(R.id.iv_profile);//카카오 프로필
        btn_goGame=findViewById(R.id.btn_goGame);

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
    }
}