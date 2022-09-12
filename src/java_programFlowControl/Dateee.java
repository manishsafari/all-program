package java_programFlowControl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateee {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/YYYY");
		
		SimpleDateFormat sdc=new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		System.out.println(sdc.format(d));
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
