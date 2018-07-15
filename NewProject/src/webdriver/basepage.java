package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basepage {
	public WebDriver driver;
	basepage(){}
	
	basepage(WebDriver driver){
		this.driver=driver;
		driver.manage().window().maximize();
	}
		
public  void driver (){
	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
}

}
