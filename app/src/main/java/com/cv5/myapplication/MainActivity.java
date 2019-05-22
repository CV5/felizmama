package com.cv5.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombreMama;
    TextView mensajeAMama;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombreMama   = findViewById(R.id.nombreMama);
        mensajeAMama = findViewById(R.id.mensajeAMama);
        imageView    = findViewById(R.id.foto);

//        Por ser la Reina de su familia, aunque no se lo mostremos.
    }

    public void Abrir(View view) {
        mensajeAMama.setText(nombreMama.getText()+" por ser la Reina de su familia, aunque no se lo mostremos.");
        imageView.setImageResource(R.drawable.felicidadesmama);
    }



}
