package com.example.hakeemalkhateb.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        final ImageButton payment = (ImageButton) findViewById(R.id.payment);
        final ImageButton albums = (ImageButton) findViewById(R.id.albums);
        final ImageButton songs = (ImageButton) findViewById(R.id.songs);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paymentActivity = new Intent(getApplicationContext(), Payment.class);
                startActivity(paymentActivity);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent AlbumsActivity = new Intent(getApplicationContext(), Albums.class);
                startActivity(AlbumsActivity);

            }
        });


        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent SongsActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(SongsActivity);

            }
        });
    }
}

