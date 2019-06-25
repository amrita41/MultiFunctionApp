package com.example.dell.multifunctionapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ninth extends AppCompatActivity implements View.OnClickListener {

    Button search_button;
    EditText search_url;
    Button facebook_btn;
    Button yahoo_btn;
    Button google_btn;
    Button linkedin_btn;
    Button gmail_btn;
    Button youtube_btn;
    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ninth);
        search_button = (Button) findViewById(R.id.button_search_ninth);
        search_url = (EditText) findViewById(R.id.search_url_main);
        facebook_btn = (Button) findViewById(R.id.facebook);
        yahoo_btn = (Button) findViewById(R.id.yahoo);
        google_btn = (Button) findViewById(R.id.google);
        linkedin_btn = (Button) findViewById(R.id.linkedin);
        gmail_btn = (Button) findViewById(R.id.gmail);
        youtube_btn = (Button) findViewById(R.id.youtube);
        back_btn = (Button) findViewById(R.id.button_back_ninth);
        search_button.setOnClickListener(this);
        facebook_btn.setOnClickListener(this);
        yahoo_btn.setOnClickListener(this);
        google_btn.setOnClickListener(this);
        linkedin_btn.setOnClickListener(this);
        gmail_btn.setOnClickListener(this);
        youtube_btn.setOnClickListener(this);
        back_btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == search_button) {
            openWebSite();
        }

        if (view == facebook_btn) {
            Intent facebookWeb = new Intent(Ninth.this, SearchWebActivity.class);
            facebookWeb.putExtra("url_address", "https://www.facebook.com");
            startActivity(facebookWeb);
        }

        if (view == google_btn) {
            Intent googleWeb = new Intent(Ninth.this, SearchWebActivity.class);
            googleWeb.putExtra("url_address", "https://www.google.com");
            startActivity(googleWeb);
        }

        if (view == yahoo_btn) {
            Intent yahooWeb = new Intent(Ninth.this, SearchWebActivity.class);
            yahooWeb.putExtra("url_address", "https://www.yahoo.com");
            startActivity(yahooWeb);
        }

        if (view == youtube_btn) {
            Intent youtubeWeb = new Intent(Ninth.this, SearchWebActivity.class);
            youtubeWeb.putExtra("url_address", "https://www.youtube.com");
            startActivity(youtubeWeb);
        }

        if (view == linkedin_btn) {
            Intent linkedinWeb = new Intent(Ninth.this, SearchWebActivity.class);
            linkedinWeb.putExtra("url_address", "https://www.linkedin.com");
            startActivity(linkedinWeb);
        }

        if (view == gmail_btn) {
            Intent gmailWeb = new Intent(Ninth.this, SearchWebActivity.class);
            gmailWeb.putExtra("url_address", "https://www.gmail.com");
            startActivity(gmailWeb);
        }
        if(view == back_btn)
        {
            Intent i=new Intent(Ninth.this, Third.class);
            startActivity(i);
            //finish();
        }

    }

    private void openWebSite() {

        String Url_address = search_url.getText().toString();
        if (TextUtils.isEmpty(Url_address)) {
            Toast empty = Toast.makeText(Ninth.this, "Please enter url or search address", Toast.LENGTH_LONG);
            empty.show();
        } else {
            String url_without_http = Url_address.replaceAll("https://www.", "");
            String https = "https://";
            String www = "www.";
            Intent search = new Intent(Ninth.this, SearchWebActivity.class);
            search.putExtra("url_address", https + www + url_without_http);
            startActivity(search);
            search_url.setText("");
            search_url.requestFocus();

        }
    }

}

