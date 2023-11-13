package de.tum.cit.ase;

public class Witch {
    //Attributes
    private static final int PILOTS_RETIREMENT_AGE = 65;
    private String name;
    private int age;
    private boolean experiencedBroomOperator;

    //Constructors
    public Witch(String name, int age, boolean experiencedBroomOperator) {
        this.name = name;
        this.age = age;
        this.experiencedBroomOperator = experiencedBroomOperator;
    }
    //getters setters


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isExperiencedBroomOperator() {
        return experiencedBroomOperator;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setExperiencedBroomOperator(boolean experiencedBroomOperator) {
        this.experiencedBroomOperator = experiencedBroomOperator;
    }
    //Methods
    public String welcomePassengers() {
        return "Welcome on board! My name is " + name;
    }

    public static boolean isRetired(int age) {
        return age >= PILOTS_RETIREMENT_AGE;
    }

}
