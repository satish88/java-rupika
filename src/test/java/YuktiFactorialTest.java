import org.testng.Assert;
import org.testng.annotations.Test;

public class YuktiFactorialTest {

    // Test 1 is for positive number of integer.
    @Test
    public void calculateFactorialOfPositiveInteger() {
        Factorial test1 = new Factorial();
        int result = test1.calculate(99);
        Assert.assertEquals(result, "result1 is too large.", "Calculate the 99!");
    }

    // Test 2 is for negative Integer.
    @Test
    public void calculateNegativeIntegerFactorial() {
        Factorial test2 = new Factorial();
        int result = test2.calculate(-56);
        Assert.assertEquals(result, -56, "Provide positive number input!");
    }

    // Test 3 is for Zero factorial.
    @Test
    public void calculateZeroFactorial() {
        Factorial test3 = new Factorial();
        int result = test3.calculate(0);
        Assert.assertEquals(result, 1, "zero factorial is always equals to 1.");
    }


}
