package practice1;
//linear algo 
public class LinearSearch {
	
	static int linearSearch(int arr[], int n) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 0,-10, -1, 3, 0, 10, 1};
		int n = 10;
		System.out.println("The element is " +linearSearch(arr, n));
	}
}
