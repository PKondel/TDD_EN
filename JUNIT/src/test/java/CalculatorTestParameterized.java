import junitparams.converters.Param;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTestParameterized {

    Calculator calculator;

    private int a;
    private int b;
    private int resSum;
    private int resSub;

    @Parameterized.Parameters(name="{index}:{0} and {1} = {2} or {3}")
    public static Iterable<? extends Object> parameters(){
        return Arrays.asList(new Object[][]{
                {1, 2, 3, -1}, {2, 3, 5, -1}, {3, 5, 7, -2}
        });
    }

    public CalculatorTestParameterized(int a, int b, int resSum, int resSub){
        this.a = a;
        this.b = b;
        this.resSum = resSum;
        this.resSub = resSub;
    }

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(resSum, calculator.add(a, b));
    }

    @Test
    public void testSubtraction(){
        assertEquals(resSub, calculator.subtract(a, b));
    }
}