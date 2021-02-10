public class MainClass {
    public static void main(String[] args){

        //Mathematical Operations;
        Mathematics operation = new Mathematics();
        int result = operation.addition(8, 9);
        System.out.println(result);

        result = operation.substraction(18, 7);
        System.out.println(result);


        result = operation.multiplication(45, 2);
        System.out.println(result);

        result = operation.division(64, 7);
        System.out.println(result);

        //FarmAnimal sound;
        FarmAnimal animal = new FarmAnimal();
        String result1 = animal.Sounds("Horse");
        System.out.println(result1);

        //Days in Month or Year;
        MonthYear calculate = new MonthYear();
        result = calculate.calculateDaysInMonth("February");
        System.out.println(result + " Days");

        result = calculate.calculateDaysInYear(2010);
        System.out.println(result + " Days");

        // Marriage eligibility check on gender & age basis;
        Marriage marriage = new Marriage();
        result1 = marriage.maleEligibility(21);
        System.out.println(result1);

        result1 = marriage.femaleEligibility(18);
        System.out.println(result1);


        //Traffic Signal directions;
        TrafficSignal signal = new TrafficSignal();
        result1 = signal.direction("Yellow");
        System.out.println(result1);
    }
}
