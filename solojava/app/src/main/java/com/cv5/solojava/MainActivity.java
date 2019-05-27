package com.cv5.solojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cantidad;
    TextView precioTotal;
    EditText nombreEt;
    TextView factura;
    String nombre;
    int contador = 0;
    int precioTasa = 2;
    int total = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        precioTotal = findViewById(R.id.precioTotal);
        cantidad = findViewById(R.id.cantidad);
        nombreEt = findViewById(R.id.nombreET);
        factura = findViewById(R.id.terminarOrdenTextView);
      }

    public void ordenar(View view) {
        contador = contador + 1;
        cantidad.setText("" + contador);
        total = contador * precioTasa;
        precioTotal.setText("$" + total);
    }

    public void terminarOrde(View view) {


        nombre = nombreEt.getText().toString();
        factura.setText(nombre+" ordeno "+ contador + " tasa de cafe el monto a  pagar es $"+ total);


    }
}
