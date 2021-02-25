import org.testng.Assert;
import org.testng.annotations.Test;

public class YuktiFactorialTest {

    // Test 1 is for positive number of integer.
    @Test
    public void calculateFactorialOfPositiveInteger() {
        Factorial test1 = new Factorial();
        long result = test1.calculate(3);
        Assert.assertEquals(result, 6l,"calculate 3!");
    }

    // Test 2 is for negative Integer.
    @Test
    public void calculateNegativeIntegerFactorial() {
        Factorial test2 = new Factorial();
        long result = test2.calculate(-56);
        Assert.assertEquals(result, -56l, "Provide positive number input!");
    }

    // Test 3 is for Zero factorial.
    @Test
    public void calculateZeroFactorial() {
        Factorial test3 = new Factorial();
        long result = test3.calculate(0);
        Assert.assertEquals(result, 1l, "zero factorial is always equals to 1.");
    }


}
