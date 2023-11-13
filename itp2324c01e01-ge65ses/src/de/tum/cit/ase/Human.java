package de.tum.cit.ase;

public class Human {
    //2. Defining attributes,
    private String name;
    private short age;
    private float heightInCm;
    private boolean driversLicense;


    //3. Implement the constructors
    //3.1 Implement the full parameterized constructor
    public Human(String name, short age, float heightInCm, boolean driversLicense) {
        this.name = name;
        this.age = age;
        this.heightInCm = heightInCm;
        this.driversLicense = driversLicense;
    }

    //3.2 Implement the partial parameterized constructor taking only the 'name' parameter
    public Human(String name) {
        this.name = name;
        this.age = 55;
        this.heightInCm = 175.5F;
        this.driversLicense = false;
    }

    //4.1 Implementing all getter methods
    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public float getHeightInCm() {
        return heightInCm;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    //4.2 Implementing all setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setHeightInCm(float heightInCm) {
        this.heightInCm = heightInCm;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    //4.3 Implement the toString() method
    public String toString() {
        return "Human{name='" + name + "', age=" + age
                + ", heightInCm=" + heightInCm + ", driversLicense="
                + driversLicense + '}';
    }

    //4.4 Implement the aging() method
    public short aging() {
        age++; // Increment the age by 1
        return age; // Return the new age value
    }


    //4.5 method growing
    public float growing(float by) {
        heightInCm += by; // Increase heightInCm by the specified amount
        return heightInCm;
    }

    //4.6 method passDrivingTest
    public boolean passDrivingTest() {
        driversLicense = true; // Set driversLicense to true
        return driversLicense; // Return the new driversLicense valu
    }

    //4.7 Implement the failDrivingTest() method
    public boolean failDrivingTest() {
        driversLicense = false; // Set driversLicense to false
        return driversLicense; // Return the new driversLicense value
    }
}