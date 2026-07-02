//check array is sorted in descending order or not
package com.pentagon.Arrays;

public class Program34 {

	public static boolean isArraySortedInDescendingOrder(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };
		System.out.println(isArraySortedInDescendingOrder(a) ? "Array is sorted in descending order"
				: "Array is not sorted in descending order");
	}
}
