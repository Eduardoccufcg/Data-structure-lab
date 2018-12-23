package impl;

/*
 * Implementação do máximo e mínimo usando no máximo 3*(n/2) comparações  de acordo com o livro
 * "Algoritmos: Teoria e Prática" de THOMAS H.CORMEM, CHARLES E. LEISERSON, RONALD L. RIVEST & CLIFFORD STEIN
 */
public class MaxMin {

	public static void main(String[] args) {

		int[] array = new int[] { -1, -1 };
		System.out.println(partition(array));

	}

	public static String partition(int[] array) {
		int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;

		// é impar
		if (array.length % 2 != 0) {
			min = array[0];
			max = array[0];
			int[] arr = comparacoes(array, 1, max, min);
			min = arr[0];
			max = arr[1];
			// é par
		} else {
			// comparacao 1
			if (array[0] >= array[1]) {
				min = array[1];
				max = array[0];
			} else {
				min = array[0];
				max = array[1];
			}
			int[] arr = comparacoes(array, 2, max, min);
			min = arr[0];
			max = arr[1];
		}

		return "(" + min + "," + max + ")";

	}

	public static int[] comparacoes(int[] array, int inicio, int max, int min) {

		int minAtual = Integer.MIN_VALUE, maxAtual = Integer.MAX_VALUE;
		for (int i = inicio; i < array.length - 1; i = i + 2) {

			// comparacao 1
			if (array[i] >= array[i + 1]) {
				minAtual = array[i + 1];
				maxAtual = array[i];
			} else {
				minAtual = array[i];
				maxAtual = array[i + 1];
			}
			// comparacao 2
			if (minAtual < min) {
				min = minAtual;
			}
			// comparacao 3
			if (maxAtual > max) {
				max = maxAtual;
			}

		}
		int[] arr = new int[2];
		arr[0] = min;
		arr[1] = max;
		return arr;
	}
}