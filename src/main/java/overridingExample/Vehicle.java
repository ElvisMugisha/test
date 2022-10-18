package overridingExample;

public class Vehicle {
    void run () {
        System.out.println("Vehicle is working well!");
    }
}

class Bike extends Vehicle {
    void run () {
        System.out.println("Bike is working well!");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}

