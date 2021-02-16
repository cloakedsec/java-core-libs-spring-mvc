
public class Constructors {

	public static void main(String[] args) {
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model="BMW";
		a.price=55600;
		
		Car d = new Car("Hyundai", 77000);
		System.out.println(d.model);
		System.out.println(d.price);
	}

}
