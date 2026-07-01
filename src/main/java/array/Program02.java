//Print the elements of array in reverse order in single line
package array;

public class Program02 {

	public static void printArray(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		printArray(arr);
	}
}
