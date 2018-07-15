package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Case8 {  // how to break, print until you need or want.

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		driver.manage().window().maximize();
		
		
     Select state = new Select(driver.findElement(By.id("sState")));
    
    List<WebElement> number=state.getOptions();
   int list = number.size();  // to print all the value you have to use loop.
   for (int i = 0; i < list; i++) {
	 String statename = state.getOptions().get(i).getText();
	 System.out.println(statename);
	 if(statename.equals("CA - California")){
		 state.selectByIndex(i);
			break;
			
			}
	}
   //loop ends in this curly brace
   driver.quit();
   
   }

	}


