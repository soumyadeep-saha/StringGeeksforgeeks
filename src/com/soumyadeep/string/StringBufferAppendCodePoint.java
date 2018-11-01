package com.soumyadeep.string;

public class StringBufferAppendCodePoint {

	public static void main(String[] args) {
		/*
		 * The java.lang.StringBuffer.appendCodePoint(int cp)is the method which appends
		 * the string representation of the codePoint argument to this sequence.
		 */
		/*
		 * Parameters : The method accepts a single parameter cp of integer type and
		 * refers to the Unicode code point.
		 * 
		 * Return Value : The method returns this object after appending the string
		 * represented by the codepoint.
		 */
		StringBuffer sb1 = new StringBuffer("Geeksforgeeks");
		sb1.appendCodePoint(65);
		System.out.println(sb1);

		StringBuffer sbf = new StringBuffer("Geeksforgeeks");
		System.out.println("String buffer = " + sbf);
		// Here it appends the CodePoint as
		// string to the string buffer
		sbf.appendCodePoint(54);
		System.out.println("After appending CodePoint is = " + sbf);
	}
}
