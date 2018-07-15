package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				 
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			        driver.get("http://usps.com/");
			        driver.manage().window().maximize();

			        Actions action = new Actions(driver);
			 
			       WebElement element = driver.findElement(By.className("menu--tier-one-category--mail-ship"));
			        action.moveToElement(element).build().perform();
			        driver.findElement(By.linkText("Look Up a ZIP Code")).click();
			        
			        driver.findElement(By.id("tAddress")).sendKeys("8103 pinelake ct");
					driver.findElement(By.id("tCity")).sendKeys("Alexandria");
					
					
					Select stateselect = new Select(driver.findElement(By.id("sState")));
				    stateselect.selectByVisibleText("VA - Virginia");
				    
					driver.findElement(By.id("lookupZipFindBtn")).click();
					Thread.sleep(3000);
			        driver.quit();
			       
	}

}
