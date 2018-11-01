package com.soumyadeep.string;

public class StringBufferAppend {

	public static void main(String[] args) {

		/*
		 * StringBuffer appendThe java.lang.StringBuffer.append() method is used to
		 * append the string representation of some argument to the sequence. There are
		 * many ways/forms in which the append() method can be used StringBuffer
		 * append(boolean a) java.lang.StringBuffer.append(char a) StringBuffer
		 * append(char[] astr) StringBuffer append(char[] cstr, int iset, int ilength)
		 * StringBuffer append(double a) StringBuffer append(float f) StringBuffer
		 * append(int i :) StringBuffer append(Long l) StringBuffer append(CharSequence
		 * a) StringBuffer append(CharSequence chseq, int start, int end) StringBuffer
		 * append(Object obj) StringBuffer append(String istr) StringBuffer
		 * append(StringBuffer sbf)
		 */

		StringBuffer sbf1 = new StringBuffer("We are geeks and its really ");
		System.out.println("Input: " + sbf1);
		// Appending the boolean value
		sbf1.append(true);
		System.out.println("Output: " + sbf1);
		System.out.println();
		StringBuffer sbf2 = new StringBuffer("We are lost - ");
		System.out.println("Input: " + sbf2);
		// Appending the boolean value
		sbf2.append(false);
		System.out.println("Output: " + sbf2);
		
		StringBuffer sbf = new StringBuffer("Geeksfor"); 
        System.out.println(" string buffer = " + sbf); 
        CharSequence chSeq = "geeks"; 
        // Appends the CharSequence 
        sbf.append(chSeq); 
        // Print the string buffer after appending 
        System.out.println("After append = " + sbf); 
        
        StringBuffer sbf3 = new StringBuffer("Geeksfor"); 
        System.out.println("string buffer = " + sbf3); 
        Object objectvalue = "geeks"; 
        // Here it appends the Object value 
        sbf.append(objectvalue); 
        System.out.println("After appending result is = " + sbf3); 
	}
}
