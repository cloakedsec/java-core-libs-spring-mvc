package practice1;
//Using Linear Search
public class FixedPoint {
	static int linearSearch(int arr[], int n) {
		for(int i=0; i<n; i++) {
			if(arr[i]==i)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 0,-10, -1, 3, 0, 10, 1};
		int n = arr.length;
		System.out.println("Fixed point is " +linearSearch(arr, n));
	}
}
