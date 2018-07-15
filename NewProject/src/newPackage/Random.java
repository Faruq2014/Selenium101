package newPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Random {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://washingtondc.craigslist.org/");
        
      
		
		
		WebElement box = driver.findElement(By.xpath(".//*[@id='sss1']"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		Random r =new Random();
		int randomNum = r.nextInt(links.size());//5
		
		WebElement link = links.get(randomNum);
		System.out.println(randomNum);
		System.out.println(link.getText());
		link.click();
		Thread.sleep(5000);
		driver.quit();

	}

	private int nextInt(int size) {
		// TODO Auto-generated method stub
		return 0;
	}

}
