import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MonthYear {

    // signature of a method
    // name of the method
    // access modifier
    // return type
    // argument details
        // name and type of argument
        // ...

    public static int calculateDaysInMonth(String month){
        System.out.println("Make sure you provide first letter capital in Month name!");

        if (month=="January" || month== "March" || month== "May"||month== "July"|| month== "August" ||month== "October"||month== "December") {
            System.out.println(month + " has 31 days.");
            return (31);
        }
        else if (month== "February"){
            System.out.println("February has 28 or 29 days.");
            return (28);
        }


        else{
            System.out.println(month + " has 30 days.");
            return(30);

        }
    }


    public static boolean checkLeapYear(int yearName){
        if (yearName % 4 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static int calculateDaysInYear(int yearName){
        if (checkLeapYear(yearName)){
            return (366);
        }
        else{
            int result = 365;
            return (365);
        }
    }

    public static List<Integer> printLeapYears(int yearName, int numberOfYears){
        int n = numberOfYears;
        List<Integer> abc = new ArrayList();

        for (int counter = 0; counter <= (4 * n); counter = counter +1) {
            yearName = yearName + 1;
            if (checkLeapYear(yearName)) {
                // System.out.println("Leap Year = " + yearName);
                abc.add(yearName);
            }
        }
        return abc;
    }



    public static void main( String[] args){
        List<Integer> result = printLeapYears(2000, 20);
        //System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}


