package com.pentagon.Arrays;

public class Program45 {
	public static void main(String[] args) {
		MyArray<Integer> arr= new MyArray<>();
		arr.addInt(1);
	    arr.addInt(2);
	    arr.addInt(3);
		
		System.out.println(arr);
		
		//size of array of arr
		System.out.println("Size of array: " + arr.size());
		
		//remove element from array at index 1
		arr.remove(1);
		System.out.println(arr);
		
		//remove all elements from array
		System.out.println(arr.clear());
		
		arr.addInt(4);
		arr.addInt(5);
		arr.addInt(6);
		
		arr.removeElement(4);
		System.out.println(arr);
		
		Integer[] a = { 7, 8, 9 };
		//add all elements of array a to arr
		arr.addAll(1,a); 
		System.out.println(arr);
	}
}
