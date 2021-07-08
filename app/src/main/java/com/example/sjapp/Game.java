package com.example.sjapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.security.KeyStore;

public class Game extends View {

    int screenWidth, screenHeight;
    Paint paint = new Paint();
    private GameThread thread;
    int d, n;


    public Game(Context con, AttributeSet at){
        super(con,at);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.screenWidth = w;
        this.screenHeight = h;

        if(thread == null) {
            thread = new GameThread();
            thread.start();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        thread.run = false;
        super.onDetachedFromWindow();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.BLACK);
        paint.setTextSize(screenHeight/16);

        canvas.drawText("sw"+screenWidth+"sh"+screenHeight,0,screenHeight/16,paint);

        Bitmap[] main = new Bitmap[5];
        for(int i=0; i<5; i++){
            main[i] = BitmapFactory.decodeResource(getResources(), R.drawable.main2 + i);
            main[i] = Bitmap.createScaledBitmap(main[i], screenWidth/8, screenHeight/4, true);
            if(i==n) {
                canvas.drawBitmap(main[i], d, screenHeight-screenHeight/4, null);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            if((int) event.getX()>screenWidth/2) { //중간값보다 크거나 작은 것
                d+=10; //좌표값
                n=1;
            }
            else {
                d-=10;
                n=0;
            }
        }
        return true;
    }

    class GameThread extends Thread {
        public boolean run = true;

        @Override
        public void run() {
            while(run) {
                try {
                    postInvalidate(); //뷰에서 이미지를 분리시킨다. True -> False
                    sleep(10);
                } catch (Exception e) {

                }
            }
        }
    }
}
