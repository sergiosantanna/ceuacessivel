package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConstelacoesOutono extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constelacoes_outono);
    }
    public void voltarTela2(View view){
        Intent it = new Intent(this, Constelacoes.class);
        startActivity(it);
    }
    public void telaGlossario(View view){
        Intent it = new Intent(this, MNO.class);
        startActivity(it);
    }
    public void telaGlossario2(View view){
        Intent it = new Intent(this, ABC.class);
        startActivity(it);
    }
    public void telaGlossario3(View view){
        Intent it = new Intent(this, ABC.class);
        startActivity(it);
    }public void telaGlossario4(View view){
        Intent it = new Intent(this, ABC.class);
        startActivity(it);
    }public void telaGlossario5(View view){
        Intent it = new Intent(this, UV.class);
        startActivity(it);
    }public void telaGlossario6(View view){
        Intent it = new Intent(this, ST.class);
        startActivity(it);
    }public void telaGlossario7(View view){
        Intent it = new Intent(this, GHI.class);
        startActivity(it);
    }public void telaGlossario8(View view){
        Intent it = new Intent(this, JKL.class);
        startActivity(it);
    }

}
