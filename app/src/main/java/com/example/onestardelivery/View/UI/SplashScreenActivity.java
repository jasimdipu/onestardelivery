package com.example.onestardelivery.View.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.onestardelivery.R;

public class SplashScreenActivity extends AppCompatActivity {

    Animation topAnimation, bottomAnimation, middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );


        topAnimation = AnimationUtils.loadAnimation(this,R.anim.slide_down);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_up);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.fade_in);

        final ImageView app_logo = findViewById(R.id.app_logo);
        final ImageView image1 = findViewById(R.id.image1);
        final ImageView image2 = findViewById(R.id.image2);
        final ImageView image3 = findViewById(R.id.image3);
        final ImageView image4 = findViewById(R.id.image4);
        final ImageView image5 = findViewById(R.id.image5);
        final ImageView image6 = findViewById(R.id.image6);

        app_logo.setAnimation(middleAnimation);

        image1.setAnimation(topAnimation);
        image2.setAnimation(topAnimation);
        image3.setAnimation(topAnimation);

        image4.setAnimation(bottomAnimation);
        image5.setAnimation(bottomAnimation);
        image6.setAnimation(bottomAnimation);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
            finish();
        }, 3000);


    }
}