package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	       WebDriver   driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath("//input[@class='inputtext'][@name='email']")).sendKeys("molla@yahoo.com");
	    driver.findElement(By.xpath("//input[@class='inputtext'][@name='pass']")).sendKeys("molla4321");
	    //both input box has same value class= inputtext. so combined two attribute together.
	        
	        

	}

}
