package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Different_Browser_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://onlinetestinghelp.com/");

		String url = driver.getCurrentUrl();

		System.out.println("---test url  openned---" + url);// https://onlinetestinghelp.com/

		String tittle = driver.getTitle();

		System.out.println("---tittle----" + tittle);

		
		  //String x= driver.getPageSource(); 
		 // System.out.println(x);
		 

		driver.close();

	}

}
