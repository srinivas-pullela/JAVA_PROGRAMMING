//Strictly increasing and decreasing
package com.pentagon.Number;

public class Program25 {
	
	public static boolean isStrictlyIncreasing(int num) {
		int lastDigit = num % 10;
		num /= 10;
		
		while (num > 0) {
			int currentDigit = num % 10;
			if (currentDigit >= lastDigit) {
				return false; // Not strictly increasing
			}
			lastDigit = currentDigit;
			num /= 10;
		}
		return true; // Strictly increasing
	}
	public static void main(String[] args) {
		int number = 12345;
		if (isStrictlyIncreasing(number)) {
			System.out.println(number + " is a strictly increasing number.");
		} else {
			System.out.println(number + " is not a strictly increasing number.");
		}
	}
}
