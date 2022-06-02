package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits_Example {

	public static void main(String[] args) throws InterruptedException {
	
		
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver=new EdgeDriver();
	
	
	driver.get("https://parabank.parasoft.com/parabank/register.htm");

//Thread.sleep(2000);
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);


WebElement wb=driver.findElement(By.name("customer.firstName"));

WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.elementToBeClickable(wb));
	
	

	driver.findElement(By.name("customer.firstName")).sendKeys("Sree");

	}

}
