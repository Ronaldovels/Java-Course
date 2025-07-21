import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int number;

        number = random.nextInt(1,7);

        double number2;

        number2 = random.nextDouble();

        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(number2);
        System.out.println(isHeads);

    }

}
