package recursive.sorting;

import sorting.AbstractSorting;
import util.Util;

public class BubbleSortRecursive<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		// Base case
		if (leftIndex >= rightIndex) {
			return;
		}

		// One pass of bubble sort. After
		// this pass, the largest element
		// is moved (or bubbled) to end.
		for (int i = leftIndex; i < rightIndex; i++) {
			if (array[i].compareTo(array[i + 1]) > 0) {
				Util.swap(array, i, i + 1);
			}
		}

		// Largest element is fixed,
		// recur for remaining array
		sort(array, leftIndex, rightIndex - 1);

	}

}
