package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView damn = (TextView) findViewById(R.id.Damn);
        damn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DAMN_Activity.class));
            }
        });

        TextView takeCare = findViewById(R.id.Take_Care);
        takeCare.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Take_Care_Activity.class));
            }
        });

        TextView astroworld = findViewById(R.id.Astroworld);
        astroworld.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Astroworld_Activity.class));
            }
        });
    }

    public void openAlbumList(View view) {
        Intent damnIntent = new Intent(this, DAMN_Activity.class);
        startActivity(damnIntent);
    }
}
