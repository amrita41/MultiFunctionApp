package com.example.dell.multifunctionapp;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fourth extends AppCompatActivity {
    private Button send;
    private EditText txt_m,txt_p;
    private final static int REQUEST_CODE_PERMISSION_SEND_SMS = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_fourth);
        send=(Button)findViewById(R.id.button_send);
        txt_m=(EditText)findViewById(R.id.text_message);
        txt_p=(EditText)findViewById(R.id.txt_phone_number);
        send.setEnabled(false);

        if(checkPermission(Manifest.permission.SEND_SMS))
        {
            send.setEnabled(true);
        }
        else
        {
            ActivityCompat.requestPermissions(Fourth.this, new String[]{(Manifest.permission.SEND_SMS)}, REQUEST_CODE_PERMISSION_SEND_SMS);
        }
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = txt_m.getText().toString();
                String phoneNum = txt_p.getText().toString();

                if(!txt_m.getText().toString().equals("") && !txt_p.getText().toString().equals("")) {
                    SmsManager smsman = SmsManager.getDefault();
                    smsman.sendTextMessage(phoneNum, null, msg, null, null);
                    Toast.makeText(Fourth.this, "SMS SENT", Toast.LENGTH_LONG).show();
                    txt_m.getText().clear();
                    txt_p.getText().clear();
                }
                else {
                    Toast.makeText(Fourth.this, "Please enter Message and Phone Number", Toast.LENGTH_LONG).show();
                }

            }
        });


    }

    private boolean checkPermission(String permission)
    {
        int checkPermission=ContextCompat.checkSelfPermission(this,permission);
        return checkPermission==PackageManager.PERMISSION_GRANTED;

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode)
        {
            case REQUEST_CODE_PERMISSION_SEND_SMS:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    send.setEnabled(true);
                }
                break;
        }
    }
}