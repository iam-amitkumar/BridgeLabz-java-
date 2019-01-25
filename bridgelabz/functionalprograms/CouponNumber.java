package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {
		System.out.println("Please enter the number of coupons: ");
		int noOfCoupons=Utility.getInt();
		int noOfRandomNumbers=Utility.Coupon(noOfCoupons);
		System.out.println(noOfRandomNumbers);
	}
}
