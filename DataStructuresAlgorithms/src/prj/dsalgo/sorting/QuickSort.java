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
		int[]  input={2,3,1,6,3,8,2,5,9,11,43,21,32,54,42};
quicksort(input,0,input.length-1);
System.out.println(("Sorting:"+Arrays.toString(input)));
	}

	
	static void quicksort(int [] input, int p, int r) {
		
		int q = partition(input,p,r);
		if(p==q) return;
		System.out.println("partition element is:"+q +" element is: "+input[q]);
		System.out.println(("In quick sorting:"+Arrays.toString(input)));
		
quicksort(input, p, q-1);
quicksort(input, q+1,r);
	}
	static int partition(int [] input, int p, int r) {
		int i=p-1,temp=0;
		for(int j=p; j<=r-1;j++) {
			if(input[r]>input[j]) {
				temp=input[j];
				input[j]=input[i+1];
				input[i+1]=temp;
				i++;
			}
			}
		temp=input[r];
		input[r]=input[i+1];
		input[i+1]=temp;
				return i+1;
	}
}


//
//partition element is:12 element is: 42
//In quick sorting:[2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 21, 32, 42, 54, 43]
//Sorting:[2, 3, 1, 6, 3, 8, 2, 5, 9, 11, 21, 32, 42, 54, 43]
