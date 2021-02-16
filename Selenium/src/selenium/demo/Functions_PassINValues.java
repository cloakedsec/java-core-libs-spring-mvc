package selenium.demo;

public class Functions_PassINValues {
	public static void main(String[] args) {
		int s = sumAll(300, 4, 6);
		if (s > 100) {
			System.out.println("Sum is greater than 100 --> " + s);
		} else {
			System.out.println("Sum is lesser than 100 -->" + s);
		}
		sumAll(4, 5, 6);
		
		int x = findSum(100);
		System.out.println("Sum of first 100 numbers is "+x);
		x = findSum(200);
		System.out.println("Sum of first 200 numbers is "+x);
	}

	public static int sumAll(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
		int temp = 100;
		return sum;
	}
	
	public static int findSum(int n) {
		int sum=0;
		for(int x=0; x<=n; x++) {
			sum= sum+x;
		}
		return sum;
	}
}