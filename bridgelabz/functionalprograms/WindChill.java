package org.bridgelabz.functionalprograms;
//
//import org.bridgelabz.utility.*;
//
//public class WindChill {
//
//	public static void main(String[] args) {
//		double t=Double.parseDouble(args[0]);
//		double v=Double.parseDouble(args[1]);
//		double res=Utility.windChillProb(t, v);
//		System.out.println("Effective temperature (the wind chill): "+res);
//	}
//
//}

// Java program to demonstrate working of ThreadLocalRandom 
// to generate random numbers. 
import java.util.concurrent.ThreadLocalRandom; 

public class WindChill 
{ 

	public static void main(String args[]) 
	{ 
		int rand_int1 = 0;
		while(true) {
			rand_int1 = ThreadLocalRandom.current().nextInt();
			if(rand_int1 >= 50 && rand_int1 <= 100) {
				System.out.println("Random Integers: " + rand_int1);
				break;
			}
		}
	} 
} 
