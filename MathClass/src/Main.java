import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        // double result;

        //result = Math.pow(2, 5);
        //result = Math.abs(-5);
        //result = Math.sqrt(9);
        //result = Math.round(4.2);
        //result = Math.ceil(3.1);
        //result = Math.floor(3.99);
        //result = Math.max(10, 20);
        //result = Math.min(10, 20);

        // Hypotenuse = sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double a;
        double b;
        double c;
        double radius;
        double circ;
        double area;
        double volume;

        System.out.print("Value of a: ");
        a = scanner.nextDouble();

        System.out.print("Value of b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.print("Value of the radius: ");
        radius = scanner.nextDouble();

        circ = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The hypotenuse is: %.1fcm\n", c);
        System.out.printf("The circumference is: %.1fcm\n", circ);
        System.out.printf("The area is: %.1fcm²\n", area );
        System.out.printf("The volume is: %.1fcm³", volume);

        scanner.close();
    }
}
