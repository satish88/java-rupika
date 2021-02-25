public class Factorial {
    //how to calculate n factorial where 20>= n>=1;
    public static Long calculate(int n){
        Long result = 1l;
        if(20 >= n && n >=1) {
            for (int counter = n; counter >= 1; counter = counter - 1) {
                result = result * counter;
            }
        }
        else if (n==0) {
            result = 1l;
        }
        else{
            System.out.println("Information not available.");
            System.out.println("Provide 1 to 20 number input!");
            result =(n)*1l;
        }
        return result;
    }

    public static void main(String[] args){
         Long result = calculate(20);
        System.out.println(result);

    }
}
