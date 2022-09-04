package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.BaseTest;
import POJO.Driver1;
import Utility.ExcelSheet;
import Utility.Report;
import Utility.ScreenShot;
import POM.LoginPage;

@Listeners(Utility.TestListeners.class)

public class First extends BaseTest {
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest 
	public void extentreports() {
		report = Report.createReport();
	}
	@BeforeMethod 
	public void browser() {
		obj=Driver1.openBrowser1();
	}
	@Test
	public void LoginPage() throws EncryptedDocumentException, IOException {
		test=report.createTest("LoginPage");
		LoginPage log = new LoginPage(obj);
		String id = ExcelSheet.GetData(1, 1);
		String pass = ExcelSheet.GetData(2, 1);
		log.Email(id, obj);
		log.Pass(pass);
		log.Login();
		
		
		}
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else {test.log(Status.SKIP, result.getName());
		
		}
	}
	
	@AfterTest 
	public void flushResult() {
		report.flush();
	}
	
	

}