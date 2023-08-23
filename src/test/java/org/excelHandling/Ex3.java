package org.excelHandling;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream ("./ExcelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("AllStrings");	
		Row r0 = s.getRow(0);	
//		Cell c0 = r0.getCell(0);
//		for (int i=0;i<r0.getLastCellNum();i++) {
//		System.out.println(r0.getCell(i).getStringCellValue());
//		}
		
		for (int i=0;i<r0.getLastCellNum();i++) {
			System.out.println(s.getRow(0).getCell(i).getStringCellValue());
			}
		
		

	}

}
