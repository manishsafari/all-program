package java_program;

public class Lagestno {

	public static void main(String[] args) {
		
		// largest no. in two no.  ternary
	/*	
		int a=20,b=54,max;
		max=(a>b)?a:b;
		System.out.println("maximum no. is:"+max);
		
		*/
		// largest no. in three  no.  ternary
		
		int a=20,b=54,c=90,max;
		max=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("maximum no. is:"+max);
	}

}
