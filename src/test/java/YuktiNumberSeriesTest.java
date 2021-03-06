import org.testng.Assert;
import org.testng.annotations.Test;

public class YuktiNumberSeriesTest {

    @Test
    public void calculateBothPositiveInputs() {
        NumberSeries test1 = new NumberSeries();
        int totalSum1 = NumberSeries.sum(16, 45);
        Assert.assertEquals(totalSum1, 435);
    }

    @Test
    public void calculateBothNegativeInputs() {
        NumberSeries test2 = new NumberSeries();
        int totalSum2 = NumberSeries.sum(-19, -9);
        Assert.assertEquals(totalSum2, -64);
    }

    @Test
    public void calculateOnePositiveAndOneNegativeInput() {
        NumberSeries test3 = new NumberSeries();
        int totalSum3 = NumberSeries.sum(-99, 98);
        Assert.assertEquals(totalSum3, -99);
    }

    @Test
    public void resultOfPositiveInteger() {
        NumberSeries test = new NumberSeries();
        int total = NumberSeries.seriesSum(100);
        Assert.assertEquals(total, 5050);
    }

    @Test
    public void resultOfNegativeInteger() {
        NumberSeries test = new NumberSeries();
        int total1 = NumberSeries.seriesSum(-1);
        Assert.assertEquals(total1, 0);
    }

    @Test
    public void resultOfZeroInput() {
        NumberSeries test = new NumberSeries();
        int total2 = NumberSeries.seriesSum(0);
        Assert.assertEquals(total2, 1);
    }
}
