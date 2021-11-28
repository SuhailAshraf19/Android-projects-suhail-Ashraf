package com.suhailashraf.svideoplayer;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView whatsapp;
        whatsapp = findViewById(R.id.whatsapp);
        whatsapp.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.dj);
        MediaController mediaController= new MediaController(this);
        whatsapp.setMediaController(mediaController);
        mediaController.setAnchorView(whatsapp);
       
        whatsapp.pause();


    }
}