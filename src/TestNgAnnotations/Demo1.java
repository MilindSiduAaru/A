package TestNgAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void Method1() {
		System.out.println("Demo1--->Method1");
	}
	@BeforeSuite
		public void Method2() {
			System.out.println("Demo1--->Method2---->BeforeSuit");
		}
	@AfterSuite
		public void Method3() {
			System.out.println("Demo1--->Method3----->AfterSuit");
		}
	@BeforeTest
	public void Method4() {
		System.out.println("Demo1--->Method4(This is Before Test)");
	}
	@AfterTest
	public void Method5() {
		System.out.println("Demo1--->Method5(This is After Test)");
	}
	@BeforeClass
	public void Method6() {
		System.out.println("Demo1--->Method6(This is BeforeClass)");
	}
	@AfterClass
	public void Method7() {
		System.out.println("Demo1--->Method7(This is AfterClass)");
	}
	@BeforeMethod
	public void Method8() {
		System.out.println("This is Before Method");
	}
	@AfterMethod
	public void Method9() {
		System.out.println("This is After Method");
	}
	@Test
	public void Method10() {
		System.out.println("Demo1---->Method10");
	}
	
	
	}
