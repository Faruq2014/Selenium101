package radio_button;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {

	public static void main(String[] args) {
		test3 t=new test3();
		t.radiobutton();
	}
		public void radiobutton(){
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement rdBtn = driver.findElement(By.id("exp-4"));
		rdBtn.click();
		
		System.out.println(rdBtn.getSize());
		System.out.println(rdBtn.getText());
		driver.close();
		}
		

	}


