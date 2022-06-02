package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Assertions_Example {

	WebDriver driver;

	
	@BeforeClass
	public void browserOpen()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)

	public void tittle_test() {

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		String tittle_Actual = driver.getTitle();
		
		SoftAssert ast = new SoftAssert();
		
		ast.assertEquals(tittle_Actual, "The Internet2");
		//Assert.assertEquals(tittle_Actual, "The Internet2");
		
		System.out.println("---tittle---" + tittle_Actual);
		
		int a= 5 ;
		int b= 6;
		//Assert.assertEquals(a, b);
		
		ast.assertEquals(a, b);
		
		ast.assertAll();

	}


	@AfterClass
	public void closingbrowser() {
		driver.close();
	}

}