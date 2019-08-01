package com.rizkasalma.myviewpager;

import android.annotation.TargetApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class CelanaActivity extends AppCompatActivity {
    private WebView webViewSaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaos);


        // panggil konstruktor
        webViewSaya = new WebView(this);

        // aktifkan javascript
        webViewSaya.getSettings().setJavaScriptEnabled(true);

        // atur klien
        webViewSaya.setWebViewClient(new WebViewClient() {
            @SuppressWarnings("deprecation")
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), description, Toast.LENGTH_SHORT).show();
            }
            @TargetApi(android.os.Build.VERSION_CODES.M)
            @Override
            public void onReceivedError(WebView view, WebResourceRequest req, WebResourceError rerr) {
                // Redirect to deprecated method, so you can use it in all SDK versions
                onReceivedError(view, rerr.getErrorCode(), rerr.getDescription().toString(), req.getUrl().toString());
            }
        });

        // isi url
        webViewSaya.loadUrl("http://sarjanalidi.com/batiqu/celana1.php");

        // set view
        setContentView(webViewSaya);
    }
}
