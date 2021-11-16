package Com.vtiger.Genricutil;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {
	
public String excelutilty(String sheetname,int rownum,int cellnum) throws Throwable
{
	FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet(sheetname);
	Row row=sheet.getRow(rownum);
	Cell cell=row.getCell(cellnum);
	return cell.getStringCellValue();
}
}
