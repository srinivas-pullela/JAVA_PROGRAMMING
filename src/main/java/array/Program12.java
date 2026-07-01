//Find the largest element of an array
package array;

public class Program12 {

	public static void maxElementInArray(Integer a[]) {
		Integer max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum element in an array is "+max);
	}
	public static void main(String[] args) {
		Integer[] arr= {10,20,30,50,40};
		maxElementInArray(arr);
	}
}
