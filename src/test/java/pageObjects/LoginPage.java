package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import Cucumber.AutomationTest082019.Base;

public class LoginPage extends Base{

	public Properties prop = new Properties();
	
//	Nhap email
	public void inputEmail(String email) throws IOException 
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		String emailTextBox = prop.getProperty("emailTextBox");
		driver.findElement(By.xpath(emailTextBox)).sendKeys(email);
	}
	
//	Nhap password
	public void inputPassword(String password) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(password);
	}
	
//	Click dang nhap
	public void clickLogin() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("buttonLogin"))).click();
	}
}
