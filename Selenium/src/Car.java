
public class Car {
	String model;
	int price;
	static int wheels=4;
	
	// construtor - overloading
		public Car(String model, int price) {
			this.model = model;
			this.price = price;
		}
		
		public Car() {
			System.out.println("in car constructor -- no args");
		}
	
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "Mercedes";
		c1.price = 45000;
		c1.start();
		c1.accel();
		
		Car c2 = new Car();
		c2.model = "Audi";
		c2.price = 56000;
		c2.start();
		c2.accel();
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		//Static
		
		System.out.println(wheels);
		System.out.println(Car.wheels);
		//bad code habits
		System.out.println(c2.wheels);
		
		c1.wheels = 8;
		
		System.out.println(wheels);
	}
	public void start() {
		System.out.println(model + " starting");
	}
	public void accel() {
		System.out.println(model + " accelerating");
	}
}
