//return the product of elements of an array
package array;

public class Program05 {

	public static int productOfElements(int a[]) {
		int product=1;
		for(int i=0;i<a.length;i++) {
			product*=a[i];
		}
		return product;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println(productOfElements(arr));
	}
}
