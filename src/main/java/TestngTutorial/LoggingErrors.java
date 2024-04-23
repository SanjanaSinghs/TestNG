package TestngTutorial;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.LogInspector;
import org.openqa.selenium.bidi.log.ConsoleLogEntry;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoggingErrors {
	
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		try {
            // Navigate to the webpage
            driver.get("https://www.virtualemployee.com/");
            String PageSource = driver.getPageSource();  
            System.out.println(PageSource);
            String textToCheck = "pagesense";
            
            // Check if the text is present in the page source
            boolean isTextPresent = PageSource.contains(textToCheck);
            
            // Print the result
            if (isTextPresent) {
                System.out.println("The text '" + textToCheck + "' is present in the page source.");
            } else {
                System.out.println("The text '" + textToCheck + "' is not present in the page source.");
            }
            // Retrieve available log types
//            Set<String> logTypes = driver.manage().logs().getAvailableLogTypes();
//            System.out.println("Available log types:");
//            for (String logType : logTypes) {
//                System.out.println(logType);
//            }
//            
//            // Retrieve browser logs
//            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
//            
//            // Filter and print all log entries
//            System.out.println("\nBrowser logs:");
//            for (org.openqa.selenium.logging.LogEntry entry : logEntries) {
//                System.out.println("Timestamp: " + entry.getTimestamp() + " Level: " + entry.getLevel() + " Message: " + entry.getMessage());
//            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
//        } finally {
//            // Close the browser driver
//            driver.quit();
        }
    }
}