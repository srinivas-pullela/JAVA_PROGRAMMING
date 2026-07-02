//print half of an array
package com.pentagon.Arrays;

public class Program08 {
	public static void printArray(int a[]) {
		for(int i=0;i<a.length/2;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		printArray(arr);
	}
}
