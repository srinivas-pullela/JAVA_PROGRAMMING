//Move negative numbers to the beginning 
package com.pentagon.Arrays;

public class Program41 {

	public static void moveNegativeNumbersToBeginning(int arr[]) {
		int n = arr.length;
		int j = 0; // index of the next negative number
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) { //if the current element is negative and not in the correct position, swap it with the element at index j
					int temp = arr[i]; //why swap is done? because we want to move the negative number to the beginning of the array and the positive number to the end of the array
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
				j++; //increment the index of the next negative number
			}
		}
	}
	public static void main(String[] args) {
		int a[] = { 1, -2, 3, -4, 5 };
		moveNegativeNumbersToBeginning(a);
		System.out.print("Array after moving negative numbers to the beginning: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
