//Return the sum of elements of an array 
package array;

public class Program04 {

	public static int sumOfElements(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println(sumOfElements(arr));
	}
}
