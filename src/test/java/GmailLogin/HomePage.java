package GmailLogin;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getNextButton().click();
		lp.getPassword().sendKeys(Password);				
		lp.getLogin().click();
		
		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		//0th row
		data[0][0]="Yathish743@gmail.com";
		data[0][1]="*&#^@@#(*";
		
		//1st row
		data[1][0]="DemoTest@gmail.com";
		data[1][1]="456788";
		
		return data;
		
		
		
		
		
		
	}
	
}
