//Count positive and negative elements
package array;

public class Program16 {

	public static void countPositiveNegativeElements(int a[]) {
		int evenPositive = 0;
		int oddNegative = 0;
		for (int i = 0; i < a.length; i++) {
			int element = a[i];
			if (element >= 0) {
				evenPositive++;
			} else {
				oddNegative++;
			}
		}
		System.out.println("Positive count is " + evenPositive);
		System.out.println("Negative count is " + oddNegative);

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 33, -11, -45 };
		countPositiveNegativeElements(a);
	}
}
