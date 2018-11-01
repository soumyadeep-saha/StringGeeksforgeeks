package com.soumyadeep.string;

public class StringVsStringbuilderVsStringbufferInterconversion {

	public static void main(String[] args) {

		//String to Stringbuilder and Stringbuffer
		String s1="SoumyadeepGeeks";
		StringBuilder sbd1=new StringBuilder(s1);
		sbd1.append(true);
		System.out.println(sbd1);
		StringBuffer sbf1=new StringBuffer(s1);
		sbf1.append("Geeks");
		System.out.println(sbf1);
		
		//Stringbuilder and Stringbuffer to String
		StringBuilder sbd2=new StringBuilder("SoumyadeepGeekstrue");
		String s2=sbd2.toString();
		System.out.println(s2);
		StringBuffer sbf2=new StringBuffer("SoumyadeepGeeksGeeks");
		String s3=sbf2.toString();
		System.out.println(s3);
		
		//Stringbuilder/Stringbuffer to Stringbuffer/Stringbuilder
		StringBuilder sbd3=new StringBuilder("SoumyadeepGeekstrue");
		//sbd3.toString();
		StringBuffer sbf3=new StringBuffer(sbd3);
		System.out.println(sbd3);
	}
}
