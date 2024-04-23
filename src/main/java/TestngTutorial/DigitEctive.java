package TestngTutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class DigitEctive {


	public void testingDigCode() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String [] urls = {"https://uqualio.com/product-features"
//				"https://uqualio.com/product-features/features-course-builder-video-elearning-software",
//				"https://uqualio.com/booking"
		};
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		for(int i=0; i<=urls.length-1; i++) {
			driver.get(urls[i]);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scrollBy(0 , 10)");
			driver.findElement(By.tagName("h1")).click();
			Thread.sleep(5000);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		    // JavaScript code snippet as a string
		    String jsCode = "const buttons = document.getElementsByTagName('button');" +
		                    "for (const button of buttons) {" +
		                    "  if (button.textContent.includes('Accept')) {" +
		                    "    console.log(button.textContent);" +
		                    "    button.click();" +
		                    "  }" +
		                    "}";

		    // Execute the JavaScript code
		    jsExecutor.executeScript(jsCode);

		    // Wait a bit to observe results
		    try {
		        Thread.sleep(2000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
			
			
//			WebElement popup = driver.findElement(By.id("coiOverlay"));
//			Thread.sleep(2000);
//	        List<WebElement> buttons = popup.findElements(By.tagName("button"));
//	        for (WebElement button : buttons) {
//	            if (button.getText().contains("Accept")) {
//	                System.out.println("Clicking button with text: " + button.getText());
//	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
////	                wait.until(ExpectedConditions.elementToBeClickable(button)).click();
//	              
//	                break; // Exit the loop once the button is clicked
//	            }
//	        }

		}
		
		
		
		
	}
}
