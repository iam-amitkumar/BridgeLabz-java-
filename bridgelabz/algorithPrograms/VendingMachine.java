package org.bridgelabz.algorithPrograms;

import org.bridgelabz.utility.*;
import org.bridgelabz.util.*;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Please enter the amount you want to withdraw: ");
		int amount=Utility.getInt();
		Util.vendingRecur(amount,0,0);
	}
}
