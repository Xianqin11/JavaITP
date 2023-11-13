package de.tum.cit.ase;

import java.util.Arrays;

public class ArrayHelpers {
	/**
	 * Add an element to an array and return the modified array
	 * @param array The array to be copied and modified
	 * @param element The elemnent to append
	 * @param <T> Array type
	 * @return The new array
	 */
	public static <T> T[] addElementToArray(T[] array, T element) {
		//返回值类型<T> T[]
		T[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[array.length] = element;
		return newArray;
	}

	/**
	 * Remove an element from an array and return the modified array
	 * @param array The array to be copied and modified
	 * @param <T> Array type
	 * @return The new array
	 */
	public static <T> T[] removeFirstElementFromArray(T[] array) {
		if (array == null || array.length == 0) {
			return array;
		}

		return Arrays.copyOfRange(array, 1, array.length);
	}
}
