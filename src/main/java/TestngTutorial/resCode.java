package TestngTutorial;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class resCode {

	@Test
	public void responseCode() {


		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		String [] urls = {"https://www.uqualio.com",
				"https://www.virtualemployee.com/da/net",
				"https://www.google.com"

		};

		for(int i=0; i<=urls.length-1; i++) {
			//	HttpURLConnection c;
			try {

				driver.get(urls[i]);
				HttpURLConnection c;

				c = (HttpURLConnection) new URL(urls[i]).openConnection();
				c.setRequestMethod("HEAD");
				c.connect();
				int r = c.getResponseCode();
				System.out.println(r);
				if(r==200) {
					System.out.println("Page is working fine");
				}
				else {
					System.out.println("Page is not getting opened");
				}
				//		driver.quit();
			}

			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				//		e.printStackTrace();
				System.out.println("Page not found");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//		e.printStackTrace();
				System.out.println("Page not found");



			}
		}

	}
	
	
}




