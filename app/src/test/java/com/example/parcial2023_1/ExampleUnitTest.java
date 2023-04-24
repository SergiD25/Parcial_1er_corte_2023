package com.example.parcial2023_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test1() {
        Año_de_nacimiento calculadora = new Año_de_nacimiento();
        int prueba = calculadora.Año_de_nacimiento(2023,25);
        assertEquals(1998,prueba);

    }
}