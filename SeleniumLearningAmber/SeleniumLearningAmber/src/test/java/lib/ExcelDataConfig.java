package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataConfig
{

	public static HSSFWorkbook wb;
	public static HSSFSheet sheet;

	static File source;

	public ExcelDataConfig(String excelPath)
	{

		try
		{
			source = new File(excelPath);
			FileInputStream input=new FileInputStream(source);
			wb=new HSSFWorkbook(input);
		} catch (Exception e)
		{
			System.out.println("Error reading excel data");
		}
	}

	public static void getExcellFullData(String excelPath) throws Exception
	{
		String data = null;
//		File source = new File(excelPath);
//		FileInputStream input = new FileInputStream(source);
//		wb = new HSSFWorkbook(input);
		sheet = wb.getSheetAt(0);

		int rownumber = sheet.getLastRowNum() + 1;
		System.out.println("total number of rows: " + rownumber);

		int columnnumber = sheet.getRow(0).getLastCellNum();
		System.out.println("total number of columns: " + columnnumber);

		System.out.println("data from excel");
		for (int i = 0; i < sheet.getLastRowNum(); i++)
		{
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++)
			{
				data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "  ");
			}
			System.out.println();
		}
	}

	public void writeToExcel(String excelPath) throws Exception, Exception
	{
		File source = new File(excelPath);
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("Amber");

		Object[][] data =

		{
				{ "Name1", "Amber" },
				{ "Age", "35" },
				{ "email", "8988@gmail.com" } };
		int rownum = 0;
		for (Object[] team : data)
		{
			HSSFRow row = sheet.createRow(rownum++);
			int columnnum = 0;
			for (Object value : team)
			{
				HSSFCell cell = row.createCell(columnnum++);
				if (value instanceof String)
				{
					cell.setCellValue((String) value);
				} else if (value instanceof Integer)
				{
					cell.setCellValue((Integer) value);
				}
			}
		}
		wb.write(new FileOutputStream(source));
		wb.close();
	}
}
