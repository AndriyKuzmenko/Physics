package com.example.physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;

public class FreeFallAnimation extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_fall_animation);

        ImageView imageView = (ImageView) findViewById(R.id.ball);

        Intent gi = getIntent();
        double mass=gi.getIntExtra("mass",0); //will be used in the table to calculate energy
        double height=gi.getIntExtra("height",0);
        double gravity=gi.getIntExtra("gravity",0);
        double time=Math.sqrt(2*height/gravity);

        float bottomOfScreen = getResources().getDisplayMetrics()
                .heightPixels - (imageView.getHeight() * 4);

        imageView.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setInterpolator(new BounceInterpolator())
                .setDuration((long)(time*1000));
    }
}
