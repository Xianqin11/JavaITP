package de.tum.cit.ase;

public class Main {
    public static void main(String[] args) {
        //TODO you can test your implementation here
        public static void main(String[] args) {
            Witch witch1 = new Witch("Witch 1", 60, true);
            Broom broom1 = new Broom(witch1, 100.0, 120.0);
            Flight flight1 = new Flight("Munich", "Berlin", broom1);

            System.out.println(witch1.welcomePassengers());
            System.out.println("Is Witch 1 retired? " + Witch.isRetired(witch1.getAge()));
            System.out.println("Max velocity for Broom 1: " + broom1.calculateMaxVelocity());
            System.out.println("Estimated distance for Flight 1: " + flight1.getEstimatedDistance());
            System.out.println("Estimated time with max velocity for Flight 1: " + flight1.getEstimatedTimeWithMaxVelocity());
        }
    }
}
