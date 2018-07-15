package mouseHover;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://usps.com/");
	        driver.manage().window().maximize();
		
		
	Actions action = new Actions (driver);
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/nav/ol/li[3]/a/span[1]"));
		
		action.moveToElement(element).build().perform();
	
		
		
		 driver.findElement(By.cssSelector(".menu--tier-one-category--mail-ship > ol:nth-child(2) > li:nth-child(6) > a:nth-child(1)")).click();
		
		 driver.findElement(By.id("tAddress")).sendKeys("5004 columbia pike");
		 
		 driver.findElement(By.id("tApt")).sendKeys("02");
		 
		 driver.findElement(By.id("tCity")).sendKeys("Arlington");
		 
		 Select state = new Select(driver.findElement(By.id("sState")));
		 
		 List <WebElement> number = state.getOptions();
		 
		 int list = number.size();
		 
		 for(int i = 0; i <=list; i++) {
			 
			 String statename =state.getOptions().get(i).getText();
			 
			 System.out.println(statename);
			 
			 state.selectByVisibleText("VA - Virginia");
			 
			 
			 driver.findElement(By.id("lookupZipFindBtn")).click();
			 
		 
	

	}

}}
