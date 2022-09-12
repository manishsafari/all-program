package java_program;

public class evenOddArrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,4,5,6,7};
System.out.println("even no. is:");
for(int value:a)
{
	if(value%2==0)
		System.out.println(value);
}
System.out.println("odd no. is:");
for(int value:a)
{
	if(value%2!=0)
		System.out.println(value);
}
	}
	}

