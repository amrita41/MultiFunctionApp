package com.example.dell.multifunctionapp;

import android.content.DialogInterface;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
public class Fifth extends AppCompatActivity {
    Camera camera;
    ImageButton imageButton;
    boolean isflash = false;
    boolean ison = false;
    Camera.Parameters parameters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_fifth);
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        if (getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            this.camera = Camera.open();
            this.parameters = this.camera.getParameters();
            this.isflash = true;
        }
        this.imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (Fifth.this.isflash) {
                    if (!Fifth.this.ison) {
                        Fifth.this.imageButton.setImageResource(R.drawable.on_button);
                        Fifth.this.parameters.setFlashMode("torch");
                        Fifth.this.camera.setParameters(Fifth.this.parameters);
                        Fifth.this.camera.startPreview();
                        Fifth.this.ison = true;
                        return;
                    }
                    Fifth.this.imageButton.setImageResource(R.drawable.off_button);
                    Fifth.this.parameters.setFlashMode("off");
                    Fifth.this.camera.setParameters(Fifth.this.parameters);
                    Fifth.this.camera.stopPreview();
                    Fifth.this.ison = false;
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(Fifth.this);
                builder.setTitle("error...");
                builder.setMessage("Flash light is not available on this device...");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface param2DialogInterface, int param2Int) {
                        param2DialogInterface.dismiss();
                        //Fifth.null.this.this$0.finish();
                    }
                });
                builder.create().show();
            }
        });

            }
    protected void onStop() {
        super.onStop();
        if (this.camera != null) {
            this.camera.release();
            this.camera = null;
        }
    }
}
