package Utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import POJO.BaseTest;

public class TestListeners extends BaseTest implements ITestListener {

	public void OnTestStart(ITestResult result) {
	
		try {
			ScreenShot.getScreenShot(obj, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(result.getName()+"Test is Start");
		
	}
	public void OnTestFail (ITestResult result) {
		System.out.println(result.getName()+"Test Failed");
	}
	public void OnTestSuccess (ITestResult result) {
		System.out.println(result.getName()+"Test Success");
	}
	public void OnTestSkip (ITestResult result) {
		System.out.println(result.getName()+"Test Skipped"); 
	}
	
}
