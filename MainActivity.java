package com.moj.nestedscrollwebview_master;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
	NestedScrollWebView mNestedScrollWebView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mNestedScrollWebView = (NestedScrollWebView) findViewById(R.id.webview);
		mNestedScrollWebView.getSettings().setJavaScriptEnabled(true);
		mNestedScrollWebView.setWebViewClient(new WebViewClient(){
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});
		mNestedScrollWebView.loadUrl("http://blog.csdn.net/m5314/article/details/68943869");
	}
}
