package com.soumyadeep.string;

import java.text.DecimalFormat;

public class WaysForIntegerToStringConversions {

	public static void main(String[] args) {

		//Convert using Integer.toString(int)
		int i1=1234;
		int i2=1111;
		String s1=Integer.toString(i1);
		String s2=Integer.toString(i2);
		System.out.println(s1);
		System.out.println(s2);
		
		//Convert using String.valueOf(int)
		int i3=1234;
		int i4=1111;
		String s3=String.valueOf(i3);
		String s4=String.valueOf(i4);
		System.out.println(s3);
		System.out.println(s4);
		
		//Convert using Integer(int).toString()
		int i5=1111;
		String s5=new Integer(i5).toString();
		System.out.println(s5);
		int i6=111111;
		Integer obj=new Integer(i6);
		String s6=obj.toString();
		System.out.println(s6);
		
		//Convert using DecimalFormat
		int i7=111111;
		DecimalFormat df1=new DecimalFormat("#");
		String s7= df1.format(i7);
		System.out.println(s7);
		int i8=111111;
		DecimalFormat df2=new DecimalFormat("#,###");
		String s8= df2.format(i8);
		System.out.println(s8);
		
		// Convert using StringBuffer or StringBuilder
		int i9 = 1234;
		StringBuffer sb1 = new StringBuffer();
		sb1.append(i9);
		String s9 = sb1.toString();
		System.out.println("String s9 = " + s9);
		
		//Convert with special radix
		//Binary
		int h = 255; 
	    String binaryString = Integer.toBinaryString(h); 
	    System.out.println(binaryString); 
	    //Ocatal
	    int i = 255; 
	    String octalString = Integer.toOctalString(i); 
	    System.out.println(octalString); 
	    //Hexadecimal
	    int j = 255; 
	    String hexString = Integer.toHexString(j); 
	    System.out.println(hexString); 
	}
}
