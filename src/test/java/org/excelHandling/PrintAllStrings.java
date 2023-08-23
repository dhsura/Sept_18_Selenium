package org.excelHandling;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllStrings {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream ("./ExcelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("AllStrings");	

		for ( int k=1;k<=s.getLastRowNum();k++) {
		
		for (int i=0;i<s.getRow(k).getLastCellNum();i++) {
			System.out.println(s.getRow(k).getCell(i).getStringCellValue());
			}
		System.out.println(" ");
		}
	

	}

}
