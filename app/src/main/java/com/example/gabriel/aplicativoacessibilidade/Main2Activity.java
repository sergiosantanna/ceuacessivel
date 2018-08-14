package com.example.gabriel.aplicativoacessibilidade;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void proximaTela9(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
    public void telaABC(View view){
        Intent it = new Intent(this, ABC.class);
        startActivity(it);
    }
    public void telaDEF(View view){
        Intent it = new Intent(this, DEF.class);
        startActivity(it);
    }
    public void telaGHI(View view){
        Intent it = new Intent(this, GHI.class);
        startActivity(it);
    } public void telaJKL(View view){
        Intent it = new Intent(this, JKL.class);
        startActivity(it);
    } public void telaMNO(View view){
        Intent it = new Intent(this, MNO.class);
        startActivity(it);
    } public void telaPQR(View view){
        Intent it = new Intent(this, PQR.class);
        startActivity(it);
    } public void telaST(View view){
        Intent it = new Intent(this, ST.class);
        startActivity(it);
    } public void telaUV(View view){
        Intent it = new Intent(this, UV.class);
        startActivity(it);
    } public void telaWX(View view){
        Intent it = new Intent(this, WX.class);
        startActivity(it);
    } public void telaYZ(View view){
        Intent it = new Intent(this, YZ.class);
        startActivity(it);
    }
}
