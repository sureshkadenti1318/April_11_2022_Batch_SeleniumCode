package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting_Example {

	WebDriver driver;

	SoftAssert ast = new SoftAssert();
	
	@Test(priority = 1)

	@Parameters("browser")
	
	public void tittle_test(String browsername) {
		
		
		if (browsername.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		else if (browsername.equalsIgnoreCase("edge"))
		{
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		 driver.manage().window().maximize();
			
		}
			
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		String tittle_Actual = driver.getTitle();
		
		System.out.println("---tittle---" + tittle_Actual);
		ast.assertEquals(tittle_Actual, "The Internet");
	
		
		driver.close();
		
	
}


}