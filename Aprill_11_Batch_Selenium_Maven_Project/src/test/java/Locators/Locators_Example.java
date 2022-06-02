package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();	
		
		
		driver.findElement(By.id("userId"));//2
		
		driver.findElement(By.name("pass"));//3
	
		driver.findElement(By.className("selectors-input jsSelector")); // ignore
		
		driver.findElement(By.cssSelector("")); //ignore
		
		driver.findElement(By.linkText("selectorshub.com1"));
		
		driver.findElement(By.partialLinkText("selectors"));// ignore
		
		driver.findElement(By.xpath("//input[@type='password']")); //1
		
		driver.findElement(By.tagName("input"));//ignore
	}

}
