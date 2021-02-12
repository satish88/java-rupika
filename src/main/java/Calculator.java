public class Calculator {
    public float calculation( char operation, float a, float b){

        if (operation == '+') {
            return (a + b);
        }

        if (operation == '-') {
            return (a - b);
        }

        if (operation == '*') {
            return (a * b);
        }

        if (operation == '/'){
            return (a / b);

        }
        else{
            System.out.println("Invalid Input");
            return(0);
        }
    }
}