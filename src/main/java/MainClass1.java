public class MainClass1 {
    // args[0] = what type of input is this
    // args[1]  = what type of output
    // args[2] = input value
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        if (args[0].equals("mm") && args[1].equals("cm")) {
            // use mm to cm converter
            int i = Integer.parseInt(args[2]);
            float result = i / 10.0f;
            System.out.println(result);
        }
        else if (args[0].equals("cm") && args[1].equals("mm")) {
            // use mm to cm converter
            int i = Integer.parseInt(args[2]);
            float result = i * 10.0f;
            System.out.println(result);
        }



    }



    // method definition
    public static void abc() {
        System.out.println("I am a method");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // <verb> is a method whose return type is <> and it takes no arguments
    // or it takes argument 1 of type <>, argument 2 of type<>,.....





}




// basic statements
// what are the variables
// if else condition
// loop: while loop, for loop, do while
// switch case statement
// methods
// classes



