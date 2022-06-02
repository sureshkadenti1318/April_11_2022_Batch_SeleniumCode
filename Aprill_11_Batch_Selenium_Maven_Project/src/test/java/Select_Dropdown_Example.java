import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement countrydropdown = driver.findElement(By.id("country"));

		Select sclt = new Select(countrydropdown);

		String defautoptin = sclt.getFirstSelectedOption().getText();//

		System.out.println("---defautoptin---" + defautoptin); // india

		// sclt.selectByIndex(2);

		// sclt.selectByValue("12");

		sclt.selectByVisibleText("Bangladesh");

		boolean flag = sclt.isMultiple();//

		System.out.println(flag);

		String defautoptin1 = sclt.getFirstSelectedOption().getText();//

		System.out.println("---defautoptin1---" + defautoptin1);

		List<WebElement> wb = sclt.getOptions();

		int totaloptions = wb.size();/// 21

		System.out.println("----totaloptions----" + totaloptions);

		for (int i = 0; i < totaloptions; i++) {
			String dropdowninfo = wb.get(i).getText();
			
			if(dropdowninfo.contains("Serbia"))
			{
				wb.get(i).click();
				break;
			}

			System.out.println("---dropdowninfo---" + dropdowninfo);
		}

	}

}
