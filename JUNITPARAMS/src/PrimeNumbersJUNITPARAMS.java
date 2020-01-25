import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumbersJUNITPARAMS {
    PrimeNumbers pnum;

    @Before
    public void setUp(){
        pnum=new PrimeNumbers();
    }

    @Test
    @Parameters({"1","2","3","4","5"})
    public void testIsPrime(int num){
        assertTrue(pnum.isPrime(num));
    }
}