package com.practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSal {
	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi=new FileInputStream("./Data/Test Data.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		int lastrow = wb.getSheet("Sheet2").getLastRowNum();
//		for (int i = 1; i <=lastrow; i++) 
//		{
//			 int sal = (int) wb.getSheet("Sheet2").getRow(i).getCell(2).getNumericCellValue();
//			if(sal>40000) 
//			{
//				System.out.println(wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue()+" "+sal);
//			}
//		}
		for (int i = 1; i <=lastrow; i++) 
		{
			String sal = wb.getSheet("Sheet2").getRow(i).getCell(2).getStringCellValue();
			if(Integer.parseInt(sal)>50000)
			{
				System.out.println(wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue());
			}
		}
	}

}
