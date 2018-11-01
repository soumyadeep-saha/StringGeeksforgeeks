package com.soumyadeep.string;

import java.util.Locale;

public class StringToLowerCase {

	public static void main(String[] args) {

		String s1 = "Welcome! to Geeksforgeeks Planet."; 
		  
        // converting string s to lowercase letter 
		String lc1=s1.toLowerCase();
		String uc1=s1.toUpperCase();
		System.out.println(uc1);
		System.out.println(lc1);
        
        String s = "I Know YOI Bui You Don't Know ME.";
        Locale TURKISH=Locale.forLanguageTag("tr");
        Locale ENGLISH=Locale.forLanguageTag("en");
        System.out.println(s.toLowerCase(TURKISH));
        System.out.println(s.toLowerCase(ENGLISH));
	}
}
