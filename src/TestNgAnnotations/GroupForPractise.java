package TestNgAnnotations;

import org.testng.annotations.Test;

public class GroupForPractise {
	@Test(groups= {"Regression"})
	public void Method1() {
		System.out.println("GroupForPractise---->Method1");
		
	}
	@Test(groups= {"Regression"})
	public void Method2() {
		System.out.println("GroupForPractise---->Method2");
		
	}
	@Test
	public void Method3() {
		System.out.println("GroupForPractise---->Method3");
		
	}
	@Test(groups= {"Regression"})
	public void Method4() {
		System.out.println("GroupForPractise---->Method4");
		
	}

}
