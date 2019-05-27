package com.cv5.sopresa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nombreDeMama;
    TextView mensajeAMama;
    ImageView foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreDeMama = findViewById(R.id.nombre);
        mensajeAMama = findViewById(R.id.mensaje);
        foto         = findViewById(R.id.foto);




    }

    public void abrir(View view) {

        mensajeAMama.setText("Hola mami");

    }
}
