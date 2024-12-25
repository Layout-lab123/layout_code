package com.example.demo_of_all_layouts;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_webview);

        WebView webView = findViewById(R.id.webView);
        webView.loadUrl("https://www.google.co.in/");
    }
}

