package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CartaMarcoNorte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta_marco_norte);
    }
    public void cartaLesteMarco(View view){
        Intent it = new Intent(this, CartaMarcoLeste.class);
        startActivity(it);
    }
    public void cartaOesteMarco(View view){
        Intent it = new Intent(this, CartaMarcoOeste.class);
        startActivity(it);
    }


}
