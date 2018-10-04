package recursive.sorting;

import sorting.AbstractSorting;

public class InsertionSortRecursive<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (rightIndex > leftIndex) {

			sort(array, leftIndex, --rightIndex);

			T x = array[rightIndex + 1];
			int j = rightIndex;
			while (j >= leftIndex && array[j].compareTo(x) > 0) {

				array[j + 1] = array[j]; // Sobreponho o elemento seguinte que está guardado na variavel x
				j--;

			}
			array[j + 1] = x; // coloco o x na posicao correta depois de empurrar todos os elementos.

		}

	}

}
