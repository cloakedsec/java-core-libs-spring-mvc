package jSoupProjectAutomate;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Orders {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://orders.takeaway.com/").get();
		String title = doc.title();
		System.out.println("title is: " + title);
		
	}
}
