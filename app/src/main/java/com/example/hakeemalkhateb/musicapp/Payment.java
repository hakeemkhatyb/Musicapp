package com.example.hakeemalkhateb.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        final ImageButton albums= (ImageButton) findViewById(R.id.albums);
        final ImageButton playlist= (ImageButton) findViewById(R.id.playlist);
        final ImageButton songs = (ImageButton) findViewById(R.id.songs);


        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent AlbumsActivity = new Intent(getApplicationContext(),Albums.class);
                startActivity(AlbumsActivity);

            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PlaylistActivity = new Intent(getApplicationContext(),Playlist.class);
                startActivity(PlaylistActivity);

            }
        });


        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent SongsActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(SongsActivity);

            }
        });
    }
}

