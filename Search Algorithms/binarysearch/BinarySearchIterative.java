package binarysearch;

import java.util.Arrays;

public class BinarySearchIterative {
	public static void main(String[] args) {
		BinarySearchRecursive a = new BinarySearchRecursive();
		Integer[] b = new Integer[] { 1, 5, 8, 9, 3, 2 };
		Arrays.sort(b);
		System.out.println(a.buscaBinaria(5, b, 0, b.length - 1));
	}

	// array Ordenado
	public int buscaBinaria(int num, Integer[] array, int left, int right) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (num == array[mid]) {
				return mid;
			} else {
				if (num > array[mid]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}
}
