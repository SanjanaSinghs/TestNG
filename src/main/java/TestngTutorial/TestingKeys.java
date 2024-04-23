package TestngTutorial;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

@Test
public class TestingKeys {
	
	public void testLearning() throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        
        try {
            // Navigate to the Amazon website
            driver.get("https://www.amazon.in/");
            Thread.sleep(5000); // Pause to allow the page to load
            
        	WebElement Element = driver.findElement(By.id("twotabsearchtextbox"));
    		Element.sendKeys("Mobile");
    		Thread.sleep(2000);
    		Actions actions = new Actions(driver);
//    		actions.keyDown(Keys.DOWN).perform();
    		 for (int i = 0; i < 4; i++) {
                
                 actions.keyDown(Keys.DOWN).perform();
                 Thread.sleep(500); 
    		 }
    		 actions.keyDown(Keys.ENTER).perform();
    		 Thread.sleep(5000);
            
            // Find elements with the class name "a-size-medium"
            List<WebElement> lists = driver.findElements(By.className("a-size-medium"));
            
            // Iterate through the list of elements
            for (int index = 0; index < lists.size(); index++) {
                // Get the element at the current index
                WebElement list = lists.get(index);
                
                // Print the index of the current element
//                System.out.println("Element at index " + index + ": " + list);
                }
            WebElement element = lists.get(2);

         // Use JavaScript to scroll to the element
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

         // Optionally, wait for a moment for the scrolling to take effect
         Thread.sleep(1000);
         element.click();
         Thread.sleep(2000);
         
         // Get all window handles
         Set<String> windowHandles = driver.getWindowHandles();
         
         // Convert the set of window handles to a list
         List<String> handlesList = new ArrayList<String>(windowHandles);
         
         // Check if there are at least two windows open
         if (handlesList.size() >= 2) {
             // Switch to the second window
             driver.switchTo().window(handlesList.get(1));
             
             // Now you are in the second window, and you can perform actions here
             System.out.println("Switched to second window");
         String title = driver.getTitle();
         System.out.println(title);}
         WebElement button = driver.findElement(By.id("add-to-cart-button"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
          button.click(); 
                

         
        }
            finally {
            // Close the browser when done
//            driver.quit();
        }
    }
}
