package java_example_180531_4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ch11_04_DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow=now.toString();
		System.out.println(strNow);
		System.out.println(now);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		
		String strNow2=sdf.format(now);
		System.out.println(strNow2);
		

	}

}
