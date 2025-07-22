import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double temp;
        String type;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        type = scanner.nextLine();

        double newTemp = (type.equalsIgnoreCase("c")) ? (temp - 32.0) * (5.0/9.0) : temp * (9.0/5.0) + 32;
        String signal = (type.equalsIgnoreCase("c")) ? "°C" : "°F";

        System.out.printf("%.1f%s", newTemp, signal);

        scanner.close();
    }


}
