package com.example.tablamatematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int valor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=8;
    }


    public void siEsta(View v){
        Intent it = new Intent(this,pantalla2.class);
        it.putExtra("llave1",valor1);
        startActivity(it);

    }

    public void noEsta(View v){
        Intent it = new Intent(this,pantalla2.class);
        startActivity(it);
    }
}
