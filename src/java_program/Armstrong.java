package java_program;

public class Armstrong {

	public static void main(String[] args) {
		int num=15;
		int org_num=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
			
		
		if(org_num==sum)
		{
			System.out.println("it is armstrong"+org_num);
		}
		else
		{
			System.out.println("it is not armstrong"+org_num);
		}
		
	}

}
