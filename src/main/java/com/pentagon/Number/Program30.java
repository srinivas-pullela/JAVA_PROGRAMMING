//Tech Number
package com.pentagon.Number;

public class Program30 {

	//Logic example: 2025 is a Tech Number because 20 + 25 = 45 and 45 * 45 = 2025
	public static boolean isTechNumber(int num) {
		int count = 0;
		int temp = num;
		
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		
		if (count % 2 != 0) {
			return false; // Not a Tech Number if the number of digits is odd
		}
		
		int halfCount = count / 2;
		int divisor = (int) Math.pow(10, halfCount);
		
		int firstHalf = num / divisor;
		int secondHalf = num % divisor;
		
		int sum = firstHalf + secondHalf;
		
		return sum * sum == num;
	}
	
	public static void main(String[] args) {
		int number = 2025;
		if (isTechNumber(number)) {
			System.out.println(number + " is a Tech Number.");
		} else {
			System.out.println(number + " is not a Tech Number.");
		}
	}
}
