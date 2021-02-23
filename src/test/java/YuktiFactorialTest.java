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
}
