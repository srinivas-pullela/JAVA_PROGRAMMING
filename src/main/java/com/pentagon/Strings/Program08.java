//Write a Java Program to remove the first and last character from a string
package com.pentagon.Strings;

public class Program08 {

	// Test case1: null
	// Test case2: first character space
	// Test case3: only one character
	public static void removeFirstAndLastChar(String str) {
		String res = "";
		if (str == null || str.charAt(0) == ' ') {
			System.out.println(str);
		} else {
			for (int i = 1; i < str.length() - 1; i++) {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		removeFirstAndLastChar("Abcd");
	}
}
