//Find the average of elements
package array;

public class Program11 {

	public static void averageOfElementsInArray(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Average of elements in array is: "+(sum/a.length));
	}
	
	public static void main(String[] args) {
		int a[]= {10,20};
		averageOfElementsInArray(a);
	}
}
