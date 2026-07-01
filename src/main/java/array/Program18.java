//Replace all negative numbers with zero
package array;

public class Program18 {
	public static void replaceNegativeNumberWithZero(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				a[i]=0;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[] = {1,2,-2,4,5};
		replaceNegativeNumberWithZero(array);
	}
}
