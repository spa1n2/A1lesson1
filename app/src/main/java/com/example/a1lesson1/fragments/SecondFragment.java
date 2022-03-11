package com.example.a1lesson1.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import com.example.a1lesson1.R;
import com.example.a1lesson1.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding;
    Animation fragmentAnim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        fragmentAnim = AnimationUtils.loadAnimation(requireContext(), R.anim.fragment_animation);
        binding.secondFragment.setAnimation(fragmentAnim);


        setupListener();
        return binding.getRoot();
    }

    private void setupListener() {
        binding.btnOpen.setOnClickListener(v -> {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                }
            }, 1000);
            FiirstFragment fiirstFragment = new FiirstFragment();
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.container_fragment,fiirstFragment).commit();

                });

            }
    @Override
    public void onStart() {
        super.onStart();
        Log.e("TAG", "SecondFragment onStart: " );

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("TAG", "SecondFragment onResume: " );

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("TAG", "SecondFragment onDestroyView: " );
    }

}