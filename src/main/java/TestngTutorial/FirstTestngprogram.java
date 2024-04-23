package TestngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTestngprogram {
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeTest
	public void pageTest() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\\\sanjanasingh\\Documents\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.virtualemployee.com/da/hire-seo-experts-cr");
	}
	
	@AfterTest
	public void closingPage() {
		driver.close();
	}
	

	
	@Test(description="Checking Page Title")
		public void redirectionTest() {
		String expectedTitle = "Hire SEO Experts";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title is correct");
	}
	
	
	@Test
	public void findingElement() {
	String expectedElement = "Full Name";
	String actualElement = driver.findElement(By.id("3f746946-34b4-442c-a677-e232cdd2bc40")).getAttribute("placeholder");
	Assert.assertEquals(actualElement, expectedElement);
}
	
	

}
