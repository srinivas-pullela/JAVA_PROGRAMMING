//count even and odd elements
package array;

public class Program15 {
	public static void countEvenOddElements(int a[]) {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			int element = a[i];
			if (element % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even count is " + evenCount);
		System.out.println("Odd count is " + oddCount);

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 33 };
		countEvenOddElements(a);
	}
}
