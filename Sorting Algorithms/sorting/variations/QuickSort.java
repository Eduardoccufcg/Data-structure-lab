package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		quicksort(array, leftIndex, rightIndex);

	}

	public void quicksort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {

			int m = partition(array, leftIndex, rightIndex);

			quicksort(array, leftIndex, m - 1);
			quicksort(array, m + 1, rightIndex);

		}

	}

	private int partition(T[] array, int leftIndex, int rightIndex) {

		T pivot = array[leftIndex];

		int i = leftIndex;

		for (int j = leftIndex + 1; j <= rightIndex; j++) {
			if (array[j].compareTo(pivot) <= 0) {

				Util.swap(array, ++i, j);

			}
		}
		Util.swap(array, leftIndex, i);
		return i;

	}

}
