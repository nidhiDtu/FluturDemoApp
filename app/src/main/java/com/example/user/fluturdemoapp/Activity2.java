package com.example.user.fluturdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Activity2 extends AppCompatActivity {

    private ImageView heart1;
    private ImageView heart2;
    private ImageView heart3;
    private ImageView heart4;
    private RelativeLayout layout;
    private boolean flags[]=new boolean[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent=getIntent();

        heart1=findViewById(R.id.heart1);
        heart2=findViewById(R.id.heart2);
        heart3=findViewById(R.id.heart3);
        heart4=findViewById(R.id.heart4);
        layout=findViewById(R.id.layout);

        heart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOutAndHideImage(heart1);
                heart1.setClickable(false);
            }
        });

        heart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOutAndHideImage(heart2);
                heart2.setClickable(false);
            }
        });

        heart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOutAndHideImage(heart3);
                heart3.setClickable(false);
            }
        });

        heart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOutAndHideImage(heart4);
                heart4.setClickable(false);
            }
        });

    }

    private void fadeOutAndHideImage(final ImageView img)
    {
        Animation fadeOut = new AlphaAnimation(1, 0);

        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(1000);

        img.setVisibility(View.VISIBLE);
        img.setAlpha(0.0f);

// Start the animation
        img.animate()
                .translationY(20)
                .alpha(1.0f);

        fadeOut.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation animation) {
//                img.setVisibility(View.INVISIBLE);
////                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(heart1.getLayoutParams());
////                lp.setMargins(5, 20, 5, 0);
////                heart1.setLayoutParams(lp);
//                img.setVisibility(View.VISIBLE);
            }
            public void onAnimationRepeat(Animation animation) {}
            public void onAnimationStart(Animation animation) {}
        });

        img.startAnimation(fadeOut);
    }
}

