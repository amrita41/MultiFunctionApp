package com.example.dell.multifunctionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Sixth extends AppCompatActivity {
    Button b;

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sixth);
        b=(Button)findViewById(R.id.button12);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                Sixth.this.startActivityForResult(intent, 0);
            }
        });
    }
}