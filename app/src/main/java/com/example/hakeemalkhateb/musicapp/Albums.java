package com.example.hakeemalkhateb.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        final ImageButton payment = (ImageButton) findViewById(R.id.payment);
        final ImageButton playlist = (ImageButton) findViewById(R.id.playlist);
        final ImageButton songs = (ImageButton) findViewById(R.id.songs);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PaymentPctivity = new Intent(getApplicationContext(), Payment.class);
                startActivity(PaymentPctivity);
            }
        });


        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PlaylistActivity = new Intent(getApplicationContext(), Playlist.class);
                startActivity(PlaylistActivity);

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

