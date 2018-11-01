package com.soumyadeep.string;

public class StringBufferReplace {

	public static void main(String[] args) {
		/*
		 * The StringBuffer.replace() is the inbuilt method which is used to replace the
		 * characters in a substring of this sequence with the characters in the
		 * specified String. Here simply the characters in the substring are removed and
		 * other char is inserted at the start.
		 */
		/*
		 * Syntax :
		 * 
		 * public StringBuffer replace(int first, int last, String st) Parameters : The
		 * method accepts three parameters.
		 * 
		 * first : This is of integer type which refers to the starting index. last :
		 * This is of integer type which refers to the the ending index. st : This is of
		 * string type which refer to the String that will replace previous contents.
		 * 
		 * If the first is negative, greater than length(), or greater than last then
		 * StringIndexOutOfBoundsException
		 */

		StringBuffer sbf = new StringBuffer("Welcome to Geekshssgeeks");
		System.out.println("string buffer = " + sbf);
		// Replacing substring from index 15 to index 18
		sbf.replace(15, 18, "for");
		System.out.println("After replacing string buffer= " + sbf);
	}
}
