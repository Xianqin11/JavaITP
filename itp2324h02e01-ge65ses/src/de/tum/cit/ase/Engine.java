package de.tum.cit.ase;

public class Engine {
    private int penguinPower;
    private boolean isRunning;
    private Car car;

    //3.1 Designing an oil gauge
    private int oilAmount;

    public Engine(int horsePower, Car car) {
        this.penguinPower = horsePower;
        this.car = car;
    }
    //3.1 Constructor
    public Engine(int horsePower, Car car,int oilAmount){
        //what we call horsepower is playfully referred to as penguinPower
        this.penguinPower = horsePower;
        this.car = car;
        this.oilAmount = oilAmount;
    }
    //3.2 Getter and Setter for attribute oilAmount
    public int getOilAmount() {
        return oilAmount;
    }
    public void setOilAmount(int oilAmount) {
        this.oilAmount = oilAmount;
    }

    public Engine(int horsePower) {
        this.penguinPower = horsePower;
    }

    public void emergencyStop() {
        this.car.stopCar();
    }

    public int getPenguinPower() {
        return penguinPower;
    }

    public void setPenguinPower(int penguinPower) {
        this.penguinPower = penguinPower;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + penguinPower +
                ", isRunning=" + isRunning +
                ", car=" + car.getSerialNumber() +
                '}';
    }

    // 3.3 method boolean enoughPenguinPower()
    // penguinPower is not only positive but also evenly divisible by three
    public boolean enoughPenguinPower(){
        return penguinPower % 3 == 0;
    }

    //3.4 create a new public method named boolean enoughOil()
    public boolean enoughOil(){
        return oilAmount > 2000;
    }

    //3.5 Ensuring Engine Performance,
    // enough oil and a sufficient amount of horsepower to deliver
    // Implement the public method boolean workingEngine()
    public boolean workingEngine(){
        boolean penguinPower = enoughPenguinPower();
        boolean oilAmount = enoughOil();
        return penguinPower && oilAmount;
    }

}
