package lib;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Utility {

	
	public static void highLightElementcaptureScreenshot(WebDriver driver, WebElement element,String screenshotName)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
		int i =0;
		try 
		{
			Thread.sleep(1000);
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			File source= ts.getScreenshotAs(OutputType.FILE);
			
			String projectDirectory=System.getProperty("user.dir");
			
//			org.openqa.selenium.io.FileHandler.copy(source, new File("./Screenshots/"+new SimpleDateFormat("yyyy_MM_dd__hh_mm").format(new Date())+screenshotName+(++i)+".png"));
			FileUtils.copyFile(source, new File(projectDirectory+"\\Screenshots\\"+new SimpleDateFormat("yyyy_MM_dd__hh_mm").format(new Date())+screenshotName+(++i)+ ".png"));
		} 
		catch (Exception e) {

			System.out.println("Error while highlighting/Capturing Screenshot of Element"+e.getMessage());
		} 

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px blue');", element); 
		
		
		

	}
	
	
	
	
	public static String captureScreenshot(WebDriver driver,String screenshotName)
	{
		int i =0;
		try {
			Thread.sleep(1000);
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			File source= ts.getScreenshotAs(OutputType.FILE);
			
//			org.openqa.selenium.io.FileHandler.copy(source, new File("./Screenshots/"+new SimpleDateFormat("yyyy_MM_dd__hh_mm").format(new Date())+screenshotName+(++i)+".png"));
			FileUtils.copyFile(source, new File("./Screenshots/"+new SimpleDateFormat("yyyy_MM_dd__hh_mm").format(new Date())+screenshotName+(++i)+ ".png"));
		}
		catch(Exception e)
		{
			System.out.println("Error while Capturing screenshot"+e.getMessage());
		}
		return screenshotName;
	}
}
