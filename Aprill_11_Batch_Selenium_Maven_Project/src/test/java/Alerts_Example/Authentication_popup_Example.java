package Alerts_Example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_popup_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
       /************* https://username:password@url **********/
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
//driver.close();
				
		
		

}
}