package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlanetasSistemaSolar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetas_sistema_solar);
    }
    public void telaAnterior(View view){
        Intent it = new Intent(this, Planetas.class);
        startActivity(it);
    }
    public void glossario1(View view){
        Intent it = new Intent(this, MNO.class);
        startActivity(it);
    }
    public void glossario2(View view){
        Intent it = new Intent(this, UV.class);
        startActivity(it);
    }
    public void glossario3(View view){
        Intent it = new Intent(this, MNO.class);
        startActivity(it);
    }
    public void glossario4(View view){
        Intent it = new Intent(this, JKL.class);
        startActivity(it);
    }
    public void glossario5(View view){
        Intent it = new Intent(this, ST.class);
        startActivity(it);
    }
}
