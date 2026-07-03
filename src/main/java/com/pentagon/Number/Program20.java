//Check if all digits of a number are even
package com.pentagon.Number;

public class Program20 {

	public static void isAllEven(int num) {
		boolean allEven = true;
		int originalNum = num; // Store the original number for output
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 != 0) {
				allEven = false;
				break;
			}
			num /= 10;
		}
		if (allEven) {
			System.out.println("All digits of " + originalNum + " are even.");
		} else {
			System.out.println("Not all digits of " + originalNum + " are even.");
		}
	}
	public static void main(String[] args) {
		isAllEven(84);
	}
}
