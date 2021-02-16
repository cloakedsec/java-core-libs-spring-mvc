package bar;

public class Fibonacci {
	public static void main(String []args) {
		long n1 = 0;
		long n2 = 1;
		long n3;
		int i, count = 100;
		System.out.print(n1+ " " +n2);
		
	for(i=2;i<count;++i) // loop starts from 0 because 0 & 1 are already printed
		
	{
		n3 = n1 + n2;
		System.out.print(" "+n3);
		n1 = n2;
		n2 = n3;
	}
		
	}
}
