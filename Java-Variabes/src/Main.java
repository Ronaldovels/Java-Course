public class Main {

    public static void main(String[] args) {

        /*
            Primitive data types (Stack)
            int: 1, 2, 4, 100
            double: 15.5, 34.5, 125.3
            char: 'A', '!'
            boolean: true or false



            Reference data types (Heap)
            string: "Curious George"
            arrays: []
            maps:
        */

        // Declaration:  variable type + unique name
        int age;

        // Assignment: Give a value to the declaration
        age = 10;

        // Declaration and assignment can be done at once
        int year = 2025;
        int quantity = 1;

        System.out.println("The year is " + year);


        double price = 19.99;
        double gpa = 3.5;
        double temperature = 27.5;

        System.out.println("Your GPA is " + gpa);


        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("The price is " + currency +  price );


        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        if (isStudent == true) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }


        String name = "Curious George";


        System.out.println("Hello " + name);






    }
}
