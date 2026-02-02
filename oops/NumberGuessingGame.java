import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToGuess = (int)(System.currentTimeMillis() % 100) + 1; // no Random package
        int attempts = 0, maxAttempts = 10;

        System.out.println("Guess a number between 1 and 100:");

        while (attempts < maxAttempts) {
            int guess = sc.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too High");
            } else if (guess < numberToGuess) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct! You won in " + attempts + " attempts.");
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, attempts over! Number was " + numberToGuess);
        }
        sc.close();
    }
}
