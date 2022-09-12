package java_program;

//import java.util.HashSet;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String[] s= {"java","mava","java","c++"}; 
		  for(int i=0; i<s.length;i++)
		  {
		  for(int j=i+1; j<s.length;j++) 
		  {
			  if(s[i]==s[j])
		  {
		  System.out.println("found duplicate element:"+s[i]); 
		  }
		 
		  }}
		 

		// Aproach 2------- Hashset----java------collection

	/*	String[] s = { "java", "mava", "jav", "c++" };
		HashSet<String> lang = new HashSet<String>();
		lang.add("java");
		lang.add("mava");
		lang.add("jav");
		lang.add("c+");
		for (String l : s) {
			System.out.println(lang.add(l));
		}*/

	}
}