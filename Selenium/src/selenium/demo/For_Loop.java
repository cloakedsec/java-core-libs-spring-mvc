package selenium.demo;
public class For_Loop {
	public static void main(String[] args) {
		System.out.println("x");
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	int sum=0;
	
	for(int n=0;n<=100;n++) {
		sum=sum+n;
	}
	System.out.println("Sum of first 100 numbers is " +sum);
}
}