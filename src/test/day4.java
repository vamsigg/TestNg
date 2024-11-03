package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 extends day3 {

	@Test
	public void webloginhomeloan()
	{
		System.out.println("webloginhome");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileloginhomeloan(String urlname)
	{
		System.out.println("mobileloginhome");
		System.out.println(urlname);
	}
	
	@Test(groups={"smoke"})
	public void apiloginhomeloan()
	{
		System.out.println("apiloginhome");
	}
}
