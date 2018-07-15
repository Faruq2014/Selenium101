package mouseHover;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.usps.com/");
	 
	       // WebElement element = driver.findElement(By.className("menu--tier-one-category--mail-ship"));
	 
	       // Actions action = new Actions(driver);
	 
	       // action.moveToElement(element).build().perform();
	       // Thread.sleep(2000);
	     
	        Select oSelect = new Select(driver.findElement(By.className("menu--tier-one-category--mail-ship")));
			
			
			List<WebElement>oSize=oSelect.getOptions();
			int iListSize=oSize.size();    //oSize.size() is our own build method,iListSize is reference name and int is data type.
			// building our own loop
			for(int i =0; i<iListSize; i++){
				System.out.println("totatl number of the dropdown list is "+" "+iListSize); //to print the int type total  number.
				
				//String st =oSelect.getOptions().get(55).getText();
				//System.out.println("55 number drop down box name is "+" "+st);
				
				
	        
		
		
		
	}

}}
