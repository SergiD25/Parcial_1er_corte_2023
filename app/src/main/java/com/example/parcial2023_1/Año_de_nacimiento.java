package com.example.parcial2023_1;

public class Año_de_nacimiento {
    public int Año_de_nacimiento (int año_actual, int valor){
        if (valor == 0)
        {
            return año_actual;
        }else {
            return Año_de_nacimiento(año_actual - 1, valor - 1);
        }
    }
}
