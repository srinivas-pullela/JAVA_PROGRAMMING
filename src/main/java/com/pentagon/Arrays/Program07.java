//Maximum element in an array
package com.pentagon.Arrays;

public class Program07 {
	public static int maxElementInArray(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {30,20,10,40,50};
		System.out.println(maxElementInArray(arr));
	}
}
