package com.example.sjapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        stoneExist = new int[9][9];
//        stoneExist[0]=new int[5];
//        stoneExist[1]=new int[6];
//        stoneExist[2]=new int[7];
//        stoneExist[3]=new int[8];
//        stoneExist[4]=new int[9];
//        stoneExist[5]=new int[8];
//        stoneExist[6]=new int[7];
//        stoneExist[7]=new int[6];
//        stoneExist[8]=new int[5];

        for(int i=0;i<9;i++){
            if(i<=1 || i>=7){
                for(int j=0;j<6;j++){
                    stoneExist[i][j]=1;
                }
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

        imageView = (ImageView)findViewById(R.id.background);
        bitmap = Bitmap.createBitmap(1080,1080,Bitmap.Config.ARGB_8888);
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

        init();
    }
    private void init(){
        drawingBackground();//backgroud 그리기
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
        for(int i=0; i<6; i++){
            String n = "gg";
            Log.d("availpass",n);
            Log.d("passfind",Integer.toString(stoneExist[0][i]));
        }
        for(int way=0; way<6; way++){
            int coloffset=0;
            for(int oneline=0; oneline<6; oneline++){
                if(way==0){//UR
                    if(row+oneline<5){
                        coloffset = oneline;
                        if(endroad(row+oneline, col+oneline)){//막다른길 아니면
                            wayinfo[way][oneline]=stoneExist[row+oneline][col+oneline];
                        }else{
                            wayinfo[way][oneline]=-1;
                            break;
                        }
                    }else{
                        if(endroad(row+oneline, col+coloffset)){
                            wayinfo[way][oneline]=stoneExist[row+oneline][col+oneline];
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
//        for(int i =0; i<6; i++){
//            Log.d("wayinfo",Integer.toString(wayinfo[i]));
//        }
        for(int i=0; i<6; i++){
            if(wayinfo[i]==-1){
                movingpoint[1]=-1;
                break;
            }
            if(wayinfo[i]==0){
                //count가 빈 칸의 위치를 나타냄
                movingpoint[1]=wayinfo[i-1];//빈칸이 오기 직전의 돌을 반환함
                break;
            }
            if(wayinfo[i]==1||wayinfo[i]==2){//자리에 돌이 있다면
                count++;
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

        Log.d("info",Integer.toString(count));
        Log.d("Becol",Integer.toString(col));

        int coloffset=0;
        for(int oneline=0; oneline<count; oneline++) {
            if (way == 0) {//UR
                if (row + oneline < 5) {
                    row++;
                    col++;
                } else {
                    row++;
                }
            }
            if (way == 1) {
                col++;
            }
            if (way == 2) {
                if (row - oneline > 3) {
                    row--;
                    col++;
                } else {
                    row--;;
                }
            }
            if (way == 3) {
                if (row - oneline > 3) {
                    row--;
                } else {
                    row--;
                    col--;
                }
            }
            if (way == 4) {
                col--;
            }
            if (way == 5) {
                if (row + oneline < 5) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        Log.d("Afcol",Integer.toString(col));

        if(row==0){
            movingpoint[0]=col+1;
        }
        if(row==1){
            movingpoint[0]=col+6;
        }
        if(row==2){
            movingpoint[0]=col+12;
        }
        if(row==3){
            movingpoint[0]=col+19;
        }
        if(row==4){
            movingpoint[0]=col+27;
        }
        if(row==5){
            movingpoint[0]=col+36;
        }
        if(row==6){
            movingpoint[0]=col+44;
        }
        if(row==7){
            movingpoint[0]=col+51;
        }
        if(row==8){
            movingpoint[0]=col+57;
        }
        return movingpoint;
    }

    private void moving(int start, int end, int kindOfStone){
        Log.d("start",Integer.toString(start));
        Log.d("end",Integer.toString(end));

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
        if(start==25){
            black_stone25.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,25);
        }
        if(start==26){
            black_stone26.setVisibility(View.INVISIBLE);
            onBlackButtonClicked(view,26);
        }

        if(kindOfStone==-1)
            return;

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
        stoneExist[row][col] = kindOfStone;

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
        canvas.drawColor(Color.WHITE);
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
            firstartx = 255;
            firstarty = 70;
            firendx = 825;
            firendy = 70;
            secstartx = 825;
            secstarty = 1010;
            secendx = 1080;
            secendy = 540;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = -Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255;
            firstarty = 70;
            firendx = 825;
            firendy = 70;
            secstartx = 0;
            secstarty = 540;
            secendx = 255;
            secendy = 1010;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255;
            firstarty = 1010;
            firendx = 825;
            firendy = 1010;
            secstartx = 0;
            secstarty = 540;
            secendx = 255;
            secendy = 70;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = -Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255;
            firstarty = 1010;
            firendx = 825;
            firendy = 1010;
            secstartx = 825;
            secstarty = 70;
            secendx = 1080;
            secendy = 540;
            startx = Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firendy;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255;
            firstarty = 70;
            firendx = 0;
            firendy = 540;
            secstartx = 825;
            secstarty = 70;
            secendx = 1080;
            secendy = 540;
            startx = -Math.abs((firendx-firstartx)/4)*i+firstartx;
            starty = Math.abs((firendy-firstarty)/4)*i+firstarty;
            endx = Math.abs((secendx-secstartx)/4)*i+secstartx;
            endy = Math.abs((secendy-secstarty)/4)*i+secstarty;
            canvas.drawLine(startx,starty,endx,endy,paint);
        }
        for(int i=0;i<5;i++) {
            firstartx = 255;
            firstarty = 540;
            firendx = 0;
            firendy = 1010;
            secstartx = 825;
            secstarty = 540;
            secendx = 1080;
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
            }if(num==9) {
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

        }
        else {
            allEnabled();
            if (num == 1) {
                arrowUR1.startAnimation(animTran1End);
                arrowR1.startAnimation(animTran2End);
                arrowUL1.startAnimation(animTran6End);
                arrowUR1.setEnabled(false);
                arrowR1.setEnabled(false);
                arrowUL1.setEnabled(false);
            }
            if (num == 2) {
                arrowUR2.startAnimation(animTran1End);
                arrowR2.startAnimation(animTran2End);
                arrowUL2.startAnimation(animTran6End);
                arrowL2.startAnimation(animTran5End);
                arrowUR2.setEnabled(false);
                arrowR2.setEnabled(false);
                arrowUL2.setEnabled(false);
                arrowL2.setEnabled(false);
            }
            if (num == 3) {
                arrowUR3.startAnimation(animTran1End);
                arrowR3.startAnimation(animTran2End);
                arrowUL3.startAnimation(animTran6End);
                arrowL3.startAnimation(animTran5End);
                arrowUR3.setEnabled(false);
                arrowR3.setEnabled(false);
                arrowUL3.setEnabled(false);
                arrowL3.setEnabled(false);
            }
            if (num == 4) {
                arrowUR4.startAnimation(animTran1End);
                arrowR4.startAnimation(animTran2End);
                arrowUL4.startAnimation(animTran6End);
                arrowL4.startAnimation(animTran5End);
                arrowUR4.setEnabled(false);
                arrowR4.setEnabled(false);
                arrowUL4.setEnabled(false);
                arrowL4.setEnabled(false);
            }
            if (num == 5) {
                arrowUR5.startAnimation(animTran1End);
                arrowL5.startAnimation(animTran5End);
                arrowUL5.startAnimation(animTran6End);
                arrowUR5.setEnabled(false);
                arrowL5.setEnabled(false);
                arrowUL5.setEnabled(false);
            }
            if (num == 6) {
                arrowUR6.startAnimation(animTran1End);
                arrowR6.startAnimation(animTran2End);
                arrowDR6.startAnimation(animTran3End);
                arrowUL6.startAnimation(animTran6End);
                arrowUR6.setEnabled(false);
                arrowR6.setEnabled(false);
                arrowDR6.setEnabled(false);
                arrowUL6.setEnabled(false);
            }
            if (num == 7) {
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
            if (num == 8) {
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
            if (num == 9) {
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
            if (num == 10) {
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
            if (num == 11) {
                arrowUR11.startAnimation(animTran1End);
                arrowDL11.startAnimation(animTran4End);
                arrowL11.startAnimation(animTran5End);
                arrowUL11.startAnimation(animTran6End);
                arrowUR11.setEnabled(false);
                arrowDL11.setEnabled(false);
                arrowL11.setEnabled(false);
                arrowUL11.setEnabled(false);
            }
            if (num == 12) {
                arrowUR12.startAnimation(animTran1End);
                arrowR12.startAnimation(animTran2End);
                arrowDR12.startAnimation(animTran3End);
                arrowUL12.startAnimation(animTran6End);
                arrowUR12.setEnabled(false);
                arrowR12.setEnabled(false);
                arrowDR12.setEnabled(false);
                arrowUL12.setEnabled(false);
            }
            if (num == 13) {
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
            if (num == 14) {
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
            if (num == 15) {
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
            if (num == 16) {
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
            if (num == 17) {
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
            if (num == 18) {
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
            if (num == 21) {
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

            if (num == 22) {
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
            if (num == 23) {
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
            if (num == 24) {
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
        }
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
    }

}