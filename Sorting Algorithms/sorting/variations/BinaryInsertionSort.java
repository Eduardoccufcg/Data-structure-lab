package sorting.variations;

import sorting.AbstractSorting;

public class BinaryInsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	public int buscaBinaria(T num, T[] array, int left, int right) {

		// nao encontrei a posicao ou seja a posicao sera left ou depois dele.
		int indice = (num.compareTo(array[left]) > 0) ? (left + 1) : left;

		if (left < right) {
			int mid = (left + right) / 2;

			if (num.compareTo(array[mid]) == 0)
				indice =  mid + 1;

			if (num.compareTo(array[mid]) > 0) {
				indice =  buscaBinaria(num, array, mid + 1, right);
			} else {
				indice = buscaBinaria(num, array, left, mid - 1);

			}
		}
		
		return indice;

	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex + 1; i <= rightIndex; i++) {
			T aux = array[i];
			int j = i - 1;
			// encontra a posicao do elemento. Comparado com a parte ordenada do array
			int loc = buscaBinaria(aux, array, leftIndex, j);
			while (j >= loc) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = aux;

		}

	}

}
