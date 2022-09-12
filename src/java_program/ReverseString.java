package java_program;

public class ReverseString {

	public static void main(String[] args) {
	/*	String s="Varanasishiva";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string value:"+rev);*/
		
		//---------------------using StringBuffer-------------------
		
	
	/*	String s="Varanasishiva";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());     */
		
		//-----------------using StringBuilder----------------
		
		String s="avihsisanaraV";
		StringBuilder sbl=new StringBuilder(s);
		System.out.println(sbl.reverse());
		
	}

}
