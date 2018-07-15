package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiLink {

	public static void main(String[] args) throws InterruptedException {
		multiLink mt = new multiLink();
		mt.gettitle();
		mt.size();

	}
public void gettitle() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.uscis.gov/");
	driver.manage().window().maximize();
	driver.findElement(By.className("dropdown-toggle")).click();
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.quit();
	
}
public void size() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().fullscreen();
	driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
	
	driver.get("http://www.google.com");
	Thread.sleep(5000);
	driver.quit();
	System.out.println("test passed");
}

}
