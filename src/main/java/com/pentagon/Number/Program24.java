//Perfect Number
package com.pentagon.Number;

public class Program24 {

	//logic here is example: 6 is a perfect number because its divisors are 1, 2, and 3, and their sum is 6 (1 + 2 + 3 = 6). 
	//Similarly, 28 is a perfect number because its divisors are 1, 2, 4, 7, and 14, and their sum is 28 (1 + 2 + 4 + 7 + 14 = 28).
	public static boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
	
	public static void main(String[] args) {
	
		int number = 28;
		if (isPerfectNumber(number)) {
			System.out.println(number + " is a perfect number.");
		} else {
			System.out.println(number + " is not a perfect number.");
		}
	}
}
