package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class BilateralSelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		while (leftIndex < rightIndex) {

			// "k" a posicao onde o elemento deve ficar. 

			int minIndex = leftIndex, k = leftIndex;
			// seleciona o elemento minimo
			for (int i = leftIndex + 1; i <= rightIndex; i++) {
				if (array[i].compareTo(array[minIndex]) < 0) {
					minIndex = i;

				}

			}
			// Coloca o elemento mínimo na k-ésima posição
			Util.swap(array, minIndex, k);

			leftIndex++;

			// "l" a posicao onde o elemento deve ficar. 

			int maxIndex = rightIndex, l = rightIndex;

			// seleciona o elemento maximo

			for (int i = rightIndex - 1; i >= leftIndex; i--) {
				if (array[i].compareTo(array[maxIndex]) > 0) {
					maxIndex = i;

				}
			}
			// Coloca o elemento maximo na k-esima posicão

			Util.swap(array, maxIndex, l);

			rightIndex--;
		}
	}

}
