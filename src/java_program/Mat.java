package java_program;

//import junit.framework.Test;

public class Mat {
	
	
	public static void main(String[] args) {
/*
		String s="Test";
		String s1="TES";
		
System.out.println(s.equalsIgnoreCase(s1));


		int a=3;
		int a=5;
		System.out.println(a);
		
		*/
		int []a= {1,2,5,6,4,3,30};
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
