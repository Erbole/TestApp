package com.geektach.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geektach.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClickers();
    }

    private void initClickers() {
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String a = binding.firstNumEt.getText().toString();
                String b = binding.secondNumEt.getText().toString();
                String result = math.add(a, b);
                binding.result.setText(result);
            }
        });
        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String c = binding.firstNumEtDiv.getText().toString();
                String d = binding.secondNumEtDiv.getText().toString();
                String result = math.division(c, d);
                binding.resultDivision.setText(result);
            }
        });
    }
}