package com.jd.quickChat;

import com.jd.chat.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ViewFeed extends Activity {
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.not);
	WebView w = (WebView) findViewById(R.id.webView1);
	w.loadUrl("http://192.168.1.5/androidchatter/viewfeed.php");

}
}
