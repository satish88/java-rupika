public class PrimeNumber {
    //To check whether a number n is prime or not;
    public static boolean checkPrimeNumber(int n) {
        String result = "true";

        if (n <= 1) {
            result = "Not Prime number";
            return false;
        } else if (n == 2) {
            result = "Prime number";
            return true;
        } else if (n > 2) {
            for (int counter = 2; counter < n; counter = counter + 1) {
                int x = n % counter;
                if (x == 0) {
                    result = "Not Prime number";
                    return false;
                }
            }
        }
        return (true);
    }

    // To generate prime numbers from 1 to n.
    public static int generatePrimeNumber(int n) {
        int number = 2;
        if (n == 0 || n == 1) {
            System.out.println( " Provide input more than 1");
        }  else if (n >= 2) {
            number = 2;
            while (number <= n) {

                if (checkPrimeNumber(number)) {
                    System.out.println("prime number " + number);
                }
                number = number + 1;
            }
        }
        return number;
    }

    // number =4, 4<10, 4%2= 0   not prime
    public static void main(String[] args) {
        boolean result = checkPrimeNumber(5);
        System.out.println(result);

        int result1 = generatePrimeNumber(25);


    }

}