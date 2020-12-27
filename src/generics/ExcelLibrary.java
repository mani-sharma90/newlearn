package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant {
	
	
	
	
	public static String getCellValue(int row,int cell) throws IOException {
	
	FileInputStream fis=new FileInputStream(excel_path);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	
	}
	

	
	
}
