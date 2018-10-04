package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		for (int k = leftIndex; k < rightIndex; k++) {

			int minIndex = k; 
			// seleciona o elemento minimo
			for (int i = k + 1; i <= rightIndex; i++) {
				if (array[i].compareTo(array[minIndex]) < 0) {
					minIndex = i;

				}

			}
			// Coloca o elemenro mínimo na k-ésima posição
			Util.swap(array, minIndex, k);

		}

		/*
		 * for (int k = rightIndex; k > leftIndex; k--) {
		 * 
		 * int maxIndex = k;
		 *  
		 * // seleciona o elemento maximo
		 * 
		 * for (int i = k - 1; i >= leftIndex; i--) { if
		 * (array[i].compareTo(array[maxIndex]) > 0) { maxIndex = i;
		 * 
		 * }
		 * 
		 * Coloca o elemento maximo na k-esima posicão
		 * } Util.swap(array, maxIndex, k);
		 * 
		 */

	}

}
