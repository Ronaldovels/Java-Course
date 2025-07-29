public class Main {

    public static void main(String[] args) {

        Bike s1000 = new Bike("S1000RR", "White");
        Bike h2r = new Bike ("H2R", "Black");
        Bike r6 = new Bike ("R6", "Blue");

        Bike[] bikes = {s1000, h2r, r6, new Bike("Panigale V4", "Red")};

        for (Bike bike : bikes) {
            bike.race();
        }



    }

}
