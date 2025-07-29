public class Bike {



    String model;
    String make;
    int year;
    String color;

    Bike(String model, String make, int year, String color) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
    }

    void race() {
        System.out.println(this.model + " is racing");
    }

}
