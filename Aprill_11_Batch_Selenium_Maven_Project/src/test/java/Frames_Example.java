import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
				
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("login_page");
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
   WebElement frmexpath=driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(frmexpath);
		

	driver.findElement(By.xpath("//a[text()='Register Now ']")).click();
	Thread.sleep(1000);
	
	driver.quit();

}
}