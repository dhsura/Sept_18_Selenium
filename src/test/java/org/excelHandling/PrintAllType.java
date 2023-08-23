package org.excelHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class PrintAllType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream ("./ExcelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("AllType");	

		for ( int k=1;k<=s.getLastRowNum();k++) {	
		for (int i=0;i<s.getRow(k).getLastCellNum();i++) {
			CellType ct =s.getRow(k).getCell(i).getCellType();
		switch (ct) {
		case STRING :System.out.println(s.getRow(k).getCell(i).getStringCellValue());
			break;
		case NUMERIC :
			if(DateUtil.isCellDateFormatted(s.getRow(k).getCell(i))) {
			//	 Date d =s.getRow(k).getCell(i).getDateCellValue() ;
				 SimpleDateFormat sdf = new SimpleDateFormat ("dd-MMM-yyyy");
				 System.out.println(sdf.format(s.getRow(k).getCell(i).getDateCellValue()));
				 }else {
				System.out.println((long)s.getRow(k).getCell(i).getNumericCellValue());
			}
		    break;
		case BOOLEAN :System.out.println(s.getRow(k).getCell(i).getBooleanCellValue());
		    break;
		case FORMULA :System.out.println(s.getRow(k).getCell(i).getCellFormula());
		    break;
		case BLANK : System.out.println("Cell is Blank");
	        break;
		case ERROR :System.out.println(s.getRow(k).getCell(i).getErrorCellValue());
	    break;
		
	        default : System.out.println("Invalid cell");
			break;
		}
			
			
			}
		System.out.println(" ");
		}
	

	}
}


 