package Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PRCT {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Automation\\\\\\\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://testautomationpractice.blogspot.com/");
		
		WebElement al = obj.findElement(By.xpath("//button[text()='Click Me']"));
		al.click();
		Alert alert = obj.switchTo().alert();
		alert.accept();
		
		WebElement sl =obj.findElement(By.xpath("//select[@name=\"speed\"]"));
		sl.click();
		
		WebDriverWait wait = new WebDriverWait(obj,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(sl));
		
		WebElement d = obj.findElement(By.xpath("//designation[@discipline=\"appdev\"]"));
		//((JavascriptExecutor)obj).executeScript("arguments[0].scrollIntoView(true)", td);
		
		((JavascriptExecutor)obj).executeScript("arguments[0].scrollIntoView", d);
	
		obj.manage().timeouts().implicitlyWait(11,TimeUnit.SECONDS);
	
		Select select = new Select (sl);
		select.selectByIndex(3);
		
		WebElement fr = obj.findElement(By.xpath("//iframe[@frameborder=\"0\"]"));
		obj.switchTo().frame(fr);
		WebElement first = obj.findElement(By.xpath("(//input[@class=\"text_field\"])[1]"));
		first.sendKeys("rajik");
		
		
	}
	
}
