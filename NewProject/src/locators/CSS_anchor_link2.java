package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_anchor_link2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	       WebDriver   driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.navigate().to("https://www.amazon.com/");
	        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(1)")).click();
	        driver.navigate().back();
	        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
	        driver.navigate().back();
	        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();
	       // driver.navigate();
	        driver.findElement(By.xpath("//a[@href='/gp/bestsellers/gift-cards/ref=sv_gc_0']"));

	}

}
