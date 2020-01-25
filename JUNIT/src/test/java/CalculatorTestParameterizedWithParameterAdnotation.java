import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTestParameterizedWithParameterAdnotation {

    Calculator calc;

    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int res;

    @Parameterized.Parameters(name="{index}:{0} and {1} = {2}")
    public static Iterable<? extends Object> parameters(){
        return Arrays.asList(new Object[][]{
                {1, 2, 3}, {2, 3, 5}, {10, 13, 23}
        });
    }

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void testAddition(){
        assertEquals(res, calc.add(a, b));
    }
}