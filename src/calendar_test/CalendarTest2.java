package calendar_test;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		printCalendar(cal);
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, 11);		//달수는 -1
		cal.set(Calendar.DATE, 9);
		printCalendar(cal);
		cal.set(1993,11,9);			
		printCalendar(cal);
	}
	
	public static void printCalendar(Calendar cal) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토" };
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);	//요일 1~7까지
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year + "년 " +
				(month+1) + "월 " +
				date + "일 " +
				days[day-1] + "요일 " +
				hour + "시 " + 
				minute + "분 " + 
				second + "초");
	}
}
