package de.tum.cit.ase;

import java.util.Random;

public class Bus {
   //attributes
   private int busID;
   private static int nextID = 0 ;

   private boolean needsMaintenance;

   //Constructor
  public Bus() {
  this.busID = nextID++;
  this.needsMaintenance = true;
        }
    // Getters and setters
    public int getBusID() {
        return busID;
    }
    public boolean getNeedsMaintenance() {
        return needsMaintenance;
    }
    public void setNeedsMaintenance(boolean needsMaintenance) {
        this.needsMaintenance = needsMaintenance;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public static void setNextId(int nextID) {
        Bus.nextID = nextID;
    }

    //method
    public void doMaintenance() {
        System.out.println("Maintenance done for bus " + busID + ".");
        needsMaintenance = false;
    }
}



