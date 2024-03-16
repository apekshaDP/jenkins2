package maven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Manoj Patil\\OneDrive\\Desktop") ;
		
		 Workbook wb = WorkbookFactory.create(fis);
		 
		 Sheet sh = wb.getSheet("Sheet1");
		 
		         Row rw = sh.createRow(3);
		          Cell cl = rw.createCell(0);
		         cl.setCellValue("pune");
		          
		              FileOutputStream fos = new FileOutputStream("C:\\Users\\Manoj Patil\\OneDrive\\Desktop");
		              
		              wb.write(fos);
		 
		 
		 
		 
	}

}
