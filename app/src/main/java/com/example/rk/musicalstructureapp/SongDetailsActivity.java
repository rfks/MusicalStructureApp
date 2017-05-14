package com.example.rk.musicalstructureapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SongDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songdetails);

        ImageButton btn = (ImageButton) findViewById(R.id.songimage);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(SongDetailsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
