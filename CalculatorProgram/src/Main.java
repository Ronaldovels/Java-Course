import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        double result = 0;
        String operation;
        boolean isValid = true;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operation = scanner.nextLine();

        switch (operation) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> { if (secondNumber == 0) {
                System.out.println("Cannot divide by 0");
                isValid = false;
            } else {
                result = firstNumber / secondNumber;
            }}
            case "^" -> result = Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.println("Invalid operation");
                isValid = false;
            }
        }

        if(isValid) {
            System.out.printf("Your result is %.3f", result);
        }

	    scanner.close();
    }
}
