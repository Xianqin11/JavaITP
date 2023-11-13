package de.tum.cit.ase;

public class Car {
    private String serialNumber;
    private boolean handbrakeApplied;
    private Engine engine;
    private Penguin driver;
    private Door doorFrontLeft;
    private Door doorFrontRight;
    private Door doorRearLeft;
    private Door doorRearRight;
    private Tire tireFrontLeft;
    private Tire tireFrontRight;
    private Tire tireRearLeft;
    private Tire tireRearRight;

    public Car(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Car(String serialNumber, Engine engine, Door doorFrontLeft, Door doorFrontRight, Door doorRearLeft, Door doorRearRight, Tire tireFrontLeft, Tire tireFrontRight, Tire tireRearLeft, Tire tireRearRight) {
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.doorFrontLeft = doorFrontLeft;
        this.doorFrontRight = doorFrontRight;
        this.doorRearLeft = doorRearLeft;
        this.doorRearRight = doorRearRight;
        this.tireFrontLeft = tireFrontLeft;
        this.tireFrontRight = tireFrontRight;
        this.tireRearLeft = tireRearLeft;
        this.tireRearRight = tireRearRight;
    }

    public void startCar() {
        this.doorFrontLeft.setOpened(false);
        this.doorFrontRight.setOpened(false);
        this.doorRearLeft.setOpened(false);
        this.doorRearRight.setOpened(false);

        this.engine.setRunning(true);

        this.handbrakeApplied = false;
    }

    public void stopCar() {
        this.engine.setRunning(false);
        this.handbrakeApplied = true;
    }

    public void setWindowHeight(Door door, int windowHeight) {
        door.setWindowHeight(windowHeight);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean ishandbrakeApplied() {
        return handbrakeApplied;
    }

    public void sethandbrakeApplied(boolean handbrakeApplied) {
        this.handbrakeApplied = handbrakeApplied;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Penguin getDriver() {
        return driver;
    }

    public void setDriver(Penguin driver) {
        this.driver = driver;
    }

    public Door getDoorFrontLeft() {
        return doorFrontLeft;
    }

    public void setDoorFrontLeft(Door doorFrontLeft) {
        this.doorFrontLeft = doorFrontLeft;
    }

    public Door getDoorFrontRight() {
        return doorFrontRight;
    }

    public void setDoorFrontRight(Door doorFrontRight) {
        this.doorFrontRight = doorFrontRight;
    }

    public Door getDoorRearLeft() {
        return doorRearLeft;
    }

    public void setDoorRearLeft(Door doorRearLeft) {
        this.doorRearLeft = doorRearLeft;
    }

    public Door getDoorRearRight() {
        return doorRearRight;
    }

    public void setDoorRearRight(Door doorRearRight) {
        this.doorRearRight = doorRearRight;
    }

    public Tire getTireFrontLeft() {
        return tireFrontLeft;
    }

    public void setTireFrontLeft(Tire tireFrontLeft) {
        this.tireFrontLeft = tireFrontLeft;
    }

    public Tire getTireFrontRight() {
        return tireFrontRight;
    }

    public void setTireFrontRight(Tire tireFrontRight) {
        this.tireFrontRight = tireFrontRight;
    }

    public Tire getTireRearLeft() {
        return tireRearLeft;
    }

    public void setTireRearLeft(Tire tireRearLeft) {
        this.tireRearLeft = tireRearLeft;
    }

    public Tire getTireRearRight() {
        return tireRearRight;
    }

    public void setTireRearRight(Tire tireRearRight) {
        this.tireRearRight = tireRearRight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", handbrakeApplied=" + handbrakeApplied +
                ", engine=" + engine +
                ", driver=" + driver +
                ", doorFrontLeft=" + doorFrontLeft +
                ", doorFrontRight=" + doorFrontRight +
                ", doorRearLeft=" + doorRearLeft +
                ", doorRearRight=" + doorRearRight +
                ", tireFrontLeft=" + tireFrontLeft +
                ", tireFrontRight=" + tireFrontRight +
                ", tireRearLeft=" + tireRearLeft +
                ", tireRearRight=" + tireRearRight +
                '}';
    }

    //5.1 Checking the car before startup
    //Implement the public method String checkCar(boolean isWinter)
    // in the class Car which returns the car's status
    public String checkCar(boolean isWinter){
        // Check if engine, doors, tires, or driver is missing
        //-> attribute is equal to null
        if(engine == null || driver == null || doorFrontLeft == null || doorFrontRight == null
           || doorRearLeft == null || doorRearRight == null ||tireFrontLeft == null ||
           tireFrontRight == null || tireRearLeft == null || tireRearRight == null){
            return "One of the car components is missing!";
        }
        //Check if the engine is not working properly
        if(!engine.workingEngine()){
            return "The engine is not working properly!";
        }
        //Check if the tires are not fitted properly
        if(!isWinter){
            return "Check your tires immediately!";
        }

        //Check if the penguin is allowed to drive the car
        if(!driver.isEligibleDriver()){
            return "The penguin is not allowed to drive a car!";
        }else{
            return "The car is checked and ready to go!";
        }
    }
}
