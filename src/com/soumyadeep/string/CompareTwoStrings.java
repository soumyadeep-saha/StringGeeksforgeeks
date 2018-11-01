package com.soumyadeep.string;

import java.util.Objects;

public class CompareTwoStrings {

	public static void main(String[] args) {

		// Using String.equals()
		String string1 = new String("Geeksforgeeks");
		String string2 = new String("Practice");
		String string3 = new String("Geeks");
		String string4 = new String("Geeks");
		String string5 = new String("geeks");
		// Comparing for String 1 != String 2
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + string1.equals(string2));
		// Comparing for String 3 = String 4
		System.out.println("Comparing " + string3 + " and " + string4 + " : " + string3.equals(string4));
		// Comparing for String 4 != String 5
		System.out.println("Comparing " + string4 + " and " + string5 + " : " + string4.equals(string5));
		// Comparing for String 1 != String 4
		System.out.println("Comparing " + string1 + " and " + string4 + " : " + string1.equals(string4));

		// Using String.equalsIgnoreCase()
		String string6 = new String("Geeksforgeeks");
		String string7 = new String("Practice");
		String string8 = new String("Geeks");
		String string9 = new String("Geeks");
		String string10 = new String("geeks");
		// Comparing for String 1 != String 2
		System.out.println("Comparing " + string6 + " and " + string7 + " : " + string6.equalsIgnoreCase(string7));
		// Comparing for String 3 = String 4
		System.out.println("Comparing " + string8 + " and " + string9 + " : " + string8.equalsIgnoreCase(string9));
		// Comparing for String 4 = String 5
		System.out.println("Comparing " + string9 + " and " + string10 + " : " + string9.equalsIgnoreCase(string10));
		// Comparing for String 1 != String 4
		System.out.println("Comparing " + string6 + " and " + string9 + " : " + string6.equalsIgnoreCase(string9));

		// Using Objects.equals() - Consequently, if both arguments are null, true is
		// returned and if exactly one argument is null, false is returned.
		String string11 = new String("Geeksforgeeks");
		String string12 = new String("Geeks");
		String string13 = new String("Geeks");
		String string14 = null;
		String string15 = null;
		System.out.println(Objects.equals(string11, string12));
		System.out.println(Objects.equals(string12, string13));
		System.out.println(Objects.equals(string11, string14));
		System.out.println(Objects.equals(string14, string15));
		System.out.println(Objects.equals(string11, string11));

		// Using String.compareTo()
		String string16 = new String("Geeksforgeeks");
		String string17 = new String("Practice");
		String string18 = new String("Geeks");
		String string19 = new String("Geeks");

		// Comparing for String 1 < String 2
		System.out.println("Comparing " + string16 + " and " + string17 + " : " + string16.compareTo(string17));
		// Comparing for String 3 = String 4
		System.out.println("Comparing " + string18 + " and " + string19 + " : " + string18.compareTo(string19));
		// Comparing for String 1 > String 4
		System.out.println("Comparing " + string16 + " and " + string19 + " : " + string16.compareTo(string19));
	}
}
