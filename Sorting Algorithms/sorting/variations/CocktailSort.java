package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

// Versao do bubblesort, tambem chamado de bubblesort simultaneo.
public class CocktailSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		while (leftIndex < rightIndex) {

			// levo o maior elemento para o final
			for (int i = leftIndex; i < rightIndex; i++) {

				if (array[i].compareTo(array[i + 1]) > 0) {
					Util.swap(array, i, i + 1);

				}

			}
			// declemento righIndex, pois o ultimo elemento está na sua posição.
			rightIndex--;

			// levo o menor elemento para o ínicio
			for (int j = rightIndex; j > leftIndex; j--) {

				if (array[j].compareTo(array[j - 1]) < 0) {
					Util.swap(array, j, j - 1);

				}

			}

			// inclemento leftIndex, pois o primeiro elemento está na sua posição.
			leftIndex++;

		}

	}

}
