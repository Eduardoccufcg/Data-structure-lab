package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class SlowSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (leftIndex < rightIndex) {
			int m = (leftIndex + rightIndex) / 2;
			sort(array, leftIndex, m);
			sort(array, m + 1, rightIndex);
			if (array[rightIndex].compareTo(array[m]) < 0) {
				Util.swap(array, rightIndex, m);
			}
			sort(array, leftIndex, rightIndex - 1);

		}

	}

}
