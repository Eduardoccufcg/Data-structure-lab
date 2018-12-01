package sorting.variations;

import sorting.AbstractSorting;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			// Find the middle point
			int m = (leftIndex + rightIndex) / 2;

			// Sort first and second halves
			sort(array, leftIndex, m);
			sort(array, m + 1, rightIndex);

			// Merge the sorted halves
			merge(array, leftIndex, m, rightIndex);
		}
	}

	@SuppressWarnings("unchecked")
	private void merge(T array[], int left, int middle, int right) {
		// Find sizes of two subarrays to be merged
		int n1 = middle - left + 1;
		int n2 = right - middle;

		/* Create temp arrays */
		T L[] = ((T[]) new Comparable[n1]);
		T R[] = ((T[]) new Comparable[n2]);

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = array[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = array[middle + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j]) <= 0) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}

}
