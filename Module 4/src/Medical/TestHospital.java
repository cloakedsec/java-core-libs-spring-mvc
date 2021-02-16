package Medical;

public class TestHospital {

	public static void main(String[] args) {
//		Hospital h = new Hospital(); illegal
		
		FortisHospital f = new FortisHospital();
		f.doScan();
		f.doVaccination();
		f.operate();
		f.PhoneConsultation();
		
		System.out.println("-------------");
		
		GovtHospital g = new GovtHospital();
		g.doScan();
		g.doVaccination();
		g.operate();
		//g.PhoneConsultation();
		System.out.println("-------------");
		
		//interface ref = new class_impl
		
		Hospital h = new FortisHospital();
		h.doScan();
		h.doVaccination();
		h.operate();
		//h.PhoneConsultation();
		
		Hospital h1 = new GovtHospital();
		
		h1 = new FortisHospital();
		
	}
	
	

}
