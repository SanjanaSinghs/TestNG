package TestngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class RightClick {

	public void testingDigCode() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.virtualemployee.com/ir/business-outsourcing-to-india/");
		Thread.sleep(2000);
		WebElement namee = driver.findElement(By.name("3f746946-34b4-442c-a677-e232cdd2bc40"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].scrollIntoView(true);", namee);
		Thread.sleep(2000);
		WebElement contact = driver.findElement(By.id("dfc1d565-4450-ed11-bba2-002248d5d7f2"));
		Actions actions = new Actions(driver);
		
		actions.contextClick(contact).perform();
	}}
