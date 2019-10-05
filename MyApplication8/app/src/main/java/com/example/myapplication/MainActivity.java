package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {


    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.mWebView);


        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("javascript:test()");
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setDatabaseEnabled(true);

        mWebView.setWebViewClient(new WebViewClient());

        mWebView.loadUrl("file:///android_asset/1User.html");

        //测试远程的 mwebview.loadUrl("http://www.itxdl.cn");
    }
}
