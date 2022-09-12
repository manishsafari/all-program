package java_program;

import java.util.Arrays;


public class CountDuplicateOccuranceDecending {

	public static void main(String[] args) {
		int []arr= {8,4,3,5,6,7,6,3,4,5,3,4,7,8,4};
		countOccurance(arr);
	}
	static void countOccurance(int []arr)
	{
		Arrays.sort(arr);
		
		System.out.println(""+Arrays.toString(arr));
		
		for(int i=arr.length;i>=0; i--)
		{
			int count=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					count++;
				else
					break;
			}
			
			System.out.println(arr[i]+"->"+count);
			i+=(count-1);
	}

}}
