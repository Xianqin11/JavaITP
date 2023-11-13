package de.tum.cit.ase;

public class Flight {
    //Attribute
    private String startingPoint;
    private String endingPoint;
    private Broom usedBroom;
    private double distance;


    //Constructor
    public Flight(String startingPoint, String endingPoint, Broom usedBroom) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.usedBroom = usedBroom;
    }
    //getters & setters
    public String getStartingPoint() {
        return startingPoint;
    }
    public String getEndingPoint() {
        return endingPoint;
    }
    public Broom getUsedBroom() {
        return usedBroom;
    }
    public double getDistance() {
        return distance;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }
    public void setEndingPoint(String endingPoint) {
        this.endingPoint = endingPoint;
    }
    public void setUsedBroom(Broom usedBroom) {
        this.usedBroom = usedBroom;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    //Methods
    public double getEstimatedDistance() {
        // Calculate distance based on starting and ending points (implementation not provided)
        return distance;
    }

    public double getEstimatedTimeWithMaxVelocity() {
        // Calculate estimated time based on max velocity (implementation not provided)
        return distance / usedBroom.calculateMaxVelocity();
    }


}
