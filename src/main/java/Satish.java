public class Satish {
    // First input is an int
    // 2nd input is a flot
    // 3rd is a String
    public static void main(String[] args) {
        // input validate
        if (args.length < 3) {
            System.out.println("Invalid input, you need to pass 3 arguments");
            System.out.println("Invalid input, you passed only " + args.length + " arguments");
            System.out.println("Syntax: <int> <float> <String>");
            return;
        }
        Integer input;
        try {
            input = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex) {
            System.out.println("You didn't provide first input as Integer");
            System.out.println("Syntax: <int> <float> <String>");
            return;
        }

//        Integer input = Integer.parseInt(args[0]);
        Float interestRate = Float.parseFloat(args[1]);
        String name = args[2];




        int a = input + 1;
        float b = interestRate + 1.0f;
        String c = "Mr. " + name;
        System.out.println("Output: " + a + " interestRate: " + b + " name: " + c);
    }
}
