package Medical;

public class MobilePhone extends Phone{

	public void roamFree() {
		System.out.println("Mobile Roaming");

	}
	//overriding
	@Override //annotation
	public void call() { //normal call
		System.out.println("Mobile Calling");
	}

}
