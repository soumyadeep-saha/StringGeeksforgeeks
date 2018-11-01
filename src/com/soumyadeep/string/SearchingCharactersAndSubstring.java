package com.soumyadeep.string;

public class SearchingCharactersAndSubstring {

	public static void main(String[] args) {

		// This is a string in which a character
		// to be searched.
		String str1 = "GeeksforGeeks is a computer science portal";

		// Returns index of first occurrence of character.
		int firstIndex1 = str1.indexOf('s');
		System.out.println("First occurrence of char 's'" + " is found at : " + firstIndex1);

		// Returns index of last occurrence specified character.
		int lastIndex1 = str1.lastIndexOf('s');
		System.out.println("Last occurrence of char 's' is" + " found at : " + lastIndex1);

		// Index of the first occurrence of specified char
		// after the specified index if found.
		int first_in1 = str1.indexOf('s', 10);
		System.out.println("First occurrence of char 's'" + " after index 10 : " + first_in1);

		int last_in1 = str1.lastIndexOf('s', 20);
		System.out.println("Last occurrence of char 's'" + " after index 20 is : " + last_in1);

		// gives ASCII value of character at location 20
		int char_at1 = str1.charAt(20);
		System.out.println("Character at location 20: " + char_at1);

		// throws StringIndexOutOfBoundsException
		// char_at = str.charAt(50);

		// This is a string in which a substring
		// is to be searched.
		String str2 = "GeeksforGeeks is a computer science portal";

		// Returns index of first occurrence of substring
		int firstIndex2 = str2.indexOf("Geeks");
		System.out.println("First occurrence of char Geeks" + " is found at : " + firstIndex2);

		// Returns index of last occurrence
		int lastIndex2 = str2.lastIndexOf("Geeks");
		System.out.println("Last occurrence of char Geeks is" + " found at : " + lastIndex2);

		// Index of the first occurrence
		// after the specified index if found.
		int first_in2 = str2.indexOf("Geeks", 10);
		System.out.println("First occurrence of char Geeks" + " after index 10 : " + first_in2);

		int last_in2 = str2.lastIndexOf("Geeks", 20);
		System.out.println("Last occurrence of char Geeks " + "after index 20 is : " + last_in2);

		// This is a string in which substring
		// to be searched.
		String test1 = "software";

		CharSequence seq = "soft";
		boolean bool1 = test1.contains(seq);
		System.out.println("Found soft?: " + bool1);

		// it returns true substring if found.
		boolean seqFound1 = test1.contains("war");
		System.out.println("Found war? " + seqFound1);

		// it returns true substring if found otherwise
		// return false.
		boolean sqFound1 = test1.contains("wr");
		System.out.println("Found wr?: " + sqFound1);

		// This is a string in which substring
		// is to be searched.
		String str = "GeeksforGeeks is a computer science portal";

		System.out.println(str.startsWith("Geek"));
		System.out.println(str.startsWith("is", 14));
		System.out.println(str.endsWith("port"));
	}
}