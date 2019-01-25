package org.bridgelabz.algorithPrograms;

import org.bridgelabz.util.Util;
import org.bridgelabz.utility.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.print("Enter your max range: ");
		int maxRange=Utility.getInt();
		Util.primeInRange(maxRange);
	}
}
