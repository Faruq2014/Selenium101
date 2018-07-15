package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Case5 {
	// to print all the value once----------by loop
	
	public static void main(String[] args) {
		//Select() + getOptions()+List<WebElement> method------------------------
				//with getOptions(),you only can work outside of the drop down box. to go inside you need List<WebElement> method and a loop
		
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		driver.manage().window().maximize();
		//driver.findElement(By.id("sState"));
		
     Select state = new Select(driver.findElement(By.id("sState"))); //select method + driver method = state method.
    // state.selectByIndex(56); state.getOptions();
     
    List<WebElement> number=state.getOptions(); // building----> getOptions()+List()= number(reference name)
  //state.getOptions() is a method, number is a reference object name and List<WebElements> is a data type and a method.
    
   int list = number.size();   //i=0 and i<list, that means in between everythin is =i, for examle in this dropdown box list
  // is from 0 to 66, thats means i= from 0 to 66.
   
   for (int i = 0; i < list; i++) {
	 String statename = state.getOptions().get(i).getText();
	 System.out.println(statename);
	// System.out.println("total state number is"+"  "+list);
	 
	
} 
   driver.quit();
	}

}
