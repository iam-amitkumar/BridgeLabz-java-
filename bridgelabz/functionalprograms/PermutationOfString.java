package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.*;

public class PermutationOfString {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		String str=Utility.getString();
		int length=str.length();
		Utility.stringPermutation(str, 0, length-1);
	}

}
