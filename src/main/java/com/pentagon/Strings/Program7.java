//Write a Java program to remove spaces from a string
package com.pentagon.Strings;

public class Program7 {

	public static void removeSpace(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			}
			res += str.charAt(i);
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		removeSpace("Welcome to Pentagon");
	}
}
