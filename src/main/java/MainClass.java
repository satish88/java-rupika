public class MainClass {
    public static void main(String[] args){
         int result;
         String result1;
         float result2;


        //Calculator;
        Calculator operation = new Calculator();
        result2 = operation.calculation('-',0.5f, 2.5f);
        System.out.println(result2);


        //FarmAnimal sound;
        FarmAnimal animal = new FarmAnimal();
        result1 = animal.Sounds("horse");
        System.out.println(result1);

        //Days in Month or Year;
        MonthYear calculate = new MonthYear();
        result = calculate.calculateDaysInMonth("February");
        System.out.println(result + " days");

        result = calculate.calculateDaysInYear(2010);
        System.out.println(result + " days");

        // Marriage eligibility check on gender & age basis;
        Marriage marriage = new Marriage();
        result1 = marriage.eligibility("male", 45 );
        System.out.println(result1);


        //Traffic Signal directions;
        TrafficSignal signal = new TrafficSignal();
        result1 = signal.direction("green");
        System.out.println(result1);


        //National symbols of India;
        NationalSymbol symbol = new NationalSymbol();
        result1 = symbol.indianSymbol("fruit");
        System.out.println(result1);


        // Interest Calculation;
        Interest simpleInterest = new Interest();
        result2 = simpleInterest.calculateSimpleInterest(400, 4, "halfYearly", 2, "year");
        System.out.println(result2);

    }
}
