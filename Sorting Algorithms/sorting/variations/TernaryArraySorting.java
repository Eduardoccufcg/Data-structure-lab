package sorting.variations;

import java.util.Arrays;

import util.Util;

public class TernaryArraySorting {

	public static void main(String[] args) {
		Integer[] r = { 1, 8, 2, 8, 2, 8, 2, 1, 8, 2, 8, 8, 8, 2, 2, 2, 1, 1, 1, 2 };
		sort(r);
		System.out.println(Arrays.toString(r));

	}

	public static void sort(Integer r[]) {
		int maior = r[0];
		int menor = r[0];

		for (int i = 1; i < r.length; i++) {
			if (r[i] > maior)
				maior = r[i];
			if (r[i] < menor)
				menor = r[i];

		}
		int i = 0, lt = 0;
		int gt = r.length - 1;
		while (i <= gt) {

			// menor que o pivot
			if (r[i] == menor)
				Util.swap(r, lt++, i++);
			// maior que o pivot
			else if (r[i] == maior)
				Util.swap(r, i, gt--);
			// igual ao pivot
			else
				i++;

		}

	}

}
