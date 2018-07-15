package radio_button;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();
List<WebElement> chkBx = driver.findElements(By.name("profession"));
         chkBx.get(0).click();
         Thread.sleep(1000);
        // chkBx.clear();

		
		int iSize = chkBx.size();
		for(int i=0; i < iSize ; i++ ){
	
		String sValue = chkBx.get(i).getAttribute("value");
			System.out.println(sValue);
		}
driver.close();
	}

}
