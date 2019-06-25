package com.example.dell.multifunctionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SearchWebActivity extends AppCompatActivity {
     String url;
     private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_search_web);
        webView=(WebView)findViewById(R.id.webView);
        url = getIntent().getExtras().get("url_address").toString();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(this.url);
        webView.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
            return;
        }
        super.onBackPressed();
    }

}
