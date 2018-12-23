package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class ThreeWayQuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (leftIndex < rightIndex) {
			// partition
			T pivot = array[leftIndex];
			int lt = leftIndex;
			int i = leftIndex;
			int gt = rightIndex;
			while (i <= gt) {
				int cmp = array[i].compareTo(pivot);
				if (cmp > 0) {
					// array[i] > pivot
					Util.swap(array, i, gt--);
				} else if (cmp < 0) {
					// array[i] < pivot
					Util.swap(array, i++, lt++);
				} else {
					i++;
				}
			}
			sort(array, leftIndex, lt - 1);
			sort(array, gt + 1, rightIndex);

		}

	}

}
