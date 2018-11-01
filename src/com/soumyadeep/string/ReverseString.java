package com.soumyadeep.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {

		// Converting String into Bytes
		/*
		 * 1. Create a temporary byte[] of length equal to the length of the input
		 * string. 2. Store the bytes (which we get by using getBytes() method) in
		 * reverse order into the temporary byte[] . 3. Create a new String abject using
		 * byte[] to store result.
		 */
		String s1="abcdefgfhijklmnopqrstuvwxyz";
		byte [] s1bArray=s1.getBytes();
		byte [] finalString=new byte[s1bArray.length];
		for(int i=0;i<s1bArray.length; i++) {
			finalString[i]=s1bArray[s1bArray.length-i-1];
		}
		System.out.println("String into Bytes: "+new String(finalString));
		
		// Using built in reverse() method of the StringBuilder class
		/*
		 * String class does not have reverse() method, we need to convert the input
		 * string to StringBuilder, which is achieved by using the append method of
		 * StringBuilder. After that, print out the characters of the reversed string by
		 * scanning from the first till the last index
		 */
		String s2="abcdefgfhijklmnopqrstuvwxyz";
		StringBuilder sb1=new StringBuilder(s2);
		sb1.reverse();
		System.out.println("Using built in reverse() method of the StringBuilder class: "+sb1);
		
		// Converting String to character array
		/*1. First, convert String to character array
		   by using the built in Java String class 
		   method toCharArray().
		2. Then, scan the string from end  to start, 
		   and print the character one by one.*/
		System.out.println("Converting String to character array");
		String s3="abcdefgfhijklmnopqrstuvwxyz";
		char [] ch1=s3.toCharArray();
		for(int i=ch1.length-1;i>=0;i-- ) {
			System.out.print(ch1[i]);
		}
		
		// Using ArrayList object
		/*1. Set the left index equal to 0 and right 
		   index equal to the length of the string -1.
		2. Swap the characters of the start index 
		   scanning with the last index scanning 
		   one by one. After that, increase the left 
		   index by 1 (left++) and decrease the right 
		   by 1 i.e., (right--) to move on to the next 
		   characters in the character array
		3. Continue till left is less than or equal to
		   the right.*/
		String s4="abcdefgfhijklmnopqrstuvwxyz";
		List<Character> sList=new ArrayList<Character>();
		char [] ch2=s4.toCharArray();
		for(Character c:ch2) {
			sList.add(c);
		}
		System.out.println();
		System.out.println("Using ArrayList object");
		Collections.reverse(sList);
		Iterator itr= sList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
}
