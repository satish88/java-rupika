import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

@Test
public class YuktiPrimeNumber {

    public void checkNegativeInputAsPrimeNumber() {
        PrimeNumber test = new PrimeNumber();
        boolean result = PrimeNumber.checkPrimeNumber(-7);
        assertEquals(result, false, "Is negative numbers are also prime.");
    }

    public void checkPositiveIntegerPrimeNumbers() {
        PrimeNumber test = new PrimeNumber();
        boolean result1 = PrimeNumber.checkPrimeNumber(997);
        assertEquals(result1, true, "997 is a prime number.");
    }

    public void printZeroNumbers() {
        PrimeNumber test = new PrimeNumber();
        List<Integer> print = PrimeNumber.generatePrimeNumber(0);
        List<Integer> expect = Arrays.asList(null);
        assertEquals(print, expect, "what is the prime numbers till 0.");
    }

    public void printPositivePrimeNumbers() {
        PrimeNumber test = new PrimeNumber();
        List<Integer> print1 = PrimeNumber.generatePrimeNumber(30);
        List<Integer> expectedNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        assertEquals(print1, expectedNumbers, "print prime numbers from 1 to 30.");
    }

}
