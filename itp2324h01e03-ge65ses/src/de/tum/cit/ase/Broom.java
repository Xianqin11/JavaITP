package de.tum.cit.ase;

public class Broom {
    //Attributes
    private Witch pilot;
    private double avgVelocity;
    private double currentVelocity;


    //Constructors
    public Broom(Witch pilot, double avgVelocity, double currentVelocity) {
        this.pilot = pilot;
        this.avgVelocity = avgVelocity;
        this.currentVelocity = currentVelocity;
    }
    //Getters Setters
    public Witch getPilot() {
        return pilot;
    }
    public double getAvgVelocity() {
        return avgVelocity;
    }
    public double getCurrentVelocity() {
        return currentVelocity;
    }

    public void setPilot(Witch pilot) {
        this.pilot = pilot;
    }
    public void setAvgVelocity(double avgVelocity) {
        this.avgVelocity = avgVelocity;
    }
    public void setCurrentVelocity(double currentVelocity) {
        this.currentVelocity = currentVelocity;
    }


    //Methods
    public double calculateMaxVelocity() {
        if (pilot.isExperiencedBroomOperator()) {
            return avgVelocity * 1.5;
        } else {
            return avgVelocity;
        }
    }
    public double calculateVelocityDifference() {
        return currentVelocity - avgVelocity;
    }

}
