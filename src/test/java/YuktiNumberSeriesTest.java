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


    //test for getting option b/w multiply and sum
    @Test
    public void positiveInputForMultiplication() {
        NumberSeries test = new NumberSeries();
        long product = NumberSeries.calculateForSeries(15, "multiply");
        Assert.assertEquals(product, 1307674368000L, "Multiply the series till 15.");
    }

    @Test
    public void negativeInputForMultiply() {
        NumberSeries test = new NumberSeries();
        long product1 = NumberSeries.calculateForSeries(-20, "multiply");
        Assert.assertEquals(product1, 2432902008176640000l, "Multiply the series till -20");
    }

    @Test
    public void multiplyWithZeroInput() {
        NumberSeries test = new NumberSeries();
        int product2 = NumberSeries.calculateForSeries(0, "multiply");
        Assert.assertEquals(product2, 0, "When you multiply any number with 0 what is the result?");
    }

    @Test
    public void sumOfPositiveInteger() {
        NumberSeries test = new NumberSeries();
        int sum = NumberSeries.calculateForSeries(20, "sum");
        Assert.assertEquals(sum, 210);
    }

    @Test
    public void sumOfNegativeInput() {
        NumberSeries test = new NumberSeries();
        int sum1 = NumberSeries.calculateForSeries(-10, "sum");
        Assert.assertEquals(sum1, -54);
    }

    @Test
    public void sumOfZeroInput() {
        NumberSeries test = new NumberSeries();
        int sum2 = NumberSeries.calculateForSeries(0, "sum");
        Assert.assertEquals(sum2, 1);
    }
}
