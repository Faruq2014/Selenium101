package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Case6 { //if you do not want to print all the value from drop down box.   

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		driver.manage().window().maximize();
		
		
     Select state = new Select(driver.findElement(By.id("sState"))); //Select()+driver()=state()
    
    List<WebElement> number=state.getOptions(); //state+getOptions()+List<WebElement>=number()
   int list = number.size();  // to print all the value you have to use loop.
   for (int i = 0; i < list; i++) {
	 String statename = state.getOptions().get(i).getText(); //building statename method=that means get all the value from drop down box.
	 System.out.println(statename);
	 if(statename.equals("VA - Virginia")){ // that means you want to stop the loop in this particular value.
		 state.selectByIndex(i);
			break; //nested for loop method.
	
	   

	}
 
   }// loop ends here
   
   driver.quit();
   }
	}
