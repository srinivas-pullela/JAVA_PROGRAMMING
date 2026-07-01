//Print minimum element in an array
package array;

public class Program06 {
	
	public static int minimumElementInArray(int a[]) {
		int min=a[0];
		for(int i=1;i<a.length-1;i++) {
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[]= {30,20,10,40,50};
		System.out.println(minimumElementInArray(arr));
	}
}
