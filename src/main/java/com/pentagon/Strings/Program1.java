//Program to convert a string to uppercase without using built-in methods
package com.pentagon.Strings;

import java.util.Scanner;

public class Program1 {
	
	//for exaample, a#CDe ---> A#CDE
	public static String toUpperCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				sb.append((char)(ch - 'a' + 'A'));
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	//second way of solving this problem without using StringBuilder and built-in methods use string
	public static String toUpperCase2(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				//result += (char)(ch - 'a' + 'A');
				ch-=32;
				result+=ch;
			} else {
				result += ch;
			}
		}
		return result;
	}
	
	//Third way of solving this problem without using StringBuilder
	public static String toUpperCase3(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] - 'a' + 'A');
			}
		}
		return new String(arr);
	}
	
	//Fourth way of solving this problem without using StringBuilder and without using toCharArray method
	public static String toUpperCase4(String str) {
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				arr[i] = (char)(ch - 'a' + 'A');
			} else {
				arr[i] = ch;
			}
		}
		return new String(arr);
	}
	
	//fifth way of solving this problem using recursion
	public static String toUpperCase5(String str) {
		if (str.length() == 0) {
			return str;
		}
		char ch = str.charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - 'a' + 'A');
		}
		return ch + toUpperCase5(str.substring(1));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		System.out.println("String in uppercase: " + toUpperCase(str));
		sc.close();
	}
}
