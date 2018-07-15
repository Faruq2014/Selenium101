package dropDownBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Case9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		//xpath for company name = //table[@class='datatable']/tbody/tr/td[1]
				//xpath for price name = //table[@class='datatable']/tbody/tr/td[4]

				List<WebElement> companyname = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
				List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
				
				System.out.println(companyname.size());
				
				for(int i=0; i<companyname.size(); i++){
					System.out.println(companyname.get(i).getText() +" --- "+ currentprice.get(i).getText());
				}
				driver.close();
				
				

	}

}
