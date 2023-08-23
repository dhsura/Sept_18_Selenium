package org.testNgEx1;

import org.testng.annotations.Test;

public class Ex1 {
  @Test
  public void TestMethod1() {
	  System.out.println("Test-1");
  }

  public void TestMethod2() {
	  System.out.println("Test-2");
  }
  @Test
  public void TestMethod3() {
	  TestMethod2();
	  System.out.println("Test-3");
  }
}
