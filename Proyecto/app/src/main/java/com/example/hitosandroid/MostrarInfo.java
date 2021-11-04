package com.example.hitosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarInfo extends AppCompatActivity {

    private TextView textoCopia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);

        textoCopia = findViewById(R.id.texto_copia);

        Intent intent = getIntent();

        textoCopia.setText(intent.getStringExtra("intent text"));
        

    }
}