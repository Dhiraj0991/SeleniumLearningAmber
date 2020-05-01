package dropDownDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropDown
{

	static WebDriver driver;

	@Test
	public void BootsrtapDropDowntest() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mama/Desktop/DhirajClass/NewIndex.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Option 3']")).click();
	}

}
