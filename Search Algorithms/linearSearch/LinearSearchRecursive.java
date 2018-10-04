package linearSearch;

public class LinearSearchRecursive {
	
	
	public LinearSearchRecursive() {
		
	}
	
	// encontra o primeia ocorrencia do elemento
	public int buscaLinear(Integer[] array, int left, int right, int num) {
		int indice = -1;

		if (left <= right) {
			if (array[left] == num) {
				indice = left;
			}else {
				indice = buscaLinear(array, ++left, right, num);
			}
			

		}
		return indice;
	}
	// encontra a ultima ocorrencia do elemento
	public int buscaLinearReverse(Integer[] array, int left, int right, int num) {
		int indice = -1;

		if (left <= right) {
			if (array[right] == num) {
				indice = right;
			}else {
				indice = buscaLinearReverse(array, left, --right, num);
			}
			

		}
		return indice;
	}

}
