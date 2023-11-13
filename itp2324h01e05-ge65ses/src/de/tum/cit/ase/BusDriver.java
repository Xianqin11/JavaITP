package de.tum.cit.ase;

public class BusDriver {
    private String name;
    private int totalHoursWorked;

    //Constructor
    public BusDriver(String name) {
        this.name = name;
        this.totalHoursWorked = 0;
    }

    //getters & setters
    public String getName() {
        return name;
    }
    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    //methods
    public void startShift() {
        System.out.println("Hi, This is bus driver " + name + ", ready to drive today!");
    }


    public String getEndShiftString(int hoursWorkedInShift) {
        totalHoursWorked += hoursWorkedInShift;
        return "My shift has ended. I have now driven for " + totalHoursWorked + " hours in total.";
    }
    public void endShift(int hoursWorkedInShift) {
        String message = getEndShiftString(hoursWorkedInShift);
        System.out.println(message);
    }

}

