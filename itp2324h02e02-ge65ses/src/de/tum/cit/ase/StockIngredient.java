package de.tum.cit.ase;

public class StockIngredient {
    //TODO: Implement
    //attributes
    private String name;
    private int price;
    private int quantity;

    //Constructor
    public StockIngredient(String name, int price, int quantity) {
        this.name = (name!= null) ? name : "";
        this.price = (price>0) ? price : 0;
        this.quantity = (quantity>0) ? quantity : 0;
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        //check if the new quantity is valid(non-null)
        if(name!= null){
            //If valid, update the quantity
            this.name = name;
        }
    }

    public void setPrice(int price) {
        //check if the new quantity is valid(non-negative)
        if(price > 0){
            //If valid, update the quantity
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        //check if the new quantity is valid(non-negative)
        if (quantity > 0) {
            //If valid, update the quantity
            this.quantity = quantity;
        }
    }
}
