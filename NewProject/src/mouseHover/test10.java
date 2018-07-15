package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://uscis.gov/");
	        driver.manage().window().maximize();

	        Actions action = new Actions(driver);
	 
	       WebElement element = driver.findElement( By.linkText("FORMS"));
	        action.moveToElement(element).build().perform();
	       Thread.sleep(3000);
	        
	        driver.findElement(By.linkText("N-400, Apply for Citizenship")).click();
	        
	}

}
