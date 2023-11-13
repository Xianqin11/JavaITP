package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Burger { //非null值的final不会变更的成员变量
	private final @NonNull String name;
	private final @NonNull String[] ingredients;

	public Burger(@NonNull String name, @NonNull String[] ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	public @NonNull String getName() {
		return this.name;
	}

	public @NonNull String[] getIngredients() {
		return this.ingredients;
	}
}
