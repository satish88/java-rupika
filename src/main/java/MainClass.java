public class MainClass {
    public static void main(String[] args){

        Mathematics operation = new Mathematics();
        int result = operation.addition(8, 9);
        System.out.println(result);

        result = operation.substraction(18, 7);
        System.out.println(result);


        result = operation.multiplication(45, 2);
        System.out.println(result);

        result = operation.division(64, 7);
        System.out.println(result);


        FarmAnimal animal = new FarmAnimal();
        String result1 = animal.Sounds("Cow");
        System.out.println(result1);

    }
}
