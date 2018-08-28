package com.example.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ComoUsarCarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_usar_cartas);
    }
    public void voltarTela(View view){
        Intent it = new Intent(this, Main3Activity.class);
        startActivity(it);
    }

}
