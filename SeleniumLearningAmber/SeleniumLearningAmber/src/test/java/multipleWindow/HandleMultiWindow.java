package multipleWindow;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.BaseClass;
import lib.MouseAction;

public class HandleMultiWindow extends BaseClass
{

	
	public HandleMultiWindow() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void keyboardActivityDemo() throws Exception
	{
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		System.out.println("Title of Parent Window: "+driver.getTitle());
		WebElement link = driver.findElement(By.xpath("//a[contains(.,'Insurance Project')]"));
		MouseAction.rightClick(driver, link);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowIds= driver.getWindowHandles();
		
		
		Iterator<String> iter= windowIds.iterator();
		
		String parentWindow=iter.next();
		String childWindow=iter.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println("Title of Child Window: "+driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Amber");
	}
}
