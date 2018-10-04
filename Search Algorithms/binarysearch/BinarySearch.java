package binarysearch;

public class BinarySearch {
	
	public BinarySearch() {
		
	}
	
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
