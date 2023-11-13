package de.tum.cit.ase;

public class Main {
    public static void main(String[] args) {
        double priceOfProduct = 10.0; // Price of a single product
        double discount = 0.4;  // Intending a 40% discount

        ProductCostCalculator calculator = new ProductCostCalculator(priceOfProduct);

        // First we want to calculate the total cost for 3 products
        int quantity = 3;
        double totalCost = calculator.getTotalCost(quantity, discount);

        System.out.println("Total cost for " + quantity +
                " products is: " + totalCost);

        // Now we want to calculate the total cost for 5 products
        quantity = 5;
        totalCost = calculator.getTotalCost(quantity, discount);

        System.out.println("Total cost for " + quantity +
                " products is: " + totalCost);
    }
}
