package com.soumyadeep.string;

public class StringBufferDelete {

	public static void main(String[] args) {

		/*
		 * Parameters : The method accepts two parameters of integer type: start_point –
		 * This refers to the beginning index and is included in the count. end_point –
		 * This refer to the ending index and is excluded from the count.
		 * 
		 * Return Value : The method returns the string after deleting the substring
		 * formed by the range mentioned in the parameters.
		 * 
		 * Exceptions : StringIndexOutOfBoundsException occurs if the start_point is
		 * negative, greater than length(), or greater than the end_point.
		 */
		StringBuffer sbf = new StringBuffer("Geeksforgeeks");
		System.out.println("string buffer = " + sbf);

		// Deleting characters from index 6 to 8
		sbf.delete(6, 8);
		System.out.println("After deletion string buffer is = " + sbf);
	}
}
