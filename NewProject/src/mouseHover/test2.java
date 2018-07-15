package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.usps.com/");
	 
		
		 WebElement menu = driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[1]/a"));
	        WebElement SUBMenu   = driver.findElement(By.xpath("//*[@id='global-menu']/div/nav/ol/li[1]/ol/li[5]/a"));

	        Actions action =    new Actions(driver);
	        action.moveToElement(menu).perform();
	        Thread.sleep(2000);
	        action.click(SUBMenu).perform();

	        
	}

}
