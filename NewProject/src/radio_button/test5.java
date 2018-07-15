package radio_button;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class test5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();
		//driver.findElement(By.id("sState"));
		
     Select state = new Select(driver.findElement(By.id("exp-4"))); //select method + driver method = state method.
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
	}
}
