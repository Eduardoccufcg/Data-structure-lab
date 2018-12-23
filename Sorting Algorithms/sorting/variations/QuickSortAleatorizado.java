package sorting.variations;

import java.util.Random;

import sorting.AbstractSorting;
import util.Util;

public class QuickSortAleatorizado<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {

			int q = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, q - 1);
			sort(array, q + 1, rightIndex);

		}

	}

	private int partition(T[] array, int leftIndex, int rightIndex) {
		Random rnd = new Random();
		int randomIndex = rnd.nextInt(rightIndex - leftIndex + 1) + leftIndex;
		Util.swap(array, randomIndex, rightIndex);
		// ***** PARTICIONAMENTO DE CORMEN ****
		T pivot = array[rightIndex];

		int i = leftIndex - 1;
		int j = leftIndex;
		while (j < rightIndex) {
			if (array[j].compareTo(pivot) <= 0) {
				Util.swap(array, ++i, j);
			}
			j++;

		}
		Util.swap(array, i + 1, rightIndex);
		return i + 1;

	}

}
