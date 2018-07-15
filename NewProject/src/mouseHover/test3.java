package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test3 {

	
		
	 
	     public static void main(String[] args)throws Exception{
	  
	     // TODO Auto-generated method stub
	     // Initialize WebDriver
	    	 System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	  
	     // Wait For Page To Load
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	     // Go to URL
	     driver.get("http://www.myntra.com/");
	  
	     // Maximize Window
	     driver.manage().window().maximize();
	  
	     // Mouse Over On " Men link " 
	     Actions a1 = new Actions(driver);
	     a1.moveToElement(driver.findElement
	     (By.xpath("//a[@href='/shop/men?src=tn&nav_id=5']"))).build().perform();
	     Thread.sleep(3000L);
	  
	     // Wait For Page To Load
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	     // Click on " bags & backpacks " link
	     driver.findElement
	     (By.xpath("//a[@href='/men-bags-backpacks?src=tn&nav_id=25']")).click();
	  
	  /*   // click on the categories - Bagpacks
	     //  driver.findElement
	     //(By.xpath("//*[text()='Categories']//following::li[1]/label']")).click
	     // Hover on the 1st bag 
	     Actions a2 = new Actions(driver);
	     a2.moveToElement(driver.findElement
	     (By.xpath("//ul[@class='results small']/li[1]"))).build().perform();
	  
	     //Click on the buy icon of the 1st bag
	     driver.findElement(By.xpath
	     (" //ul[@class='results small']/li[1]/div[1]//div[2]")).click();
	  
	     // Wait For Page To Load
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	     // Hover over the shopping bag icon present on the top navigational bar   
	     Actions a3 = new Actions(driver);
	     a3.moveToElement(driver.findElement
	     (By.xpath("//a[@href='/checkout/cart']"))).build().perform();
	  
	     // click on the remove icon
	     driver.findElement(By.xpath("//a[@data-hint='Remove item']")).click();
	  
	     //closing current driver window */
	     driver.close();   

	}

}
