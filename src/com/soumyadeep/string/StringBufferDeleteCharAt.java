package com.soumyadeep.string;

public class StringBufferDeleteCharAt {

	public static void main(String[] args) {

		StringBuffer sb1= new StringBuffer("abcdefghij");
		sb1.deleteCharAt(4);
		System.out.println(sb1);
		
        StringBuffer sbf = new StringBuffer("raghav"); 
        System.out.println("String buffer before deletion = " + sbf); 
        // Deleting the character at indexpoint 5 
        sbf.deleteCharAt(5); 
        System.out.println("After deletion new StringBuffer = " + sbf); 
	}
}