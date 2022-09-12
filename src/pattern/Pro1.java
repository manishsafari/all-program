package pattern;

public class Pro1 {

	public static void main(String[] args) {
		
	/*	for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
			System.out.print(" * ");
			}
		
		System.out.println("");
		}
		
	}}
		
		*/
	/*	
		
		for(int i=1; i<=4; i++)
		{
			if(i==4)
				break;
			for(int j=1; j<=4; j++)
				
			{
			System.out.print(" * ");
			}
		
		System.out.println("");
		}
		
	}}
		*/
	
/*		
for(int i=0; i<=4; i++)
{

	for(int j=4 ; j>=i+1; j--)
		
	{
		System.out.print(" * ");
	
		
	}
	
	System.out.println("  ");
}

		
	}
	}

*/
/*
for(int i=0; i<=4; i++)
{

	for(int j=1 ; j<=4-i; j++)
		
	{
		System.out.print(" ");
	
	}
	for(int k=0;k<=i; k++)
	{
		System.out.print("*");
	}
	
	System.out.println("  ");  
	                                // System.out.println("");
}

		
	}
	}

*/

for(int i=1; i<=4; i++)
{

	for(int j=1 ; j<=4; j++)
		
	{
		if(i==1||i==4||j==1||j==4)
		{
		System.out.print("*");
	
	}
		else
		{
	//System.out.print(""); 
	System.out.print(" ");
}
		
	}
	System.out.println();
}}}