package M05;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();
    @Test
    void testSuma() {
        assertEquals(2,calc.suma(1,1));
    }
    @Test
    void testResta() {
        assertEquals(2,calc.resta(3,1));
    }
    @Test
    void testMult() {
        assertEquals(6,calc.mult(3,2));
        assertEquals(6,calc.mult(-3,-2));
        assertEquals(-6,calc.mult(3,-2));
        assertEquals(-6,calc.mult(-3,2));
    }
    @Test
    void testDiv() {
        assertEquals(2,calc.div(8,4));
    }
}