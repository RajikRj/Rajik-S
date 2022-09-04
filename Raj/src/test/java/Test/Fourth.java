package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fourth {

	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Automation\\\\\\\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://jqueryui.com/");
		obj.manage().window().maximize();
		
		
		
		
//		WebElement dr = obj.findElement(By.xpath("//a[@href='http://jqueryui.com/draggable/']"));
//		dr.click();
//		WebElement frame = obj.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
//		obj.switchTo().frame(frame);
//		
//		Actions action = new Actions(obj);
//		WebElement drag = obj.findElement(By.xpath("//div[@id=\"draggable\"]"));
//		action.clickAndHold(drag);
//		action.moveByOffset(300, 30);
//		action.release(drag);
//		action.perform();
//		
//		obj.switchTo().defaultContent();
		
		WebElement drop = obj.findElement(By.xpath("//a[@href=\"http://jqueryui.com/droppable/\"]"));
		drop.click();
		Thread.sleep(2000);
		
		WebElement frame1 = obj.findElement(By.xpath("//iframe[@src=\"/resources/demos/droppable/default.html\"]"));
		obj.switchTo().frame(frame1);
		Actions action = new Actions(obj);
		WebElement drop1 = obj.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop2 = obj.findElement(By.xpath("//div[@id=\"droppable\"]"));
		action.clickAndHold(drop1).dragAndDrop(drop1, drop2).perform();
		
		
		
	}
	
	
	
}
