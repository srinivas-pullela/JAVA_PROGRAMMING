//Check the given number is bouncy number or not
package com.pentagon.Number;

public class Program33 {

	public static boolean isBouncy(int num) {
		boolean increasing = false;
		boolean decreasing = false;
		int lastDigit = num % 10;
		num /= 10;
		
		while (num > 0) {
			int currentDigit = num % 10;
			if (currentDigit < lastDigit) {
				increasing = true;
			} else if (currentDigit > lastDigit) {
				decreasing = true;
			}
			if (increasing && decreasing) {
				return true; // It's a bouncy number
			}
			lastDigit = currentDigit;
			num /= 10;
		}
		return false; // Not a bouncy number
	}
	public static void main(String[] args) {
		int number = 12345;
		if (isBouncy(number)) {
			System.out.println(number + " is a bouncy number.");
		} else {
			System.out.println(number + " is not a bouncy number.");
		}
	}
}
