package org.bridgelabz.algorithPrograms;

import org.bridgelabz.util.*;

public class Payment {

	public static void main(String[] args) {
		double P=Double.parseDouble(args[0]);
		int Y=Integer.parseInt(args[1]);
		double R=Double.parseDouble(args[2]);
		double res=Util.monthlyPayment(P, Y, R);
		System.out.println("Payment is: "+res);
	}

}
