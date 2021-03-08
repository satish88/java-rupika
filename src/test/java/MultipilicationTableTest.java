import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

@Test
public class MultipilicationTableTest {

    public void MultiplyWithZeroNumbers() {
        MultipilicationTable test = new MultipilicationTable();
        List<Integer> table = MultipilicationTable.table(5);
        List<Integer> expectedTable = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60);
        Assert.assertEquals(table, expectedTable);
    }

    public void MultiplyNegativeIntegers() {
        MultipilicationTable test = new MultipilicationTable();
        List<Integer> table = MultipilicationTable.table(-2);
        List<Integer> expectedTable = Arrays.asList(-2, -4, -6, -8, -10, -12, -14, -16, -18, -20, -22, -24);
        Assert.assertEquals(table, expectedTable);
    }

    public void MultiplyZeroInput() {
        MultipilicationTable test = new MultipilicationTable();
        List<Integer> table = MultipilicationTable.table(0);
        List<Integer> expectedTable = Arrays.asList(0);
        Assert.assertEquals(table, expectedTable);
    }
}