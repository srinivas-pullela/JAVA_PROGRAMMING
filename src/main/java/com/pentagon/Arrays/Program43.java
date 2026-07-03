//First non-repeating element in an array
package com.pentagon.Arrays;

public class Program43 {

	public static int firstNonRepeatingElement(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean isRepeating = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isRepeating = true;
					break;
				}
			}
			if (!isRepeating) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 3, 2 };
		int result = firstNonRepeatingElement(a);
		if (result != -1) {
			System.out.println("First non-repeating element is " + result);
		} else {
			System.out.println("No non-repeating elements found");
		}
	}
}
