import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String item;
        double price;
        int quantity;
        double total;
        char currency = '$';

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is: " + currency + total);

        scanner.close();
    }
}
