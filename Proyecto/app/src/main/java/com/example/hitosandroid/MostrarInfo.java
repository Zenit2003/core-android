package com.example.hitosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarInfo extends AppCompatActivity {

    private TextView tvMostrarNombre;
    private TextView tvMostrarApellidos;
    private TextView tvMostrarNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);

        tvMostrarNombre = findViewById(R.id.tv_mostrar_nombre);
        tvMostrarApellidos = findViewById(R.id.tv_mostrar_apellidos);
        tvMostrarNumero = findViewById(R.id.tv_mostrar_numero);

        Intent intent = getIntent();

        tvMostrarNombre.setText(intent.getStringExtra("intent nombre"));
        tvMostrarApellidos.setText(intent.getStringExtra("intent apellidos"));
        tvMostrarNumero.setText(intent.getStringExtra("intent numero"));
        

    }
}