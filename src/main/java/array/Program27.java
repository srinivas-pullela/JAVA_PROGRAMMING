//Count frequency of all elements in an array
package array;

public class Program27 {

	public static void countFrequencyAll(int arr[]) {
		int n=arr.length;
		boolean visited[]=new boolean[n]; //default value of boolean is false so we don't need to initialize it
		for(int i=0;i<n;i++) {
			System.out.println(visited[i]);
			if(visited[i]==true) { //why it is true? because if the element is already counted then we don't want to count it again so we mark it as true and skip it
				System.out.println(visited[i]);
				continue;//why continue? because we want to skip the current iteration and move to the next iteration of the loop
			}
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) { // why == because we want to check if the elements are equal or not
					count++;
					visited[j]=true;
				}
			}
			System.out.println("Frequency of "+arr[i]+" is "+count);
		}
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3,5,5};
		countFrequencyAll(a);
	}
}
