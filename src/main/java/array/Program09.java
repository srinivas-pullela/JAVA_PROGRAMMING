//return sum of an half of an array
package array;

public class Program09 {
	public static void printArray(int a[]) {
		int sum=0;
		for(int i=0;i<a.length/2;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		printArray(arr);
	}
}
