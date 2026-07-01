//Swap numbers without using third variable
package number;

import java.util.Scanner;

public class Program08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number1 : ");
		int n1=sc.nextInt();
		System.out.print("Enter a number2 : ");
		int n2=sc.nextInt();
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		sc.close();
	}
}
