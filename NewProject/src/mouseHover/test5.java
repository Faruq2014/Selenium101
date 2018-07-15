package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				 
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			        driver.get("http://store.demoqa.com/");
			        driver.manage().window().maximize();
			 
		 WebElement element = driver.findElement(By.linkText("Product Category"));

	     Actions action = new Actions(driver);

		action.moveToElement(element).moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
		
		//action.moveToElement(element).moveToElement(driver.findElement(By.linkText("ipads"))).click().build().perform();	
		
	}

}
