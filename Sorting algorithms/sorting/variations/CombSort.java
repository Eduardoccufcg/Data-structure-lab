package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

/**
 * The combsort algoritm.
 */
public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int gap = rightIndex - leftIndex + 1;
		boolean swapped = true;

		// enquanto o gap for maior que 1 ou houver troca.
		while (gap > 1 || swapped) {
			if (gap > 1) {
				gap = (int) (gap / 1.25);
			}
			int i = leftIndex;

			swapped = false;
			while (i + gap <= rightIndex) {
				if (array[i].compareTo(array[i + gap]) > 0) {
					Util.swap(array, i, i + gap);
					swapped = true;
				}

				i++;
			}
		}

	}

}
