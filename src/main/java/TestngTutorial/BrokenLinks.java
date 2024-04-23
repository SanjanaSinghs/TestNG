package TestngTutorial;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.virtualemployee.com/lp/hire-ios-native-app-developers/");
		List<WebElement> lists = driver.findElements(By.tagName("img"));
		for(WebElement list : lists) {
		String links = list.getAttribute("src");
		System.out.println(links);
		
		try {
			URL link = new URL(links);
			HttpURLConnection c = (HttpURLConnection)link.openConnection();
			c.setRequestMethod("HEAD");
			c.connect();
			int r = c.getResponseCode();
			System.out.println(r);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		}
	}
}

