package com.example.howprog;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        ImageButton level = findViewById(R.id.level);
        ImageButton level2 = findViewById(R.id.level2);
        ImageButton gear = findViewById(R.id.imageButton6);
        ImageButton cross = findViewById(R.id.imageButton7);
        ConstraintLayout settings= findViewById(R.id.settings);
        ConstraintLayout desc= findViewById(R.id.description);
        ImageButton cross2 = findViewById(R.id.imageButton9);
        ImageButton level3 = findViewById(R.id.imageButton10);
        ImageButton level4 = findViewById(R.id.imageButton11);

        level.setOnClickListener(v -> {
            Intent intent = new Intent(this, Prelevel.class);
            new Handler().postDelayed(() -> {
                startActivity(intent);
            }, 100);
        });
        level2.setOnClickListener(v -> {
            Intent intent = new Intent(this, Prelevel.class);
            new Handler().postDelayed(() -> {
                startActivity(intent);
            }, 100);
        });
        level.setOnLongClickListener(v -> {
            new Handler().postDelayed(() -> {
                desc.setVisibility(View.VISIBLE);
            }, 100);
            return true;
        });
        level2.setOnLongClickListener(v -> {
            new Handler().postDelayed(() -> {
                desc.setVisibility(View.VISIBLE);
            }, 100);
            return true;
        });
        level3.setOnClickListener(v -> {
            Intent intent = new Intent(this, Level.class);
            new Handler().postDelayed(() -> {
                startActivity(intent);
            }, 100);
        });
        level4.setOnClickListener(v -> {
            Intent intent = new Intent(this, Level.class);
            new Handler().postDelayed(() -> {
                startActivity(intent);
            }, 100);
        });


        gear.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                settings.setVisibility(View.VISIBLE);
            }, 100);
        });

        cross.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                settings.setVisibility(View.INVISIBLE);
            }, 100);
        });
        cross2.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                desc.setVisibility(View.INVISIBLE);
            }, 100);
        });
    }
}