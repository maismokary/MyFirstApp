import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int MAX_ATTEMPTS = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(MAX - MIN + 1) + MIN;
        int attempts = 0;
        boolean won = false;

        System.out.println("Guess the number between " + MIN + " and " + MAX);
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

        while (attempts < MAX_ATTEMPTS && !won) {
            System.out.print("Attempt " + (attempts + 1) + ": ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
                continue;
            }

            int guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            } else {
                won = true;
                System.out.println("Correct! You won in " + attempts + " attempts.");
            }
        }

        if (!won) {
            System.out.println("Game over. The number was " + secret);
        }

        scanner.close();
    }
}