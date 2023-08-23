package org.testNgEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReportTC2 {
	@BeforeTest
	public void getQADetails () {
		System.out.println("get QA Enviroment Details");
	}
	@AfterTest 
	public void claerQAEnviromentDetails () {
		System.out.println("claer QA Enviroment Details");
	}
	@Test 
	public void createReportTC () {
		System.out.println(" Create  Report ");
	}
	@Test 
	public void updateReportTC () {
		System.out.println(" update  Report ");
	}
	@Test 
	public void deleteReportTC () {
		System.out.println(" delete Report ");
	}

}
