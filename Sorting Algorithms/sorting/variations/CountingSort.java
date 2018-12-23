package sorting.variations;

import sorting.AbstractSorting;

public class CountingSort extends AbstractSorting<Integer> {

	public void sort(Integer[] array, int leftIndex, int rightIndex) {

		Integer maior = maior(array, leftIndex, rightIndex);
		Integer menor = menor(array, leftIndex, rightIndex);
		Integer[] contador = new Integer[maior - menor + 1];

		Integer[] resposta = new Integer[rightIndex - leftIndex + 1];

		for (int k = 0; k < contador.length; k++) {
			contador[k] = 0;
		}

		// contar.

		for (int i = leftIndex; i <= rightIndex; i++) {
			contador[array[i] - menor]++;
		}

		// complemento.
		for (int j = 1; j < contador.length; j++) {
			contador[j] += contador[j - 1];
		}
		// ordena.

		for (int i = rightIndex; i >= leftIndex; i--) {
			resposta[contador[array[i] - menor]-- - 1] = array[i];
		}

		// copia pro array.
		int indice = 0;
		for (int i = leftIndex; i <= rightIndex; i++) {
			array[i] = resposta[indice];
			indice++;
		}

	}

	public int maior(Integer[] array, int leftIndex, int rightIndex) {
		int maior = Integer.MIN_VALUE;

		for (int i = leftIndex; i <= rightIndex; i++) {

			if (array[i] > maior) {

				maior = array[i];

			}

		}
		return maior;
	}

	public int menor(Integer[] array, int leftIndex, int rightIndex) {
		int menor = Integer.MAX_VALUE;

		for (int i = leftIndex; i <= rightIndex; i++) {

			if (array[i] < menor) {

				menor = array[i];

			}

		}
		return menor;

	}

}
