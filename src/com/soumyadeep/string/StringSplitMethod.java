package com.soumyadeep.string;

public class StringSplitMethod {

	public static void main(String[] args) {

		//Public String [ ] split ( String regex, int limit )
		String str	 = "geekss@for@geekss"; 
		String [] arr1=str.split("@", 0);
		for(String s: arr1) {
			System.out.println(s);
		}

		// Java program to demonstrate working of split(regex, 
		// limit) with small limit
        String str1 = "geekss@for@geekss"; 
        String[] arrOfStr1 = str1.split("@", 2); 
        for (String a : arrOfStr1) {
            System.out.println(a);
        }
        // Java program to demonstrate working of split(regex, 
        // limit) with high limit
        String str2 = "geekss@for@geekss"; 
        String[] arrOfStr2 = str2.split("@", 5); 
  
        for (String a : arrOfStr2) { 
            System.out.println(a);
        }
        // Java program to demonstrate working of split(regex, 
        // limit) with negative limit
        String str3 = "geekss@for@geekss"; 
        String[] arrOfStr3 = str3.split("@", -2); 
        for (String a : arrOfStr3) {
            System.out.println(a); 
        }
        // Java program to demonstrate working of split(regex, 
        // limit) with high limit
        String str4 = "geekss@for@geekss"; 
        String[] arrOfStr4 = str4.split("s", 5); 
        for (String a : arrOfStr4) {
            System.out.println(a); 
        }
        // Java program to demonstrate working of split(regex, 
        // limit) with negative limit
        String str5 = "geekss@for@geekss"; 
        String[] arrOfStr5 = str5.split("s", -2); 
        for (String a : arrOfStr5) {
            System.out.println(a);
        }
        // Java program to demonstrate working of split(regex, 
        // limit) with 0 limit
        String str6 = "geekss@for@geekss"; 
        String[] arrOfStr6 = str.split("s", 0); 
        for (String a : arrOfStr6) {
            System.out.println(a); 
        }
        
        //public String[] split(String regex)
        String strSplit = "GeeksforforGeeksfor   "; 
        String[] arrOfStr = strSplit.split("for"); 
          for (String a : arrOfStr) {
            System.out.println(a); 
          }
        
	}
}
