package java_program;

public class primeOrNot {

	public static void main(String[] args) {
		int num= 11;
		boolean prime=true;
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				prime=false;
				break;
			}
		}
if(prime)
{
	System.out.println(num+ "it is prime");
}
else
{
	System.out.println(num+ "it is not prime");
}
	}

}
