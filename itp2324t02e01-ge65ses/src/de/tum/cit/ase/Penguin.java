package de.tum.cit.ase;

public class Penguin {
    //1.1 attributes & constructor
    private String name;
    private String choice;
    private int prisonTime;

    public Penguin(String name){
        this.name =name;
        prisonTime = 0;
        choice = "NONE";
    }
    //1.3 getter for attribute name
    //choice和prisonTime都设了值，不需要getter


    public String getName() {
        return name;
    }

}
