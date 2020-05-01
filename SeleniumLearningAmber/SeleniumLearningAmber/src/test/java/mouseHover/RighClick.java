package mouseHover;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.MouseAction;

public class RighClick extends MouseAction
{
	WebDriver driver;

	@Test
	public void rightClick() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();

		// Launch the Application Under Test (AUT)
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		
		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		
		rightClick(driver, link);
		// Click on Edit link on the displayed menu options
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();
		// Accept the alert displayed
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" + alert.getText()); //alert text\n??
		alert.accept();
		// driver.switchTo().alert().accept();
		// Closing the driver instance
		// driver.quit();

	}
}
