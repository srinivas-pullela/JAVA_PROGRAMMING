//Perfect Number
package com.pentagon.Number;

public class Program24 {

	public static void sumOfDigits(int num) {
		int n=num;
		int sum=0;
		while(num!=0) {
			int ld=num%10;
			sum+=ld;
			num=num/10;
		}
		if(sum==n) {
			System.out.println("Perfect number");
		}else {
			System.out.println("Not a perfect number");
		}
	}
	
	public static void main(String[] args) {
		sumOfDigits(23579);
	}
}
