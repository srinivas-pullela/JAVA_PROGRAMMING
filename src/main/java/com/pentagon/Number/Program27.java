//Automorphic number
package com.pentagon.Number;

public class Program27 {

	public static void isAutomorphicNum(int num) {
		int square = num * num;
		String numStr = Integer.toString(num);
		String squareStr = Integer.toString(square);
		
		if (squareStr.endsWith(numStr)) {
			System.out.println(num + " is an Automorphic number.");
		} else {
			System.out.println(num + " is not an Automorphic number.");
		}
	}
	public static void main(String[] args) {
		int number = 25;
		isAutomorphicNum(number);
	}
}
