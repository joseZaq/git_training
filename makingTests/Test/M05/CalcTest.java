package M05;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc=new Calc();
    @org.junit.jupiter.api.Test
    void suma() {
        assertEquals(4,calc.suma(2,2));
    }

    @org.junit.jupiter.api.Test
    void mult() {
        assertEquals(4,calc.mult(2,2));
    }

    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(1,calc.div(2,2));
    }

    @org.junit.jupiter.api.Test
    void res() {
        assertEquals(0,calc.res(2,2));
    }
}