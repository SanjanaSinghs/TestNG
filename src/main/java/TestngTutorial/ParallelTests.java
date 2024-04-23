package TestngTutorial;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTests {
	WebDriver driver = null;
	
	@BeforeTest
	public void settingUpBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		driver = new FirefoxDriver();	
		
		
	}

	@Test
	public void OpeningPage() throws MalformedURLException, IOException {
		
		String [] urls = {"https://www.uqualio.com",
				"https://www.virtualemployee.com/da/net",
				"https://www.google.com"

		};
//
		for(int i=0; i<=urls.length-1; i++) {
			//	HttpURLConnection c;
			try {

				driver.get(urls[i]);
				HttpURLConnection c = (HttpURLConnection) new URL(urls[i]).openConnection();
		c.setRequestMethod("HEAD");
		int r = c.getResponseCode();
		System.out.println(r);
			}
			finally {
				
			}
		}
	}
	
	@Test
	public void FillingForm() throws InterruptedException {
		driver.get("https://www.virtualemployee.com/lp/outsource-to-india-optimized-d/");
		Thread.sleep(5000);
		WebElement namee = driver.findElement(By.name("3f746946-34b4-442c-a677-e232cdd2bc40"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].scrollIntoView(true);", namee);
		namee.sendKeys("Haider Ali");
		driver.findElement(By.id("7f685ebb-7c54-4cff-a1bc-772562d25c38")).sendKeys("haider.ali@virtualemployee.com");
		Thread.sleep(5000);
		driver.findElement(By.id("dfc1d565-4450-ed11-bba2-002248d5d7f2")).sendKeys("Haider Ali");
		driver.findElement(By.id("ac6a065d-364e-40d6-9a19-d9bf1ed4aa3e")).sendKeys("12345678");
		WebElement website = driver.findElement(By.id("ac9ddb60-616f-4f12-b4e2-9202f688ed2f"));
		website.sendKeys("test");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", website);
		
		WebElement dropdownElement = driver.findElement(By.id("dfc1d565-4450-ed11-bba2-002248d5d7f2"));
		dropdownElement.click();
		Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Looking for a service");
        
        WebElement projectDuration = driver.findElement(By.id("89348cac-086e-ec11-8943-000d3af2e9bb"));
        projectDuration.click();
		
Select duration = new Select(projectDuration);
		duration.selectByIndex(2);
	
	
	driver.findElement(By.id("85348cac-086e-ec11-8943-000d3af2e9bb")).sendKeys("Testing");
	driver.findElement(By.xpath("//button[@name='submit']")).click();
	Thread.sleep(2000);
	String thankyouPage = driver.getCurrentUrl();
	System.out.println(thankyouPage);
	}
	
	@AfterTest
	public void closingBrowser() {
		driver.quit();
		
	}
}
