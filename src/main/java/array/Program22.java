//Count elements greater than a given value
package array;

public class Program22 {

	public static void countGreater(int arr[], int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				count++;
			}
		}
		System.out.println("Count of elements greater than "+x+" is "+count);
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		int x=3;
		countGreater(a,x);
	}
}
