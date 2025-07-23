import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(101);
        int userGuess;
        int count = 0;


        System.out.println("Number Guessing Game!");
        System.out.println("Guess a number between 1-100");
        System.out.print("Enter a guess: ");
        userGuess = scanner.nextInt();
        count++;

        while (userGuess != number) {
            if (userGuess > 100 || userGuess < 1) {
                System.out.println("Number out of range!");
                System.out.print("Enter a guess: ");
                userGuess = scanner.nextInt();
                count++;
            }
            else if (userGuess < number) {
                System.out.println("TOO LOW! Try again");
                System.out.print("Enter a guess: ");
                userGuess = scanner.nextInt();
                count++;

            } else if (userGuess > number) {
                System.out.println("TOO HIGH! Try again");
                System.out.print("Enter a guess: ");
                userGuess = scanner.nextInt();
                count++;
            }
        }

        if (userGuess == number) {
            System.out.println("\nCORRECT! YOU GUESSED IT!");
            System.out.printf("It took you %d tries to guess!", count);

        }

        scanner.close();
    }


}
