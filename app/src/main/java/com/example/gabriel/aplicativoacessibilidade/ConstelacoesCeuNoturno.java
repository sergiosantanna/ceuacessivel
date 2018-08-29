package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ConstelacoesCeuNoturno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constelacoes_ceu_noturno);
    }
    public void voltarTela(View view){
        Intent it = new Intent(this, Main4Activity.class);
        startActivity(it);
    }

}
