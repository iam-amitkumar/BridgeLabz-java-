package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.*;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("Please enter your stake to play ");
		int stake=Utility.getInt();
		System.out.println("Please enter your goal for winning the match ");
		int goal=Utility.getInt();
		System.out.println("Please enter how many times you want to play the bet ");
		int playNumber=Utility.getInt();
		Utility.gambler(stake, goal, playNumber);
	}

}
