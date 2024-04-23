package TestngTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class AmazonTest {
	
    @Test
	public void amazonTesting() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		WebElement Element = driver.findElement(By.id("twotabsearchtextbox"));
		Element.sendKeys("Mobile");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.DOWN).perform();
		 for (int i = 0; i < 4; i++) {
            
             actions.keyDown(Keys.DOWN).perform();
             Thread.sleep(500); 
		 }
		 actions.keyDown(Keys.ENTER).perform();
		
		 List<WebElement> lists = driver.findElements(By.className("a-size-medium"));
         
         // Iterate through the list of elements
         for (int index = 0; index < lists.size(); index++) {
             // Get the element at the current index
             WebElement list = lists.get(index);
             
             // Print the index of the current element
             System.out.println("Element at index " + index + ": " + list);
//			 if (((List<WebElement>) list).size() > 1) {
//	                // Click on the element at index 1 (the second element in the list)
//	                ((WebDriver) list).get(1).click();
//		}
		
		
//		List<WebElement> lists = driver.findElements(By.className("s-heavy"));
//		for(WebElement list : lists) {
//			if(list.getText().equals("tv stand")) {
//				System.out.println(list.getText());
//list.click();
//			}
//		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String text = (String) js.executeScript("return document.getElementsByClassName(\"s-heavy\")[3].textContent;");
//		System.out.println("Text content of element: " + text);
//		
//		 WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]"));
//	        element.click();
		
}
}
}
