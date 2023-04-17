package com.example.parcial2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button continuar;
    EditText usuario , contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.Usuario);
        contrasena = findViewById(R.id.Contrasena);
    }

    public void NuevoActivity(View view)
    {
        continuar = findViewById(R.id.Continuar);
        String nombreusuario = usuario.getText().toString();
        String contraseñaU = contrasena.getText().toString();
        Intent siguiente= new Intent(this,MainActivity2.class);
        Bundle usuario1 = new Bundle();
        Bundle contraseña = new Bundle();
        usuario1.putString("usuariokey",nombreusuario);
        contraseña.putString("contraseñakey",contraseñaU);
        siguiente.putExtras(usuario1);
        siguiente.putExtras(contraseña);
        

        Persona datos = new Persona();
       // datos.Persona();

        String us = "Sergio";     // datos de usuario
        String cna = "123hola";   // datos de la contrasena
        
        if ( us.equals(nombreusuario)  && cna.equals(contraseñaU)){
            startActivity(siguiente);



        }else  {
            Toast.makeText(MainActivity.this, "Datos de usuario incorrecto", Toast.LENGTH_SHORT).show();
            limpiar();
        }

    }

    private void limpiar() {
        usuario.setText("");
        contrasena.setText("");
    }


}