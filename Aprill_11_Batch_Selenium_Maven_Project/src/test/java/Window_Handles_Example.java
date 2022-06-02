import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		WebElement frmexpath = driver.findElement(By.xpath("//frame[@name='login_page']"));

		driver.switchTo().frame(frmexpath);
		System.out.println(driver.getWindowHandle());

		driver.findElement(By.xpath("//a[text()='Register Now ']")).click();
		Thread.sleep(3000);

		Set<String> allwindw_id = driver.getWindowHandles();// 2

		Iterator<String> it = allwindw_id.iterator();

		String prntid = it.next(); // patrnt window id

		String ChildId = it.next();

		System.out.println("----prntid---" + prntid);

		System.out.println("----ChildId---" + ChildId);
		
		
		driver.switchTo().window(ChildId);
		
		String childwindtittle=driver.getTitle();
		
		System.out.println("----childwindtittle----" +childwindtittle);
		
	driver.switchTo().window(prntid);
		
		String prntidwindtittle=driver.getTitle();
		
		System.out.println("----prntidwindtittle----" +prntidwindtittle);
		
		

		driver.quit();

	}
}