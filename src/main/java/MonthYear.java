public class MonthYear {

    public int calculateDaysInMonth(String month){
        System.out.println("Make sure you provide first letter capital in Month name!");

        if (month=="January" || month== "March" || month== "May"||month== "July"|| month== "August" ||month== "October"||month== "December") {
            int x = 31;
            System.out.println(month + " has 31 days.");
            return (x);
        }
        if (month== "February"){
            int y = 28;
            System.out.println("February has 28 or 29 days.");
            return (y);
        }


        else{
            int z = 30;
            System.out.println(month + " has 30 days.");
            return(z);

        }
    }


    public int calculateDaysInYear(int yearname){
        if (yearname % 4 == 0) {
            int x = 366;
            System.out.println(yearname +" has 366 Days. ");
            return (x);
        }
        else{
            int y = 365;
            System.out.println(yearname + " has 365 Days. ");
            return (y);
        }
    }

}


