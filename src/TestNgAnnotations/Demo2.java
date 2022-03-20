package TestNgAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void Method1() {
		System.out.println("Demo2---->Method1");
		
	}
	@Test
	public void Method2() {
		System.out.println("Demo2---->Method2");
		
	}
	@Test
	public void Method3() {
		System.out.println("Demo2---->Method3");
		
	}
	@BeforeTest
	public void Method4() {
		System.out.println("Demo2--->Method4(This is Before Test)");
	}
	@AfterTest
	public void Method5() {
		System.out.println("Demo2--->Method5(This is After Test)");
	}

}
