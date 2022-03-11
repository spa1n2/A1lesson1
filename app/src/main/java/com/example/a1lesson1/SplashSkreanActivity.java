package com.example.a1lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.a1lesson1.databinding.ActivitySplashSkreanBinding;

public class SplashSkreanActivity extends AppCompatActivity {
    private ActivitySplashSkreanBinding binding;
    Animation toAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashSkreanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        toAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        binding.imLogo.setAnimation(toAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashSkreanActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}