package fileUpload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import lib.BaseClass;

public class FileUploadEasiestWay extends BaseClass
{

	
	public FileUploadEasiestWay() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void fileUpload() throws Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		String projectDirectory=System.getProperty("user.dir");
		System.out.println(projectDirectory);
		String fileToUpload=projectDirectory+"\\Coding notes.docx";
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(fileToUpload);
		
	}
}
