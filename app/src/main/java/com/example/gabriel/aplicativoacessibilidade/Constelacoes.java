package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Constelacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constelacoes);
    }
    public void proximaTela12(View view){
        Intent it = new Intent(this, Main4Activity.class);
        startActivity(it);
    }
    public void definicaoConstelacoes(View view){
        Intent it = new Intent(this, DefinicaoConstelacoes.class);
        startActivity(it);
    }
    public void constelacoesOutono(View view){
        Intent it = new Intent(this, ConstelacoesOutono.class);
        startActivity(it);
    }
}
