package org.bridgelabz.algorithPrograms;

import org.bridgelabz.utility.*;
import org.bridgelabz.util.*;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter your 1st String ");
		String str1=Utility.getString();
		System.out.println("Enter your 2nd String ");
		String str2=Utility.getString();
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		if(Util.isAnagram(s1, s2)) {
			System.out.println("\nThe Two Strings are Anagram");
		}
		else {
			System.out.println("\nThe Two Strings are not Anagram");
		}
	}
}
