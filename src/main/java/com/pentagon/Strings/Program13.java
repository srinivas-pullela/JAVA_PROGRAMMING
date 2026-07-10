//Write a Java Program to check if a string is palindrome
package com.pentagon.Strings;

public class Program13 {
	
	public static void reverseString(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			res+=ch;
		}
		if(res.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String[] args) {
		reverseString("MADAM");
	}
}
