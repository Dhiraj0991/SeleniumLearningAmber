package excelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel
{

	static HSSFWorkbook wb;
	static HSSFSheet sheet;

	public static void main(String[] args) throws Exception
	{
		String data = null;
		File source = new File("C:\\Users\\mama\\Desktop\\data.xls");
//		FileInputStream input = new FileInputStream(source);
//		wb = new HSSFWorkbook(input);
//		sheet = wb.getSheetAt(0);
//		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("data0 from excel value is " + data0);
//
//		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
//		System.out.println("data1 from excel value is " + data1);
//
//		int rownumber = sheet.getLastRowNum()+1;
//		System.out.println("total number of rows: " + rownumber);
//
//		int columnnumber = sheet.getRow(0).getLastCellNum();
//		System.out.println("total number of columns: " + columnnumber);
//
//		System.out.println("data from excel");
//		for (int i = 0; i < rownumber; i++)
//		{
//			for (int j = 0; j < columnnumber; j++)
//			{
//				data = sheet.getRow(i).getCell(j).getStringCellValue();
//				System.out.print(data + "  ");
//			}
//			System.out.println();
//		}
		
		
		FileOutputStream output=new FileOutputStream(source);
		sheet.getRow(0).createCell(0).setCellValue("Taiwan");
		wb.write(output);
		
		wb.close();
		System.out.println("data has printed successfully");
	}

}
