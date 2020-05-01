package dropDownDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown
{

	static WebDriver driver;

	@Test
	public void DropDowntest() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		
		
		
		
		
		WebElement sel = driver.findElement(By.id("select-demo"));
		Select dd = new Select(sel);
		// WebElement firstElement= dd.getFirstSelectedOption();
		System.out.println(
				"before selecting any value, the defaul of dropdown is: " + dd.getFirstSelectedOption().getText());
//		dd.selectByIndex(7);
		dd.selectByVisibleText("Saturday");

		List<WebElement> ele = dd.getAllSelectedOptions(); //my interpretation is dd.getSelectedOption()

		System.out.println(ele.get(0).getText());
		// get(0) means index, 0 index was "please select" > now 0 index being
		// overwritten to "Saturday"

		List<WebElement> ele1 = dd.getOptions();

		System.out.println(ele1.get(7).getText());
		
		
		
	//Select tag in DropDown must use "Select Class" 	
		
		
		
		
		
//		driver.findElement(By.id("select-demo")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//option[Text()='Saturday']")).click();

	}
}
