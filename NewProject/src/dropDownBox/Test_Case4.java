package dropDownBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Test_Case4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.usps.com/");
		WebElement mail=driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(mail).perform();

	}

}
