public class Main {

    public static void main(String[] args) {

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Bike s1000 = new Bike("S1000RR", "Bmw", 2025, "White");
        Bike h2r = new Bike ("H2R", "Kawasaki", 2026, "Black");
        Bike r6 = new Bike ("R6", "Yamaha", 2024, "Blue");

        System.out.println(s1000.color + " " + s1000.make + " " + s1000.model + " " + s1000.year);
        System.out.println(h2r.color + " " + h2r.make + " " + h2r.model + " " + h2r.year);
        System.out.println(r6.color + " " + r6.make + " " + r6.model + " " + r6.year);

        s1000.race();
        h2r.race();
        r6.race();

    }

}
