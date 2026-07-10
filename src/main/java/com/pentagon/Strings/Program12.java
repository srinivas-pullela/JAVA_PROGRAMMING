//Write a Java Program to reverse a string
package com.pentagon.Strings;

public class Program12 {

	public static void reverseString(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			res+=ch;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		reverseString("Srinivas");
	}
}
