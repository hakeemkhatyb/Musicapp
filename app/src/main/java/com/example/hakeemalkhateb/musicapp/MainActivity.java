package com.example.hakeemalkhateb.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton payment = (ImageButton) findViewById(R.id.payment);
        final ImageButton albums = (ImageButton) findViewById(R.id.albums);
        final ImageButton playlist = (ImageButton) findViewById(R.id.playlist);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PaymentActivity = new Intent(getApplicationContext(), Payment.class);
                startActivity(PaymentActivity);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent AlbumsActivity = new Intent(getApplicationContext(), Albums.class);
                startActivity(AlbumsActivity);

            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PlaylistActivity = new Intent(getApplicationContext(), Playlist.class);
                startActivity(PlaylistActivity);

            }
        });

    }
}
