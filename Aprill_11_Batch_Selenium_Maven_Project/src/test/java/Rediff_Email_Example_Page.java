import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Email_Example_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//div[@onclick='javascript: openDiv(event);']")).click();
		
		Thread.sleep(2000);

		List<WebElement> wb = driver.findElements(By.xpath("//li"));// 203

		int total_countrys = wb.size();/// 21

		System.out.println("----total_countrys----" + total_countrys);
		
		
		for(int i=0;i<total_countrys;i++)  
		{
			String total_countrys_info=wb.get(i).getText();
			
			System.out.println("---total_countrys_info---" +total_countrys_info);
			
			if(total_countrys_info.contains("Anguilla"))
			{
				wb.get(i).click();
				break;
			}
			
			
		}
		
	}

}
