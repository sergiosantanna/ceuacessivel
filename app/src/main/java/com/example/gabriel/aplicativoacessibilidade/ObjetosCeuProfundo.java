package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ObjetosCeuProfundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos_ceu_profundo);
    }

    public void aglomeradosGlobulares(View view){
        Intent it = new Intent(this, Nebulosas.class);
        startActivity(it);
    }

    public void definicoesNebulosas(View view){
        Intent it = new Intent(this, DefinicaoNebulosas.class);
        startActivity(it);
    }

    public void voltarObjetosCeuProfundo(View view){
        Intent it = new Intent(this, Main4Activity.class);
        startActivity(it);
    }
}
