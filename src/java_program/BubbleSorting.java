package java_program;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,2,3,6,7};
System.out.println("array before sorting"+Arrays.toString(a));
int n=a.length;
for(int i=0; i<n-1;i++)
{
	for(int j=0; j<n-1; j++)
	{
		if(a[j]>a[j+1])
		{
			int b=a[j];
			a[j]=a[j+1];
			a[j+1]=b;
		}
	}
}
System.out.println("array After sorting"+Arrays.toString(a));
	}

}
