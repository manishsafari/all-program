package java_program;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="java selenium java";
int total_count=str.length();
int after_remove=str.replaceAll("a", "").length();
int count=total_count-after_remove;
System.out.println("number occurance of e is:"+count);
	}

}
