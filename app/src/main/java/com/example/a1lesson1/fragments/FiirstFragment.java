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
import com.example.a1lesson1.databinding.FragmentFiirstBinding;

public class FiirstFragment extends Fragment {
    FragmentFiirstBinding binding;
    Animation fragmentAnim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFiirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentAnim = AnimationUtils.loadAnimation(requireContext(),R.anim.fragment_animation);
        binding.firstFragment.setAnimation(fragmentAnim);

        setupListener();
    }

    private void setupListener() {
        binding.btnOpen.setOnClickListener(v -> {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                }
            },1000);

            SecondFragment secondFragment = new SecondFragment();
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.container_fragment,secondFragment).commit();
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("TAG", "FiirstFragment onStart: " );

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("TAG", "FiirstFragment onResume: " );

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("TAG", "FiirstFragment onDestroyView: " );
    }
}