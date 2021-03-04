import org.testng.Assert;
import org.testng.annotations.Test;

public class YuktiPrimeNumber {

    @Test
    public void checkPrimeNumber() {
        PrimeNumber checker = new PrimeNumber();
        String result = checker.calculatePrimeNumber(18);
        Assert.assertEquals(result, "Not Prime number", "18 is a prime number or not.");
    }

    @Test
    public void resultOnNegativeInteger() {
        PrimeNumber checker1 = new PrimeNumber();
        String result1 = checker1.calculatePrimeNumber(-37);
        Assert.assertEquals(result1, "Not Prime number", "18 is a prime number or not.");
    }
}
