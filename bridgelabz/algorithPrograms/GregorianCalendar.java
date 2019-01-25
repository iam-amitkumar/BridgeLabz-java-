package org.bridgelabz.algorithPrograms;

import org.bridgelabz.util.*;

public class GregorianCalendar {

	public static void main(String[] args) {
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int n=Util.dayOfWeek(d, m, y);
		System.out.println(n);
		String dayString;
		switch(n) {
		case 0:dayString="Sunday	";
			break;
		case 1:dayString="Monday	";	
			break;
		case 2:dayString="Tuesday	";
			break;
		case 3:dayString="Wednesday	";
			break;
		case 4:dayString="Thursday	";
			;
		case 5:dayString="Friday	";
			break;
		case 6:dayString="Saturday	";
			break;
		default:dayString="Invalid Day";
			break;
		}
		System.out.println("---Gregorian Calendar---\n\n"+d+"/"+m+"/"+y+" falls on "+dayString);
		
	}

}
