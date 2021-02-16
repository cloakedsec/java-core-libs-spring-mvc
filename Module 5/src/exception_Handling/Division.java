package exception_Handling;

public class Division {
	public static void main(String[] args) {
		
		try {
		int i=2/0;
		System.out.println(i);
	}catch(Exception e) {
		System.out.println("Some error"+ e.getMessage());
		e.printStackTrace();
	}
		
}
}