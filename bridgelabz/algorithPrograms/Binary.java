package org.bridgelabz.algorithPrograms;

import org.bridgelabz.utility.*;
import org.bridgelabz.util.*;

public class Binary {

	public static void main(String[] args) {
		int number=Utility.getInt();
		
		String s=Util.toBinary(number);
		String str=Util.eightBits(s);
		System.out.println("\nI:\nEight bit binary representation of "+number+"(decimal): "+str);
		
		String firstFour=str.substring(0,4);
		String secondFour=str.substring(4);
		System.out.println("\nFirst half Nibble: "+firstFour+"\nSecond half Nibble: "+secondFour);
		
		String swapped=Util.swapNibble(firstFour, secondFour);
		System.out.println("\nSwapped Nibble = "+swapped);
		
		long num=Long.valueOf(swapped);
		
		long decimal=Util.toDecimal(num);
		System.out.println("\nDecimal representation of "+swapped+"(binary): "+decimal);
		
		if(Util.isPowerOfTwo(decimal)) {
			System.out.println("\nII:\nYes, The resultant number is power of 2");
		}
		else {
			System.out.println("\nII:\\nNo, The resultant number is not power of 2");
		}
	}

}
