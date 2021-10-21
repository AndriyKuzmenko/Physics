package com.example.physics;

import androidx.appcompat.app.AppCompatActivity;
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

        float bottomOfScreen = getResources().getDisplayMetrics()
                .heightPixels - (imageView.getHeight() * 4);
        //bottomOfScreen is where you want to animate to

        imageView.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setInterpolator(new BounceInterpolator())
                .setDuration(2000);
    }
}
