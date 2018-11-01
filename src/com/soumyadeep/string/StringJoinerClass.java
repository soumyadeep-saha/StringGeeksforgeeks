package com.soumyadeep.string;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("soumyadeep1");
		arrayList.add("soumyadeep2");
		arrayList.add("soumyadeep3");
		arrayList.add("soumyadeep4");

		StringJoiner sj1 = new StringJoiner(",");
		sj1.setEmptyValue("sj1 is empty");
		System.out.println(sj1);
		sj1.add(arrayList.get(0)).add(arrayList.get(1));
		System.out.println(sj1.toString());
		StringJoiner sj2 = new StringJoiner(",");
		sj2.add(arrayList.get(2)).add(arrayList.get(3));
		System.out.println(sj2.toString());
		sj1.merge(sj2);
		System.out.println(sj1);
		System.out.println(sj1.length());
		
		//add() method
		StringJoiner sj3 = new StringJoiner(",");
		sj3.add("soumyadeep");
		sj3.add("is");
		sj3.add("geek");
		sj3.add("soumyadeep");
		sj3.add("is");
		sj3.add("geek");
		System.out.println(sj3);
		StringJoiner sj4 = new StringJoiner(" ");
		sj4.add("soumyadeep");
		sj4.add("is");
		sj4.add("geek");
		System.out.println(sj4);
		
		//length() method
		StringJoiner sj5 = new StringJoiner(" ");
		System.out.println(sj5.length());
		sj5.add("soumyadeep");
		sj5.add("is");
		sj5.add("geek");
		System.out.println(sj5.length());
		sj5.add("1");
		System.out.println(sj5);
		System.out.println(sj5.length());

		//toString() method
		StringJoiner sj6 = new StringJoiner(" ");
		System.out.println(sj6);
		sj6.add("soumyadeep");
		sj6.add("is");
		sj6.add("geek");
		System.out.println(sj6.toString());
		
		//setEmptyValue() method
		StringJoiner sj7 = new StringJoiner(" ");
		System.out.println(sj7);
		//sj7.setEmptyValue(null);
		sj7.setEmptyValue("sj7 is empty");
		System.out.println(sj7);
		sj7.add("soumyadeep");
		sj7.add("is");
		sj7.add("geek");
		System.out.println(sj7.toString());
		
		//merge() method
		StringJoiner sj8 = new StringJoiner(",");
		sj8.add("soumyadeep");
		sj8.add("is");
		sj8.add("geek");
		System.out.println(sj8);
		StringJoiner sj9 = new StringJoiner(" ");
		sj9.add("soumyadeep");
		sj9.add("is");
		sj9.add("geek");
		System.out.println(sj9);
		StringJoiner sj10 = null;
		sj8.merge(sj9);
		System.out.println(sj8);
		//sj8.merge(sj10);
		System.out.println(sj8);
	}
}
