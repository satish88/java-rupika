import org.testng.annotations.Test;

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

}