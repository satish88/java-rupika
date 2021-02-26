public class PrimeNumber {

    public static String calculatePrimeNumber(int n) {
        String result = "Prime Number";

        if (n <= 1) {
            result = "Not Prime Number";
        }
        else if (n == 2) {
            result = "Prime number";
        }
        else if (n > 2) {
            for (int counter = 2; counter < n ; counter = counter + 1) {
                int x = n % counter;
                if (x == 0) {
                    result =  "Not Prime number";
                    return result;
                }
            }
        }
            return (result);

    }
        public static void main (String[]args){
            String result = calculatePrimeNumber(1);
            System.out.println(result);

        }

}