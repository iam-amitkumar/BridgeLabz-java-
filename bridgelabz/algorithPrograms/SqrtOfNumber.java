package org.bridgelabz.algorithPrograms;

import org.bridgelabz.utility.*;
import org.bridgelabz.util.*;

public class SqrtOfNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a non-negative number: ");
		double c=Utility.getDouble();
		double res=Util.sqrt(c);
		System.out.println("\nSqure Root using Newton's Method: "+res);
	}

}
