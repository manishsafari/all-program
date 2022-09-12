package java_programFlowControl;

public class Triky_String {

	public static void main(String[] args) {
	
		String s1="hello world";
		String s2="hello world";
		String s3=s1;
		System.out.println(s1==s2);                 
		                                    // output:-   True
		
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		
		//-------------------------------------------------------
		
		
		String n1=new String("hello world");
		String n2=new String("hello world");
		
		//output --- false
		System.out.println(n1==n2); 
		
		//output --- true
		System.out.println(n1.equals(n2));
		
		//----------------------------------------------------------
		// false
		System.out.println(s1==n2); 
		
		// true
		System.out.println(s1.equals(n2)); 
		
		
		//-- arithmatic exception will not come get output will be 
		
		System.out.println(9.0/0);
		
		System.out.println(12.33f/0);
		
		System.out.println(9/0.0);
		
		System.out.println(19.12d/0);
		
		//-- arithmatic exception will not come get output will be 
		
		System.out.println(9.0/0.0);
		
		System.out.println(0.0/0);
		System.out.println(0.0/0.0);
		
		System.out.println(12.33/0.0);
		
		System.out.println(0/0.0);
		
		// WE CAN NOT CAMPARE NaN --NOT A NUMBER
		System.out.println(Float.NaN==Float.NaN);
		System.out.println(Float.NaN!=Float.NaN);
		//-- arithmatic exception will come only integer time example
		System.out.println(10/0);
		System.out.println(0/0);
	}

}
