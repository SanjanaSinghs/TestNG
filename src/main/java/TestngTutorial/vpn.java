package TestngTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class vpn {
	
	public void vpnex() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sanjanasingh\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com");	   
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://addons.mozilla.org/firefox/downloads/file/4189770/veepn_free_fast_security_vpn-2.5.5.xpi");
		driver.navigate().to("https://www.virtualemployee.com");
		Thread.sleep(50000);
		driver.navigate().refresh();

//		((JavascriptExecutor) driver).executeScript("window.open()");
//        Object[] handles = driver.getWindowHandles().toArray();
//        driver.switchTo().window(handles[2].toString());
//		Thread.sleep(2000);

		
	}

}
