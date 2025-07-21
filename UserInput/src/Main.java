import java.util.Scanner;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        /*
            COMMON ISSUES
            When receiving an int or double input, you may need to "clear" the input buffer of the enter (\n).
            One way to fix that is just calling a scanner.NextLine(); after the int or double input.
         */


        //Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        /*
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //next does not read spaces, nextLine does.

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // nexInt read integers

        //System.out.print("What is your gpa: ");
        //double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent == true) {
            System.out.println("You are a student!");

            System.out.print("What is your gpa: ");
            double gpa = scanner.nextDouble();

            System.out.println("Hello " + name);
            System.out.println("You are " + age + " years old");
            System.out.println("Your GPA is: " + gpa);
        } else {
            System.out.println("Hello " + name);
            System.out.println("You are " + age + " years old");
            System.out.println("You are NOT a student!");
        } */

        // Calculate area of a rectangle

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double height;
        double width;
        double area;


        System.out.print("Enter the height of the rectangle (cm): ");
        height = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the width of the rectangle (cm): ");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("The area of the given rectangle is: " + area + "cm²");

        scanner.close();
    }

}
