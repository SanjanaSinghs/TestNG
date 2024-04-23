package TestngTutorial;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@RunWith(Parameterized.class)
public class parameterss {
	 private String email;
	    private String password;
	    private static final String APPLICATION_URL = "https://app.transiteld.com/login";

	    public void parameterss(String email, String password) {
	    	  this.email = (email == null) ? "" : email;
	          this.password = (password == null) ? "" : password;
	    }

	    @DataProvider(name = "loginData")
	    public static Object[][] data() {
	        return new Object[][] {
	                {"test-admin@transiteld.com", "Kingg@209"},  // Valid credentials
	                {"user2", "password2"},  // Valid credentials
	                {"user3", "wrongpassword"},  // Invalid password
	                {"nonexistentuser", "password"}  // Invalid username
	        };
	    }

	    @Test(dataProvider = "loginData")
	    public void testLogin(String email, String password) throws InterruptedException {
	    	 System.out.println("Username: " + email);
	         System.out.println("Password: " + password);
	        // Set the path to ChromeDriver executable
	        System.setProperty("webdriver.gecko.driver","C:\\Users\\\\sanjanasingh\\Documents\\geckodriver.exe");

	        // Initialize the WebDriver
	        WebDriver driver = new FirefoxDriver();
	        System.out.println("URL: " + APPLICATION_URL);

	        // Open the financial app login page
	        driver.get(APPLICATION_URL);

	        // Enter username and password
	        WebElement usernameField = driver.findElement(By.name("email"));
	        usernameField.sendKeys(email);

	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys(password);

	        // Click on the login button
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign In']"));
	        loginButton.click();
	        Thread.sleep(2000);

	        // Verify login outcome based on the test data
	        if (email.equals("nonexistentuser") || password.equals("wrongpassword") || password.equals("password2")) {
	            // Assert login failure (URL should remain the same)
	            assertEquals(APPLICATION_URL, driver.getCurrentUrl());
	        } else {
	            // Assert successful login (check for redirection to another URL)
	            assertEquals("https://app.transiteld.com/companies?status=active&page=1", driver.getCurrentUrl());
	        }

	        // Close the WebDriver
	        driver.quit();
	    }
	}


