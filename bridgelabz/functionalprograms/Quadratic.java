package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.*;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Please enter the value of a(a should not be 0): ");
		double a=Utility.getDouble();
		System.out.println("Please enter the value of b: ");
		double b=Utility.getDouble();
		System.out.println("Please enter the value of c: ");
		double c=Utility.getDouble();
		Utility.QuadEquation(a, b, c);
	}

}
