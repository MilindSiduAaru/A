package TestNgAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="getdata")
	public void TestDataProvider(String Username,String Password) {
		System.out.println(Username);
		System.out.println(Password);
}
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="Test1";
		obj[0][1]="Test123";
		obj[1][0]="Test2";
		obj[1][1]="Test456";
		return obj;
		
	}

}
