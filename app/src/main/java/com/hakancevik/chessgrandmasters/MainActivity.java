package com.hakancevik.chessgrandmasters;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;


import com.hakancevik.chessgrandmasters.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    boolean isOpen = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }


    @SuppressLint("SetTextI18n")
    public void changeImage(View view) {

        if (isOpen) {
            binding.imageView.setImageResource(R.drawable.kasparov);
            isOpen = false;
            binding.nameText.setText("Garry Kasparov");
        }
        else {
            binding.imageView.setImageResource(R.drawable.carlsen);
            isOpen = true;
            binding.nameText.setText("Magnus Carlsen");
        }


    }


}


