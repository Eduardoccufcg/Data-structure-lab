package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class StoogeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override

	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array.length > 0) {

			if (array[leftIndex].compareTo(array[rightIndex]) > 0) {

				Util.swap(array, leftIndex, rightIndex);
			}
			if (rightIndex - leftIndex > 1) {
				int t = (rightIndex - leftIndex + 1) / 3;
				sort(array, leftIndex, rightIndex - t);
				sort(array, leftIndex + t, rightIndex);
				sort(array, leftIndex, rightIndex - t);

			}

		}

	}

}
