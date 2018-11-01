package com.soumyadeep.string;

public class StringVsStringbuilderVsStringbuffer {

	public static void concat1(String s1) {
		s1=s1+"Geeks";
	}
	public static void concat2(StringBuilder s2) {
		s2.append("Geeks");
	}
	public static void concat3(StringBuffer s3) {
		s3.append("Geeks");
	}
	
	public static void main(String[] args) {

		String s1= "GeeksFor";
		concat1(s1);
		System.out.println(s1);
		StringBuilder s2= new StringBuilder("GeeksFor");
		concat2(s2);
		System.out.println(s2);
		StringBuffer s3= new StringBuffer("GeeksFor");
		concat3(s3);
		System.out.println(s3);
	}
}
