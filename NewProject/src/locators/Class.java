package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	       WebDriver   driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.className("inputtext")).sendKeys("molla@yahoo.com");
	       //driver.findElement(By.className("inputtext")).sendKeys("abcd1234");
	       //driver.findElement(By.id("u_0_2")).click();
           //driver.close();
	       driver.get("https://www.usps.com/");
			 
	        WebElement element = driver.findElement(By.className("menu--tier-one-category--mail-ship"));
	 
	        Actions action = new Actions(driver);
	 
	        action.moveToElement(element).build().perform();
	 Thread.sleep(2000);
	     
	
	}
}
