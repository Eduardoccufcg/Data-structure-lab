package sorting.variations;

import java.util.Arrays;

import sorting.AbstractSorting;
import util.Util;

public class HeapSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (rightIndex - leftIndex + 1 < array.length) {
			T[] subArray = Arrays.copyOfRange(array, leftIndex, rightIndex + 1);
			heapSort(subArray);
			for (int i = leftIndex; i <= rightIndex; i++) {
				array[i] = subArray[i - leftIndex];
			}

		}else {
			heapSort(array);
		}

	}

	public void heapSort(T array[]) {
		int n = array.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(array, n, i);

		// One by one extract an element from heap
		for (int k = n - 1; k >= 0; k--) {
			// Move current root to end
			Util.swap(array, 0, k);
			// call max heapify on the reduced heap
			heapify(array, k, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	public void heapify(T array[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && array[l].compareTo(array[largest]) > 0)
			largest = l;

		// If right child is larger than largest so far
		if (r < n && array[r].compareTo(array[largest]) > 0)
			largest = r;

		// If largest is not root
		if (largest != i) {
			Util.swap(array, i, largest);

			// Recursively heapify the affected sub-tree
			heapify(array, n, largest);
		}

	}

}
