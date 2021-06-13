package com.example.howprog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Prelevel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prelevel);
        ImageView view = findViewById(R.id.imageView12);
        view.setOnClickListener(v -> {
            Intent intent = new Intent(this, Level.class);
            new Handler().postDelayed(() -> {
                startActivity(intent);
            }, 100);
        });
    }
}
