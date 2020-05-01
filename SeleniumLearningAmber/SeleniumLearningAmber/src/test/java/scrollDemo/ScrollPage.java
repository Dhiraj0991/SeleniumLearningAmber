package scrollDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage
{
	WebDriver driver;
	@Test
	public void setupBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Red");
		driver.findElement(By.name("q")).submit();
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);   same as submit()
//		driver.findElement(By.xpath("//Input[@value='Google Search']")).click();
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("scroll(0,1400)");
		Thread.sleep(2000);
		je.executeScript("scroll(0,-1400)");
	}

}
