package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import lib.Utility;

public class FacebookScreenshot {

	static WebDriver driver;

	@Test
	public void captureScreenshot() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		Utility.highLightElementcaptureScreenshot(driver, username,"Username Highlighted");
		username.sendKeys("dheeru.nmishra@gmail.com");
		Utility.captureScreenshot(driver, "Username Enetered");

		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		Utility.highLightElementcaptureScreenshot(driver, password, "Password Highlighted");
		password.sendKeys("1234");
		Utility.captureScreenshot(driver, "Password Enetered");







	}

}
