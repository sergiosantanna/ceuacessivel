package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CartaJunhoLeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta_junho_leste);
    }

    public void cartaNorteJunho(View view){
        Intent it = new Intent(this, CartaJunhoNorte.class);
        startActivity(it);
    }
    public void cartaSulJunho(View view){
        Intent it = new Intent(this, CartaJunhoSul.class);
        startActivity(it);
    }

    public void cartaLesteJunho(View view){
        Intent it = new Intent(this, CartaJunhoLeste.class);
        startActivity(it);
    }
    public void cartaOesteJunho(View view){
        Intent it = new Intent(this, CartaJunhoOeste.class);
        startActivity(it);
    }
}
