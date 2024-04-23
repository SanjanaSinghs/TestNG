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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.*;

public class ExtendedReports {
	
	public static void main (String [] args) {
		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("extentReports.html");
        extent.attachReporter(spark);
        
        ExtentTest test1 =extent.createTest("My First Test Case");
        

	
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	System.setProperty("webdriver.gecko.driver","C:\\Users\\\\sanjanasingh\\Documents\\geckodriver.exe");
	driver = new FirefoxDriver();
	
	test1.log(Status.INFO, "Starting Test Case");
	driver.get("https://www.virtualemployee.com/da/hire-seo-experts-cr");
	
	test1.log(Status.PASS, "Page should open");
	String expectedTitle = "Hire SEO experts";
		String actualTitle = driver.getTitle();
		System.out.println("Title is correct"+expectedTitle.equalsIgnoreCase(actualTitle));
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			test1.log(Status.PASS, "Title is correct");
		}
		else {
			test1.log(Status.FAIL, "Title is incorrect");
		}
//		Assert.assertEquals(actualTitle, expectedTitle);
//		test1.log(Status.PASS, "Title is correct");
		System.out.println("Title is correct");
		
		driver.close();
		test1.log(Status.INFO, "Test Completed");
		extent.flush();
	}
	
	

//	public void findingElement() {
//	String expectedElement = "Full Name";
//	String actualElement = driver.findElement(By.id("3f746946-34b4-442c-a677-e232cdd2bc40")).getAttribute("placeholder");
//	Assert.assertEquals(actualElement, expectedElement);
//}
//	
	

}
