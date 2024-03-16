package maven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Step1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1:create object of fileinputtream class and in fileinputtream constructor enter the location of the external file
				FileInputStream fis=new FileInputStream("src\\main\\resources\\Data.xlsx ") ;
	   //step2:Call WorkbookFactory class from apache poi &call (inputStream)
		        Workbook wb = WorkbookFactory.create(fis);
		//step3:call a method getSheet(String name
		       Sheet sh = wb.getSheet("Sheet1");
		//step 4:Call getRow(int num)&Enter the row number
		      Row rw = sh.getRow(0);
		//Step 5: Call getCell (int cell)
		     Cell cl = rw.getCell(0);
		//Step 6:call  getStringCellValue()
		     String data=cl.getStringCellValue();
		     System.out.println(data);
		        
		        
		        
		        
		        
		       
	}

}
