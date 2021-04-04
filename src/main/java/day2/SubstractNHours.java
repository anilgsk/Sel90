package day2;

import java.util.Calendar;

public class SubstractNHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, -5);
		System.out.println(cal.getTime());

	}

}
