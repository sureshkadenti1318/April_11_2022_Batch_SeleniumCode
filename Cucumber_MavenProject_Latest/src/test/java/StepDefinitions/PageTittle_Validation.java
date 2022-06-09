package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTittle_Validation {

	WebDriver driver;
	String tittle;

	@Given("open browser")
	public void open_browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		System.out.println("---open browser---");
	}

	@Given("Enter url")
	public void enter_url() {

		System.out.println("---URL open");
		driver.get("https://onlinetestinghelp.com/");

		driver.manage().window().maximize();

	}

	@When("get the tittle")
	public void get_the_tittle() {

		System.out.println("---Title test");

		tittle = driver.getTitle();

		System.out.println("-----tittle-" + tittle);
	}

	@Then("validate the title")
	public void validate_the_title() {

		System.out.println("---Tittle check");

		Assert.assertEquals(tittle, "Home - onlinetestinghelp.com");
		
		driver.close();

	}

}
