package sorting.variations;

import sorting.AbstractSorting;

public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex + 1; i <= rightIndex; i++) {
			T aux = array[i];
			int j = i - 1;
			while (j >= leftIndex && (array[j].compareTo(aux) > 0)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = aux;

		}

	}

}
