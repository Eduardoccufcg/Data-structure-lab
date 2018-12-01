package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

// QuickSort utilizando o particionamento de Cormen
public class QuickSortCormen <T extends Comparable<T>> extends AbstractSorting<T>{

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// Caso Recursivo
		if (leftIndex < rightIndex) {

			int q = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, q - 1);
			sort(array, q + 1, rightIndex);

		}

	}

	private int partition(T[] array, int leftIndex, int rightIndex) {
		T pivot = array[rightIndex];
		int i = leftIndex - 1;
		int j = leftIndex;
		while (j < rightIndex) {
			if (array[j].compareTo(pivot) <= 0) {
				i++;
				Util.swap(array, i, j);
			}
			j++;

		}
		Util.swap(array, i + 1, rightIndex);
		return i + 1;

	}

}
