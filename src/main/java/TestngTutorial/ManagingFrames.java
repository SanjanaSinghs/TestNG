package TestngTutorial;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class ManagingFrames {
	
	public void testingDigCode() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://uqualio.com/product-features");
		driver.findElement(By.tagName("h1")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		 WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("cookie-information-sharinglibrary-iframe")));

		    // Use JavascriptExecutor to modify the style of the iframe to make it visible
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].style.display = 'block';", iframeElement);
		    

		    // Switch to the iframe
		    driver.switchTo().frame(iframeElement);
		    
		    Actions actions = new Actions(driver);
		    WebElement elementLocator = driver.findElement(By.name("cookie-information-sharinglibrary-iframe"));
		    actions.contextClick(elementLocator).perform();
		    Thread.sleep(2000);
	    try {
	        WebElement buttonInIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("coi-banner-wrapper")));
//	        buttonInIframe.click();
	        System.out.println("Clicked the button in the iframe.");
	    } catch (NoSuchElementException e) {
	        System.out.println("Failed to find the button in the iframe.");
	    }

	    // Switch back to the default content
	    driver.switchTo().defaultContent();

	    // Close the driver
//	    driver.quit();
	}
}