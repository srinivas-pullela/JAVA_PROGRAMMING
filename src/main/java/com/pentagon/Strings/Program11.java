//Write a program to convert first letter in a sentence into a uppercase
package com.pentagon.Strings;

public class Program11 {

	public static void firstLetterCapital(String str) {
		String res = "";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			char ch = s.charAt(0);
			if (ch >= 'a' && ch <= 'z') {
				res += (char) (ch - 32);
				res += s.substring(1) + " ";
			} else {
				res += s + " ";
			}
		}
		System.out.println(res);
	}

	public static void firstLetterCapital1(String str) {

	}

	public static void main(String[] args) {
		String s1 = "i love bangalore";
		firstLetterCapital(s1);
	}
}
