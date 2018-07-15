package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
       WebDriver driver1 = new FirefoxDriver();
       WebDriver driver2 = new FirefoxDriver();
       WebDriver driver3 = new FirefoxDriver();
       driver1.get("http://www.google.com");
       driver2.get("http://www.facebook.com");
       driver3.get("http://www.yahoo.com");
       System.out.println(driver1.getTitle());
       

	}

}
