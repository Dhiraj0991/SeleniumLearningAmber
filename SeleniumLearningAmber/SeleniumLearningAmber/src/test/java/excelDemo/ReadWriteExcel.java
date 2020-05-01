package excelDemo;

import lib.ExcelDataConfig;

public class ReadWriteExcel
{
	public static void main(String[] args) throws Exception
	{
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\mama\\Desktop\\data.xls");
		excel.writeToExcel("C:\\Users\\mama\\Desktop\\data.xls");

		System.out.println("Writing excel data successfully");

		ExcelDataConfig.getExcellFullData("C:\\Users\\mama\\Desktop\\data.xls");
	}
}
