public class Bike {

    String model;
    String color;

    Bike(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void race() {
        System.out.println(this.color + " " + this.model + " is racing");
    }

}
