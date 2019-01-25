package org.bridgelabz.algorithPrograms;

import org.bridgelabz.utility.*;
import org.bridgelabz.util.*;

public class DecToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a binary number: ");
		int dec=Utility.getInt();
		String res=Util.toBinary(dec);
		System.out.println("\nBinary form of "+dec+": "+res);
		
	}
}
