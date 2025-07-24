import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        boolean isPlaying = true;
        int choice;

        while (isPlaying) {
            System.out.println("BLACKJACK GAME");
            System.out.println();
            System.out.print("Enter 1 to play or 2 to leave: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> playGame();
                case 2 -> {
                            int finalChoice;
                            System.out.println("Are you sure you wanna quit? ");
                            System.out.print("1 to quit 2 to keep playing: ");
                            finalChoice = scanner.nextInt();
                            System.out.println();
                            if (finalChoice == 1) {
                                System.out.println("Quiting...");
                                isPlaying = false;
                            } else if (finalChoice == 2) {
                                playGame();
                            } else {
                                System.out.println("Invalid option!");
                            }
                            }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    static void playGame(){
        int[] houseHand = new int[10];
        int[] playerHand= new int[10];
        String[] cards = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J" };
        int hitChoice;
        boolean hit = false;

        for (int i = 0; i < 2; i++) {
            houseHand[i] = random.nextInt(0, 15);
            playerHand[i] = random.nextInt(0,  15);
        }



        System.out.println("HOUSE CARDS:");
        System.out.println(houseHand[0] + " | secret");
        System.out.println("Player Cards");
        System.out.println(playerHand[0] + " | " + playerHand[1]);
        System.out.println("\nDo you wanna hit or stop (1 - 2): ");
        hitChoice = scanner.nextInt();

        while (hitChoice == 1) {
            for (int i = 3; i < playerHand.length; i++) {
                playerHand[i] = random.nextInt(0,  15);
                for (int j = 0; j <= playerHand.length; j++) {
                    System.out.print(playerHand[j] + " | " );
                }
                System.out.println("Hit or stop (1-2):  ");
                hitChoice = scanner.nextInt();
                if (hitChoice == 2) { break; }
            }
        }



        scanner.close();


    }

    static void printCard() {

    }
}
