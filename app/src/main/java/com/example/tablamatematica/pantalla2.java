package com.example.tablamatematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {
    int valor2;
    TextView valorModificar;
    int recepValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        valor2 = 2;//primer numero de la matriz de botones
        valorModificar = (TextView) findViewById(R.id.txtval2);

        //Recepcion da vlores enviados desde el activity 1
        recepValor = getIntent().getIntExtra("llave1",0);
        //valorModificar.setText(""+recepValor);

    }
    public void siEsta(View v){
        int valorEnvio2 = recepValor + valor2;
        Intent it2 = new Intent(this,Pantalla3.class);
        it2.putExtra("llave2",valorEnvio2);
        startActivity(it2);

    }

    public void noEsta(View v){

        Intent it = new Intent(this,Pantalla3.class);
        it.putExtra("llave2",recepValor);
        startActivity(it);
    }
}
