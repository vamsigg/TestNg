package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//itestlisner is a interface which implements testng listeners

public class Listeners implements ITestListener {

	@Override  
	public void onTestSuccess(ITestResult result)
	{  
	System.out.println("Success of test cases and its details");  
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) 
	{  
	//screen shot //response if api is failed
	System.out.println("failure of test cases and its details "+result.getName()); 
	}  
}
