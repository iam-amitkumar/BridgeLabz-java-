/**
 * The HelloUser program implements simply replace
 * the "<<UserName>>" from the String template with
 * the user input name and displays it.
 * 
 * @author Amit Kumar
 * @version 1.0
 * @since 13/12/2018
 */
package org.bridgelabz.functionalprograms;

import org.bridgelabz.utility.Utility;

public class HelloUser {
	public static void main(String[] args) {
		String str="Hello <<UserName>>, How are you?"; //String template which will updated after user input
		System.out.println(str);
		String userName=Utility.getString(); //"getString" method called which is declared in Utility class
		String s="";
		if(userName.length()>=3) { 			//length of the user input String get checked
			s+=str.substring(0, 6); 		//substring "Hello" extracted and concat with s(having null)
			s=s+userName; 					//"Hello" concatinated with user input name
			s=s+str.substring(18, 32); 		/*rest of the substring get extracted from the string 
									   		after <<UserName>> and concatinated with String s*/
			System.out.println(s);
		}
		else {
			System.out.println("Plese enter a name with min length of 3 letters");
		}
	}
}
