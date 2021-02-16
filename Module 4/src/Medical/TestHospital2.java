package Medical;

public class TestHospital2 {
	public static void main(String[] args) {
	Hospital c = new CityHospital();
	c.doScan();
	c.doVaccination();
	c.operate();
}
}