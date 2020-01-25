import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTestJUnitParams {

    Calculator calc;

    @Before
    public void setUp () {calc=new Calculator();
    }

    @Test
    @Parameters({"1,1,2","2,3,5","3,4,7"})
    public void testAdd(int a, int b, int wyn){
        assertEquals(wyn, calc.add(a,b));
    }

    @Test
    @Parameters({"2,1,1","5,3,2","7,4,3"})
    public void testSubtract(int a, int b, int wyn){
        assertEquals(wyn, calc.subtract(a,b));
    }

    @Test
    @Parameters({"2,1,2","5,3,15","7,4,28"})
    public void testMultiply(int a, int b, int wyn){
        assertEquals(wyn, calc.multiply(a,b));
    }

    @Test
    @Parameters({"2,1,2","5,3,1.66","7,3,2.33"})
    public void testDivide(int a, int b, double wyn){
        assertEquals(wyn, calc.divide(a,b),0.01);
    }

    @Test
    @Parameters({"2,0.5","5,0.2","9,0.14"})
    public void testInverse(int a, double wyn){
        assertEquals(wyn, calc.inverse(a),0.01);
    }
}