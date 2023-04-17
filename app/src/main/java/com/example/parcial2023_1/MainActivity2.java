package com.example.parcial2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parcial2023_1.db.DbAmigo;
import com.example.parcial2023_1.db.DbHelper;

public class MainActivity2 extends AppCompatActivity {

    Button guardar , crearBD;
    EditText nombre,edad,ciudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        nombre = findViewById(R.id.nombre);
        edad = findViewById(R.id.edad);
        ciudad = findViewById(R.id.ciudad);


        guardar = findViewById(R.id.registrar);

        crearBD = findViewById(R.id.crearbd);
        crearBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper dbHelper = new DbHelper(MainActivity2.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if (db != null )
                {
                    Toast.makeText(MainActivity2.this, "Dase de datos creada", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity2.this, "Error en la creacion", Toast.LENGTH_SHORT).show();
                }
            }

        });


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbAmigo dbAmigos = new DbAmigo(MainActivity2.this);
                long id = dbAmigos.insertarAmigo(nombre.getText().toString(),edad.getText().toString(),ciudad.getText().toString());

                if (id >  0){
                    Toast.makeText(MainActivity2.this, "Registro guardado", Toast.LENGTH_SHORT).show();
                    limpiar();
                }else{
                    Toast.makeText(MainActivity2.this, "No se guardo el registro", Toast.LENGTH_SHORT).show();
                    limpiar();
                }
            }
        });

    }


    private void limpiar() {
        nombre.setText("");
        ciudad.setText("");
        edad.setText("");
    }

}


