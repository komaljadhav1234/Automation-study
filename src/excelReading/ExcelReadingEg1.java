package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg1 {
	//cascaded method

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//step1:create file
		
		File MyFile = new File("C:\\Users\\Admin\\Documents\\5thmarch.xlsx");
		
	    String name = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(name);

	}

}
