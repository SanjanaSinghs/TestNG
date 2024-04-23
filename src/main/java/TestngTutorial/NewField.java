package TestngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewField {
	@Test
	public void fieldAddition() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.virtualemployee.com/lp/hire-software-development-company/");
		Thread.sleep(2000);
		 try {
				
	         // Replace "elementId" with the actual ID of the element you want to scroll to
	         String elementId = "form";
	         
	         // Use JavascriptExecutor to scroll to the element
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         WebElement animatedElement = driver.findElement(By.id("form"));
	         js.executeScript("arguments[0].scrollIntoView(true);", animatedElement);
	         Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.id("3f746946-34b4-442c-a677-e232cdd2bc40")).sendKeys("Haider Ali");
	}
		 finally {
			 
		 }
	}

}
