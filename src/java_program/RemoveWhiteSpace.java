package java_program;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="        star    srtbh    ";
     //s=s.trim();                              it will be remove spcae front and back 
s=s.replaceAll("\\s", "");                     // but this will remove all the space of the string
System.out.println(s);
	}

}
