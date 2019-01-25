package org.bridgelabz.algorithPrograms;

import org.bridgelabz.utility.*;
import org.bridgelabz.util.*;

public class PrimeAnagramPalindrome {

	public static void main(String[] args) {
		int number=Utility.getInt();
		System.out.println("\nPrime & Palindrome & Anagram Numbers upto "+number+": ");
		for(int i=2;i<=number;i++) {
			if(Util.isPrime(i)&&Util.isNumberPalindrome(i)&&Util.isNumberAnagram(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
