package com.example.hitosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button boton;
    private EditText editTextNombre;
    private EditText editTextApellidos;
    private EditText editTextNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto_datos);

        boton = findViewById(R.id.boton_hito);

        editTextNombre = findViewById(R.id.edit_nombre);

        editTextApellidos = findViewById(R.id.edit_apellidos);

        editTextNumero = findViewById(R.id.edit_numero);

        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MostrarInfo.class);
                intent.putExtra("intent nombre", editTextNombre.getText().toString());
                intent.putExtra("intent apellidos", editTextApellidos.getText().toString());
                intent.putExtra("intent numero", editTextNumero.getText().toString());  //No sé si el que sean números afecta

                startActivity(intent);
            }
        });
    }
}