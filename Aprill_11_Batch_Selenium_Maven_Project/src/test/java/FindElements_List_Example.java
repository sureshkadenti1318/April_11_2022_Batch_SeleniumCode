import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_List_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://parabank.parasoft.com/parabank/register.htm");

		List<WebElement> wb = driver.findElements(By.xpath("//a"));// 21

		int totallinks = wb.size();/// 21

		System.out.println("----totallinks----" + totallinks);
		
		
		for(int i=0;i<totallinks;i++)  
		{
			String linkinfo=wb.get(i).getText();
			
			System.out.println("---linkinfo---" +linkinfo);
		}
		
	}

}
