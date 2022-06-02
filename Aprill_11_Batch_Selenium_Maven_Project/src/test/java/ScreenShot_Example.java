import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Example {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		TakesScreenshot sct =(TakesScreenshot)(driver);
		
	File src=	sct.getScreenshotAs(OutputType.FILE);
	
	File dst= new File ("E:\\Training_Batches\\April_11th_2022_Batch\\Rediff.PNG");
	
	FileUtils.copyFile(src, dst);
	
	Thread.sleep(2000);
	
	
		System.out.println("-------------done---------");
		
		
	}

}
