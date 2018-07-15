package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID {

	public static void main(String[] args) {
		 
			   System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		       WebDriver   driver = new FirefoxDriver();
		 
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		        driver.get("https://www.facebook.com/");
		        driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
		        driver.findElement(By.id("pass")).sendKeys("abcd1234");
		        driver.findElement(By.id("u_0_2")).click();

	}

}
