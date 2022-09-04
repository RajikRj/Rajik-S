package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.BaseTest;
import POJO.Driver1;

public class Third extends BaseTest {

	@BeforeMethod
	public void Before(){
		obj = Driver1.openBrowser1();
	}
	
	@Test 
	public void Leaf () {
		
		WebElement globe = obj.findElement(By.xpath("//i[@class=\"pi pi-globe layout-menuitem-icon\"]"));
		globe.click();
		
		WebElement alert =obj.findElement(By.xpath("//li[@id=\"menuform:m_overlay\"]"));
		alert.click();
		

		WebElement alert1 = obj.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[1]"));
		alert1.click();
		Alert a1 = obj.switchTo().alert();
		a1.accept();
		
		WebElement alert2 = obj.findElement(By.xpath("(//span[@class=\"ui-button-icon-left ui-icon ui-c pi pi-external-link\"])[2]"));
		alert2.click();
		Alert a2 = obj.switchTo().alert();
		a2.dismiss();
		
		WebElement alert3 = obj.findElement(By.xpath("(//span[@class=\"ui-button-icon-left ui-icon ui-c pi pi-external-link\"])[3]"));
		alert3.click();
		
		WebElement dismis = obj.findElement(By.xpath("(//span[@class=\"ui-button-icon-left ui-icon ui-c pi pi-check\"])[1]"));
		dismis.click();
		
		WebElement alert4 = obj.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[6]"));
		alert4.click();
		Alert a4 = obj.switchTo().alert();
		a4.sendKeys("Ok");
		a4.accept();
		
		
	}
	

		}
		