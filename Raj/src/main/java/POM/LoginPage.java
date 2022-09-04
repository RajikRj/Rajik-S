package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(xpath="//input[@type='text']")private WebElement email;
	@FindBy(xpath="//input[@type='password']")private WebElement pass;
	@FindBy(xpath="//input[@value='Login']")private WebElement login;
	
	
	public LoginPage (WebDriver obj) {
		PageFactory.initElements(obj, this);
	}
	
	public void Email(String EmailId, WebDriver obj) {
		WebDriverWait wait = new WebDriverWait(obj,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(EmailId);
	}
	public void Pass (String Pass) {
		pass.sendKeys(Pass);
	}
	public void Login() {
		login.click();
	}
	
}
