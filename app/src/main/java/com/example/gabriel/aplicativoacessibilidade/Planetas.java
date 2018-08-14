package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Planetas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetas);
    }
    public void proximaTela12(View view){
        Intent it = new Intent(this, Main4Activity.class);
        startActivity(it);
    }
    public void proximaTelaDescricao(View view){
        Intent it = new Intent(this, Definicao.class);
        startActivity(it);
    }
    public void proximaTelaPlanetasSistemaSolar(View view){
        Intent it = new Intent(this, PlanetasSistemaSolar.class);
        startActivity(it);
    }
    public void proximaTelaAudiodescricaoPlanetas(View view){
        Intent it = new Intent(this, AudiodescricaoPlanetas.class);
        startActivity(it);
    }
}
