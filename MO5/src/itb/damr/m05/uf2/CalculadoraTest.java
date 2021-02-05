package itb.damr.m05.uf2;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculadora=new Calculadora();

    @org.junit.jupiter.api.Test
    void suma() {
        assertEquals(10,calculadora.suma(5,5));
    }

    @org.junit.jupiter.api.Test
    void resta() {
        assertEquals(0,calculadora.suma(5,5));
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        assertEquals(10,calculadora.multiplication(5,2));
    }

    @org.junit.jupiter.api.Test
    void division() {
        assertEquals(2,calculadora.division(4,2));
    }
}