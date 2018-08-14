package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void proximaTela5(View view){
        Intent it = new Intent(this, ObjetosCeuProfundo.class);
        startActivity(it);
    }
    public void proximaTela6(View view){
        Intent it = new Intent(this, Constelacoes.class);
        startActivity(it);
    }
    public void proximaTela7(View view){
        Intent it = new Intent(this, Planetas.class);
        startActivity(it);
    }
    public void proximaTela8(View view){
        Intent it = new Intent(this, SatelitesNaturais.class);
        startActivity(it);
    }
    public void proximaTela10(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

}
