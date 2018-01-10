package com.example.rayan.habitatforhumanityandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        setTitle("Habitat for Humanity");

        Bundle extras = getIntent().getExtras();
        String website;

        if (extras != null) {
            website = extras.getString("website");
        } else {
            website = "habitatskc.org";
        }

        WebView wv = (WebView) findViewById(R.id.webView);

        wv.setWebViewClient(new MyBrowser());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setSupportZoom(true);
        wv.loadUrl(website);
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
