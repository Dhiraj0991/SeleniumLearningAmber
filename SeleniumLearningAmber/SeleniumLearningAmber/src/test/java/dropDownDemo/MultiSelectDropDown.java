package dropDownDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class MultiSelectDropDown
{
static WebDriver driver;
	
	@Test
	public void selectDDValues()
	{		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		
		WebElement dropdownvalues = driver.findElement(By.id("multi-select"));
		
		Select dd= new Select(dropdownvalues);
		

		
		dd.selectByVisibleText("California");
		dd.selectByVisibleText("New York");
		
		
		
//		ArrayList<WebElement> all_selected=(ArrayList<WebElement>) dd.getAllSelectedOptions();
//System.out.println(dd.getAllSelectedOptions().get(0).getText());
//System.out.println(dd.getAllSelectedOptions().get(1).getText());
		
		
		List<WebElement> all_selected=dd.getAllSelectedOptions();
		System.out.println("After selection the selected value are:");
		
		
		
		
		for(WebElement ele: all_selected) //Advance For Loop or For each Loop
		{
			String selected_values=ele.getText();
			System.out.println(selected_values);
		}
		
		
		
		
	}

}
