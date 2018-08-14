package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SatelitesNaturais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satelites_naturais);
    }
    public  void voltarTela3(View view){
        Intent it = new Intent(this, Main3Activity.class);
        startActivity(it);
    }
    public void definicaoSatelites(View view){
        Intent it = new Intent(this, DefinicaoSatelites.class);
        startActivity(it);
    }
    public void satelitesNaturais(View view){
        Intent it = new Intent(this, Lua.class);
        startActivity(it);
    }
}
