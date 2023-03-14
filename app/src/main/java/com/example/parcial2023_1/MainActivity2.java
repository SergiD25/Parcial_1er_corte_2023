package com.example.parcial2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.parcial2023_1.db.DbAmigo;

public class MainActivity2 extends AppCompatActivity {

    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        guardar = findViewById(R.id.registrar)


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbAmigo dbCarros = new DbAmigo(MainActivity2.this);
                long id = dbCarros.insertarAmigo(nombre.getText().toString(),edad.getText().toString(),ciudad.getText().toString());

                if (id >  0){
                    Toast.makeText(MainActivity2.this, "Registro guardado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity2.this, "No se guardo el registro", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void limpiar() {
        placa.setText("");
        color.setText("");
        modelo.setText("");
    }
    }
}