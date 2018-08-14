package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.VideoView;

public class SobreGaturamo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_gaturamo);

        WebView wv = (WebView) findViewById(R.id.webView2);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("http://astro.ufes.br/goa");


    }
    public void proximaTela(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
