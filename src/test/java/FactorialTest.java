import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {
    @Test
    public void testForCalculatingFactorialOfPositiveNumbers() {
        Factorial factorial = new Factorial();
        long result = factorial.calculate(20);
        assertEquals(result, 2432902008176640000l, "value of 20!");
    }

    @Test
    public void testForCalculatingFactorialOfZero() {
        Factorial factorial = new Factorial();
        long result = factorial.calculate(0);
        assertEquals(result, 1l, "value of 0!");
    }

    @Test
    public void testForCalculatingFactorialOfNegativeNumbers() {
        Factorial factorial = new Factorial();
        long result = factorial.calculate(-2);
        assertEquals(result, -2l, "value of -2!");
    }
}