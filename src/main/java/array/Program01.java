//Print the elements of array in a single line
package array;

public class Program01 {

	public static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		printArray(arr);
	}
}
