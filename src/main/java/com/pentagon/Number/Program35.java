package com.pentagon.Number;

public class Program35 {
	
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

	public static int sumOfPrimeFactors(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if((n%i==0)&& isPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumOfPrimeFactors(12));
	}
}
