public class Satish1 {
    // how to handle BC and AD along with year inputs

    // 320 BC ---> -320
    //

    // it will take 2 arguments
    // first argument will be numerical value -- which year
    // 2nd argument will be string value and it can only be either BC or AD
    public void method1(int year, String bcOrAD) {

        if (bcOrAD == "BC") {
            year = year * -1;
        }
        else if (bcOrAD == "AD") {
            year = year;
        }
        else {
            System.out.println("ERROR: Invalid unit of year");
            return;
        }
        System.out.println("Input year is:" + year);
    }


}
