//Write a Java Program to count the number of words present in a given sentence
package com.pentagon.Strings;

public class Program14 {
	public static int countWords(String str) {
		return str.split(" ").length;
	}
	public static void main(String[] args) {
		int count = countWords("I am Srinivas");
		System.out.println(count);
	}
}