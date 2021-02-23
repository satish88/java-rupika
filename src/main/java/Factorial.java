public class Factorial {

    //how to calculate n factorial;
    public static int calculate(int n){
        int result = 1;
        if(n >=1){
           for( int counter = n; counter>=1; counter= counter -1){
            result = result * counter;
           }
        }
        else if (n==0) {
            result = 1;
        }
        else{
            System.out.println("Information not available.");
            System.out.println("Provide positive number input!");
            result = n;
        }
        return result;
    }

    public static void main(String[] args){
         int result = calculate(3);
        System.out.println(result);

    }
}
