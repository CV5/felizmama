package com.cv5.solojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cantidad;
    TextView precioTotal;
    EditText nombreEt;
    TextView factura;
    String nombre;
    SeekBar seek_bar;
    CheckBox checkBox;
    int contador = 0;
    int precioTasa = 2;
    int total = 0;
    RatingBar ratingBar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        precioTotal = findViewById(R.id.precioTotal);
        cantidad = findViewById(R.id.cantidad);
        nombreEt = findViewById(R.id.nombreET);
        factura = findViewById(R.id.terminarOrdenTextView);
        checkBox = findViewById(R.id.checkbox);
        ratingBar = findViewById(R.id.rating_bar);
        seek_bar = findViewById(R.id.seek_bar);
      }

    public void ordenar(View view) {
        contador = contador + 1;
        cantidad.setText("" + contador);
        if (checkBox.isChecked()){
            precioTasa = 4;
        }else{
            precioTasa = 2;
        }
        total = total + precioTasa;
        precioTotal.setText("$" + total);
    }

    public void terminarOrde(View view) {


        nombre = nombreEt.getText().toString();
        factura.setText(nombre+" ordeno "+ contador + " tasa de cafe el monto a  pagar es $"+ total);
        float vote = seek_bar.getProgress();

        ratingBar.setRating(vote);
        ratingBar.setVisibility(View.VISIBLE);

    }
}
