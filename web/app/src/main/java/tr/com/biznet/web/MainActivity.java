package tr.com.biznet.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webViewVektorel = (WebView) findViewById(R.id.webViewVBiznet);
        webViewVektorel.loadUrl("http://www.biznet.com.tr/");
        webViewVektorel.setWebViewClient(new WebViewClient());
        webViewVektorel.getSettings().setJavaScriptEnabled(true);
    }
}
