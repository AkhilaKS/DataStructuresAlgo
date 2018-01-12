/**
 * 
 */
package prj.dsalgo.sorting;

import java.util.Arrays;

/**
 * @author akhilasrinivas
 *
 */
public class InsertionSortDecre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 43, 21, 32, 54, 42 };
		int key = 0, j = 0;
		boolean tobeSet;
		for (int i = 1; i < input.length; i++) {
			key = input[i];
			tobeSet = false;
			for (j = i - 1; j >= 0; j--) {
				if (key > input[j]) {
					tobeSet = true;
					input[j + 1] = input[j];
				} else
					break;
			}
			if (tobeSet)
				input[j + 1] = key;
		}
		System.out.println("Sorted array in decreasing order: " + Arrays.toString(input));

	}
}
