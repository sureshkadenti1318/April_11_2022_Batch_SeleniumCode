package Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Chrome_Browser {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
		
	WebDriver driver= new ChromeDriver();	
	
	}

}
