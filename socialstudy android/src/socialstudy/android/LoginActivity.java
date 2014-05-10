package socialstudy.android;

import org.apache.cordova.*;

import android.os.Bundle;
import android.webkit.WebView;

public class LoginActivity extends CordovaActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 
		 setContentView(R.layout.login);
		 CordovaWebView wv = (CordovaWebView) findViewById(R.id.mainView);
		 wv.getSettings().setUserAgentString("mobileSocialStudy");
//		 wv.loadUrl("https://studisocial.appspot.com/");
		 wv.loadUrl("http://socialstudy-oneiros.rhcloud.com/StudiSocial-war/");
//		 wv.loadUrl("file:///android_asset/www/index.html");
		 
//	        super.init();
	         //Set by <content src="index.html" /> in config.xml
	        //super.loadUrl(Config.getStartUrl());
	        
//	        super.loadUrl("https://studisocial.appspot.com/");

		
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.login, menu);
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// Handle action bar item clicks here. The action bar will
//		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
//
//	/**
//	 * A placeholder fragment containing a simple view.
//	 */
//	public static class PlaceholderFragment extends Fragment {
//
//		public PlaceholderFragment() {
//		}
//
//		@Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//			View rootView = inflater.inflate(R.layout.fragment_login,
//					container, false);
//			return rootView;
//		}
//	}

}
