package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void voltarMenu(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
    public void comoUsar(View view){
        Intent it = new Intent(this, ComoUsarCarta.class);
        startActivity(it);
    }
    public void carta03(View view){
        Intent it = new Intent(this, CartaMarcoNorte.class);
        startActivity(it);
    }
    public void carta04(View view){
        Intent it = new Intent(this, CartaAbril.class);
        startActivity(it);
    }
    public void carta05(View view){
        Intent it = new Intent(this, CartaMaioNorte.class);
        startActivity(it);
    }
    public void carta06(View view){
        Intent it = new Intent(this, CartaJunhoNorte.class);
        startActivity(it);
    }

}
