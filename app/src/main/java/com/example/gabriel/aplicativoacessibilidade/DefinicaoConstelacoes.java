package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DefinicaoConstelacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definicao_constelacoes);
    }
    public void voltarTela(View view){
        Intent it = new Intent(this, Main4Activity.class);
        startActivity(it);
    }

}
