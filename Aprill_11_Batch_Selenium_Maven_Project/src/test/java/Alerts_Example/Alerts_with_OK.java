package Alerts_Example;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_with_OK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(2000);
		
	Alert alt=	driver.switchTo().alert();
	/*
	alt.accept(); //Clicking on ok button
	alt.dismiss(); //Clicking on cancel button
	alt.getText(); // to text of popup
	alt.sendKeys("abcd"); //pass input into altert popup
	*/
String alrtTxt=	alt.getText();

System.out.println("----alrtTxt---" +alrtTxt);

alt.accept();
		
driver.close();
				
		
		

}
}