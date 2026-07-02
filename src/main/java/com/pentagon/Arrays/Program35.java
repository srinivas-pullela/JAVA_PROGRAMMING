//Difference between min and max in array
package com.pentagon.Arrays;

public class Program35 {

	public static int differenceBetweenMinAndMax(int arr[]) {
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			int element=arr[i]; 
			if(element>max) {
				max=element;
			}else if(element<min) {
				min=element;
			}
		}
		return max-min;
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		System.out.println("Difference between max and min is "+differenceBetweenMinAndMax(a));
	}
}
