//Chack a number is Happy number or UnHappy number
package com.pentagon.Number;

public class Program32 {

	//Logic example: 19
	public static boolean isHappy(int n) {
		int slow = n;
		int fast = n;

		do {
			slow = getNext(slow);
			fast = getNext(getNext(fast));
		} while (slow != fast);

		return slow == 1;
	}

	private static int getNext(int n) {
		int totalSum = 0;
		while (n > 0) {
			int digit = n % 10;
			totalSum += digit * digit;
			n /= 10;
		}
		return totalSum;
	}
	public static void main(String[] args) {
		int number = 19; // Example number to check
		if (isHappy(number)) {
			System.out.println(number + " is a Happy number.");
		} else {
			System.out.println(number + " is an UnHappy number.");
		}
	}
}
