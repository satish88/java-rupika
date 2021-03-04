import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrimeNumberTest {
    @Test
    public void testForCheckingTwoIsPrimeNumberOrNot(){
        PrimeNumber number= new PrimeNumber();
        boolean result = number. checkPrimeNumber(2);
        assertEquals(result, true, "Is 2 a prime number");
    }
    @Test
    public void testForCheckingPrimeNumberGreaterThanTwo(){
        PrimeNumber number= new PrimeNumber();
        boolean result = number. checkPrimeNumber(7);
        assertEquals(result, true, "Is 7 a prime number");
    }
    @Test
    public void testForCheckingPrimeNumberLessThanTwo(){
        PrimeNumber number= new PrimeNumber();
        boolean result = number. checkPrimeNumber(1);
        assertEquals(result, false, "Is 1 a prime number");
    }

}