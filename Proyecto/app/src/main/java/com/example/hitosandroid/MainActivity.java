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
    private Usuario ultimoUsuario;
    private TextView msjUltimoUsiario;
    private TextView tvUltimoUsuario;
    private TinyDB tinyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tinyDB = new TinyDB(this);


        texto = findViewById(R.id.texto_datos);

        boton = findViewById(R.id.boton_hito);

        editTextNombre = findViewById(R.id.edit_nombre);

        editTextApellidos = findViewById(R.id.edit_apellidos);

        editTextNumero = findViewById(R.id.edit_numero);

        msjUltimoUsiario = findViewById(R.id.msj_ultimo_usuario);

        tvUltimoUsuario = findViewById(R.id.tv_ultimo_usuario);

        try {
            ultimoUsuario = (Usuario) tinyDB.getObject("lastUser", Usuario.class);
            msjUltimoUsiario.setText("Último usuario introducido:");
            tvUltimoUsuario.setText(ultimoUsuario.toString());
        }catch (Exception e){
            msjUltimoUsiario.setText("No se ha introducido ningún usuario");
            tvUltimoUsuario.setText("");
        }

        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Usuario usuario = new Usuario(editTextNombre.getText().toString(),
                        editTextApellidos.getText().toString(),editTextNumero.getText().toString());

                Intent intent = new Intent (MainActivity.this, MostrarInfo.class);

                Bundle bundle =new Bundle();
                bundle.putSerializable("usuario", usuario);

                tinyDB.putObject("lastUser", usuario);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}