package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	       WebDriver   driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://www.seleniumhq.org");
	      driver.findElement(By.xpath("//*[@id='menu_download']/a")).click();
	        
	     
	       // driver.quit();


	      //*[@id="menu_download"]/a
	}

}
//<li id="menu_download"><a href="/download/" title="Get Selenium">Download</a></li>
//<a href="/download/" title="Get Selenium">Download</a>
//*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a