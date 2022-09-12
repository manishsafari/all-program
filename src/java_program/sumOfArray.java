package java_program;

public class sumOfArray {

	public static void main(String[] args) {
		int[] a= {10,30,40,50};
		int sum=0;
		for(int i=0; i<=a.length-1;i++)
		{
			sum=sum + a[i];
		}
System.out.println("sum of array no. is:"+sum);
	}

}
