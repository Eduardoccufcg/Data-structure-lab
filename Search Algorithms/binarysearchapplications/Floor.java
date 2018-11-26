package binarysearchapplications;

import java.util.Arrays;

public class Floor {
	
	public static void main(String[] args) {
		System.out.println(floor(new Integer[] {1,2,3,4,5,6,7,8,9},5));
	}
	
	
	
	
	public Floor() {
		
	
		
	}
	public static int floor(Integer[] array,Integer x) {
		Arrays.sort(array);
		return floor(array,x,0,array.length-1);
	}

	public static Integer floor(Integer[] array, Integer x, int leftIndex, int rightIndex) {
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
				if (middle > 0) {

					// Se x é maior que meio - 1 e menor que meio. Então ele é o floor. Ou seja x
					// está entre meio e meio -1
					if (array[middle - 1] < x) {
						resultado = array[middle - 1];
						// Agora se o meio - 1 for maior que x então procuro a esquerda.
					} else {
						resultado = floor(array, x, leftIndex, middle - 1);

					}

				}
				// Se entrar aqui significa que x > meio.
			} else {
				// Se estiver no final, ou seja só sobrou um elemento e ainda nao
				// encontrei, entao este elemento é o floor
				if (leftIndex == rightIndex) {
					resultado = array[leftIndex];
					// Se nao houver apenas um elemento então procuro a direita.
				} else {
					resultado = floor(array, x, middle + 1, rightIndex);
				}

			}

		}
		return resultado;

	}

}
