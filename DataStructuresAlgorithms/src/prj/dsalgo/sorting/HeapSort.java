/**
 * 
 */
package prj.dsalgo.sorting;

import java.util.Arrays;

/**
 * @author akhilasrinivas
 *
 */
public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] input= {19,2,14,7,10,9,8,4,9,8,4};
		int[] input = { 2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 43, 21, 32, 54, 42 };
		// int[] input = {16,14,10,8,7,9,3,2,4,1};
		// int[] input = {4,1,3,2,16,9,10,14,8,7};
		// int [] input = {15,13,9,5,12,8,7,4,0,6,2,1};
		// int [] input = {9,16,3,2,4,8,5,14,12};
		// maxHeapify(input,1,input.length);
		System.out.println("First: " + Arrays.toString(input));
		// buildMaxHeap(input);
		// System.out.println(Arrays.toString(input));
		heapSort(input);
		System.out.println(Arrays.toString(input));

	}

	static void maxHeapify(int[] input, int i, int heapSize) {
		System.out.println("a[i] :" + input[i] + " i= " + i + " heapsize: " + heapSize);
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;
		if (((leftChild > heapSize) && (rightChild > heapSize)) || (i > heapSize))
			return;
		int largest = 0, temp = 0;
		if (leftChild <= heapSize) {
			if (input[i] < input[leftChild])
				largest = leftChild;
			else
				largest = i;
		}
		System.out.println("Largest is : " + largest);
		if ((rightChild <= heapSize) && (input[largest] < input[rightChild]))
			largest = rightChild;
		if (largest != i) {
			temp = input[largest];
			input[largest] = input[i];
			input[i] = temp;
			maxHeapify(input, largest, heapSize);
		} else
			return;
	}

	static void buildMaxHeap(int[] input) {
		System.out.println("from buildMaxHeap");
		for (int i = ((input.length / 2) - 1); i >= 0; i--) {
			maxHeapify(input, i, input.length - 1);
		}
		System.out.println("after buildMaxHeap");
	}

	static void heapSort(int[] input) {
		buildMaxHeap(input);
		System.out.println("Built heap:" + Arrays.toString(input));
		int temp = 0, size = input.length - 1;
		while (size >= 0) {
			System.out.println(size);
			System.out.println(Arrays.toString(input));
			temp = input[size];
			input[size] = input[0];
			input[0] = temp;
			size--;
			System.out.println("after exchange" + Arrays.toString(input));
			maxHeapify(input, 0, size);
			System.out.println("After max heapify:" + Arrays.toString(input));
		}
	}
}
