/**
 * This is a Utility class which contains 
 * all the concrete methods which can be called
 * within any program from any class
 * 
 * @author Amit Kumar
 * @version 1.0
 * @since 13/12/2018
 */
package org.bridgelabz.utility;

import java.time.Instant;
import java.util.*;

public class Utility {
	static Scanner sc=new Scanner(System.in);

	/*
	 * This function is used to take the String from
	 * the user and return it.
	 */
	public static String getString() {
		System.out.println("Enter String/Sentence: ");
		String s=sc.nextLine();
		return s;
	}

	/*
	 * This function is used to take the an integer
	 * value from the user and return it.
	 */
	public static int getInt() {
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		return number;
	}

	/*
	 * This function is used to take the an double
	 * value from the user and return it.
	 */
	public static double getDouble() {
		System.out.println("Enter a number: ");
		double number=sc.nextDouble();
		return number;
	}

	/*
	 * coinFlip function is used to generate random values between
	 * 0 and 1 upto n times taken by user and if the random generated value is
	 * less than 0.5 it counted as tail otherwise head. This method
	 * also calculate the percentage of heads and tails occured.
	 */
	public static void coinFlip(double flips) {	
		int head=0,tail=0;
		Random r=new Random();
		for(int i=1;i<=flips;i++) {	  //repeat the process of generating random number flip times provided by user
			double value=r.nextDouble(); //generate random value between 0 and 1 and store it in value
			if(value<0.5) 
				tail++; //increment the value of tail if random value is less than 0.5
			else 
				head++; //increment the value of tail if random value is more than 0.5
		}
		double tailPercent=((tail/flips)*100);  //calculate the percentage of tail
		System.out.println("Percentage of tails: "+tailPercent);
		double headPercent=((head/flips)*100);	//calculate the percentage of head
		System.out.println("Percentage of heads: "+headPercent);
	}

	/*
	 * isLeap function is used to take value of year by user and calculate
	 * if it is a leap year or not only if the year is a four digit number.
	 */
	public static void isLeap(int year) {
		if(String.valueOf(year).length()==4){	//this line first parse int into String and check the length of String
			if((year%4==0 && year%100!=0 )||(year%400==0)) {  //if the length of the year is 4 then it calculate if it is leap year or not
				System.out.println(year+ " is leap year"); //if the given year is a leap year then this message get printed
			}
			else {
				System.out.println(year+ " is not a leap year"); //if the given year is not a leap year then this message get printed
			}
		}
		else {
			System.out.println("Please enter four digit year only"); //if the given year length is not equals to 4, this message get printed
		}
	}

	/*
	 * findPower method is used to find out the power of any digit
	 * with any base.
	 */
	public static int findPower(int base,int pow) {
		int power=1;
		while(pow!=0) {
			power=power*base;
			pow--;
		}
		return power;
	}

	/*
	 * printTable is used to print a table using findPower method
	 * where base is fixed, i.e., 2 and power value vary from 1
	 * to n where n is user input
	 */
	public static void printTable(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("2 ^ "+i+" = "+Utility.findPower(2, i));
		}
	}

	/*
	 * nthHarmonic method is used to print the nth term in a harmonic
	 * series where n is user input.
	 */
	public static void nthHarmonic(int num) {
		double sum=0.0;
		if(num==0) {
			System.out.println("Please enter the value greater than 0");
		}
		else {
			for(int i=1;i<=num;i++) {
				sum=sum+(1.0/i);
			}
		}
		System.out.println("the Nth Harmonic Value: "+sum);
	}

	/*
	 * factors method is used to find all the prime
	 * factors upto value n where n is user input.
	 */
	public static void factors(int num) {
		for(int i=2;i*i<=num;i++) {
			while(num%i==0) {
				System.out.print(i+" ");
				num=num/i;
			}
		}
		if(num>1) {
			System.out.println(num);
		}
	}

	/*
	 * gambler method takes the @param
	 */
	public static void gambler(int stake,int goal,int playNumber) {
		double win=0,loss=0;
		for(int i=1;i<=playNumber;i++) {
			if(stake>0) {
				if(stake<=goal) {
					Random r =new Random();
					int winOrLoss=r.nextInt(2); //generate random number to decide randomly whether the player is win or lost the bet
					if(winOrLoss==1) {  //when random number generated as 1 then it is considered as Win
						stake++;  //stake get increased by 1 currency unit when player win the bet
						win++;  //count the number of wins
					}
					else {  	//when random number generated as 0 then it is considered as Loss
						stake--;  //stake get reduced by 1 currency unit when player lost the bet
						loss++;  //count the number of loss
					}
				}
				else {
					System.out.println("\nCongrats!!! You have reached your Goal");
					break;
				}
			}
			else {
				System.out.println("\nOops! You lost all your stake money");
				break;
			}
		}
		double numberOfPlay=win+loss;
		double winPercent=(win/numberOfPlay)*100;
		double lossPercent=(loss/numberOfPlay)*100;//calculate the percentage player win the bets
		System.out.println("\nNumber of Wins: "+(int)win+" out of "+(int)numberOfPlay);
		System.out.println("Percentage of wins: "+winPercent);
		System.out.println("Percentage of loss: "+lossPercent);

		/*	public static void gambler(int stake,int goal,int playNumber) {
				double win=0,loss=0;
				for(int i=1;i<=playNumber;i++) {
					if(stake>0 && stake<=goal) {
						Random r =new Random();
						int winOrLoss=r.nextInt(2); //generate random number to decide randomly whether the player is win or lost the bet
						System.out.println(winOrLoss);
						if(winOrLoss==1) {  //when random number generated as 1 then it is considered as Win
							stake++;  //stake get increased by 1 currency unit when player win the bet
							win++;  //count the number of wins
						}
						else {  	//when random number generated as 0 then it is considered as Loss
							stake--;  //stake get reduced by 1 currency unit when player lost the bet
							loss++;  //count the number of loss
						}
					}
				}
				double winPercent=(win/(win+loss))*100;  //calculate the percentage player win the bets
				System.out.println("Number of Wins: "+win);
				System.out.println("Percentage of wins: "+winPercent);
			}*/
	}


	public static int maxOfArray(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}


	public static int Coupon(int noOfCoupons) {
		int count=0;
		int[] couponsArr=new int[noOfCoupons];
		for(int i=0;i<couponsArr.length;i++) {
			System.out.print("Please enter Coupon number "+(i+1)+" : ");
			couponsArr[i]=sc.nextInt();
		}
		int maxValue=maxOfArray(couponsArr);
		int l=couponsArr.length;
		while(l!=0) {
			count++;
			Random r=new Random();
			int rand=r.nextInt(maxValue+1);
			for(int i=0;i<l;i++) {
				if(couponsArr[i]==rand) {
					couponsArr[i]=couponsArr[l-1];
					l--;
					break;
				}
			}
		}
		return count;
	}

	public static int[][] intTwoDArray(int rows,int columns) {
		int[][] arr1=new int[rows][columns];
		System.out.println("Please enter "+rows+"*"+columns+" ,i.e., "+rows*columns+" elements for Array(integer): ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		return arr1;
	}

	public static double[][] doubleTwoDArray(int rows,int columns) {
		double[][] arr2=new double[rows][columns];
		System.out.println("Please enter "+rows+"*"+columns+" ,i.e., "+rows*columns+" elements for Array(double): ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr2[i][j]=sc.nextDouble();
			}
		}
		return arr2;
	}

	public static boolean[][] booleanTwoDArray(int rows,int columns) {
		boolean[][] arr3=new boolean[rows][columns];
		System.out.println("Please enter "+rows+"*"+columns+" ,i.e., "+rows*columns+" elements for Array(boolean): ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr3[i][j]=sc.nextBoolean();
			}
		}
		return arr3;
	}

	public static void displayArr(int[][] intTwoDArray,double[][] doubleTwoDArray,boolean[][] booleanTwoDArray, int m,int n) {
		//		PrintWriter pw=new PrintWriter(System.out,true);
		System.out.println("Display integer matrix: \n");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(intTwoDArray[i][j]+"    ");
			}
			System.out.println("\n");
		}

		System.out.println("Display double matrix: \n");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(doubleTwoDArray[i][j]+"    ");
			}
			System.out.println("\n");
		}

		System.out.println("Display boolean matrix: \n");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(booleanTwoDArray[i][j]+"     ");
			}
			System.out.println("\n");
		}
	}


	public static int[] createArray() {
		System.out.print("Please enter size of the array: ");
		int arraySize=sc.nextInt();
		int[] arr=new int[arraySize];
		for(int i=0;i<arr.length;i++) {
			arr[i]=getInt();
		}
		return arr;
	}

	public static void dispArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static void tripletSumZero(int[] arr) {
		int count=0;
		String str;
		ArrayList<String> hs=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if((arr[i]+arr[j]+arr[k])==0) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
						str=""+arr[i]+arr[j]+arr[k];
						System.out.println("String-->"+str);
						hs.add(str);
					}
				}
			}
		}
		System.out.println(hs);
		System.out.println("Total triplets are: "+count);
	}

	public static double euclideanDistance(double x,double y) {
		double distance=Math.sqrt((Math.pow(x,2)+Math.pow(y, 2)));
		return distance;
	}


	public static void stopwatchTime() {
		long start=0,stop=0;
		boolean option=true;
		boolean a = false;
		int input;
		while(option==true) {
			System.out.println("Enter your option: \n"
					+ "1. Press 1 to start the stopwatch\n"
					+ "2. Press 2 to stop the stopwatch");
			System.out.println("\nEnter your option: ");
			input=sc.nextInt();
			if(input==1) {
				start=Instant.now().getEpochSecond();
				a=true;
			}
			else if(input==2 && a==true) {
				stop=Instant.now().getEpochSecond();
				long resTime=stop-start;
				System.out.println("\nElapsed time : "+resTime+" seconds");
				option=false;
				break;
			}
			else {
				System.out.println("\nInvalid input (Press 1 or 2 only)");
				break;
			}
		}
	}


	public static void QuadEquation(double a,double b,double c) {
		double root1,root2=0;
		double determinant=((b*b)-(4*a*c));
		if(determinant>0) {
			root1=(-b+Math.sqrt(determinant))/(2*a);
			root2=(-b-Math.sqrt(determinant))/(2*a);
			System.out.println("\nRoot 1 = "+root1+"\n"
					+ "Root 2 = "+root2);
		}
		else if(determinant==0) {
			root1=(-b/(2*a));
			System.out.println("\nRoot 1 = Root 2 = "+root1);
		}
		else {
			double realPart=(-b/(2*a));
			double imaginaryPart=(Math.sqrt(-determinant)/(2*a));
			System.out.println("\nRoot 1 = "+realPart+"+"+imaginaryPart+"i\n"
					+ "Root 2 = "+realPart+"-"+imaginaryPart+"i");
		}
	}

	public static double windChillProb(double t,double v) {
		double w=0;
		if((t<=50) && (t<=120 && t>=3)) {
			w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v, 0.16));
		}
		else {
			System.out.println("Value of 't' should not exced more than 50\n"
					+ "Value of 'v' should not exceed more than 120 or less than 3	");
		}
		return w;
	}

	public static String swapChar(String str,int a,int b) {
		char temp;
		char[] charArray=str.toCharArray();
		temp=charArray[a];
		charArray[a]=charArray[b];
		charArray[b]=temp;
		return String.valueOf(charArray);
	}

	public static void stringPermutation(String str,int initialPos, int lastPos) {
		if(initialPos==lastPos) {
			System.out.println(str);
		}
		else {
			for(int i=initialPos;i<=lastPos;i++) {
				swapChar(str, initialPos, i);
				stringPermutation(str, initialPos+1, lastPos);
				str=swapChar(str, initialPos, lastPos);
			}
		}
	}

	//Tic Tac Toe
//	public static char[][] board(){
//		char[][] board=new char[3][3];
//		for(int i=0;i<board.length;i++) {
//			for(int j=0;j<board.length;j++) {
//				board[i][j]='_';
//			}
//		}
//		return board;
//	}

	public static void printBoard(char[][] board) {
		for(int i=0;i<board.length;i++) {
			System.out.print("| ");
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" | ");
			}
			System.out.println("\n");
		}
		System.out.println();
	}
	public static boolean checkWin(char[][] board) {
		if((board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O') ||
				(board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O')||
				(board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O')||
				(board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O')||
				(board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O')||
				(board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O')||
				(board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O')||
				(board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O')||
				(board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O')) {
				return true;
			}
		return false;
	}


}







