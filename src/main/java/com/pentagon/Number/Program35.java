//check whether a number is prime or not and find the sum of all prime factors of a number
package com.pentagon.Number;

public class Program35 {
	
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int number = 28;
		int sumOfPrimeFactors = 0;
		System.out.print("Prime factors of " + number + " are: ");
		for (int i = 2; i <= number; i++) {
			if (number % i == 0 && isPrime(i)) {
				System.out.print(i + " ");
				sumOfPrimeFactors += i;
			}
		}
		System.out.println("\nSum of prime factors: " + sumOfPrimeFactors);
	}
}
