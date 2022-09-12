package java_program;

public class maxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {19,30,50,64,167};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum element in array:"+max);
	}

}
