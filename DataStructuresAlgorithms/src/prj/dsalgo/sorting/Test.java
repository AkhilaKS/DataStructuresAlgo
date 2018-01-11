/**
 * 
 */
package prj.dsalgo.sorting;

import java.util.Arrays;

/**
 * @author akhilasrinivas
 *
 */
public class Test {
	int [] classVar= new int[5];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] localVar= new int[5];
//static int[] staticVar=new int[5];
System.out.println("Local var: "+Arrays.toString(localVar));
Test testObj=new Test();
System.out.println("Class var: "+Arrays.toString(testObj.classVar));

	}
}
