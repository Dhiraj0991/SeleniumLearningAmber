package mouseHover;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.MouseAction;

public class MouseMovement2 extends MouseAction
{

	static WebDriver driver;

	@Test
	public void mouseHover() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://executeautomation.com/blog/mouse-hover-click-selenium/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		WebElement videoSeries = driver.findElement(By.xpath("(//a[contains(.,'Video Series')])[2]"));
		WebElement freeCourses = driver.findElement(By.xpath("(//a[@href='http://executeautomation.com/blog/free-courses/'])[2]"));
		WebElement titBits = driver.findElement(By.xpath("(//a[@href='http://executeautomation.com/blog/selenium-titbits/'])[2]"));
		Thread.sleep(4000);
		mouse_hover(driver, videoSeries);
		Thread.sleep(4000);

		mouse_hover_click(driver, freeCourses,titBits);
		

		
	}
}
