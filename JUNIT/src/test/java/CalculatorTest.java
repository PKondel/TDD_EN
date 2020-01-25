import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        //assertEquals dwuargumentowy dla typu całkowitego zwracanego z metody np. int, long
        //(bez delta oznaczajacej dopuszczalny błąd)
        assertEquals(7,calc.add(3,4));
    }

    @Test
    public void testSubtract() {
        assertEquals(7,calc.subtract(10,3));
    }

    @Test
    public void testMultiply() {
        assertEquals(70,calc.multiply(10,7));
    }

    @Test
    public void testDivide() {
        //assertEquals jest trzyargumentowy, poniewaz musimy okreslic dopuszczalny błąd
        //stosowany dla typow zmiennoprzecinkowych np. float, double
        //float - typ zmiennoprzecinkowy pojedynczej precyzji (32)
        //double - typ zmiennoprzecinkowy podwojnej precyzji (64)
        assertEquals(3.1,calc.divide(22,7),0.1);
        assertEquals(2.0,calc.divide(14,7),0.01);

    }

    @Test
    public void testInverse() {
        assertEquals(0.5,calc.inverse(3.0),0.0001);
        assertEquals(0.125,calc.inverse(8.0),0.000000001);
    }

    @Test
    public void testPower(){
        assertEquals(1024, calc.power(2.0,10.0), 0.1);
    }

}