package com.example.tablamatematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pantalla3 extends AppCompatActivity {
    int valor3;
    int recepValor;
    TextView text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        valor3=4;
        text3 = (TextView) findViewById(R.id.txtval3);
        //Recepcion da vlores enviados desde el activity 1
        recepValor = getIntent().getIntExtra("llave2",0);
        //text3.setText(""+recepValor);
    }

    public void siEsta(View v){
        int valorEnvio3 = recepValor + valor3;
        Intent it3 = new Intent(this,Pantalla4.class);
        it3.putExtra("llave3",valorEnvio3);
        startActivity(it3);

    }

    public void noEsta(View v){
        Intent it = new Intent(this,Pantalla4.class);
        it.putExtra("llave3",recepValor);
        startActivity(it);
    }
}
