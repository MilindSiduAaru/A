package TestNgAnnotations;

import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void Method1() {
		System.out.println("Demo3---->Method1");
	}
	@Test(enabled=false)
	public void Method2() {
		System.out.println("Demo3---->Method2");
	}
	@Test
	public void Method3() {
		System.out.println("Demo3---->Method3");
	}
	@Test
	public void Method4() {
		System.out.println("Demo3---->Method4");
	}

}
