package com.chaurasiyashivani.adishakti;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button play = findViewById(R.id.button);
        Button pause = findViewById(R.id.button2);

        mediaPlayer = MediaPlayer.create(this,R.raw.aarti);
        mediaPlayer.start();
        play.setOnClickListener(v -> mediaPlayer.start());
        pause.setOnClickListener(v -> mediaPlayer.pause());
    }
}