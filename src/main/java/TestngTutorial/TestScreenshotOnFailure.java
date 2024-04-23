package TestngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class TestScreenshotOnFailure {

    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

        // Specify the URL to test
        String url = "https://www.amazon.in/Fleximaa-Womens-Cotton-Hoodies-whoomar7c-xl/dp/B077DC586W/ref=sr_1_2?_encoding=UTF8&content-id=amzn1.sym.74f25a9d-e850-443b-a26a-da459bed7e95&dib=eyJ2IjoiMSJ9.0_wThGDP4O02cYXanmTdeaT7YL-imy62geiQn67j3JyF1bjmjeaT6MCs5Ms0Tbj3vIsaZpYKmtryZ6WfNK_AZjz4RDRE804WBTaP8MrH8K94g8M3QulwomnnZvWF2oOobDCqjylJdk7OXyK2ihzBKey_FfTJediUqvZ3E_IG-GZ037Mlpgbfv5L2hazz4TjXZtIraUIkOtnSxBeWuEmPvcXzUZvDBKoYueuaLgPgPDm8W5m-EvaKhOtMQawWV_FDV0SRPYXogwWRsl9Akg6D52vypwsdtLGygmAyUP5aSnY.zsppTT0a06SOuVTJWYHvxnpoQG_mP8C8oL6y_iYXLkc&dib_tag=se&pd_rd_r=fc75055a-c21a-43e7-935c-9634521f7203&pd_rd_w=C1UUS&pd_rd_wg=nVWDY&pf_rd_p=74f25a9d-e850-443b-a26a-da459bed7e95&pf_rd_r=YNWVVDY1P07NS2PKKCKK&qid=1712926301&refinements=p_n_specials_match%3A21618256031%2Cp_85%3A10440599031%2Cp_n_feature_nineteen_browse-bin%3A11301357031&rnid=11301356031&rps=1&s=apparel&sr=1-2";

        // Specify the path where you want to save the screenshot
        String screenshotPath = "screenshot.png";

        try {
            // Navigate to the URL
            driver.get(url);
            driver.findElement(By.id("add-to-cart-button")).click();
            driver.findElement(By.id("nav-cart-count")).click();

       
            List<WebElement> element = driver.findElements(By.className("sc-list-item"));
            for(WebElement elements : element) {
            	System.out.println(elements);
            }


        } catch (NoSuchElementException e) {
            // Exception occurred, take a screenshot
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Taking screenshot and saving it as: " + screenshotPath);

            // Cast driver to TakesScreenshot
            TakesScreenshot ts = (TakesScreenshot) driver;

            // Take a screenshot and save it to the specified path
            File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            } catch (IOException ioe) {
                System.out.println("Failed to save screenshot: " + ioe.getMessage());
            }
        } finally {
            // Clean up and close the browser
//            driver.quit();
        }
    }
}


