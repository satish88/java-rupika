import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {
@Test
    public void testForCalculatingFactorialOfPositiveNumbers(){
    Factorial factorial = new Factorial();
    int result = factorial.calculate(3);
    assertEquals(result, 6, "value of 3!");
    }
    @Test
    public void testForCalculatingFactorialOfZero(){
        Factorial factorial = new Factorial();
        int result = factorial.calculate(0);
        assertEquals(result, 1, "value of 0!");
    }
    @Test
    public void testForCalculatingFactorialOfNegativeNumbers(){
        Factorial factorial = new Factorial();
        int result = factorial.calculate(-2);
        assertEquals(result, -2, "value of -2!");
    }
}