/**
 * The CoinFlip program implements simply 
 * print the percentage of heads and tails
 * where number of flips is user input
 * 
 * @author Amit Kumar
 * @version 1.0
 * @since 13/12/2018
 */
package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.Utility;

public class CoinFlip {
	public static void main(String[] args) {
		System.out.println("Please enter the number of flips");
		double flips=Utility.getDouble();  //user input taken for the number of times coin get flip
		Utility.coinFlip(flips);  //Method coinFlip called from the Utility class with @param number of coin flips
	}
}
