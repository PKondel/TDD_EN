import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    PrimeNumbers pnum;

    @Before
    public void setUp(){
        pnum = new PrimeNumbers();
    }

    @Test
    public void shouldSay3IsPrimeNumber(){
        assertTrue(pnum.isPrime(3));
    }

    @Test
    public void shouldSay5IsPrimeNumber(){
        assertTrue(pnum.isPrime(5));
    }
}