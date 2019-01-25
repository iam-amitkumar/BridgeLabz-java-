/**
 *This program takes a command­line argument N and prints a
 *table of the powers of 2 that are less than or equal to 2^N
 */
package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.Utility;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]); // command line argument is used here where input is in String and parsed in integer value
		if(n>=0 && n<31) {	//here condition is applied that value of input should be greater than or equals to 0 but less than 31
			Utility.printTable(n);  //printTable method get called from Utility class to print the table
		}
		else {
			System.out.println("Please enter the value less than 31");//if the value of input "n" is greater than 30 then this message will print
		}
	}

}
