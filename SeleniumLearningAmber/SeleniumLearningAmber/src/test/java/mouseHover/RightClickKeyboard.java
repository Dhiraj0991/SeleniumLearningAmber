package mouseHover;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.MouseAction;

public class RightClickKeyboard extends MouseAction
{

	
	@Test
	public void keyboardActivityDemo() throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();

		// Launch the Application Under Test (AUT)
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		
		WebElement link = driver.findElement(By.xpath("//a[contains(.,'Insurance Project')]"));
		
		rightClick(driver, link);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
