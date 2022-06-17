package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngDemo2 {
//	@BeforeClass
//	private void beforeClass() {
//	System.out.println("Before class");
//
//	}
//	@BeforeMethod
//	private void beforeMethod() {
//		System.out.println("Before method");
//
//	}
//@AfterMethod
//private void afterMethod() {
//	System.out.println("After method");
//
//}
@Parameters({"username","password"})
@Test()
private void tc01(String s,String s1) {
	System.out.println(s);
	System.out.println(s1);

}
}
//@Test(priority=5,invocationCount=5)
//private void tc01() {
//	System.out.println("test1");
//
//}
//@Test(priority=2,enabled=false)
//private void tc02() {
//	System.out.println(" test2");
//
//}
//@Test(priority=-10)
//private void tc03() {
//	System.out.println(" test 3");
//
//}
//@Test(priority=2)
//private void tc04() {
//	System.out.println(" ram kumar");
//
//}
//@Test(priority=-1)
//private void tc05() {
//	System.out.println(" vijay mani");
//
//}
//@AfterClass
//private void afterClass() {
//	System.out.println("After class");
//
//}
//}
