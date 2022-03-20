package TestNgAnnotations;

import org.testng.annotations.Test;

public class groupsDemo {
	@Test(groups= {"Smoke"})
	public void Method1() {
		System.out.println("groupsDemoSMoke--->Method1");
	}
	@Test
	public void Method2() {
		System.out.println("groupsDemoSMoke--->Method2");
	}
	@Test(groups= {"Smoke"})
	public void Method3() {
		System.out.println("groupsDemoSMoke--->Method3");
	}
	@Test(groups= {"Regression"})
	public void Method4() {
		System.out.println("GroupDemoRegression--->Method4");
	}
}
