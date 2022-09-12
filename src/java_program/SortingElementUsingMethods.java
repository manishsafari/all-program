package java_program;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementUsingMethods {

	public static void main(String[] args) {
		// Assending order
/*int[] a= {200,10,3,55,50,99};
System.out.println("array before sorting"+Arrays.toString(a));
//Arrays.parallelSort(a);          ---------------------method1
Arrays.sort(a);
System.out.println("array After sorting"+Arrays.toString(a));    */
		
		
		//decending order for sorting order
		
		Integer[] a= {23,45,12,56,78};
		System.out.println("array before sorting"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("array After sorting"+Arrays.toString(a));
	}

}
