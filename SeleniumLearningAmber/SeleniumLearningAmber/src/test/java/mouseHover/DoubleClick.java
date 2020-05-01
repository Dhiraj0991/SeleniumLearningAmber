package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.MouseAction;

public class DoubleClick extends MouseAction
{
	static WebDriver driver;

	@Test
	public void doubleClick() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		Thread.sleep(3000);
		
		WebElement dd=driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		doubleclick(driver, dd);
	}
}