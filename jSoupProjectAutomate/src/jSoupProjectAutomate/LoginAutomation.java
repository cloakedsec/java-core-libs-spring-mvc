package jSoupProjectAutomate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LoginAutomation {

	public static void main(String[] args) {

		try {

			// grab login form page first
			Response loginPageResponse = Jsoup.connect("https://mail.rediff.com/cgi-bin/login.cgi")
					.referrer("http://www.rediff.com/").userAgent("Mozilla/5.0").timeout(10 * 1000)
					.followRedirects(true).execute();

			System.out.println("Fetched login page");

			// get the cookies from the response, which we will post to the action URL
			Map<String, String> mapLoginPageCookies = loginPageResponse.cookies();

			// lets make data map containing all the parameters and its values found in the
			// form
			Map<String, String> mapParams = new HashMap<String, String>();
			mapParams.put("FormName", "existing");
			mapParams.put("seclogin", "on");
			mapParams.put("login", "YOUR_USER_ID");
			mapParams.put("passwd", "YOUR_PASSWORD");
			mapParams.put("remember", "1");
			mapParams.put("proceed", "Go");

			// URL found in form's action attribute
			String strActionURL = "https://mail.rediff.com/cgi-bin/login.cgi";

			Response responsePostLogin = Jsoup.connect(strActionURL)
					// referrer will be the login page's URL
					.referrer("https://mail.rediff.com/cgi-bin/login.cgi")
					// user agent
					.userAgent("Mozilla/5.0")
					// connect and read time out
					.timeout(10 * 1000)
					// post parameters
					.data(mapParams)
					// cookies received from login page
					.cookies(mapLoginPageCookies)
					// many websites redirects the user after login, so follow them
					.followRedirects(true).execute();

			System.out.println("HTTP Status Code: " + responsePostLogin.statusCode());

			// parse the document from response
			Document document = responsePostLogin.parse();
			System.out.println(document);

			// get the cookies
			Map<String, String> mapLoggedInCookies = responsePostLogin.cookies();

			/*
			 * For all the subsequent requests, you need to send the mapLoggedInCookies
			 * containing cookies
			 */

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
