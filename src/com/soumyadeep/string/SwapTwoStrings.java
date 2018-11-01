package com.soumyadeep.string;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		/*
		 * Algorithm 
		 * 1) Append second string to first string and store in first string:
		 * a = a + b
		 * 
		 * 2) call the method substring(int beginindex, int endindex) by passing
		 * beginindex as 0 and endindex as, a.length() - b.length(): b =
		 * substring(0,a.length()-b.length());
		 * 
		 * 3) call the method substring(int beginindex) by passing b.length() as
		 * argument to store the value of initial b string in a a =
		 * substring(b.length());
		 */

		// Declare two strings 
		String s1="soumyadeep1";
		String s2="soumyadeep2";
		
		// Print String before swapping 
		System.out.println("Strings before swap: s1 = " + s1 + " and s2 = "+s2);
		
		// append 2nd string to 1st
		s1=s1+s2;
		// store intial string a in string b
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println("Strings after swap: s2 = " +s2);
		
		// store initial string b in string a
		s1=s1.substring(s2.length());
		System.out.println("Strings after swap: s1 = " +s1);
		
		// print String after swapping 
        System.out.println("Strings after swap: s1 = " +  s1 + " and s2 = " + s2);
	}
}
