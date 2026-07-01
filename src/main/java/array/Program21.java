//Print elements at even indices
package array;

public class Program21 {

	public static void printEvenIndices(int arr[]) {
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		printEvenIndices(a);
	}
}
