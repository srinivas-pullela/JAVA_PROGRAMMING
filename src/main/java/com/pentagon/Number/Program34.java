//print all the prime-factors of a given number
package com.pentagon.Number;

public class Program34 {
	
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void primeFactors(int n) {
		for(int i=2;i<=n/2;i++) {
			if((n%i==0)&& isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		primeFactors(12);
	}
}
