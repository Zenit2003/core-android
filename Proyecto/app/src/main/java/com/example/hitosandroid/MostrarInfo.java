package com.example.hitosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarInfo extends AppCompatActivity {

    private TextView tvMostrarNombre;
    private TextView tvMostrarApellidos;
    private TextView tvMostrarNumero;
    private Usuario usuarioMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);

        tvMostrarNombre = findViewById(R.id.tv_mostrar_nombre);
        tvMostrarApellidos = findViewById(R.id.tv_mostrar_apellidos);
        tvMostrarNumero = findViewById(R.id.tv_mostrar_numero);

        Intent intent = getIntent();

        //Envio del usuario por activities
        usuarioMostrar = (Usuario) getIntent().getSerializableExtra("intent usuario");
        
        //Asignación de los campos de texto
        tvMostrarNombre.setText(usuarioMostrar.getNombre());
        tvMostrarApellidos.setText(usuarioMostrar.getApellidos());
        tvMostrarNumero.setText(usuarioMostrar.getNumero());



    }
}