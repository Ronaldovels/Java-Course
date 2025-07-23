import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int cols;
        char symbol;


        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        cols = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }

}
