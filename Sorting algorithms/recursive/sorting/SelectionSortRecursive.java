package recursive.sorting;

import sorting.AbstractSorting;
import util.Util;

public class SelectionSortRecursive<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (leftIndex < rightIndex) {

			int min = min(array, leftIndex, rightIndex);

			if (min != leftIndex) {
				Util.swap(array, leftIndex, min);
			}

			sort(array, ++leftIndex, rightIndex);

		}
	}

	public int min(T array[], int i, int j) {
		int minIndex;
		if (i == j) {
			minIndex = i;
		} else {
			int menor1, menor2, meio;
			meio = (i + j) / 2;
			menor1 = min(array, i, meio);
			menor2 = min(array, meio + 1, j);
			if (array[menor1].compareTo(array[menor2]) < 0) {
				minIndex = menor1;
			} else {
				minIndex = menor2;
			}

		}
		return minIndex;
	}

}
