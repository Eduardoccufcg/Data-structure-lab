package binarysearch;

import java.util.Arrays;

public class BinarySearchRecursive {

	public BinarySearchRecursive() {

	}

	public static void main(String[] args) {
		BinarySearchRecursive a = new BinarySearchRecursive();
		Integer[] b = new Integer[] { 1, 5, 8, 9, 3, 2 };
		Arrays.sort(b);
		System.out.println(a.buscaBinaria(5, b, 0, b.length - 1));
	}

	// array Ordenado
	public int buscaBinaria(int num, Integer[] array, int left, int right) {
		int indice = -1;

		if (left <= right) {
			int meio = (left + right) / 2;

			if (num == array[meio]) {
				indice = meio;

			}

			else {

				if (array[meio] < num) {
					indice = buscaBinaria(num, array, meio + 1, right);
				} else {
					indice = buscaBinaria(num, array, left, meio - 1);
				}
			}

		}

		return indice;

	}

}
