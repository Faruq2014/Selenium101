package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class facebook extends basepage {
	 facebook (){}
	public facebook (WebDriver driver){
		super(driver);
	}
	public void fb() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mjmolla@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("faruq8205");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.getTitle().equals("Facebook"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl().equals("http://www.facebook.com"));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
		
       
	}
	

}
