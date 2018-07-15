package dropDownBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Case2 {
	
	public static void main(String args[])throws InterruptedException{
		//Select method + getOptions method.
		
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		driver.manage().window().maximize();
		//driver.findElement(By.id("tAddress")).sendKeys("pinelake ct");
		driver.findElement(By.id("tCity")).sendKeys("Alexandria");
		
		Select stateselect = new Select(driver.findElement(By.id("sState")));
		//stateselect.selectByIndex(56); 
		//Thread.sleep(2000);
		//stateselect.deselectByIndex(56);
		//stateselect.selectByVisibleText("VA - Virginia");
		
		// thats all you can do with select method but with the help of getOptions method you can do lots more.
		
		stateselect.getOptions().get(56).click();
		String name=stateselect.getOptions().get(56).getText();  //printing one state 
		System.out.println("name of the state is"+" "+name);
		Thread.sleep(2000);
		stateselect.getOptions().clear();  // clear the value
		
		stateselect.getOptions().get(55).click();    //working with the another state
		String name1=stateselect.getOptions().get(55).getText();
		System.out.println("name of the state is"+" "+name1);
		
		int n=stateselect.getOptions().size();  //printing the total size of the drop down box.
		System.out.println("total number of state is "+" "+n);
		
		driver.findElement(By.id("lookupZipFindBtn")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	
	}

}
