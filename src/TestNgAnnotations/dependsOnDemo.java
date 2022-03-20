package TestNgAnnotations;

import org.testng.annotations.Test;

public class dependsOnDemo {
	@Test(dependsOnMethods= {"Method2"})
	public void Method1() {
		System.out.println("dependsonDemo---->Method1");
	}
	@Test
	public void Method2() {
		System.out.println("dependsonDemo---->Method2");
	}
	/*@Test
	public void Method3() {
		System.out.println("dependsonDemo---->Method3");
	}*/

}
