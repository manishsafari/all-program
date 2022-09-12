package java_program;

public class Palindrome {

	public static void main(String[] args) {
	/*	int num= 123321;
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==org_num)
		{
			System.out.println("it is palindrome:"+org_num);
		}
		else
		{
			System.out.println("it is not palindrome:"+org_num);
		}*/
		
		
		//------------------------------palindrome for string-----------------------
		
		String str="madam";
		String org_str=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(org_str))
		{
			System.out.println("it is palindrome:"+org_str);
		}
		else
		{
			System.out.println("it is not palindrome:"+org_str);
		}
	}

}
