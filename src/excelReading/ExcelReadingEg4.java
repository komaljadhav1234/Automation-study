package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File MyFile = new File("C:\\Users\\Admin\\Documents\\5thmarch.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		//i want to read one column
		//static coding
		
		for (int i=0;i<=3;i++)
		{
			String value = mysheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(value);
		}
		//dynamic coding
		 
		int lastRowNum = mysheet.getLastRowNum();
		int totalRowCount = lastRowNum;
		System.out.println(totalRowCount);
		  
		  for(int i=0;i<=totalRowCount-1;i++)
		  {
			  String value = mysheet.getRow(i).getCell(2).getStringCellValue();
			  System.out.println(value);
		  }
	}

}
