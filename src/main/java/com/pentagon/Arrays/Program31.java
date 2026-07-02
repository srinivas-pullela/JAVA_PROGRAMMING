//Sum of odd-indexed elements in an array
package com.pentagon.Arrays;

public class Program31 {

	public static int sumOfOddIndexedElements(int arr[]) {
		int sum = 0;
		for (int i = 1; i < arr.length; i += 2) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[] = { 1, 5, 2, 4, 3 };
		int sum = sumOfOddIndexedElements(a);
		System.out.println("Sum of odd-indexed elements is " + sum);
	}
}
