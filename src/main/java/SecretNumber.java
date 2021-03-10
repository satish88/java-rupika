import java.util.Scanner;

public class SecretNumber {
    public static boolean guessTheSecretNumber(int guess, int secretNumber){
        if (secretNumber > guess) {
            System.out.println("Sorry, Secret number is greater than your guess!");
        } else if (secretNumber < guess) {
            System.out.println("Sorry, Secret number is smaller than your guess!");
        }
        else if (secretNumber == guess) {
            System.out.println("Congratulations! Your guess is correct.");
            return true;
        }

     return false;
    }


    public static void main(String[]args){
        int secretNumber = (int) (Math.random() * 100);
        boolean result = false;
        while (!result) {
            Scanner guessNumber = new Scanner(System.in);
            System.out.println("Enter new guess:");
            int guess = guessNumber.nextInt();
            System.out.println("guess = " + guess);

            result = guessTheSecretNumber(guess, secretNumber);

        }
        System.out.println("success");
    }
}
