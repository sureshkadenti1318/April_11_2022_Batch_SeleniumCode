package TestNg_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Annotations_1 {

	WebDriver driver;

	
	@BeforeClass
	public void browseropen()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	
	
	

	@Test(priority = 1)

	public void tittle_test() {

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		String tittle = driver.getTitle();
		System.out.println("---tittle---" + tittle);

	}

	@Test(priority = 2)

	public void keyboardoperations() throws InterruptedException {
		driver.get("https://www.google.com/advanced_search");

		driver.findElement(By.name("as_q1")).sendKeys("Test Test");

		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL + "a");// select all info

		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL + "c");// copy all info

		driver.findElement(By.name("as_q")).sendKeys(Keys.TAB);

		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL + "v");

		Thread.sleep(2000);

		System.out.println("---done---");
	}

	@Test(priority = 3)
	public void screenshotTest() throws IOException, InterruptedException {
		TakesScreenshot sct = (TakesScreenshot) (driver);

		File src = sct.getScreenshotAs(OutputType.FILE);

		File dst = new File("E:\\Training_Batches\\April_11th_2022_Batch\\Rediff.PNG");

		FileUtils.copyFile(src, dst);

		Thread.sleep(2000);

		System.out.println("-------------done---------");
	}

	@AfterClass
	public void closingbrowser() {
		driver.close();
	}

}