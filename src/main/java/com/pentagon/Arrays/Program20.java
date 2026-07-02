//Find the index of a given element
package com.pentagon.Arrays;

public class Program20 {
	public static int checkArrayIndex(int arr[], int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]= {1,7,2,6,3};
		System.err.println(checkArrayIndex(a, 7));
	}
}
