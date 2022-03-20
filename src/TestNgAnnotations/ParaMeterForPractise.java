package TestNgAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeterForPractise {
	@Parameters({"Aaryan"})
	@Test
	public void Method1(String A) {
		System.out.println("ParaMeterForPractise---->Method1");
		System.out.println(A);
		
	}
	@Parameters({"Aaryan"})
	@Test
public void Method2(String A) {
	System.out.println("ParaMeterForPractise---->Method2");
	System.out.println(A);
		
	}
	@Parameters({"Aaryan"})
	@Test
public void Method3(String A) {
	System.out.println("ParaMeterForPractise---->Method3");
	System.out.println(A);
}

}
