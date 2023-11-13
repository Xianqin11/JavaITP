package de.tum.cit.ase;

public class FactoryLine {

    public static Car buildCar() {
        Door doorFrontLeft = new Door();
        Door doorFrontRight = new Door();
        Door doorRearLeft = new Door();
        Door doorRearRight = new Door();

        Tire tireFrontLeft = new Tire("2.0");
        Tire tireFrontRight = new Tire("2.0");
        Tire tireRearLeft = new Tire("2.0");
        Tire tireRearRight = new Tire("2.0");

        Engine engine = new Engine(246);

        String serialNumber = "A001";
        Car car = new Car(serialNumber, engine, doorFrontLeft, doorFrontRight, doorRearLeft, doorRearRight, tireFrontLeft, tireFrontRight, tireRearLeft, tireRearRight);

        car.getEngine().setCar(car);

        return car;
    }

    public static void pickupCar(Penguin human, Car car) {
        human.getIntoCar(car);
    }
}
