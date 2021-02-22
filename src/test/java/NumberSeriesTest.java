import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberSeriesTest {
    @Test
    public void testForAddingPositiveIntegerSeries(){
        NumberSeries test = new NumberSeries();
        int result =test.sum(3,12);
        assertEquals(result, 45, "sum of multiples of 3 and 5 from 3 to 12");
    }

    @Test
    public void testForAddingNegativeIntegerSeries(){
        NumberSeries test = new NumberSeries();
        int result =test.sum(-3,-12);
        assertEquals(result, -45, "sum of multiples of 3 and 5 from -3 to -12");
    }

    @Test
    public void testForAddingPositiveIntegerToNegativeIntegerSeries(){
        NumberSeries test = new NumberSeries();
        int result =test.sum(3,-12);
        assertEquals(result, -42, "sum of multiples of 3 and 5 from 3 to -12");
    }

    @Test
    public void testForAddingNegativeIntegerToPositiveIntegerSeries(){
        NumberSeries test = new NumberSeries();
        int result =test.sum(-3,12);
        assertEquals(result, 42, "sum of multiples of 3 and 5 from -3 to 12");
    }
    @Test
    public void testForAddingSameIntegerSeries(){
        NumberSeries test = new NumberSeries();
        int result =test.sum(-6,-6);
        assertEquals(result, -6, "sum of multiples of 3 and 5 from -6 to -6");
    }
}