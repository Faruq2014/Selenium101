package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	       WebDriver   driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("aaaa");
	        driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("bbbb");
	        
	        //driver.findElement(By.id("pass")).sendKeys("abcd1234");
	        //driver.findElement(By.cssSelector("input[value=Log In]")).click();
	        driver.findElement(By.cssSelector("input[type=submit]")).click();
	       System.out.println( driver.findElement(By.cssSelector(".fsl")).getText());
     

	}

}
