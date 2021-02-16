package day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_PropertiesFile {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\Employee.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("hobbies"));
		System.out.println(prop.getProperty("dob"));
	}

}
