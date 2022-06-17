package com.example.tablamatematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pantalla4 extends AppCompatActivity {
    int valor4;
    int recepValor;
    TextView text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        valor4=1;
        text4 = (TextView) findViewById(R.id.txtval4);
        //Recepcion da vlores enviados desde el activity 1
        recepValor = getIntent().getIntExtra("llave3",0);
        //text4.setText(""+recepValor);
    }

    public void siEsta(View v){
        int valorEnvio4 = recepValor + valor4;
        Intent it4 = new Intent(this,Pantalla5.class);
        it4.putExtra("llave4",valorEnvio4);
        startActivity(it4);

    }

    public void noEsta(View v){
        Intent it = new Intent(this,Pantalla5.class);
        it.putExtra("llave4",recepValor);
        startActivity(it);
    }
}
