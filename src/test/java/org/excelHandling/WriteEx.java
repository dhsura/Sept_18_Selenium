package org.excelHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteEx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream ("./ExcelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("WriteOperation");	
		s.getRow(1).createCell(2).setCellValue("Pass");
		s.getRow(2).createCell(2).setCellValue("Pass");
		s.getRow(3).createCell(2).setCellValue("Fail");
		FileOutputStream fos = new FileOutputStream ("./ExcelFiles/TestData.xlsx");
		wb.write(fos);
		fos.close();
		wb.close();
		
	}

}
