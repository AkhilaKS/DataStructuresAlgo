/**
 * 
 */
package prj.dsalgo.sorting;

import java.util.Arrays;

/**
 * @author akhilasrinivas
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 43, 21, 32, 54, 42 };
		// System.out.println(input.length-1);
		//
		mergesort(input, 0, input.length - 1);
		System.out.println(Arrays.toString(input));
	}

	static void merge(int[] a, int p, int q, int r) {
		int[] first = new int[20];
		int[] second = new int[20];
		int m = 0, n = 0, i = 0, j = 0;
		for (i = p; i <= r; i++) {
			first[m] = a[i];
			m++;
		}
		for (j = r + 1; j <= q; j++) {
			second[n] = a[j];
			n++;
		}
		i = 0;
		j = 0;
		int k = 0;
		for (k = p; k <= q; k++) {
			if ((i == m) || (j == n))
				break;
			if (first[i] <= second[j]) {
				a[k] = first[i];
				i++;
			} else {
				a[k] = second[j];
				j++;
			}
		}
		while (k <= q) {
			if (i < m) {
				a[k] = first[i];
				i++;
			}
			if (j < n) {
				a[k] = second[j];
				j++;
			}
			k++;

		}
	}

	static void mergesort(int[] a, int p, int q) {
		int r = 0;
		if (p < q) {
			r = (p + q) / 2;
			mergesort(a, p, r);
			mergesort(a, r + 1, q);
			merge(a, p, q, r);
		}
	}
}
