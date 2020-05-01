package scrollDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntoView 
{
	static WebDriver driver;
	
	
	@Test
	public void scrolling() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
//		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbar_themes_demo.html");
		
		 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 
		 
		Thread.sleep(2000);
		 
		WebElement element = driver.findElement(By.xpath("//div[@id='mCSB_11_container']//p[contains(text(),'Nemo enim ipsam voluptatem quia voluptas sit asper')]"));
		 
		 
		Thread.sleep(2000);
		
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		 
		 
		 
		// Extract the text and verify
		 
		System.out.println(element.getText());


	}
}
