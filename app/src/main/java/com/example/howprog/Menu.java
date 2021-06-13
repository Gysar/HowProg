package com.example.howprog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ImageButton[] buttons = new ImageButton[3];
        buttons[0] = findViewById(R.id.imageButton);
        buttons[1] = findViewById(R.id.imageButton2);
        buttons[2] = findViewById(R.id.imageButton3);
        for (ImageButton b : buttons) {
            b.setOnClickListener(v -> {
                v.setBackgroundColor((getResources().getColor(R.color.lighter, null)));
                v.setElevation(20);
                Intent intent = new Intent(this, Map.class);
                new Handler().postDelayed(() -> {
                    startActivity(intent);
                    v.setBackgroundColor(getResources().getColor(R.color.primary));
                    v.setElevation(0);
                }, 100);
            });

        }
        ImageView[] trash=new ImageView[3];
        trash[0]=findViewById(R.id.imageView);
        trash[1]=findViewById(R.id.imageView6);
        trash[2]=findViewById(R.id.imageView7);
        ImageView delete = findViewById(R.id.imageView8);
        TextView ja = findViewById(R.id.textView9);
        TextView nein = findViewById(R.id.textView10);
        ImageButton gear = findViewById(R.id.imageButton4);
        ImageButton cross = findViewById(R.id.imageButton7);
        ConstraintLayout settings= findViewById(R.id.settings);
        for (ImageView b : trash) {
            b.setOnClickListener(v -> {
                new Handler().postDelayed(() -> {
                    delete.setVisibility(View.VISIBLE);
                    ja.setVisibility(View.VISIBLE);
                    nein.setVisibility(View.VISIBLE);
                }, 100);
            });

        }

        ja.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                delete.setVisibility(View.INVISIBLE);
                ja.setVisibility(View.INVISIBLE);
                nein.setVisibility(View.INVISIBLE);
            }, 100);
        });

        nein.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {
                delete.setVisibility(View.INVISIBLE);
                ja.setVisibility(View.INVISIBLE);
                nein.setVisibility(View.INVISIBLE);
            }, 100);
        });

        gear.setOnClickListener(v -> {
            settings.setVisibility(View.VISIBLE);
        });

        cross.setOnClickListener(v -> {
            new Handler().postDelayed(() -> {

                settings.setVisibility(View.INVISIBLE);
            }, 100);
        });

    }
}