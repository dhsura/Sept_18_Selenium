package org.excelHandling;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream ("./ExcelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int totalsheet = wb.getNumberOfSheets();
		System.out.println("totalsheet : "+totalsheet);
		
		int sheetIndex = wb.getSheetIndex("AllStrings");
		System.out.println("SheetIndex = "+sheetIndex);
		
		String sheetName = wb.getSheetName(0);
		System.out.println("Sheet name = "+sheetName);
		System.out.println("***************");
		for ( int i=0;i<totalsheet;i++) {
			System.out.println(wb.getSheetName(i));
		}

	}

}
