package TestNg_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_DataProvider_Example {

	WebDriver driver;

	
	@BeforeClass
	public void browserOpen()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider ="testdata" )

	public void tittle_test(String UN ,String PW) throws InterruptedException {

		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(UN);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PW);
		
		//driver.findElement(By.xpath("//div[@class='element-companyId']//input[@placeholder='Enter your company']")).sendKeys(compny);
		


		Thread.sleep(3000);
	

	}


	
	@DataProvider
	
	public Object[][] testdata()
	{
		
		Object[][] data = new Object[3][2] ; // rows and columns 
		
		
		data[0][0]="UN1";
		data[0][1]="PWD1";
		
		
		data[1][0]="UN2";
		data[1][1]="PWD2";
		
		data[2][0]="UN3";
		data[2][1]="PW3";
		
		return data;
		
	}
	
	
	
	@AfterClass
	public void closingbrowser() {
		driver.close();
	}

}