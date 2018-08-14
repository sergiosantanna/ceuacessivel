package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DefinicaoNebulosas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definicao_nebulosas);
    }

    public void voltarObjetosCeuProfundo(View view){
        Intent it = new Intent(this, ObjetosCeuProfundo.class);
        startActivity(it);
    }
}
