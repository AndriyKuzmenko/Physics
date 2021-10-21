package com.example.physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

public class FreeFallAnimation extends AppCompatActivity
{
    double mass,height,gravity;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_fall_animation);

        ImageView imageView = (ImageView) findViewById(R.id.ball);

        Intent gi = getIntent();
        mass=gi.getIntExtra("mass",0); //will be used in the table to calculate energy
        height=gi.getIntExtra("height",0);
        int planet=gi.getIntExtra("planet",0);
        if(planet>=0) gravity=Languages.gravity[planet];
        else gravity=10;
        double time=Math.sqrt(2*height/gravity);

        Log.i("TAG","m="+mass+", h="+height+", g="+gravity+", t="+time);

        float bottomOfScreen = getResources().getDisplayMetrics()
                .heightPixels - 64*5;

        imageView.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setDuration((long)(time*1000));
    }
}
