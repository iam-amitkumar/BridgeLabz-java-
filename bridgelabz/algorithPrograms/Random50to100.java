package org.bridgelabz.algorithPrograms;
//
import java.util.concurrent.ThreadLocalRandom;

public class Random50to100 {

	public static int randomNumber(int min, int max) {
		int randNum = 0;
		while(true) {
			int random = ThreadLocalRandom.current().nextInt();
			if(random >= min && random <= max) {
				randNum = random;
				break;
			}
		}
		return randNum;
	}
	
	
	public static void main(String[] args) {
//		System.out.println(randomNumber(50, 100));
		
		int abc = randomNumber(50, 100);
		System.out.println(abc);
	}
}


