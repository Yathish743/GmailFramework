package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {

	
	public WebDriver driver;
	
	By email=By.cssSelector("[id='identifierId']");
	By password=By.cssSelector("[type='password']");
	By login=By.cssSelector("[id='passwordNext']");
	By NextButton=By.cssSelector("[id='identifierNext']");
	By SignInText= By.xpath("//span[text()= 'Sign in']");	
	public LoginPage(WebDriver driver) {	
		
		this.driver=driver;
		
	}
	public WebElement getSignIn()
	{
		return driver.findElement(SignInText);
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getNextButton()
	{
		return driver.findElement(NextButton);
	}
	
	
}
