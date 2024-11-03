package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups={"smoke"})
	public void demo()
	{
		System.out.println("world");
	}
	
	@Test
	public void mobilelogin()
	{
		System.out.println("login");
	}
	
	@Test
	public void mobilesignin()
	{
		System.out.println("signin");
	}
	
	@Test
	public void mobilesignout()
	{
		System.out.println("signout");
	}
	
	@Test
	public void worldmethod()
	{
		System.out.println("world2");
		Assert.assertTrue(false);
	}
}
