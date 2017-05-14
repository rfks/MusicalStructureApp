package com.example.rk.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playlistButton = (Button) findViewById(R.id.playlist);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(playlistIntent);
            }
        });

        Button libraryButton = (Button) findViewById(R.id.library);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        Button songdetailButton = (Button) findViewById(R.id.songdetail);
        songdetailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songdetailIntent = new Intent(MainActivity.this, SongDetailsActivity.class);
                startActivity(songdetailIntent);
            }
        });
    }
}
