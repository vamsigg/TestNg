package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Parameters({"URL","APIKEY"})
	@Test
	public void demo(String urlname,String key)
	{
		System.out.println("Hellow");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(dataProvider="getdata")
	public void seconddemo(String username,String password)
	{
		System.out.println("bye");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name="getdata")
	public Object[][] getdata()
	{
		//1st combination username and password--good credit history
		//2nd combination username and password--no credit history
		//3rd combination username and password--fraud credit history
		Object[][] data=new Object[3][2];
		
		//1st set                       //columns in the row are nothing but values for that particular combination(row
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
	}
}
