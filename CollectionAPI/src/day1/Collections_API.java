package day1;

import java.util.ArrayList;
import java.util.Hashtable;

public class Collections_API {

	public static void main(String[] args) {
		
		ArrayList<String> List =new ArrayList();
		List.add("A");
		List.add("B");
		List.add("C");
		List.add("D");
		
		System.out.println(List.get(2));
		System.out.println(List.size());
		
		
		for(int i=0;i<List.size();i++) {
			System.out.println(List.get(i));
		}
		
		
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("name", "Ashen");
		table.put("place", "India");
		table.put("profession", "IT");
		
		System.out.println(table.get("name"));
	
		table.put("name", "Sam");
		System.out.println(table.get("name"));

	}

}
