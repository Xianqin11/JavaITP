package de.tum.cit.ase;

@SuppressWarnings("UnnecessaryLocalVariable")
public class ProductCostCalculator {
    private final double productPrice;
    private int totalCalculations;
    private int totalProducts;

    public ProductCostCalculator(double productPrice) {
        this.productPrice = productPrice;
        this.totalCalculations = 0;
        this.totalProducts = 0;
    }

    public double getTotalCost(int qty, double discount) {
        double discountedPriceOfProduct = getDiscountedPriceOfProduct(discount);
        double totalCost = qty * discountedPriceOfProduct;

        this.totalProducts += qty;
        /* Mistake 1
        The variable totalProducts should be updated with the quantity of products,
        not the total number of calculations.
         This will accumulate the total quantity of products processed by the calculator.
         */
        return totalCost;
    }

    public double getDiscountedPriceOfProduct(double discount) {
        /*
        Mistake 2
        you should multiply the productPrice by the discount
        to calculate the discounted price correctly.
        double discountedPriceOfProduct = this.productPrice - discount; */
        double discountedPriceOfProduct = this.productPrice * (1 - discount);
        return discountedPriceOfProduct;
    }

    public double getProductsPerCalculation() {
        //return (1D * this.totalProducts) / this.totalCalculations;
        /*
        The getProductsPerCalculation method should return the average number of
        products per calculation. To do this, you need to divide the total number of
        products by the total number of calculations
         */
        if (totalCalculations == 0) {
            return 0.0; // Avoid division by zero
        }
        return (1D * this.totalProducts) / this.totalCalculations;
    }
}
