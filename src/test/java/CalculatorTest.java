import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void testForIntInputsAddition(){
        Calculator operation = new Calculator();
        float addition = operation.calculation('+', 6,8);
        assertEquals(addition, 14, "addition of 6 and 8");
    }

    @Test
    public void testForFloatInputsAddition(){
        Calculator operation = new Calculator();
        float addition = operation.calculation('+', 6.2f,8.4f);
        assertEquals(addition, 14.6, "addition of 6.2 and 8.4");
    }

    @Test
    public void testForNegativeInputsAddition(){
        Calculator operation = new Calculator();
        float addition  =operation.calculation('+', -6,-8);
        assertEquals(addition, 14, "addition of -6 and -8");
    }


    @Test
    public void testForOneNegativeInputAddition(){
        Calculator operation = new Calculator();
        float addition = operation.calculation('+', 6,-8);
        assertEquals( addition , -2, "addition of 6 and -8");
    }

    @Test
    public void testForIntInputsSubtraction(){
        Calculator operation = new Calculator();
        float addition = operation.calculation('-', 16,5);
        assertEquals(addition, 11, "subtraction of 16 and 5");
    }

    @Test
    public void testForFloatInputsSubtraction(){
        Calculator operation = new Calculator();
        float subtraction = operation.calculation('-', 16.6f,5.2f);
        assertEquals(subtraction, 11.4, "subtraction of 16.6 and 5.2");
    }

    @Test
    public void testForSecondInputGreaterThanFirstInSubtraction(){
        Calculator operation = new Calculator();
        float subtraction = operation.calculation('-', 16,25);
        assertEquals(subtraction, -9, "subtraction of 16 and 25");
    }















































































}