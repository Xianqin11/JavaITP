package de.tum.cit.ase;

public class Penguin {
    private String name;
    private short age;
    private float heightInCm;
    private boolean driversLicense;
    private Car car;

    //4.1 add attributes diopter and wearingGlasses
    private float diopter;
    private boolean wearingGlasses;

    //4.2 add new attributes to the Constructors
    public Penguin(String name, short age, float heightInCm, boolean driversLicense,
                   float diopter, boolean wearingGlasses) {
        this.name = name;
        this.age = age;
        this.heightInCm = heightInCm;
        this.driversLicense = driversLicense;
        this.diopter = diopter;
        this.wearingGlasses = wearingGlasses;
    }
    //4.3 add getter and setter to diopter and wearingGlasses
    public float getDiopter() {
        return diopter;
    }
    public boolean isWearingGlasses() {
        return wearingGlasses;
    }
    public void setDiopter(float diopter) {
        this.diopter = diopter;
    }
    public void setWearingGlasses(boolean wearingGlasses) {
        this.wearingGlasses = wearingGlasses;
    }


    public void getIntoCar(Car car) {
        this.car = car;
        this.car.setDriver(this);
    }

    public void exitCar() {
        this.car.setDriver(null);
        this.car = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public float getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(float heightInCm) {
        this.heightInCm = heightInCm;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heightInCm=" + heightInCm +
                ", driversLicense=" + driversLicense +
                '}';
    }

    public short aging() {
        return ++age;
    }

    public float growing(float by) {
        heightInCm += by;
        return heightInCm;
    }

    public boolean passDrivingTest() {
        driversLicense = true;
        return true;
    }

    public boolean failDrivingTest() {
        driversLicense = false;
        return false;
    }
    //4.3 method Valid Eyesight, "OR"
    //If the diopter is below -0.25 or higher than +2.0,
    //you are required to wear glasses while driving
    //--> valid eyesight  >= -0.25 and < +2.0
    public boolean validEyesight(){
        return diopter >= -0.25 && diopter < +2.0;
    }

    //4.4 public method boolean isEligibleDriver()
    public boolean isEligibleDriver(){
        boolean validDriversLicense = passDrivingTest();
        boolean validEyesight = validEyesight();

    //validEyesight && !wearingGlasses
        return validDriversLicense && validEyesight && !wearingGlasses && age >= 5;
    }
}
