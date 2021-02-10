public class Mathematics {
    public int addition(int a, int b){
        int x = a + b;
        return(x);
    }

    public int substraction(int a, int b){
        if( a > b) {
            int x = a - b;
            return (x);
        }
        else{
            System.out.println("Invalid Input");
            System.out.println("Value of First number must be greater than Second number");
            return(0);
        }
    }

    public int multiplication(int a, int b){
        int x = a * b;
        return(x);
    }

    public int division(int a, int b){
        if(a > b){
            int x = a / b;
            return(x);
        }
        else{
            System.out.println("Invalid Input");
            System.out.println("Value of first number must be greater than second number");
            return(0);
        }
    }
}