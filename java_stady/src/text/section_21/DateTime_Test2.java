package text.section_21;

import java.util.Calendar;
import java.util.Date;

public class DateTime_Test2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		Calendar calender = Calendar.getInstance();
		
		
		calender.setTime(date);
		
		System.out.println("年は" + calender.get(Calendar.YEAR));
		
		System.out.println("月は" + calender.get(Calendar.MONTH));
		System.out.println("日は" + calender.get(Calendar.DATE));
		
		System.out.println("時間は" + calender.get(Calendar.HOUR));
		System.out.println("分は" + calender.get(Calendar.MINUTE));
		System.out.println("秒は" + calender.get(Calendar.SECOND));

	}

}
