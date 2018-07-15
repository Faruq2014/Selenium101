package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://store.demoqa.com/");
	        driver.manage().window().maximize();
		
		
		
		
		
		WebElement element = driver.findElement(By.linkText("Product Category"));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).perform();
 
        WebElement subElement = driver.findElement(By.linkText("iPads"));
 
        action.moveToElement(subElement);
 
        action.click();
        action.perform();
        
        Thread.sleep(2000);
        driver.quit();
	}

}
