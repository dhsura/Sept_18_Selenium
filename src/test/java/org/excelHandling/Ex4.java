package org.excelHandling;


import org.utilities.BaseUtility;

public class Ex4 {

	public static void main(String[] args) throws Exception {
		BaseUtility Bu = new BaseUtility ();
		int str = Bu.getNumberOfSheets( 0, "./ExcelFiles/TestData.xlsx");
		System.out.println(str);
		String sheetname = Bu.getNameOfSheets("./ExcelFiles/TestData.xlsx");
		System.out.println(sheetname);
		int sI = Bu.getSheetIndex("AllStrings","./ExcelFiles/TestData.xlsx");
		System.out.println(sI);
		
		
	}

}
