package TestNgAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	@Parameters({"url","EmployeeName"})
	@Test
	public void Method1(String parameterTest ,String name) {
		System.out.println("ParametersDemo----->Method1");
		System.out.println(parameterTest);
		System.out.println(name);
	}
	@Test
	public void Method2() {
		System.out.println("ParametersDemo----->Method2");
	}
	@Test
	public void Method3() {
		System.out.println("ParametersDemo----->Method3");
	}

}
