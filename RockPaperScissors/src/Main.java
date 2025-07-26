import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerPick;
        String computerPick;
        boolean isPlaying = true;
        int keepPlaying;

        System.out.println("Rock Paper Scissors Game!");

        do {
            for (int i = 0; i < choices.length; i++) {
                System.out.println(i+1 + ". " + choices[i]);
            }

            System.out.print("Chose your pick: ");
            playerPick = scanner.nextLine();

            computerPick = choices[random.nextInt(0,3)];

            if (!playerPick.equalsIgnoreCase("rock") &&
                    !playerPick.equalsIgnoreCase("paper") &&
                    !playerPick.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid input");
            }

            if (playerPick.equals(computerPick)) {
                System.out.println("You and the computer choose: " + playerPick);
                System.out.println("That is a draw!");
            } else if (playerPick.equalsIgnoreCase("paper") && computerPick.equalsIgnoreCase("rock")){
                System.out.println("The computer choose: " + computerPick);
                System.out.println("You won!");
            } else if (playerPick.equalsIgnoreCase("rock") && computerPick.equalsIgnoreCase("scissors")) {
                System.out.println("The computer choose: " + computerPick);
                System.out.println("You won!");
            } else if (playerPick.equalsIgnoreCase("scissors") && computerPick.equalsIgnoreCase("paper")) {
                System.out.println("The computer choose: " + computerPick);
                System.out.println("You won!");
            } else if (playerPick.equalsIgnoreCase("rock") && computerPick.equalsIgnoreCase("paper")){
                System.out.println("The computer choose: " + computerPick);
                System.out.println("You lost!");
            } else if (playerPick.equalsIgnoreCase("paper") && computerPick.equalsIgnoreCase("scissors")) {
                System.out.println("The computer choose: " + computerPick);
                System.out.println("You lost!");
            } else if (playerPick.equalsIgnoreCase("scissors") && computerPick.equalsIgnoreCase("rock")) {
                System.out.println("The computer choose: " + computerPick);
                System.out.println("You lost!");
            }
            System.out.print("Keep playing yes or no (1-2)? ");
            keepPlaying = scanner.nextInt();
            scanner.nextLine();
            if (keepPlaying == 2) {
                isPlaying = false;
            }
        } while (isPlaying);





        scanner.close();
    }

}
