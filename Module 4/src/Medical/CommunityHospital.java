package Medical;

public abstract class CommunityHospital extends StreetHospital{
public void doScan() {
		System.out.println("CommunityHospital doScan");
	}

/*public void doVaccination() {
	System.out.println("CommunityHospital doVaccination");
} */

	public void operate() {
		System.out.println("CityHospital operating");
	}
	//function overloading: one function with different input params
	public void operate(String patientName) {
		System.out.println("City hosp");
	}
	//function overriding : extending class and using the parent function in child class
	public void operate(String patientName, int hrs) {
		System.out.println("City hosp");
	}

}
