package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

//QuickSort utilizando o particionamento de Hoare.
public class QuickSortHoare<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {

			int m = partition(array, leftIndex, rightIndex);

			sort(array, leftIndex, m - 1);
			sort(array, m + 1, rightIndex);

		}

	}

	private int partition(T[] array, int leftIndex, int rightIndex) {
		// o pivot é o elemento inicial
		T pivot = array[leftIndex];
		// percorrer o array da esquerda pra direita
		int i = leftIndex + 1;
		int j = rightIndex;

		while (i <= j) {

			/*
			 * Este laço irá parar quando encontrar algum elemento à esquerda que é maior
			 * que o pivô, pois ele deveria estar na partição direita
			 */
			while (i <= j && array[i].compareTo(pivot) <= 0) {
				i++;
			}
			/*
			 * Esse laço irá parar quando encontrar algum elemento à direira que é menor ou
			 * igual ao pivô, pois ele deveria estar na partição esquerda
			 */

			while (i <= j && array[j].compareTo(pivot) > 0) {
				j--;
			}

			// se os índices não ultrapassarem, troca-os de posição
			if (i < j) {
				Util.swap(array, i, j);
			}
		}
		// coloca o pivô na posição de ordenação
		Util.swap(array, leftIndex, j);
		// retorna a posição do pivô
		return j;
	}

}
