package day2;

import java.text.DecimalFormat;

public class FloatSealing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 15.4712377;
		
		DecimalFormat numtoformate = new DecimalFormat("###.##");
		System.out.println(numtoformate.format(d));

	}

}
