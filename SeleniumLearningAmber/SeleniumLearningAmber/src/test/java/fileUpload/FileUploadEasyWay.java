package fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadEasyWay
{

	
	@Test
	public void fileUpload() throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the Application Under Test (AUT)
		driver.get("https://demoqa.com/automation-practice-form/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\mama\\Pictures\\89614188_3433847819964391_3965618947360817152_n.jpg");
	}
}
