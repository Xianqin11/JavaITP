package de.tum.cit.ase;



public class BurgerShop {
    //TODO: Implement
    //attribute 1: a modifiable Burger[] attribute called orders
    //聚合关系，Burger类作为BurgerShop的成员变量
    private Burger[] orders; //// modifiable Burger[] attribute

    // attribute 2: final Stock stock,
    // 聚合关系 ，Stock类作为成员变量类别
    private final Stock stock; //final: read-only after construction

    //Constructor to initialize attributes to default values
    public BurgerShop(Burger[] orders, Stock stock) {
        this.orders = new Burger[0];
        this.stock = new Stock();
    }

    //method orderBurger(Burger): void
    public void orderBurger(Burger burger){
        //???
    }
}
