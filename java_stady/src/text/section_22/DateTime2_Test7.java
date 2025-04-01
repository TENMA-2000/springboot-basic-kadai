package text.section_22;

import java.time.LocalDate;


public class DateTime2_Test7 {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(1999, 1, 2);
		
		System.out.println(date1);
		
		System.out.println("1年後は" + date1.plusYears(1));
		
		System.out.println("1か月後は" + date1.plusMonths(1));
		
		System.out.println("5日後は" + date1.plusDays(5));

	}

}
