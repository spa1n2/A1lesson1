package com.example.a1lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a1lesson1.databinding.ActivityMainBinding;
import com.example.a1lesson1.fragments.FiirstFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_fragment, FiirstFragment.class,null).commit();

        }

    }

}