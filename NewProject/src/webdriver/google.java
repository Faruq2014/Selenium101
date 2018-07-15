package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class google extends basepage {
	google(){}
	public google(WebDriver driver){
		super(driver);
		driver.manage().window().maximize();
	}
	public static void m (){
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		  //System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		  // WebDriver driver = new InternetExplorerDriver();
		  driver.get("http://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getTitle().equals("Google"));
		  driver.findElement(By.name("q")).sendKeys("test");
		  driver.findElement(By.name("q")).click();
		  System.out.println(driver.getCurrentUrl());
		  
		 // driver.quit();
		 // driver.close();

}

}
