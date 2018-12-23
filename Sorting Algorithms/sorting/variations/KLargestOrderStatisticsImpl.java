package sorting.variations;

import java.util.Arrays;

import util.Util;

public class KLargestOrderStatisticsImpl<T extends Comparable<T>> {

	public static void main(String[] args) {
		KLargestOrderStatisticsImpl<Integer> s = new KLargestOrderStatisticsImpl<Integer>();
		Integer[] array = new Integer[] { 7, 3, 9, 1, 5, 8, 2, 4, 10, 6 };
		System.out.println(Arrays.toString(s.getKLargest(array, 1)));
	}

	/*
	 * Retorna um array contendo os k maiores elementos.
	 */
	public T[] getKLargest(T[] array, int k) {
		T[] output = null;

		if (k <= array.length) {
			T[] arr = (T[]) new Comparable[k];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = orderStatistics(array, array.length - k + 1);
				k--;

			}
			output = arr;
		}

		return output;

	}

	/*
	 * Retorna a k-ésima estatística de ordem de uma array, ou seja o k-ésimo menor
	 * elemento.
	 */
	public T orderStatistics(T[] array, int k) {
		for (int h = 0; h < k; h++) {

			int minIndex = h;
			// seleciona o elemento minimo
			for (int i = h + 1; i < array.length; i++) {
				if (array[i].compareTo(array[minIndex]) < 0) {
					minIndex = i;

				}

			}
			// Coloca o elemenro mínimo na k-ésima posição
			Util.swap(array, minIndex, h);

		}
		return array[k - 1];

	}

}
