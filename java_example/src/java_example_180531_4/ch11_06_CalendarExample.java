package java_example_180531_4;
// p.540
import java.util.Calendar;

public class ch11_06_CalendarExample {

	public static void main(String[] args) {
		
		Calendar now=Calendar.getInstance();
		
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH);
		int day=now.get(Calendar.DAY_OF_MONTH);
		int week=now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		
		
		System.out.println(year);
		
		
	}

}
