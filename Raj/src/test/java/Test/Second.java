package Test;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class Second {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Automation\\\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://testautomationpractice.blogspot.com/");
		
		obj.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement search = obj.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]"));
		
		
		search.sendKeys("Rajik");
		
		WebElement alert = obj.findElement(By.xpath("//button[text()='Click Me']"));
		alert.click();
		Alert a = obj.switchTo().alert();
		a.accept();
		
		WebElement dt = obj.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		dt.click();
		WebElement month = obj.findElement(By.xpath("//span[text()='Prev']"));
		month.click();
		
		WebElement drop = obj.findElement(By.xpath("//select[@name=\"speed\"]"));
		Select select = new Select (drop);
		select.selectByVisibleText("Slower");
		
		WebElement drop1 = obj.findElement(By.xpath("//select[@name=\"files\"]"));
		WebDriverWait wait = new WebDriverWait (obj,Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(drop1));
		Select select1 = new Select (drop1);
		select1.selectByIndex(2);
		
		WebElement text = obj.findElement(By.xpath("(//span[contains(@style,font-family)])[16]"));
		String txt = text.getText();
		System.out.println(txt);
		
		WebElement frame = obj.findElement(By.xpath("//iframe[@frameborder=\"0\"]"));
		obj.switchTo().frame(frame);
		
		WebElement name = obj.findElement(By.xpath("//input[@name=\"RESULT_TextField-1\"]"));
		name.sendKeys("Rajik");
		
		WebElement male = obj.findElement(By.xpath("//label[@for=\"RESULT_RadioButton-7_0\"]"));
		male.click();
		
		WebElement td = obj.findElement(By.xpath("//label[@for=\"RESULT_CheckBox-8_2\"]"));
		
		((JavascriptExecutor)obj).executeScript("arguments[0].scrollIntoView(true)", td);
		
		

		obj.switchTo().defaultContent();
		Thread.sleep(2000);
		Actions act = new Actions(obj);
		WebElement dc = obj.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(dc);
		act.perform();
//		
//		File input = ((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
//		File output = new File ("D:\\Automation\\Selenium\\ScreenShots\\Facebook.jpg");
//		FileHandler.copy(input, output);
		
		File input = ((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
		File output = new File("bfshbfibsfsfb\\Facebook.jpg");
		FileHandler.copy(input, output);
		
		
	}
	
	}
	
	
	
	
	
