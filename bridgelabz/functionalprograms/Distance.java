package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.*;

public class Distance {

	public static void main(String[] args) {
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double distance=Utility.euclideanDistance(x, y);
		System.out.println("The distance from origin to your coordinate is: "+distance);
	}

}
