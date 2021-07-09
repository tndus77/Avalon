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

    Animation animTran1Start, animTran1End, animTran2Start, animTran2End, animTran5Start, animTran5End,animTran6Start, animTran6End;

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

        View view = getLayoutInflater().from(this).inflate(R.layout.activity_main,null);

        animTran1Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_1);
        animTran1End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_1_end);
        animTran2Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_2);
        animTran2End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_2_end);
        animTran5Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_5);
        animTran5End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_5_end);
        animTran6Start = AnimationUtils.loadAnimation(this, R.anim.anim_tran_6);
        animTran6End = AnimationUtils.loadAnimation(this, R.anim.anim_tran_6_end);

        black_stone3 = (FloatingActionButton)findViewById(R.id.black_stone3);
        arrowL3 = (FloatingActionButton)findViewById(R.id.arrowL3);
        arrowUL3 = (FloatingActionButton)findViewById(R.id.arrowUL3);
        arrowUR3 = (FloatingActionButton)findViewById(R.id.arrowUR3);
        arrowR3 = (FloatingActionButton)findViewById(R.id.arrowR3);

        black_stone2 = (FloatingActionButton)findViewById(R.id.black_stone2);
        arrowL2 = (FloatingActionButton)findViewById(R.id.arrowL2);
        arrowUL2 = (FloatingActionButton)findViewById(R.id.arrowUL2);
        arrowUR2 = (FloatingActionButton)findViewById(R.id.arrowUR2);
        arrowR2 = (FloatingActionButton)findViewById(R.id.arrowR2);

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

        black_stone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBlackButtonClicked(v,3);
            }
        });
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
            if(num==2) {
                arrowUR2.startAnimation(animTran1Start);
                arrowR2.startAnimation(animTran2Start);
                arrowUL2.startAnimation(animTran6Start);
                arrowL2.startAnimation(animTran5Start);
            }
            if(num==3){
                arrowUR3.startAnimation(animTran1Start);
                arrowR3.startAnimation(animTran2Start);
                arrowUL3.startAnimation(animTran6Start);
                arrowL3.startAnimation(animTran5Start);
            }
        }
        else{
            if(num==2) {
                arrowUR2.startAnimation(animTran1End);
                arrowR2.startAnimation(animTran2End);
                arrowUL2.startAnimation(animTran6End);
                arrowL2.startAnimation(animTran5End);
            }
            if(num==3){
                arrowUR3.startAnimation(animTran1End);
                arrowR3.startAnimation(animTran2End);
                arrowUL3.startAnimation(animTran6End);
                arrowL3.startAnimation(animTran5End);
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
        }
    }

}