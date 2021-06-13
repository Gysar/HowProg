package com.example.howprog;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Level extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);
        ImageView beenden = findViewById(R.id.beenden);
        ImageView block1 = findViewById(R.id.block1);
        ImageView block2 = findViewById(R.id.block2);
        ImageView block3 = findViewById(R.id.block3);
        ImageView buch = findViewById(R.id.buch);
        ImageView funktionen = findViewById(R.id.funktionen);
        ImageView plus = findViewById(R.id.plus);
        ImageView plusfunktion = findViewById(R.id.plusfunktion);
        ImageView tipp = findViewById(R.id.tipp);
        ImageView swap = findViewById(R.id.swap);
        ImageView vollbild = findViewById(R.id.vollbild);
        ConstraintLayout explanation = findViewById(R.id.explanationscope);
        ConstraintLayout bloecke = findViewById(R.id.bloecke);
        ConstraintLayout text = findViewById(R.id.text);
        ImageButton cross = findViewById(R.id.cross);
        ImageView bee = findViewById(R.id.bee);
        ImageView kreis2 = findViewById(R.id.kreis2);
        ImageView blockauswahl = findViewById(R.id.blockauswahl);
        ImageView tippexplanation = findViewById(R.id.tippexplanation);

        vollbild.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                setContentView(R.layout.levelhoch);
            }, 100);
        });

        beenden.setOnClickListener(v -> {
            Intent intent = new Intent(this, Levelende.class);
            new Handler().postDelayed(() -> {
                startActivity(intent);
            }, 100);
        });
        tipp.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                tippexplanation.setVisibility(View.VISIBLE);
            }, 100);
        });
        tippexplanation.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                tippexplanation.setVisibility(View.INVISIBLE);
            }, 100);
        });
        buch.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                explanation.setVisibility(View.VISIBLE);
                cross.setVisibility(View.VISIBLE);
            }, 100);
        });
        cross.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                explanation.setVisibility(View.INVISIBLE);
                cross.setVisibility(View.INVISIBLE);
            }, 100);
        });
        plus.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                bee.setVisibility(View.VISIBLE);
                kreis2.setVisibility(View.VISIBLE);
            }, 100);
        });
        swap.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                if(bloecke.getVisibility()==View.VISIBLE) {
                    bloecke.setVisibility(View.INVISIBLE);
                    text.setVisibility(View.VISIBLE);
                }else{
                    bloecke.setVisibility(View.VISIBLE);
                    text.setVisibility(View.INVISIBLE);
                }
            }, 100);
        });
        blockauswahl.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                if(block3.getVisibility()==View.VISIBLE) block1.setVisibility(View.VISIBLE);
                else if(block2.getVisibility()==View.VISIBLE) block3.setVisibility(View.VISIBLE);
                else block2.setVisibility(View.VISIBLE);
            }, 100);
        });

    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.levelhoch);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.level);
        }
    }
}