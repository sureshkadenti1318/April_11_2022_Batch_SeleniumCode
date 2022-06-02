import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_Exmple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("E:\\Training_Batches\\April_11th_2022_Batch\\Zoom.txt");
		
		Thread.sleep(2000);
		
	//	driver.close();
				
		
		

}
}