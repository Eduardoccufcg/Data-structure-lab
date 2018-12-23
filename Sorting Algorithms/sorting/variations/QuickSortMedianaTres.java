package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class QuickSortMedianaTres<T extends Comparable<T>> extends AbstractSorting<T> {

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
		int meio = (leftIndex + rightIndex) / 2;
		T a = array[leftIndex];
		T b = array[meio];
		T c = array[rightIndex];
		int mediana = 0;
		// a < b
		if (a.compareTo(b) < 0) {
			// a < b < c
			if (b.compareTo(c) < 0) {
				mediana = meio;

			} else {
				// a < c && c <= b
				if (a.compareTo(c) < 0) {
					mediana = rightIndex;

				} else {
					// c <= a && e a < b
					mediana = leftIndex;
				}
			}
			// a >= b
		} else {
			if (c.compareTo(b) < 0) {
				// c < b && b <= a
				mediana = meio;
			} else {
				// b <= c & c < a
				if (c.compareTo(a) < 0) {
					mediana = rightIndex;
				} else {
					// b <= a && a <= c
					mediana = leftIndex;
				}

			}

		}
		// coloca o elemento da mediana no fim para poder usar o Quicksort de Cormen
		Util.swap(array, mediana, rightIndex);
		// ****** ALGORITMO DE PARTICAO DE CORMEN******
		// o pivot é o elemento final
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
