//Write a program to print the count of vowels,consonants,numbers and special characters in a string.
package com.pentagon.Strings;

import java.util.Scanner;

public class Program2 {

	// In how many we can solve this problem? and which is the best way to solve
	// this problem?
	// Ans: We can solve this problem in many ways but the best way is to use the
	// built-in methods of the String class and the Character class.
	// The third way is the best way to solve this problem because it is simple and
	// easy to understand.

	// First way logic without using built-in methods
	public static void countVowelsConsonantsSpecialChars(String str) {
		int vowels = 0, consonants = 0, specialChars = 0, numb=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vowels++;
				} else {
					consonants++;
				}
			} else if(ch>='0' && ch<='9'){
				numb++;
			}
			else {
				specialChars++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Numbers: "+numb);
		System.out.println("Special Characters: " + specialChars);
	}

	// Second way of doing this problem using switch case
	public static void countVowelsConsonantsSpecialChars2(String str) {
		int vowels = 0, consonants = 0, specialChars = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowels++;
				break;
			default:
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
					consonants++;
				} else {
					specialChars++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Special Characters: " + specialChars);
	}

	// Third way of logic
	public static void countVowelsConsonantsSpecialChars3(String str) {
		int vowels = 0, consonants = 0, specialChars = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if ("aeiouAEIOU".indexOf(ch) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			} else {
				specialChars++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Special Characters: " + specialChars);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		countVowelsConsonantsSpecialChars(str);
//		countVowelsConsonantsSpecialChars2(str);
//		countVowelsConsonantsSpecialChars3(str);
		sc.close();
	}
}
