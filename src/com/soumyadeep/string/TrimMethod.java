package com.soumyadeep.string;

public class TrimMethod {

	public static void main(String[] args) {
		/*
		 * We can eliminate the leading and trailing spaces of a string in Java with the
		 * help of trim(). trim() method is defined under the String class of java.lang
		 * package. It does not eliminated the middle spaces of the string. By calling
		 * the trim() method, a new String object is returned. It doesn’t replace the
		 * value of String object. Therefore if we want the access to the new String
		 * object, we just need to reassign it to the old String or assign it to a new
		 * variable.
		 */
		String str1 = "  Hello World  ";
		System.out.println(str1);
		System.out.println(str1.trim());

		String str2 = "      Hey  there    Joey!!!      ";
		System.out.println(str2);
		System.out.println(str2.trim());
	}
}
