package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Case7 {
//how to get text name from index value
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tools.usps.com/go/ZipLookupAction_input");
		driver.manage().window().maximize();
		//driver.findElement(By.id("sState"));
		
     Select state = new Select(driver.findElement(By.id("sState")));  // to find total index number
     state.getOptions().get(33).click();         // to click 33 number state.
     Thread.sleep(5000);
     
     List<WebElement> number=state.getOptions();  // using List method alone
     int list = number.size();  // to know total number or the maximum number
     System.out.println("total state number is"+"  "+list);
     
     // using getOptions() alone---->
    String v= state.getOptions().get(55).getText(); // to find particular state.
   System.out.println("55 numver state is "+" "+v); // to print state name.
   
    String v1= state.getOptions().get(56).getText();
    System.out.println("56 numver state is "+" "+v1);
    
    
    String v2= state.getOptions().get(57).getText();
    System.out.println("57 numver state is "+" "+v2);
    
    String v3= state.getOptions().get(58).getText();
    System.out.println("58 numver state is "+" "+v3);
    
   
   
    
    
    driver.close();
	}
	

}
