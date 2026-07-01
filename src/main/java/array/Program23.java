//Print alternative elements
package array;

public class Program23 {

	public static void printAlternative(int arr[]) {
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		printAlternative(a);
	}
}
