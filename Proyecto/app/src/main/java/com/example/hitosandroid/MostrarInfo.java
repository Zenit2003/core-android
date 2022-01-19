package com.example.hitosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.nio.BufferUnderflowException;

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


        Bundle objetoEnviado = getIntent().getExtras();
        Usuario usuarioMostrar= null;

        if(objetoEnviado != null){
            usuarioMostrar = (Usuario) objetoEnviado.getSerializable("usuario");
            tvMostrarNombre.setText(usuarioMostrar.getNombre().toString());
            tvMostrarApellidos.setText(usuarioMostrar.getApellidos().toString());
            tvMostrarNumero.setText(usuarioMostrar.getNumero().toString());
        }

    }
}