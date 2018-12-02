package aplicacoes;

import util.Util;

public class FindTriplet {
	public static void main(String[] args) {

		FindTriplet a = new FindTriplet();
		Integer[] array = new Integer[] { 5, 4, 3, 7, 4, 45, 0, 8, 7 };
		System.out.println(a.find3Numbers(array, 9));
	}

	// Solucao sem ordenar
	public boolean find3Numbers(Integer A[], int sum) {
		int l, r;

		// Fix the first element as A[i]
		for (int i = 0; i < A.length - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < A.length - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < A.length; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
						return true;
					}
				}
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	public boolean find3Numbers(Integer[] array, Integer sum) {
		int l, r;
		// Ordenar os elementos
		quickSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length - 2; i++) {

			l = i + 1;
			r = array.length - 1;
			while (l < r) {
				if (array[i] + array[l] + array[r] == sum) {
					System.out.println("Triplet is " + array[i] + ", " + array[l] + ", " + array[r]);
					return true;
				} else if (array[i] + array[l] + array[r] < sum) {
					l++;
				} else {
					r--;
				}
			}
		}
		return false;

	}

	// Implementacao do quicksort
	private void quickSort(Integer[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int m = partition(array, leftIndex, rightIndex);
			quickSort(array, leftIndex, m - 1);
			quickSort(array, m + 1, rightIndex);
		}
	}

	private int partition(Integer[] array, int leftIndex, int rightIndex) {
		Integer pivot = array[leftIndex];
		int i = leftIndex;
		for (int j = leftIndex + 1; j <= rightIndex; j++) {
			if (array[j] <= pivot) {
				i++;
				Util.swap(array, i, j);
			}

		}
		Util.swap(array, leftIndex, i);
		return i;

	}

}
