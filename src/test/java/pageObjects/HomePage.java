package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import Cucumber.AutomationTest082019.Base;

public class HomePage extends Base{

	public Properties prop = new Properties();
	
	public String getUserName() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		return driver.findElement(By.xpath(prop.getProperty("userName"))).getText();
	}
}
