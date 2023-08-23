package org.excelHandling;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream ("./ExcelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("AllStrings");
		int lastRowNumber =  s.getLastRowNum();
		System.out.println("lastRowNumber :"+lastRowNumber);
		
		int phsyNoRow = s.getPhysicalNumberOfRows();
		System.out.println("phsyNoRow :"+phsyNoRow);
		
		Row r0 = s.getRow(0);
		int lastCellNum = r0.getLastCellNum();
		System.out.println("lastcellNumber : "+lastCellNum);
		int phsyNumCell = r0.getPhysicalNumberOfCells();
		System.out.println("phsyNumCell : "+phsyNumCell);
		
		
		Cell c0 = r0.getCell(0);
		System.out.println(c0.getStringCellValue());
	

	}

}
