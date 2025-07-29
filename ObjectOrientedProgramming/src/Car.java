public class Car {

    String make = "Mazda";
    String model = "RX7";
    int year = 1990;
    double price = 20000.99;
    boolean isRunning = false;

    void start() {
        System.out.println("You start the engine");
        isRunning = true;
    }
    void stop() {
        System.out.println("You stop the engine");
        isRunning = false;
    }
    void drive() {
        System.out.println("You drive the " + model);
    }
    void brake() {
        System.out.println("You brake the " + model);
    }


}
