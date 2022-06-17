package com.example.tablamatematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pantalla5 extends AppCompatActivity {
    int valor5;
    int recepValor;
    TextView text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla5);

        valor5=16;
        text5 = (TextView) findViewById(R.id.txtval5);
        //Recepcion da vlores enviados desde el activity 1
        recepValor = getIntent().getIntExtra("llave4",0);
        //text5.setText(""+recepValor);

    }

    public void siEsta(View v){
        int valorEnvio5 = recepValor + valor5;
        Intent it5 = new Intent(this,Respuesta.class);
        it5.putExtra("llave5",valorEnvio5);
        startActivity(it5);

    }

    public void noEsta(View v){
        Intent it = new Intent(this,Respuesta.class);
        it.putExtra("llave5",recepValor);
        startActivity(it);
    }
}
