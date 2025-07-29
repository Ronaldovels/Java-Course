
public class Main {

    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //          and can perform action (methods)
        //          It is a reference data type

        Car car = new Car();

        System.out.println(car.make + " " + car.model);
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();
        car.stop();
        System.out.println(car.isRunning);



    }


}
