package com.example.dell.multifunctionapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Eighth extends AppCompatActivity {
    Button b11,b12;
    MediaPlayer mp1,mp2,mp3,mp,mp4,mp5,mp6,mp7;
    Spinner dropdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eighth);
        dropdown=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Eighth.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.names));
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        b11=(Button)findViewById(R.id.button_play);
        b12=(Button)findViewById(R.id.button_pause);
        mp1=MediaPlayer.create(this,R.raw.a);
        mp2=MediaPlayer.create(this,R.raw.a1);
        mp3=MediaPlayer.create(this,R.raw.a2);
        mp4=MediaPlayer.create(this,R.raw.a3);
        mp5=MediaPlayer.create(this,R.raw.a5);
        mp6=MediaPlayer.create(this,R.raw.a6);
        mp7=MediaPlayer.create(this,R.raw.maula);
        mp=mp1;
        mp.start();
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dropdown.getSelectedItem().equals("Jiyein_Kyun")){
                    mp.pause();
                    mp.start();
                    mp=mp1;
                }
                if(dropdown.getSelectedItem().equals("Lag_Jaa_Gale")){
                    mp.pause();
                    mp2.start();
                    mp=mp2;
                }
                if(dropdown.getSelectedItem().equals("LoseYourself")){
                    mp.pause();
                    mp3.start();
                    mp=mp3;
                }
                if(dropdown.getSelectedItem().equals("Alone")){
                    mp.pause();
                    mp4.start();
                    mp=mp4;
                }
                if(dropdown.getSelectedItem().equals("BlankSpace")){
                    mp.pause();
                    mp5.start();
                    mp=mp5;
                }
                if(dropdown.getSelectedItem().equals("Despacito")){
                    mp.pause();
                    mp6.start();
                    mp=mp6;
                }
                if(dropdown.getSelectedItem().equals("Maula")){
                    mp.pause();
                    mp7.start();
                    mp=mp7;
                }
            }

        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

    }
}
