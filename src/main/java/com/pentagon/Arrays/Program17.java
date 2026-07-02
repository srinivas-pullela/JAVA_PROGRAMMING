//Copy one array into another array in reverse order
package com.pentagon.Arrays;

public class Program17 {
	public static void copyArrayInRevOrd(int a[]) {
		int arr[] = new int[a.length];
		int pointer=0;
		for(int i=a.length-1;i>=0;i--) {
			arr[pointer]=a[i];
			pointer++;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		copyArrayInRevOrd(array);
	}
}
