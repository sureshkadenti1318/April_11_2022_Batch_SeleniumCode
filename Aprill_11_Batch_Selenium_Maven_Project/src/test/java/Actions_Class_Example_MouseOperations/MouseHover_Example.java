package Actions_Class_Example_MouseOperations;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		
		
			
		
WebElement Kidstab=driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));


Actions act = new Actions(driver);

act.moveToElement(Kidstab).build().perform();
Thread.sleep(2000);
		
	
//driver.close();
				
		
		

}
}