package com.example.sjapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MovableFloatingActionButton extends FloatingActionButton implements View.OnTouchListener {

    private final static float CLICK_DRAG_TOLERANCE = 10;

    private float downRawX, downRawY;
    private float dX,dY;

    public MovableFloatingActionButton(@NonNull @org.jetbrains.annotations.NotNull Context context) {
        super(context);
        init();
    }

    public MovableFloatingActionButton(@NonNull @org.jetbrains.annotations.NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MovableFloatingActionButton(@NonNull @org.jetbrains.annotations.NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams)v.getLayoutParams();

        int action = event.getAction();
        if(action == event.ACTION_DOWN){
            downRawX = event.getRawX();
            downRawY = event.getRawY();
            dX = v.getX() - downRawY;
            dY = v.getY() - downRawY;
            return true;
        }
        else if(action == event.ACTION_MOVE) {
            int viewWidth = v.getWidth();
            int viewHeight = v.getHeight();

            View viewParent = (View) v.getParent();
            int parentWidth = viewParent.getWidth();
            int parentHeight = viewParent.getHeight();

            float newX = event.getRawX() + dX;
            newX = Math.max(layoutParams.leftMargin, newX);
            newX = Math.min(parentWidth - viewWidth - layoutParams.rightMargin, newX);

            float newY = event.getRawY() + dY;
            newY = Math.max(layoutParams.topMargin, newY);
            newY = Math.min(parentHeight - viewHeight - layoutParams.bottomMargin, newY);

            v.animate().x(newX).y(newY).setDuration(0).start();
        }
        else if(action == event.ACTION_UP){





        }
        return false;
    }
}
