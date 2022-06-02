package TestNg_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations_Order {

	
	@BeforeSuite // 1
	public void test() {
		System.out.println("1.Before suite is running");
	}
	
	@BeforeTest // 2
	public void test1() {
		System.out.println("2.Before test is running");
	}
	
	

	@BeforeClass//3
	public void test_54() {
		System.out.println("3.Before class is running");
	}
	
	
	@BeforeMethod // 4
	public void test3() {
		System.out.println("4.Before method is running");
	}

	@Test (priority = 1)// 5
	public void test_5() {
		System.out.println("5.Test is running----priority = 1");
	}
	

	@Test (priority = 2)// 5
	public void test_6() {
		System.out.println("5.Test is running----priority = 2");
	}
	
	@Test (priority = 3)// 5
	public void test_76() {
		System.out.println("5.Test is running----priority = 3");
	}
	
	
	@AfterMethod // 6
	public void test8() {
		System.out.println("6.After method is running");
	}

	@AfterClass // 7
	public void test7() {
		System.out.println("7.After class is running");
	}
	
		
	@AfterTest // 8
	public void test6() {
		System.out.println("8.After test is running");
	}

	
	@AfterSuite //9
	public void test5() {
		System.out.println("9.After suite is running");
	}





}
