package com.example.myjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private boolean bool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textVIew);
        bool = false;

        textView.setVisibility(TextView.GONE);

        button.setOnClickListener(view -> {
            textView.setText("Soham Pande The Great");
            textView.setVisibility(TextView.VISIBLE);
            button.setText("Hide my name");
        });
    }
}