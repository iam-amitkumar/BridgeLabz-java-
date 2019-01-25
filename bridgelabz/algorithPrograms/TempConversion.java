package org.bridgelabz.algorithPrograms;

import org.bridgelabz.utility.*;
import org.bridgelabz.util.*;

public class TempConversion {

	public static void main(String[] args) {
		System.out.println("Please enter your option: \n"
				+ "1. Press 1 to convert Celsius to Fahrenheit \n"
				+ "2. Press 2 to convert Fahrenheit to Celsius \n");
		int option=Utility.getInt();
		double res=Util.temperaturConversion(option);
		System.out.println("\n"+res);
	}

}
