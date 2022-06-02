package Navigation_Commadsnds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Commands_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();//Maximize window
		
		
		driver.get("https://onlinetestinghelp.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.navigate().back(); //onlinetestinghelp
		Thread.sleep(3000);
		
		driver.navigate().forward(); //facebook
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		System.out.println("---testing done");
		
		driver.close();
		
	}

}
