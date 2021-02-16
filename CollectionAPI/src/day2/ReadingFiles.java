package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
//		//creating
//		File f = new File("C:\\testing\\temp.txt");
//		f.createNewFile();
//		
//		
//		//writing
//		FileWriter w = new FileWriter("C:\\testing\\temp.txt");
//		BufferedWriter out = new BufferedWriter(w);
//		out.write("Hello we are writing in a file");
//		out.newLine();
//		out.write("This is a new line");
//		out.flush();
//		
		
		//reading
		FileReader r = new FileReader("C:\\testing\\temp.txt");
		BufferedReader bfr = new BufferedReader(r);
		String x = "";
		
//		System.out.println(bfr.readLine());
//		System.out.println(bfr.readLine());
		
		while((x = bfr.readLine()) != null) {
			System.out.println(x);
		}
	}

}
