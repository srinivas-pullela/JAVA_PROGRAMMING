//Maximum and Minimum Element in an Array
package array;

public class Program25 {

	public static void maxMin(int arr[]) {
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			int element=arr[i];
			if(element>max) {
				max=element;
			}else if(element<min) {
				min=element;
			}
		}
		System.out.println("Maximum element is "+max);
		System.out.println("Minimum element is "+min);
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		maxMin(a);
	}
}
