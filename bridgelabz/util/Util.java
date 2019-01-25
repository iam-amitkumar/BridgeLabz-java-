package org.bridgelabz.util;

import java.util.Arrays;

import org.bridgelabz.utility.Utility;

public class Util {

	public static boolean isAnagram(char[] s1,char[] s2) {
		int string1Length=s1.length;
		int string2Length=s2.length;
		if(string1Length!=string2Length) {
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<string1Length;i++) {
			if(s1[i]!=s2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int number) {
		int count=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count>0)
			return false;
		return true;
	}

	public static void primeInRange(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isNumberPalindrome(int number) {
		int r=0,rev=0;
		int tempNumber=number;
		while(number!=0) {
			r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		if(tempNumber!=rev)
			return false;
		return true;
	}

	//	public static int numberLength(int number) {
	//		int count=0;
	//		while(number!=0) {
	//			@SuppressWarnings("unused")
	//			int r=number%10;
	//			count++;
	//			number=number/10;
	//		}
	//		return count;
	//	}

	public static boolean isNumberAnagram(int number) {
		if(isNumberPalindrome(number)) //if a number is  palindrome then for sure it will be anagram
			return true;
		return false;
	}

	//Vending Machine using iteration
	//	public static void vendingMachineProb(int amount) {
	//		System.out.println("\nAmount ----> "+amount+"\n");
	//		int[] rupees= {1000,500,100,50,10,5,2,1};//5525
	//		int notes=0;
	//			for(int i=0;i<rupees.length;i++) {
	//				if(amount/rupees[i]>0) {
	//					System.out.println("notes of"+rupees[i]+" is "+amount/rupees[i]);
	//					notes=notes+amount/rupees[i];
	//					amount=amount%rupees[i];
	//				}
	//			}
	//			System.out.println("total no. of notes is "+notes);
	//			}
	//	
	//vending machine recursion
	public static void vendingRecur(int amount,int notes,int i) {
		int[] rupees= {1000,500,100,50,10,5,2,1};
		if(amount==0&&i==rupees.length) {
			System.out.println("total notes is "+notes);
			return;
		}
		if(amount/rupees[i]>0) {
			System.out.println("notes of"+rupees[i]+" is "+amount/rupees[i]);
			notes=notes+amount/rupees[i];
			amount=amount%rupees[i];
		}
		vendingRecur(amount,notes,i+1);
		
	}

	public static int dayOfWeek(int d,int m,int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31*m0 / 12) % 7;
		return d0;
	}
	
	public static double temperaturConversion(int option) {
		double temp;
		double res=0;
		if(option==1) {
			System.out.println("\nEnter the temperature in Celcius: ");
			temp=Utility.getDouble();
			res=(temp*9/5)+32;
		}
		else if(option==2) {
			System.out.println("\nEnter the temperature in Fahrenheit: ");
			temp=Utility.getDouble();
			res=(temp-32)*5/9;
		}
		else {
			System.out.println("Invalid input");
		}
		return res;
	}
	
	public static double monthlyPayment(double P,int Y,double R) {
		double n=12*Y;
		double r=R/(12*100);
		double paymentDen=(1-Math.pow((1+r), -n));
		double payment=(P*r)/paymentDen;
		return payment;
	}
	
	public static double sqrt(double c) {
		double t=c;
		if(c>0) {
			double epsilon = 1e-15;
			while(Math.abs(t - c/t) > epsilon*t) {
				t=((c/t)+t)/2;
			}
		}
		else {
			System.out.println("Please enter positive number");
		}
		return t;
	}
	
	public static String toBinary(int dec) {
		String bin="";
		while(dec!=0) {
			int rev=dec%2;
			bin=rev+bin;
			dec=dec/2;
		}
		return bin;
	}
	
	
	public static int lengthOfDigit(int number) {
		int count=0;
		while(number!=0) {
			@SuppressWarnings("unused")
			int rem=number%10;
			count++;
			number=number/10;
		}
		return count;
	}
	
	
	public static String eightBits(String str) {
		while((str.length())!=8) {
			str="0"+str;
		}
		return str;
	}
	
	public static String swapNibble(String first,String second) {
		String temp=first;
		first=second;
		second=temp;
		String swapped=first+second;
		return swapped;
	}
	
	
	public static long toDecimal(long bin) {
		long dec=0;
		int count=0;
		while(bin!=0) {
			long r=bin%10;
			dec=(long) (dec+r*Math.pow(2, count));
			count++;
			bin=bin/10;
		}
		return dec;	
	}
	
	public static boolean isPowerOfTwo(long num) {
		for(int i=1;i<=num/2;i++) {
			if(Math.pow(2, i)==num)
				return true;
		}
		return false;
	}
	
	
	
	
}











