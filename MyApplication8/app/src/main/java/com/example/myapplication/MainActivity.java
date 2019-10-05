package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {

    private WebView mWebView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView  mWebView= new WebView(getApplicationContext());
//        mWebView = (WebView) findViewById(R.id.mWebView);

        WebSettings webSettings = mWebView.getSettings();

        mWebView.getSettings().setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");


        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);

//        mWebView.loadUrl("javascript:test()");
//        mWebView.getSettings().setDomStorageEnabled(true);
//        mWebView.getSettings().setDatabaseEnabled(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.requestFocus();
        //点击超链接的时候重新在原来的进程上加载URL
        mWebView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });

//        mWebView.setWebViewClient(new WebViewClient());

        mWebView.loadUrl("file:///android_asset/1User.html");
        setContentView(mWebView);
        //测试远程的 mwebview.loadUrl("http://www.itxdl.cn");
    }
}
