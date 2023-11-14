package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class Stock {
	//Stock和StockIngredient是聚合关系，通过在一个类中包含另一个类的对象来表示
	//Stock类包含StockIngredient数组作为成员变量
	private @NonNull StockIngredient[] stockIngredients;

	public @NonNull StockIngredient[] getStockIngredients() {
		return this.stockIngredients;
	}
	//Stock methods
	// TODO: Rename this method to addToStockIngredients(done)
	public void addToStockIngredients(@NonNull StockIngredient ingredient) {
		this.stockIngredients = ArrayHelpers.addElementToArray(this.stockIngredients, ingredient);
	}

	public @Nullable StockIngredient findStockIngredient(@NonNull String name) {
		for (var x : this.stockIngredients) {
			// TODO: Return x if the name is equal
			if(x.getName().equals(name)){
				// If the names match, return the StockIngredient
				return x;
			}
		}
		return null;
	}

	public int add(@NonNull String ingredient) {
		StockIngredient stockIngredient = this.findStockIngredient(ingredient);

		if (stockIngredient != null) { //stockIngredient不为空时{}内的内容
			// TODO: Uncomment the following once you have implemented StockIngredient
			// increase the quantity of a Stock Ingredient(+1)
			// given its name and return the new Stock quantity
			//先把getQuantity把stockIngredient数值+1,set到Quantity里
			stockIngredient.setQuantity(stockIngredient.getQuantity() + 1);
			//return the new Stock quantity
			return stockIngredient.getQuantity();
		}
		//If the operation cannot be completed return -1
		return -1;
	}

	public int take(@NonNull String ingredient) {
		StockIngredient stockIngredient = this.findStockIngredient(ingredient);
		if (stockIngredient != null) { //如果stockIngredient不为null
			// TODO: Replace 0 with the current quantity of the found stock ingredient
			//var stockQuant = 0;
			var stockQuant = stockIngredient.getQuantity();

			if (stockQuant < 1) {
				// TODO: Uncomment the following once you have implemented StockIngredient
				return -1;
			}
			stockIngredient.setQuantity(stockQuant - 1);
			return stockIngredient.getQuantity();
		}
			// If the operation cannot be completed
			return -1;
		}
	}

