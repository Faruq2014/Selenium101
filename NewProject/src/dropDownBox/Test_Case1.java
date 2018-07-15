package dropDownBox;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Case1 {  //how to use Select()

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		driver.manage().window().maximize();
		driver.findElement(By.id("tAddress")).sendKeys("8103 pinelake ct");
		driver.findElement(By.id("tCity")).sendKeys("Alexandria");
		//Select()+ driver()= stateselect method(stateselect also is data type)
		
		Select stateselect = new Select(driver.findElement(By.id("sState")));
	    stateselect.selectByVisibleText("VA - Virginia");
	    
		driver.findElement(By.id("lookupZipFindBtn")).click();
		driver.quit();
		
	
		}
}
