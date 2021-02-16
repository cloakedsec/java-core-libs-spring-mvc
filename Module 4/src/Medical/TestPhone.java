package Medical;

public class TestPhone {

	public static void main(String[] args) {
		MobilePhone m = new MobilePhone();
		
		Phone p = new Phone();
		
		p.call();
		p.voiceMail();
		
		System.out.println("----------");
		m.call();
		m.voiceMail();
		m.roamFree();
		
		SmartPhone s = new SmartPhone();
		s.call();
	}
}
