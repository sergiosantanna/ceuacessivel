package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ArtigosCientificos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artigos_cientificos);
    }
    public void telaInicial(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
