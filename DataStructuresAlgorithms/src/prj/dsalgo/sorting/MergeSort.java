/**
 * 
 */
package prj.dsalgo.sorting;

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
		 int[]  input={2,3,1,6,3,8,2,5,9,11,43,21,32,54,42};
			int [] output=mergesort(input,0,input.length);
	}
static int[] merge(int[] a,int p,int q,int r) {
	int[] left= {}; int[] right= {};int m=0,n=0,i=0,j=0;int[] result= {};
	for(i=p;i<=(r-1);i++) {
		left[m]=a[i]; m++;
	}
	for(j=r;j<=q;j++) {
		right[n]=a[j]; n++;
	}
	i=j=0;
	for(int k=0;k<(m+n);k++) {
		if(left[i]<right[j]) {
			result[k]=left[i];i++;}
		else { result[k]=right[j];j++;}
	}
	
	return result;
	
}

static int[] mergesort(int[] a,int p,int q) {
	int r=(p+q)/2;
	mergesort(a,p,r-1);
	mergesort(a,r,q);
	return merge(a,p,q,r);
}
}
