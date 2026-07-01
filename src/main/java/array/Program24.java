//Find second largest element
package array;

public class Program24 {

	public static void secondLargest(int arr[]) {
		int largest=arr[0];
		int secLargest=arr[0];
		for(int i=1;i<arr.length;i++) {
			int element=arr[i];
			if(element>largest) {
				secLargest=largest;
				largest=element;
			}else if(element>secLargest&& element!=largest) {
				secLargest=element;
			}
		}
		System.out.println("Second Largest element is "+secLargest);
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		secondLargest(a);
	}
}
