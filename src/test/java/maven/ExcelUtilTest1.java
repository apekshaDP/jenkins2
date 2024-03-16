package maven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import commonUtils.ExcelUtil;
import commonUtils.PropertyFileUtil;

public class ExcelUtilTest1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtil eutil=new ExcelUtil();
		
		       String a = eutil.getDataFromExcel("Sheet1", 0, 0);
		
		PropertyFileUtil putil=new PropertyFileUtil();
		       String b  =putil.getDataFromPropertyFile("url");
		       System.out.println(a);
		       System.out.println(b);
		       
	}
}
