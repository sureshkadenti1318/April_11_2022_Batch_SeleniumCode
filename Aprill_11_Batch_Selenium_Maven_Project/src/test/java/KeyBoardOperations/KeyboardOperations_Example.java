package KeyBoardOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/advanced_search");
		
		
		driver.findElement(By.name("as_q")).sendKeys("Test Test");	
		

		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"a");// select all info
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"c");// copy all info 

		
		driver.findElement(By.name("as_q")).sendKeys(Keys.TAB);
		
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(2000);
		
		System.out.println("---done---");

}
}