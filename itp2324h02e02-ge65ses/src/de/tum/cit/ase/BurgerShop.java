package de.tum.cit.ase;
import java.util.HashMap;


public class BurgerShop {
    //TODO: Implement
    //attribute 1: a modifiable Burger[] attribute called orders
    //聚合关系，Burger类作为BurgerShop的成员变量
    private Burger[] orders; //// modifiable Burger[] attribute


    // attribute 2: final Stock stock,
    // 聚合关系 ，Stock类作为成员变量类别
    private final Stock stock; //final: read-only after construction

    //Constructor to initialize attributes to default values
    public BurgerShop() {
        this.orders = null;
        this.stock = new Stock();
    }

    public int calculateTotalPrice(Burger burger) {
        String[] burgerIngredients = burger.getIngredients();
        int totalPrice = 0;
        for (var ing: burgerIngredients) {
            if (stock.findStockIngredient(ing) != null) {
                totalPrice += stock.findStockIngredient(ing).getPrice();
            }
        }
        return totalPrice;
    }

    public void acceptSupplyDelivery(String name, int price, int quantity) {
        if(stock.findStockIngredient(name) != null) { // already existed material
            int origQuantity = stock.findStockIngredient(name).getQuantity();
            stock.findStockIngredient(name).setQuantity(origQuantity + quantity); // if need to change price
        } else { // not existed material
            StockIngredient newStockIngredient = new StockIngredient(name, price, quantity);
            stock.addToStockIngredients(newStockIngredient);
        }
    }

    public void orderBurger(Burger burger) { // FIFO
        //1. 先加入到orders队列 将burger放入队列中
        //2.调用checkOrderReady
        //3.如果成功了 将库存材料删除 + 输出 + 删除成功的队列
        //4. 否则
        ArrayHelpers.addElementToArray(orders ,burger);
        if (orders[0].equals(burger)) {
            // checkOrderReady
            checkOrderReady();
        }
    }

    public void checkOrderReady() {
        // 需要查看order 还有库存是否满足
        // 如果满足 放入
        //If all necessary Ingredients are in stock, we can instantly cook a Burger and notify the customer that the burger is ready. Write "The order is ready: [Burger name]"" e.g.:
        // check condition exit directly
        if (orders.length == 0) return;
        String[] ingredients = orders[0].getIngredients();
        for (var ing: ingredients) { // also check quantity
            if (stock.findStockIngredient(ing) == null) return;
        } // 直接没对应食材
        //还需要看数量是否满足
        // remove stock material use dictionary
        HashMap<String, Integer> orderIngredients = new HashMap<String, Integer>();
        for (var in: ingredients) {
            if (orderIngredients.containsKey(in)) {
                orderIngredients.put(in, 1 + orderIngredients.get(in));
            } else {
                orderIngredients.put(in, 1);
            }
        }
        // 遍历元素看是否满足库存原料
        for (var key: orderIngredients.keySet()) {
            if (stock.findStockIngredient(key).getQuantity() < orderIngredients.get(key)) {
                return;
            }
        }
        // if 满足库存 直接减去对应的库存量
        for (var key: orderIngredients.keySet()) {
            int orignalQuantity = stock.findStockIngredient(key).getQuantity();
            stock.findStockIngredient(key).setQuantity(orignalQuantity - orderIngredients.get(key));
        }
        System.out.println( "The order is ready: " + orders[0].getName());
        ArrayHelpers.removeFirstElementFromArray(orders);

    }
}
