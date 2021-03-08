import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

@Test
public class MonthYearTest {

    public void findTheDaysThoughMonth() {
        MonthYear month = new MonthYear();
        int days = MonthYear.calculateDaysInMonth("July");
        assertEquals(days, 31, "Days in july month");
    }

    public void checkNonDivisibleToFourYear() {
        MonthYear month = new MonthYear();
        boolean checkLeapYear = MonthYear.checkLeapYear(1990);
        assertEquals(checkLeapYear, false, "1990 is not a leap year.");
    }

    public void checkCenturyYear() {
        MonthYear month = new MonthYear();
        boolean checkCentury = MonthYear.checkLeapYear(1900);
        assertEquals(checkCentury, false, "1900 is not a leap year.");
    }

    public void daysInAYear() {
        MonthYear month = new MonthYear();
        int day = MonthYear.calculateDaysInYear(1997);
        assertEquals(day, 365, "1997 has 365 days.");
    }

    public void daysInACenturyYear() {
        MonthYear day = new MonthYear();
        int daysInAYear = MonthYear.calculateDaysInYear(2100);
        assertEquals(daysInAYear, 365, "Year 2100 will have 356 days.");
    }

    public void printLeapYears() {
        MonthYear Year = new MonthYear();
        List<Integer> years = MonthYear.printLeapYears(1895, 3);
        List<Integer> expectedYears = Arrays.asList(1896, 1904, 1908);
        assertEquals(years, expectedYears, "After 1895 print next three leap years.");
    }

}