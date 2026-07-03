//First repeating element in an array
package com.pentagon.Arrays;

public class Program42 {

	public static int firstRepeatingElement(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	//another way using break statement
	public static int firstRepeatingElementWithBreak(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean isRepeating = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isRepeating = true;
					break;
				}
			}
			if (isRepeating) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 3, 2 };
		int result = firstRepeatingElement(a);
		if (result != -1) {
			System.out.println("First repeating element is " + result);
		} else {
			System.out.println("No repeating elements found");
		}
		
		int resultWithBreak = firstRepeatingElementWithBreak(a);
		if (resultWithBreak != -1) {
			System.out.println("First repeating element (with break) is " + resultWithBreak);
		} else {
			System.out.println("No repeating elements found (with break)");
		}
	}
}
