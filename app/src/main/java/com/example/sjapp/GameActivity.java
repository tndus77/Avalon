package com.example.sjapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

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

    int stoneExist[][];//0:없음,1:내돌,2:상대돌


    Animation animTran1Start, animTran1End, animTran2Start, animTran2End,
            animTran3Start, animTran3End, animTran4Start, animTran4End,animTran5Start, animTran5End,animTran6Start, animTran6End;

    int clicked = 0;
    boolean opened = false;

    ImageView imageView;
    Bitmap bitmap;
    Canvas canvas;
    Paint paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        stoneExist[0]=new int[5];
        stoneExist[1]=new int[6];
        stoneExist[2]=new int[7];
        stoneExist[3]=new int[8];
        stoneExist[4]=new int[9];

        Arrays.fill(stoneExist,0);
        Arrays.fill(stoneExist[0],1);
        Arrays.fill(stoneExist[1],1);
        stoneExist[2][2]=1;
        stoneExist[2][3]=1;
        stoneExist[2][4]=1;

        View view = getLayoutInflater().from(this).inflate(R.layout.activity_main,null);

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



        imageView = (ImageView)findViewById(R.id.background);
        bitmap = Bitmap.createBitmap(1080,1080,Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        imageView.setImageBitmap(bitmap);

        drawingBackground();

        black_stone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,2);
            }
        });
        arrowUR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        black_stone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,3);
            }
        });

        black_stone4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,4);
            }
        });

        black_stone7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,7);
            }
        });

        black_stone8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,8);
            }
        });

        black_stone9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,9);
            }
        });

        black_stone10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,10);
            }
        });

        black_stone14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,14);
            }
        });

        black_stone15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,15);
            }
        });

        black_stone16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,16);
            }
        });
    }
    //private boolean canMove(){}

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
        }
        else{
            allEnabled();
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
        }
    }

    private void setVisibility(int clicked, View v, int num) {
        if(!opened){
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
        }
        else{
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
        }
    }
    private void allUnabled(){
        black_stone2.setEnabled(false);
        black_stone3.setEnabled(false);
        black_stone4.setEnabled(false);
        black_stone7.setEnabled(false);
        black_stone8.setEnabled(false);
        black_stone9.setEnabled(false);
        black_stone10.setEnabled(false);
        black_stone14.setEnabled(false);
        black_stone15.setEnabled(false);
        black_stone16.setEnabled(false);
    }
    private void allEnabled(){
        black_stone2.setEnabled(true);
        black_stone3.setEnabled(true);
        black_stone4.setEnabled(true);
        black_stone7.setEnabled(true);
        black_stone8.setEnabled(true);
        black_stone9.setEnabled(true);
        black_stone10.setEnabled(true);
        black_stone14.setEnabled(true);
        black_stone15.setEnabled(true);
        black_stone16.setEnabled(true);
    }

}