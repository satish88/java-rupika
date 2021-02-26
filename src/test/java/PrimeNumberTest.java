import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrimeNumberTest {
    @Test
    public void testForCheckingTwoIsPrimeNumberOrNot(){
        PrimeNumber number= new PrimeNumber();
        String result = number. calculatePrimeNumber(2);
        assertEquals(result, "Prime number", "Is 2 a Prime Number?" );
    }
    @Test
    public void testForCheckingPrimeNumberGreaterThanTwo(){
        PrimeNumber number= new PrimeNumber();
        String result = number. calculatePrimeNumber(6);
        assertEquals(result, "Not Prime number", "Is 6 a Prime Number?" );
    }
    @Test
    public void testForCheckingPrimeNumberLessThanTwo(){
        PrimeNumber number= new PrimeNumber();
        String result = number. calculatePrimeNumber(1);
        assertEquals(result, "Not Prime number", "Is 1 a Prime Number?" );
    }

}