import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement_Commands {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://parabank.parasoft.com/parabank/register.htm");

//WebElement firstname=driver.findElement(By.name("customer.firstName"));

//firstname.sendKeys("FirstName");

		driver.findElement(By.name("customer.firstName")).sendKeys("Sree");

		driver.findElement(By.name("customer.firstName")).clear();

		String x = driver.findElement(By.id("customer.address.city")).getAttribute("name");

		System.out.println("----x---" + x); // customer.address.city

		String tittle = driver.findElement(By.xpath("//h1[@class='title']")).getText();

		System.out.println("----tittle---" + tittle);// Signing up is easy!

		String tagname = driver.findElement(By.xpath("//h1[@class='title']")).getTagName();

		System.out.println("-----tagname-is-" + tagname);// h1

		String title_color = driver.findElement(By.xpath("//h1[@class='title']")).getCssValue("color");
		System.out.println("----title_color---" + title_color);// rgb_1/0

//---------------------------

		boolean lognbtn = driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed();// true

		System.out.println("----lognbtn---" + lognbtn);// true

		boolean lognbtn_enbl = driver.findElement(By.xpath("//input[@value='Log In']")).isEnabled();// true

		System.out.println("----lognbtn_enbl---" + lognbtn_enbl);// true

//boolean lognbtn_slct=driver.findElement(By.xpath("//input[@value='Log In']")).isSelected();// true 

//System.out.println("----lognbtn_enbl---" +lognbtn_slct);//true

		driver.findElement(By.xpath("//input[@value='Register']")).click();

		driver.close();

	}

}
