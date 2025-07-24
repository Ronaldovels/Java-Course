import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int numOfDice;
        int total = 0;

        System.out.print("Enter de # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {

            for (int i = 0; i < numOfDice; i++) {

                int roll = random.nextInt(1, 7);
                System.out.println("You rolled: " + roll);
                asciDie(roll);
                System.out.println("--------------------");
                total += roll;
            }
            System.out.println(total);
        } else {
            System.out.println("# of dice must be greater than 0!");
        }

    }

    static void asciDie(int roll) {
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
               """;
        String dice2 = """
                -------
               |     ● |
               |       |
               | ●     |
                -------
               """;
        String dice3 = """
                -------
               |     ● |
               |   ●   |
               | ●     |
                -------
               """;
        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
               """;
        String dice5 = """
                -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
               """;
        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
               """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");

        }

    }

}
