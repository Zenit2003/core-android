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

                Usuario usuario = new Usuario(editTextNombre.getText().toString(),
                        editTextApellidos.getText().toString(),editTextNumero.getText().toString());

                Intent intent = new Intent (MainActivity.this, MostrarInfo.class);

                Bundle bundle =new Bundle();
                bundle.putSerializable("usuario", usuario);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}