package java_program;

public class RemoveJunkAndSecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="asdf34566@#$%SADTGFHGJ&^*0";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
