import org.testng.Assert;
import org.testng.annotations.Test;

public class YuktiNumberSeriesTest {

    //test with both positive inputs/numbers
    @Test
    public void calculateBothPositiveInputs() {
        NumberSeries test1 = new NumberSeries();
        int totalSum1 = test1.sum(16, 45);
        Assert.assertEquals(totalSum1, 435);
    }

    //test with both negative inputs/numbers
    @Test
    public void calculateBothNegativeInputs() {
        NumberSeries test2 = new NumberSeries();
        int totalSum2 = test2.sum(-19, -9);
        Assert.assertEquals(totalSum2, -64);
    }

    //Test with One positive and one negative input/numbers
    @Test
    public void calculateOnePositiveAndOneNegativeInput() {
        NumberSeries test3 = new NumberSeries();
        int totalSum3 = test3.sum(-99, 98);
        Assert.assertEquals(totalSum3, -99);
    }
}
