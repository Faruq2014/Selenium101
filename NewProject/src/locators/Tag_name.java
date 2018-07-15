package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tag_name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		driver.manage().window().maximize();
		driver.findElement(By.id("tAddress")).sendKeys("8103 pinelake ct");
		driver.findElement(By.id("tCity")).sendKeys("Alexandria");
		//Select()+ driver()= stateselect method(stateselect also is data type)
		
		Select stateselect = new Select(driver.findElement(By.id("sState")));
	    stateselect.selectByVisibleText("VA - Virginia");
	     // tag name= visible text
	    driver.findElement(By.id("lookupZipFindBtn")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //--------------------------------------------------------------
	    Select stateselect1 = new Select(driver.findElement(By.id("sState")));
	    driver.findElement(By.id("tCity")).sendKeys("Alexandria");
	    stateselect1.selectByIndex(55);
	    // tag name = index 
	    driver.findElement(By.id("lookupZipFindBtn")).click();
	    //-------------------------------------------------------------
	    
	    driver.get("http://facebook.com");
		List<WebElement>rbt = driver.findElements(By.name("sex"));
		rbt.get(0).click();
		Thread.sleep(3000);
		rbt.get(1).click();
		// tag name = value
		
		//driver.quit();

	}

}
