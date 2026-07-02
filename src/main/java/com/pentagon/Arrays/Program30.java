//Sum of even-indexed elements in an array
package com.pentagon.Arrays;

public class Program30 {

	public static int sumOfEvenIndexedElements(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i += 2) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[] = { 1, 5, 2, 4, 3 };
		int sum = sumOfEvenIndexedElements(a);
		System.out.println("Sum of even-indexed elements is " + sum);
	}
}
