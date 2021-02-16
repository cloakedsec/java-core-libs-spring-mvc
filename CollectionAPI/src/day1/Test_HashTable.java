package day1;

import java.util.Hashtable;

public class Test_HashTable {
	public static void main(String[] args) {
		
		Hashtable<String, String> table1 = new Hashtable<String, String>();
		table1.put("city1", "DL");
		table1.put("city2", "GR");
		table1.put("city3", "PR");

	
	Hashtable<String, String> table2 = new Hashtable<String, String>();
	table2.put("city1", "13113");
	table2.put("city2", "13433");
	table2.put("city3", "03030");
	
	Hashtable<String, Hashtable<String, String>> table = new Hashtable<String, Hashtable<String, String>>();
	table.put("name", table1);
	table.put("zip", table2);
	
	System.out.println(table.get("zip").get("city2"));
}
}
