package TestngTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Preparation {
	
	@Test
	public void learning() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.virtualemployee.com/ir/database-developers/");
//		Dimension d = new Dimension(1920,1080);
//        driver.manage().window().setSize(d);
//        driver.manage().window().setSize(new Dimension(390, 864));
		String expectedTitle = "Hire Database Developers";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title is correct");
		List<WebElement> elementList = driver.findElements(By.xpath("//h2"));
		for (WebElement element : elementList) {
		String text = element.getText();
		String font = element.getCssValue("font-size");
		System.out.println(text + " " + font);
		}
	}

}
