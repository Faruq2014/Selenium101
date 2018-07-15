package dropDownBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.usps.com/");
		
		WebElement MailShip = driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[1]/a"));
		
	
		System.out.println(MailShip.getText());    
		
		Actions act = new Actions(driver);
		act.moveToElement(MailShip).build().perform();
		
		//*[@id='global-menu']/div/nav/ol/li[1]/ol/li[5]/a
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[1]/ol/li[5]/a")));
		
		driver.findElement(By.xpath("//*[@id='global-menu']/div/nav/ol/li[1]/ol/li[5]/a")).click();
		
		/*
		WebElement icon = driver.findElement(By.xpath("//*[@id='secondary']/div[1]/div[2]/div[1]/div[1]/span[1]"));
		act.dragAndDropBy(icon, 50, 0).build().perform();
		*/
		//driver.close();
		

	}

}
