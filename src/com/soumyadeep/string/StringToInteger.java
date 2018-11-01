package com.soumyadeep.string;

public class StringToInteger {

	public static void main(String[] args) {

		//Integer.parseInt
		int decimalExample1 = Integer.parseInt("20"); 
        int signedPositiveExample1 = Integer.parseInt("+20"); 
        int signedNegativeExample1 = Integer.parseInt("-20"); 
        int radixExample1 = Integer.parseInt("20",16); 
        int stringExample1 = Integer.parseInt("geeks",29); 
  
        // Uncomment the following code to check 
        // NumberFormatException 
  
        //   String invalidArguments = ""; 
        //   int emptyString = Integer.parseInt(invalidArguments); 
        //   int outOfRangeOfInteger = Integer.parseInt("geeksforgeeks",29); 
        //   int domainOfNumberSystem = Integer.parseInt("geeks",28); 
  
        System.out.println(decimalExample1); 
        System.out.println(signedPositiveExample1); 
        System.out.println(signedNegativeExample1); 
        System.out.println(radixExample1); 
        System.out.println(stringExample1); 
        
        //Integer.valueOf
        int decimalExample2 = Integer.valueOf("20"); 
        int signedPositiveExample2 = Integer.valueOf("+20"); 
        int signedNegativeExample2 = Integer.valueOf("-20"); 
        int radixExample2 = Integer.valueOf("20",16); 
        int stringExample2 = Integer.valueOf("geeks",29); 
  
        System.out.println(decimalExample2); 
        System.out.println(signedPositiveExample2); 
        System.out.println(signedNegativeExample2); 
        System.out.println(radixExample2); 
        System.out.println(stringExample2); 
	}
}
