package utilities;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
 
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class XLS_DataProvider {
	static Workbook book;
	static Sheet sheet;
	
	public static String testdata_sheet_path = "C:\\Users\\madhutejaswara reddy\\OneDrive\\Desktop\\RLL group 6\\Book1.xlsx";
	
	public static List<Map<String,String>>getTestData(String sheetName ) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = null;
		file =	new FileInputStream(testdata_sheet_path);
		
		book = WorkbookFactory.create(file);
		sheet = book.getSheet(sheetName);
		
		List<Map<String,String>> data = new ArrayList<>();	
		for(int i=0;i<sheet.getLastRowNum();i++) {
			
			LinkedHashMap<String,String> lob = new LinkedHashMap<>();
			
			
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
				
				String Headername = sheet.getRow(sheet.getFirstRowNum()).getCell(j).getStringCellValue();
				
				
				lob.put(Headername, sheet.getRow(i+1).getCell(j).toString());
	         }
			data.add(lob);
		}
	
		return data;
		
	}

}
