package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	
	
	public static String GetData(int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Automation\\Selenium\\Saucedemo excel.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Fuck").getRow(row).getCell(cell).getStringCellValue();
		return value;
	
	}
	
	
}
