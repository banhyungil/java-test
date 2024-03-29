package calendar_test;

import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();		//달력 종류를 선택할 수 있기 때문에 팩토리 형식을 채택했다.
		printDate(cal);
		
		// 2020/12/25
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11);	// Month - 1
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(1993, 12, 9);// 2007년 11월 18일
		printDate(cal);
		
		cal.add(Calendar.DATE, 1000);
		printDate(cal);
	}
	
	public static void printDate(Calendar cal) {
		
		String[] days = {"일","월","화","수","목","금","토"};
		// 년도
		int year = cal.get(Calendar.YEAR);
		
		// 월(0~11), +1
		int month = cal.get(Calendar.MONTH);
		
		// 일
		int date = cal.get(Calendar.DATE);
		
		// 요일 : 1(일)~7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		// 시
		int hour = cal.get(Calendar.HOUR);
		
		// 분
		int minute = cal.get(Calendar.MINUTE);
		
		//초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year + "년 " +
				(month+1) + "월 " +
				date + "일 " + 
				hour + "시 " + 
				minute + "분 " + 
				second + "초");
	}

}
