package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("G:\\eclipse pro\\saletrackr\\src\\test\\resources\\testData\\dataFile.xlsx");
        Workbook workbook=WorkbookFactory.create(f1);
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(2);
        System.out.println("Name: "+row.getCell(0).getStringCellValue());
        System.out.println("Email: "+row.getCell(1).getStringCellValue());
        System.out.println("Password: "+row.getCell(2).getStringCellValue());
        System.out.println("Mobile No.: "+(long)row.getCell(3).getNumericCellValue());
        System.out.println("Status: "+row.getCell(4).getBooleanCellValue());      
	}

}
