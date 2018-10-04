package sorting.variations;

import sorting.AbstractSorting;
import util.Util;

public class Bubblesort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex; i++) {
			for (int j = leftIndex; j < rightIndex; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					Util.swap(array, j, j + 1);
				}
			}
		}

		// BubbleSort Inverso

		/*
		 * 
		 * for( int i = leftIndex; i <= rightIndex;i++) { for(int j = rightIndex; j >
		 * leftIndex;j--) { if(array[j].compareTo(array[j-1]) < 0) { Util.swap(array, j,
		 * j - 1); } } }
		 */

	}

}
