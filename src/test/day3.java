package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL"})
	@Test
	public void weblogincarloan(String urlname)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
	}
	
	@Test(timeOut=4000)                      //wait for till that time before fail
	public void logincarloan()
	{
		System.out.println("logincar");
	}
	
	@Test(enabled=false)                     //intentional not executing this test
	public void applogincarloan()
	{
		System.out.println("applogincar");
	}
	
	@Test(groups={"smoke"})                  //dividing based on groups
	public void mobilelogincarloan()
	{
		System.out.println("mobilelogincar");
	}
	
	@Test(dependsOnMethods={"weblogincarloan","logincarloan"}) 
	public void apilogincarloan()            //before excuting this method that method will excute
	{
		System.out.println("apilogincar");
	}
	
	
	
	@BeforeSuite
	public void beforemobileloginhome()
	{
		System.out.println("i will excute beforesuite");
	}
	
	@AfterSuite
	public void aftermobileloginhome()
	{
		System.out.println("i will excute aftersuite");
	}
	
	@BeforeClass
	public void beforeclasslogin()
	{
		System.out.println("i will excute beforeclass");
	}
	
	@AfterClass
	public void afterclasslogin()
	{
		System.out.println("i will excute afterclass");
	}
	
	@BeforeTest
	public void beforemobileloghome()
	{
		System.out.println("i will excute beforetest");
	}
	
	@AfterTest
	public void aftermobileloghome()
	{
		System.out.println("i will excute aftertest");
	}
	
	@BeforeMethod
	public void apilogincarbeforeloan()
	{
		System.out.println("before every method");
	}
	
	@AfterMethod
	public void apilogincarafterloan()
	{
		System.out.println("after every method");
	}
}
