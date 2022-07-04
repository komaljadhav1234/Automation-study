package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//ready total sheet
		
		File MyFile = new File("C:\\Users\\Admin\\Documents\\5thmarch.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		//read total sheet using static coding
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
		String value = mysheet.getRow(i).getCell(j).getStringCellValue();
		 System.out.print(value+" ");
		}
			System.out.println();
		}
	
	}

}
