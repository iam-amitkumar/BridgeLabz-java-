package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.*;

public class TwoDimentionArray {

	public static void main(String[] args) {
		System.out.println("Please enter row number 'M': ");
		int m=Utility.getInt();
		System.out.println("Please enter column number 'N': ");
		int n=Utility.getInt();
		int[][] dispIntArr=Utility.intTwoDArray(m,n);
				
		double[][] dispDoubleArr=Utility.doubleTwoDArray(m,n);
		
		boolean[][] dispBooleanArr=Utility.booleanTwoDArray(m,n);
		
		Utility.displayArr(dispIntArr,dispDoubleArr,dispBooleanArr,m,n);
	}
}
