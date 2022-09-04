package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver1 {

	public static WebDriver openBrowser1() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.leafground.com/");
		obj.manage().window().maximize();
		return obj;
		
	}
	
	
}
