package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class yahoo {
	public static void main (String[]args){
		yahoo y = new yahoo();
		y.url();
		y.title();
	}
	
	public void url(){
		//System.setProperty("webdriver.ie.driver", "C:/dev/Driver/IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://mail.yahoo.com/");
		driver.manage().window().fullscreen();
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("molla");
		//driver.findElement(By.id("login-signin")).click();
		//driver.findElement(By.name("password")).sendKeys("fasq122");
		//driver.findElement(By.id("login-signin")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.xpath("https://mail.yahoo.com/"));
		
	}
	public void title(){
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://mail.yahoo.com/");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}
	

}
