package com.example.tablamatematica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Respuesta extends AppCompatActivity {
    TextView respuesta;
    int recepValor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        respuesta = (TextView) findViewById(R.id.txtRespuesta);

        //Recepcion da vlores enviados desde el activity 3
        recepValor = getIntent().getIntExtra("llave3",0);
        respuesta.setText(""+recepValor);
    }
}
