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
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto_hito);

        boton = findViewById(R.id.boton_hito);

        editText = findViewById(R.id.edit_hito);

        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText("Funciona");
                Intent intent = new Intent (MainActivity.this, MostrarInfo.class);
                intent.putExtra("intent text", editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}