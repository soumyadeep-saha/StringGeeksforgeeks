package com.soumyadeep.string;

public class RemoveLeadingZeros {

	public static void main(String[] args) {

		String s="00000123569";
		StringBuilder sb=new StringBuilder(s);
		int i=0;
		while(s.charAt(i)=='0') {
			i++;
		}
		sb.replace(0, i, "");
		System.out.println(sb.toString());
	}
}
