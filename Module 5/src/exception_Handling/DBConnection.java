package exception_Handling;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//connecting db = success
			//querry - pull = exception
			System.out.println("A");
			int i=2/0;
			System.out.println("B");
		}catch(Exception e) {
			System.out.println("Some exception");
		}finally {
			System.out.println("Finally");
		}
	}

}
