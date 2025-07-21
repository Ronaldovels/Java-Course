public class Main {

    public static void main(String[] args) {

        // printf() = is a method to format output

        // %[flags][width][.precision][specifier-character]

        /*
            Specifier-character = the type of the variable that will be in the placeholder
            s = strings
            c = char
            d = integer
            f = double
            b = boolean
         */

        /*String name = "Curious George";
        char firstLetter = 'C';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your height is %f.1cm tall\n", height);
        System.out.printf("Emplyoed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);*/


        //precision = limit the amount of decimals
        /*
            flags
            + = output a plus
            , = comma grouping separator
            ( = negative numbers are enclosed in ()
            space = display a minus if negative, space if positive
         */

        /*double price1 = 9.99;
        double price2 = 90000.42;
        double price3 = -200.99;
        double price4 = 400.54;
        double price5 = -400.54;

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n", price5);*/

        /*
            width
            0 = zero padding (1 -> 0001)
            number = right justified padding
            negative number = left justified padding
        */

        int id1 = 1;
        int id2 = 25;
        int id3 = 547;
        int id4 = 1250;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }

}
