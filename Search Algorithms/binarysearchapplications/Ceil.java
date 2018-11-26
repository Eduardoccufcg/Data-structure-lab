package binarysearchapplications;

import java.util.Arrays;

public class Ceil {

	public static void main(String[] args) {
		System.out.println(ceil(new Integer[] { 1, 3, 4, 5, 6, 8, 9 }, -111));

	}

	public Ceil() {

	}

	public static int ceil(Integer[] array, Integer x) {
		Arrays.sort(array);
		return ceil(array, x, 0, array.length - 1);
	}

	public static Integer ceil(Integer[] array, Integer x, int leftIndex, int rightIndex) {
		Integer resultado = null;
		// Verifico se o left é menor ou igual ao right
		if (leftIndex <= rightIndex) {

			// Calculo o meio
			int middle = (leftIndex + rightIndex) / 2;
			// Se o elemento o elemento que eu estou procurando é igual ao meio, então ele é
			// o floor.
			if (x.equals(array[middle])) {
				resultado = x;
				// Agora se o elemento do meio for maior que o que estou procurando e nao for o
				// primeiro do array, procurarei de left a meio -1.
			} else if (x < array[middle]) {

				if (leftIndex == rightIndex) {
					resultado = array[leftIndex];
					// Se nao houver apenas um elemento então procuro a direita.
				}else {
					resultado = ceil(array, x, leftIndex, middle - 1);
				}
				

			} else {

				if (middle < array.length - 1) {
					if (array[middle + 1] > x) {
						resultado = array[middle + 1];
					} else {
						resultado = ceil(array, x, middle + 1, rightIndex);
					}
				}

				// Se estiver no final, ou seja só sobrou um elemento e ainda nao
				// encontrei, entao este elemento é o floor

			}

		}
		return resultado;

	}

}
