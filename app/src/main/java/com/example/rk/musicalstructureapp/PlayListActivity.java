package com.example.rk.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


        Button songdetailButton = (Button) findViewById(R.id.songdetail);
        songdetailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songdetailIntent = new Intent(PlayListActivity.this, SongDetailsActivity.class);
                startActivity(songdetailIntent);
            }
        });


        Button removeButton = (Button) findViewById(R.id.removebutton);
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.remove_song, Toast.LENGTH_SHORT).show();
            }
        });
    }

    ;
}
