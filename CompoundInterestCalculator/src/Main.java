import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // Compound Interest Calculator

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double principalAmount;
        double interestRate;
        int compoundedPerYear;
        int years;
        double totalAmount;
        char currency = '$';

        System.out.print("Enter the principal amount: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded: ");
        compoundedPerYear = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        totalAmount = principalAmount * Math.pow((1 + (interestRate / compoundedPerYear)), (compoundedPerYear * years));

        System.out.printf("The amount after %d years is %c%,.2f", years, currency, totalAmount);

        scanner.close();
    }
}
