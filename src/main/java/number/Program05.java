//Find the last digit of a number
package number;

import java.util.Scanner;

public class Program05 {
	public static int lastDigits(int num) {
		return num%10;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println("Last Digit is "+lastDigits(n));
		sc.close();
	}
}
