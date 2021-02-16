package Medical;

public class GovtHospital implements Hospital{

	@Override
	public void operate() {
		System.out.println("Govt Hospital");
	}

	@Override
	public void doScan() {
		System.out.println("Govt Hospital scanning");
	}

	@Override
	public void doVaccination() {
		System.out.println("Govt Hospital Vaccination");
		
	}
	

}
