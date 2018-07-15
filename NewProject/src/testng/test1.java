package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import radio_button.test3;

public class test1 {
	
	
	@Test
	public void dologin(){
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	       WebDriver   driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.facebook.com/");
	       
	        driver.findElement(By.cssSelector("#email")).sendKeys("aaaa");
	        
	        
	        
	        driver.findElement(By.cssSelector("#pass")).sendKeys("abcd1234");
	        driver.findElement(By.cssSelector("input[id^=u_0]")).click();
	       System.out.println( driver.findElement(By.cssSelector(".fsl")).getText());
	       driver.close();
  
	}
@Test
public void radio_button(){
	test3 t = new test3();
	t.radiobutton();
	
}
	
	
	
}
