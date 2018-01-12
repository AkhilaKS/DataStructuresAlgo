/**
 * 
 */
package prj.dsalgo.sorting;

import java.util.Arrays;

/**
 * @author akhilasrinivas
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] input = { 2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 43, 21, 32, 54, 42 };
		// int [] input = {9,16,3,2,4,8,5,14,12};

		// int[] input= {19,2,14,7,10,9,8,4,9,8,4};
		// int[] input = {16,14,10,8,7,9,3,2,4,1};
		// int[] input = {4,1,3,2,16,9,10,14,8,7};
		int[] input = { 15, 13, 9, 5, 12, 8, 7, 4, 0, 6, 2, 1 };

		quicksort(input, 0, input.length - 1);
		System.out.println(("Sorting:" + Arrays.toString(input)));
	}

	static void quicksort(int[] input, int p, int r) {
		if (p > r)
			return;
		int q = partition(input, p, r);
		System.out.println("partition element is:" + q + "       p is: " + p + "        r is: " + r
				+ "       element is: " + input[q]);
		System.out.println(("In quick sorting:" + Arrays.toString(input)));
		System.out.println("");
		// if (p == q)
		// return;
		// if((p>(q-1))|| ((q+1)>r)) return;

		quicksort(input, p, q - 1);
		quicksort(input, q + 1, r);
	}

	static int partition(int[] input, int p, int r) {
		int i = p - 1, temp = 0;
		if (p == r)
			return p;

		for (int j = p; j <= r - 1; j++) {
			if (input[r] > input[j]) {
				temp = input[j];
				input[j] = input[i + 1];
				input[i + 1] = temp;
				i++;
			}
		}
		temp = input[r];
		input[r] = input[i + 1];
		input[i + 1] = temp;
		return i + 1;
	}
}

// partition element is:12 element is: 42
// In quick sorting:[2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 21, 32, 42, 54, 43]
// Sorting:[2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 21, 32, 42, 54, 43]
