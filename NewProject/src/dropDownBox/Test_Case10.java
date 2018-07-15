package dropDownBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Case10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		System.out.println("Total rows is "+rows);
		String data = "2,474.05";
				
		for (int rownum =1; rownum<=rows; rownum++){
			List<WebElement> rowcell = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" +rownum+"]/td"));
			//System.out.println("Row number " +rownum +" has total cell -->" + rowcell.size());
			
			for(int cNum=0; cNum<rowcell.size(); cNum++){
				String CellValue = rowcell.get(cNum).getText();
				//System.out.println(CellValue);
				System.out.print(CellValue +"---");
				
				/*
				if(data.equals(CellValue)){data is 1 and if we find cell value is 1 then break
					System.out.print(CellValue +"---");
					break;
				}*/
				/*
				if(CellValue.contains(data)){
					System.out.print(CellValue +"---");
					break;
				}*/
				
			}
			System.out.println();
			

		}
		
          driver.quit();
	}

}
