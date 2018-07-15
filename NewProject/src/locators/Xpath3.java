package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\molla\\Downloads\\chromedriver.exe");
	       WebDriver   driver = new ChromeDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      
	        driver.navigate().to("https://www.google.com/");
	        
	       
	        driver.findElement(By.xpath("//*[@id='fsr']/a[2]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id='maia-main']/div[2]/p[1]/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id='archives']/li[1]/a")).click();
	        Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        driver.navigate().back();//can navigate back because chain link xpath
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[@id='fsr']/a[1]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/a")).click();
	        driver.navigate().back(); //not working because different window
	        driver.quit();
	        
	      
	}

}
