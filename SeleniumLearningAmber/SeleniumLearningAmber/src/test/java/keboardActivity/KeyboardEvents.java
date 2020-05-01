package keboardActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardEvents
{

	@Test
	public void name() throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the Application Under Test (AUT)
		driver.get("https://www.facebook.com");

		Actions actions=new Actions(driver);
		
		actions.sendKeys(driver.findElement(By.name("firstname")), "Amber")
		.sendKeys(Keys.TAB)
		.sendKeys("Lee")
		.sendKeys(Keys.TAB)
		.sendKeys("9038331081")
		.build()
		.perform();
	}
}
