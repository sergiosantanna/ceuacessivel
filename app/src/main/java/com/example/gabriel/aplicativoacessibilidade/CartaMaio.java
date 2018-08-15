package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CartaMaio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta_maio_norte);
    }

    public void cartaNorteAbril(View view){
        Intent it = new Intent(this, CartaMaioNorte.class);
        startActivity(it);
    }
    public void cartaSulAbril(View view){
        Intent it = new Intent(this, CartaMaioSul.class);
        startActivity(it);
    }

    public void cartaLesteAbril(View view){
        Intent it = new Intent(this, CartaMaioLeste.class);
        startActivity(it);
    }
    public void cartaOesteAbril(View view){
        Intent it = new Intent(this, CartaMaioOeste.class);
        startActivity(it);
    }

}
