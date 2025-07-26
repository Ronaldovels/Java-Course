import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        boolean isPlaying = true;
        int choice;

        while (isPlaying) {
            System.out.println("BLACKJACK GAME");
            System.out.print("Enter 1 to play or 2 to leave: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> playGame();
                case 2 -> {
                    int finalChoice;
                    System.out.println("Are you sure you want to quit? ");
                    System.out.print("1 to quit, 2 to keep playing: ");
                    finalChoice = scanner.nextInt();
                    System.out.println();
                    if (finalChoice == 1) {
                        System.out.println("Quitting...");
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

    static void playGame() {
        // PHASE 1: SETUP

        ArrayList<Integer> playerHand = new ArrayList<>();
        ArrayList<Integer> houseHand = new ArrayList<>();

        // PHASE 2: INITIAL DEAL
        // Deal two cards to each
        playerHand.add(random.nextInt(0, 14));
        houseHand.add(random.nextInt(0, 14));
        playerHand.add(random.nextInt(0, 14));
        houseHand.add(random.nextInt(0, 14));

        // PHASE 3: PLAYER'S TURN
        int playerTotal;
        while (true) { // Player's loop continues until they stand or bust
            System.out.println("\n--------------------");
            System.out.println("DEALER'S HAND:");
            printHand(houseHand, true); // For now, shows the whole hand

            System.out.println("\nYOUR HAND:");
            printHand(playerHand, false);

            playerTotal = calculateHandValue(playerHand);
            System.out.println("Your total: " + playerTotal);

            if (playerTotal > 21) {
                System.out.println("Bust! Your total is: " + playerTotal);
                break; // End of player's turn
            }

            System.out.print("\nHit (1) or Stand (2)? ");
            int hitChoice = scanner.nextInt();

            if (hitChoice == 1) {
                playerHand.add(random.nextInt(0, 14));
            } else {
                System.out.println("You stand with " + playerTotal);
                break;
            }
        }

        // PHASE 4: DEALER'S TURN
        int houseTotal = calculateHandValue(houseHand);

        if (playerTotal <= 21) {
            System.out.println("\n--- Dealer's Turn ---");
            while (houseTotal < 17) {
                System.out.println("The dealer hits...");
                houseHand.add(random.nextInt(0, 14));
                houseTotal = calculateHandValue(houseHand);
            }
            System.out.println("The dealer stands.");
        }

        // PHASE 5: FINAL RESULTS
        System.out.println("\n--- GAME OVER ---");
        System.out.println("Your final hand (" + playerTotal + "):");
        printHand(playerHand, false);
        System.out.println("\nDealer's final hand (" + houseTotal + "):");
        printHand(houseHand, false);
        System.out.println("--------------------");

        // Determine the winner
        if (playerTotal > 21) {
            System.out.println("Dealer wins! You busted.");
        } else if (houseTotal > 21) {
            System.out.println("You win! The dealer busted.");
        } else if (playerTotal > houseTotal) {
            System.out.println("You win!");
        } else if (houseTotal > playerTotal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("Push (Tie)!");
        }
        System.out.println("\n");
    }

    static int calculateHandValue(ArrayList<Integer> hand) {
        int total = 0;
        int aceCount = 0;
        for (int card : hand) {
            if (card == 0) { // Ace
                aceCount++;
                total += 11;
            } else if (card >= 10) {
                total += 10;
            } else {
                total += card; // For cards 1-9 (key 1 is value 1, etc.)
            }
        }
        // If total is over 21, change an Ace's value from 11 to 1
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }
        return total;
    }

    static String[] getCardArtLines(int card) {
        return switch (card) {
            case -1 -> new String[]{
                    " ------- ",
                    "|#######|",
                    "|#######|",
                    "|#######|",
                    "|#######|",
                    "|#######|",
                    " ------- "};
            case 0 -> new String[]{
                    " ------- ",
                    "|A      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      A|",
                    " ------- "};
            case 1 -> new String[]{
                    " ------- ",
                    "|1      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      1|",
                    " ------- "};
            case 2 -> new String[]{
                    " ------- ",
                    "|2      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      2|",
                    " ------- "};
            case 3 -> new String[]{
                    " ------- ",
                    "|3      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      3|",
                    " ------- "};
            case 4 -> new String[]{
                    " ------- ",
                    "|4      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      4|",
                    " ------- "};
            case 5 -> new String[]{
                    " ------- ",
                    "|5      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      5|",
                    " ------- "};
            case 6 -> new String[]{
                    " ------- ",
                    "|6      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      6|",
                    " ------- "};
            case 7 -> new String[]{
                    " ------- ",
                    "|7      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      7|",
                    " ------- "};
            case 8 -> new String[]{
                    " ------- ",
                    "|8      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      8|",
                    " ------- "};
            case 9 -> new String[]{
                    " ------- ",
                    "|9      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      9|",
                    " ------- "};
            case 10 -> new String[]{
                    " ------- ",
                    "|10     |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|     10|",
                    " ------- "};
            case 11 -> new String[]{
                    " ------- ",
                    "|K      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      K|",
                    " ------- "};
            case 12 -> new String[]{
                    " ------- ",
                    "|Q      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      Q|",
                    " ------- "};
            case 13 -> new String[]{
                    " ------- ",
                    "|J      |",
                    "|       |",
                    "|       |",
                    "|       |",
                    "|      J|",
                    " ------- "};
            default -> new String[]{
                    " ------- ",
                    "|???????|",
                    "|???????|",
                    "|???????|",
                    "|???????|",
                    "|???????|",
                    " ------- "};
        };
    }

    static void printHand(ArrayList<Integer> hand, boolean hideSecondCard) {
        if (hand == null || hand.isEmpty()) {
            System.out.println("[Empty hand]");
            return;
        }

        StringBuilder[] outputLines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            outputLines[i] = new StringBuilder();
        }

        for (int i = 0; i < hand.size(); i++) {
            String[] cardArt;

            if (hideSecondCard && i == 1) {
                cardArt = getCardArtLines(-1);
            } else {

                int cardValue = hand.get(i);
                cardArt = getCardArtLines(cardValue);
            }


            for (int j = 0; j < 7; j++) {
                outputLines[j].append(cardArt[j]).append("  ");
            }
        }

        for (StringBuilder line : outputLines) {
            System.out.println(line.toString());
        }
    }
}