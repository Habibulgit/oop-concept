package oop_concepts.abstraction.vehicles1;

public class VehiclesDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car1 car1 = new Car1();

        bike.start();
        bike.stop();
        car1.start();
        car1.stop();
    }
}
