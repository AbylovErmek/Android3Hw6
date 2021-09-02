package com.geektech.android3hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geektech.android3hw6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setOnClicks();
    }

    private void setOnClicks() {
        binding.add.setOnClickListener(v -> result(math.add(getFirst(), getSecond())));
        binding.subtract.setOnClickListener(v -> result(math.sub(getFirst(), getSecond())));
        binding.multiply.setOnClickListener(v -> result(math.mult(getFirst(), getSecond())));
        binding.divide.setOnClickListener(v -> result(math.div(getFirst(), getSecond())));
    }

    private void result(int subtract) {
        binding.result.setText(String.valueOf(subtract));
        binding.result.setVisibility(View.VISIBLE);
    }

    private int getFirst() {
        String text = binding.firstEdt.getText().toString();
        return text.equals("") ? 0 : Integer.parseInt(text);
    }

    private int getSecond() {
        String text = binding.secondEdt.getText().toString();
        return text.equals("") ? 0 : Integer.parseInt(binding.secondEdt.getText().toString());
    }
}