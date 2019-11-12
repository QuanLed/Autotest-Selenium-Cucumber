package Cucumber.AutomationTest082019;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException 
	{
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
			prop.load(file);
			System.setProperty("webdriver.chrome.driver", "//Users//quanld//eclipse-workspace//AutomationTest082019//chromedriver");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally {
//			driver.close();
//			driver.quit();
//		}
		return driver;
	}
}
