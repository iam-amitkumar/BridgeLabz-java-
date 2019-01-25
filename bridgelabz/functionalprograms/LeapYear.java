/**
 * LeapYear program take the year as user input
 * and tells the user that the given year is 
 * leap year or not if and only if the given
 * year having four digit else print message
 * to give a valid year.
 */
package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Please enter the year: ");
		int year=Utility.getInt(); //getInt method called from Utility class to take the user input "year"
		Utility.isLeap(year);  //isLeap method get called from Utility class to to check if the year is four digit or not and year is leap or not
	}
}
