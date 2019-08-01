package com.rizkasalma.myviewpager;


import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{
    private WebView webViewSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getIntent();



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
            webViewSaya.loadUrl("http://sarjanalidi.com/batiqu/");

            // set view
            setContentView(webViewSaya);


//        int image_movie = movieItem.getImageMovie();
//        String Title = movieItem.getTitle();
//        String Description = movieItem.getDescription();
//        String ReleaseDate = movieItem.getReleaseDate();
//        String Runtime = movieItem.getRuntime();
//        final String TrailerId = movieItem.getTrailerId();
//
//        final TextView TrailerButton = findViewById(R.id.buttonTrailer);
//        TrailerButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v="+TrailerId)));
//
//            }
//        });
//
//        ImageView imageMovie = findViewById(R.id.img_photo);
//        imageMovie.setImageResource(image_movie);
//
//        TextView titleMovie = findViewById(R.id.titleMovie);
//        titleMovie.setText(Title);
//
//        TextView desc = findViewById(R.id.description);
//        desc.setText(Description);
//
//        TextView time = findViewById(R.id.release_date);
//        time.setText(ReleaseDate);
//
//        TextView runtime = findViewById(R.id.runtime);
//        runtime.setText(Runtime);

//        WebView web = (WebView) findViewById(R.id.web_view);
//        web.loadUrl("http://3d1f8d88.ngrok.io/batiqu/batik1.php/");
//        web.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onClick(View v) {
    }
}
