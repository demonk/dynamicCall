package cn.uc.gamesdk.layout;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ActivityLayout extends FrameLayout {

	//private CordovaWebView webview;
	private WebView webview;
	
	public ActivityLayout(Context context) {
		super(context);

		TextView textView = new TextView(context);
		textView.setText("I am from core.dex j");
		this.addView(textView);

		webview = new WebView(context);
		
		FrameLayout.LayoutParams parmas = new FrameLayout.LayoutParams(
				FrameLayout.LayoutParams.FILL_PARENT,
				FrameLayout.LayoutParams.FILL_PARENT);
		
		webview.loadUrl("file:///android_asset/www/index.html");
		
		this.addView(webview);
		
	}

}
