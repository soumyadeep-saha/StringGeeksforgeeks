package com.soumyadeep.string;

public class StringBufferClass {

	public static void main(String[] args) {

		StringBuffer s1=new StringBuffer("GeeksforGeeksSoumyadeep"); 
        int p=s1.length(); 
        int q=s1.capacity(); 
        System.out.println("Length of string GeeksforGeeks="+p); 
        System.out.println("Capacity of string GeeksforGeeks="+q); 
        //append method
        StringBuffer s2=new StringBuffer("Geekfor");
        s2.append("geeks");
        System.out.println(s2);
        s2.append("soumyadeep");
        System.out.println(s2);
        //insert method
        StringBuffer s3=new StringBuffer("GeeksGeeks");
        s3.insert(5, "for");
        System.out.println(s3);
        s3.insert(5, 1);
        System.out.println(s3);
        s3.insert(6, true);
        System.out.println(s3);
        s3.insert(10, 1.21f);
        System.out.println(s3);
        s3.insert(14, 2.11d);
        System.out.println(s3);
        char [] ch= {'s','s'};
        s3.insert(18, ch);
        System.out.println(s3);
        //reverse method
        StringBuffer s4=new StringBuffer("GeeksGeeks"); 
        s4.reverse(); 
        System.out.println(s4);
        //delete() and deleteCharAt() methods
        StringBuffer s5=new StringBuffer("GeeksforGeeks");
        s5.delete(5,8);
        System.out.println(s5);
        s5.append(2);
        System.out.println(s5);
        s5.deleteCharAt(10);
        System.out.println(s5);
        //replace() method
        StringBuffer s6=new StringBuffer("GeeksforGeeks");
        s6.replace(0, s6.length(), "1");
        System.out.println(s6);
        //ensureCapacity() method
        StringBuffer s=new StringBuffer("GeeksforGeeks");
        System.out.println(s.capacity());
        s.ensureCapacity(63);
        System.out.println(s.capacity());
	}
}
