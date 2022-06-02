package Actions_Class_Example_MouseOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		
			
		
WebElement rightclckelmnt=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));


Actions act = new Actions(driver);

act.contextClick(rightclckelmnt).build().perform();// rightClick


	
//driver.close();
				
		
		

}
}