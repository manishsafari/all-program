package java_program;

import java.util.Arrays;

public class twoArrayEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {1,4,3,5,6,8};
		int[] b= {1,4,3,5,6,8};
		boolean status=Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println("Array are Equal:");
		}
		else
		{
			System.out.println("Array are not Equal:");
		}
	}

}
