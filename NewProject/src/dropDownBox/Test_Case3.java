package dropDownBox;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Case3 {

	public static void main(String[] args) throws InterruptedException {
		
		//Select() + getOptions()+List<WebElement> method------------------------
		//with getOptions(),you only can work outside of the drop down box. to go inside you need List<WebElement> method and a loop
		
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		
		Select oSelect = new Select(driver.findElement(By.id("sState")));
		
		//oSelect.getOptions() is a method, oSize is a reference object name and List<WebElements> is a data type and a method.
		
		List<WebElement>oSize=oSelect.getOptions();
		int iListSize=oSize.size();    //oSize.size() is our own build method,iListSize is reference name and int is data type.
		// building our own loop
		for(int i =0; i<iListSize; i++){
			System.out.println("totatl number of the dropdown list is "+" "+iListSize); //to print the int type total  number.
			
			String st =oSelect.getOptions().get(55).getText();
			System.out.println("55 number drop down box name is "+" "+st);
			
			
	       driver.quit();
	}
	}
}
