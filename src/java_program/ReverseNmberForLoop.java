package java_program;

public class ReverseNmberForLoop {

	public static void main(String[] args) {
	/*	int num=103131;
		int rev=0;
		System.out.println("before reverse no:"+num);
		for(; num!=0 ;)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("after reverse no:"+rev);*/

		//using while loop
		int num=34567;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

}
