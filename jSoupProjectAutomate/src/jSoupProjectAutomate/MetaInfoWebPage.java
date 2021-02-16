package jSoupProjectAutomate;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MetaInfoWebPage {

	public static void main(String [] args) throws IOException {
		
		Document doc = Jsoup.connect("https://orders.takeaway.com/").get();  
		String keywords = doc.select("meta[name=keywords]").first().attr("content");
		System.out.println("Meta keyword : " + keywords);  
		String description = doc.select("meta[name=description]").get(0).attr("content");  
		System.out.println("Meta description : " + description);  
	}
	
	
}
