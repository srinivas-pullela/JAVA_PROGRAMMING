//Check whether a number is strong/factorian/krishnamurty number
package com.pentagon.Number;

public class Program22 {

	public static boolean isStrongNumber(int num) {
		int originalNum = num;
		int sum = 0;
		
		while (num > 0) {
			int digit = num % 10;
			sum += factorial(digit);
			num /= 10;
		}
		
		return sum == originalNum;
	}
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int number = 145;
		if (isStrongNumber(number)) {
			System.out.println(number + " is a strong/factorian/krishnamurty number.");
		} else {
			System.out.println(number + " is not a strong/factorian/krishnamurty number.");
		}
	}
}
