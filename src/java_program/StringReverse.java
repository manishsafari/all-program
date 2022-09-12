package java_program;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="look at me code";
String[] words=str.split("\\s");
String rev_w=" ";
for(String w:words)
{
	StringBuilder sbl=new StringBuilder(w);
	sbl.reverse();
	rev_w=rev_w+sbl.toString()+" ";
}
System.out.println(rev_w);
	}

}
